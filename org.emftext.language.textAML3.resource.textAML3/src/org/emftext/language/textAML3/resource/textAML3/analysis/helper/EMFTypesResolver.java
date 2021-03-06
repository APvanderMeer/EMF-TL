/*******************************************************************************
 * Copyright (c) 2006-2011 
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany 
 *      - initial API and implementation
 *      
 * Modified to accomodate textAML3 instead of ecore.
 ******************************************************************************/
package org.emftext.language.textAML3.resource.textAML3.analysis.helper;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emftext.language.textAML3.TypeSystemDec;
import org.emftext.language.textAML3.PackageElement;
import org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolveResult;

public class EMFTypesResolver {

	private static final String DELIMITER = "::";
	
	// TODO having state in resolver classes may be a problem, because
	// there is no guarantee about how resolver classes are reused.
	protected Resource resource = null;

	public void doResolve(String identifier, EObject container,
			EReference reference, EClass typeToResolve,
			boolean resolveFuzzy, ITextAML3ReferenceResolveResult<?> result) {

		// we collect all classifiers that are reachable in this map. once all
		// classifiers have been collected, whether they match the identifier
		// we are looking for. this way, we can resolve both fuzzy and non-fuzzy
		// the same way.
		Map<String, ENamedElement> candidates = new LinkedHashMap<String, ENamedElement>();
		resource = container.eResource();

		// first: add all classifiers from current package
		EObject rootContainer = EcoreUtil.getRootContainer(container);
		if (rootContainer instanceof EPackage) {
			EPackage ePackage = (EPackage) rootContainer;
			addCandidates(candidates, ePackage, ePackage.getName());
		}
		// second: add all classifiers from imported packages
		Map<String, EPackage> imports = collectImports(container);
		for (String prefix : imports.keySet()) {
			EPackage importedPackage = imports.get(prefix);
			if (importedPackage != null && !importedPackage.eIsProxy()) {
				addCandidates(candidates, importedPackage, prefix);
			}
		}
		// third: add all classifiers that are defined in the current resource
		if (rootContainer instanceof EPackage) {
			EPackage ePackage = (EPackage) rootContainer;
			addCandidates(candidates, ePackage, null);
		}
		// third: add all classifiers that are defined in EcorePackage
		addCandidates(candidates, EcorePackage.eINSTANCE, null);

		// check all candidates and add those that match the identifier to the
		// result set
		addResults(identifier, candidates, typeToResolve, resolveFuzzy, result);
		
		// if we could not resolve the identifier, we do at least check whether
		// the package or the classifier could not be resolved to give a more
		// detailed error message
		if (!result.wasResolved()) {
			int delimiterIndex = identifier.lastIndexOf(DELIMITER);
			if (delimiterIndex >= 0) {
				String prefix = identifier.substring(0, delimiterIndex);
				if (!containsPackage(candidates, prefix)) {
					result.setErrorMessage("EPackage '" + prefix + "' not found");
				}
				else {
					String list = typeToResolve.getName() + "\n";
					for(ENamedElement element: candidates.values()) {
						list = list + "\n" + element.getName() + " " + element.eClass().getName();
					}
					result.setErrorMessage(list);
				}
			}
		}
	}

	private boolean containsPackage(Map<String, ENamedElement> candidates,
			String prefix) {
		for (String identifier : candidates.keySet()) {
			if (identifier.startsWith(prefix + DELIMITER)) {
				return true;
			}
		}
		return false;
	}

	private void addCandidates(Map<String, ENamedElement> candidates, EPackage ePackage, String prefix) {
		for (EClassifier next : ePackage.getEClassifiers()) {
			if (prefix == null) {
				candidates.put(next.getName(), next);
			} else {
				candidates.put(prefix + DELIMITER + next.getName(), next);
				if (EEnum.class.isAssignableFrom(next.getClass())) {
					for (EEnumLiteral lit : ((EEnum)next).getELiterals()) {
						candidates.put(prefix + DELIMITER + next.getName() + DELIMITER + lit.getName(), lit);
					}
				}
			}
		}
		for (EPackage subPackage : ePackage.getESubpackages()) {
			String newPrefix = prefix == null ? null : (prefix + DELIMITER) + subPackage.getName();
			addCandidates(candidates, subPackage, newPrefix);
		}
		for (EClassifier subClass : ePackage.getEClassifiers()) {
			if (subClass instanceof EClass) {
				String newPrefix = prefix == null ? null : (prefix + DELIMITER)
						+ subClass.getName();
				addCandidates(candidates, (EClass)subClass, newPrefix);
			}
		}
	}
	
