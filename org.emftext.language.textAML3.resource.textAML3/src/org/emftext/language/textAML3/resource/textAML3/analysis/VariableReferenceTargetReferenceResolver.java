/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.analysis;

public class VariableReferenceTargetReferenceResolver implements org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<org.emftext.language.textAML3.VariableReference, org.emftext.language.textAML3.Variable> {
	
	private org.emftext.language.textAML3.resource.textAML3.analysis.TextAML3DefaultResolverDelegate<org.emftext.language.textAML3.VariableReference, org.emftext.language.textAML3.Variable> delegate = new org.emftext.language.textAML3.resource.textAML3.analysis.TextAML3DefaultResolverDelegate<org.emftext.language.textAML3.VariableReference, org.emftext.language.textAML3.Variable>();
	
	public void resolve(String identifier, org.emftext.language.textAML3.VariableReference container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolveResult<org.emftext.language.textAML3.Variable> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.emftext.language.textAML3.Variable element, org.emftext.language.textAML3.VariableReference container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
