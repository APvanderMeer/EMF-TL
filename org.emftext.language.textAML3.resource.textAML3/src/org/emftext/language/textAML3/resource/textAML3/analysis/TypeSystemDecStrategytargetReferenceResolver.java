/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.analysis;

public class TypeSystemDecStrategytargetReferenceResolver implements org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<org.emftext.language.textAML3.TypeSystemDec, org.eclipse.emf.ecore.EStructuralFeature> {
	
	private org.emftext.language.textAML3.resource.textAML3.analysis.TextAML3DefaultResolverDelegate<org.emftext.language.textAML3.TypeSystemDec, org.eclipse.emf.ecore.EStructuralFeature> delegate = new org.emftext.language.textAML3.resource.textAML3.analysis.TextAML3DefaultResolverDelegate<org.emftext.language.textAML3.TypeSystemDec, org.eclipse.emf.ecore.EStructuralFeature>();
	
	public void resolve(String identifier, org.emftext.language.textAML3.TypeSystemDec container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolveResult<org.eclipse.emf.ecore.EStructuralFeature> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.eclipse.emf.ecore.EStructuralFeature element, org.emftext.language.textAML3.TypeSystemDec container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