	private void addCandidates(Map<String, ENamedElement> candidates, EClass eClass, String prefix) {
		for (EStructuralFeature next : eClass.getEAllStructuralFeatures()) {
			if (prefix == null) {
				candidates.put(next.getName(), next);
			} else {
				candidates.put(prefix + DELIMITER + next.getName(), next);
			}
		}
	}	

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void addResults(String identifier, 
			Map<String, ENamedElement> candidates, EClass typeToResolve,
			boolean resolveFuzzy, ITextAML3ReferenceResolveResult result) {
		for (String nextIdentifier : candidates.keySet()) {
			ENamedElement next = candidates.get(nextIdentifier);
			if (typeToResolve.isInstance(next)) {
				ENamedElement classifier = next;

				if (resolveFuzzy) {
					result.addMapping(nextIdentifier, classifier);
				} else {
					if (nextIdentifier != null && nextIdentifier.equals(identifier)) {
						result.addMapping(identifier, classifier);
						return;
					}
				}

				if (classifier instanceof EClassifier) {
					// type parameter?
					for (ETypeParameter typeParameter : ((EClassifier)classifier)
							.getETypeParameters()) {
						if (typeParameter.getName().equals(identifier)) {
							result.addMapping(identifier, classifier);
							return;
						}
					}
				}
			}
		}
	}

	private Map<String, EPackage> collectImports(EObject element) {
		Map<String, EPackage> imports = new LinkedHashMap<String, EPackage>();
		if (element instanceof TypeSystemDec) {
			EList<PackageElement> importnames = ((TypeSystemDec) element).getPackages();
			if (importnames != null) {
				for (PackageElement importname : importnames) {
					if (!imports.containsKey(importname.getTargetpackage().getName())) {
						imports.put(importname.getTargetpackage().getName(), importname.getTargetpackage());
					}
				}
			}
		}
		if (element.eContainer() != null) {
			Map<String, EPackage> upperImports = collectImports(element.eContainer());
			for (String key : upperImports.keySet()) {
				if (!imports.containsKey(key)) {
					imports.put(key, upperImports.get(key));
				}
			}
		}
		return imports;
	}

	private EPackage findEPackage(String uriString) {
		if (resource == null) {
			return null;
		}
		ResourceSet rs = resource.getResourceSet();
		if (rs == null) {
			return null;
		}
		Resource ePackageResource = null;
		URI uri = URI.createURI(uriString);
		URI resourceURI = resource.getURI();
		if (resourceURI.isRelative() || resourceURI.isHierarchical()) {
			uri = uri.resolve(resourceURI); // relative
		}
		try {
			ePackageResource = rs.getResource(uri, true);
		} catch (Exception e) {
		}

		if (ePackageResource == null ||
			ePackageResource.getContents().isEmpty() || 
			!(ePackageResource.getContents().get(0) instanceof EPackage)) {
			// if the package cannot be found by the URI, look it up in
			// the package registry
			return EPackage.Registry.INSTANCE.getEPackage(uriString);
		}
		return (EPackage) ePackageResource.getContents().get(0);
	}

	public String doDeResolve(ENamedElement element, EObject container) {
		resource = container.eResource();
		if (container.eResource().equals(element.eResource()) || element.eResource() == null) {
			return element.getName();
		}
		else {
			EPackage classContainer = (EPackage) element.eResource().getContents().get(0);
			
			Map<String, EPackage> imports = collectImports(container);
			Set<String> importPrefixes = imports.keySet();
			for (String prefix : importPrefixes) {
				EPackage ePackage = imports.get(prefix);
				if(classContainer.equals(ePackage)) {
					String result = collectPackagePrefixes(classContainer, element);
					if (result.length() > 0) {
						result = prefix + DELIMITER + result;
						return result;
					}
				}
			}
		}
		return element.getName();
	}

	private String collectPackagePrefixes(EPackage ePackage, ENamedElement element) {
		if (ePackage.getEClassifier(element.getName()) != null) {
			String result = element.getName();
			return result;
		} else {
			EList<EPackage> subPackages = ePackage.getESubpackages();
			for (EPackage subPackage : subPackages) {
				String returned = collectPackagePrefixes(subPackage, element);
				if (returned.length() > 0) {
					String result = subPackage.getName() + DELIMITER + returned;
					return result;
				}
			}
		}
		return "";
	}
}
