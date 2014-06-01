/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.analysis;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.emftext.language.textAML3.resource.textAML3.analysis.helper.EMFTypesResolver;

public class AttributeExpressionMyattributeReferenceResolver implements org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<org.emftext.language.textAML3.AttributeExpression, org.eclipse.emf.ecore.EStructuralFeature> {
	
	public void resolve(String identifier, org.emftext.language.textAML3.AttributeExpression container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolveResult<org.eclipse.emf.ecore.EStructuralFeature> result) {
		if (container.eContainer().eClass().getName().equalsIgnoreCase("ModelElementExpression")) {
			org.emftext.language.textAML3.ModelElementExpression parent = (org.emftext.language.textAML3.ModelElementExpression) container.eContainer();
			new EMFTypesResolver().doResolve(qualify(parent.getBaseclass()) + "::" + identifier, container, reference, EcorePackage.eINSTANCE.getEStructuralFeature(), resolveFuzzy, result);
		}
		else {
			new EMFTypesResolver().doResolve(identifier, container, reference, EcorePackage.eINSTANCE.getEStructuralFeature(), resolveFuzzy, result);
		}
	}
	
	public String deResolve(org.eclipse.emf.ecore.EStructuralFeature element, org.emftext.language.textAML3.AttributeExpression container, org.eclipse.emf.ecore.EReference reference) {
		return new EMFTypesResolver().doDeResolve(element, container);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
	private static String qualify(ENamedElement elem) {
		if (elem.eContainer() != null) {
			return qualify((ENamedElement)elem.eContainer()) + "::" + elem.getName();
		}
		else {
			return elem.getName();
		}
	}
	
}
