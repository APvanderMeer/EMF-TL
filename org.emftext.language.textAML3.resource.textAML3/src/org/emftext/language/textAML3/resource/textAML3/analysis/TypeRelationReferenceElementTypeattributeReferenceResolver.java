/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.analysis;

public class TypeRelationReferenceElementTypeattributeReferenceResolver implements org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<org.emftext.language.textAML3.TypeRelationReferenceElement, org.emftext.language.textAML3.TypeAttribute> {
	
	private org.emftext.language.textAML3.resource.textAML3.analysis.TextAML3DefaultResolverDelegate<org.emftext.language.textAML3.TypeRelationReferenceElement, org.emftext.language.textAML3.TypeAttribute> delegate = new org.emftext.language.textAML3.resource.textAML3.analysis.TextAML3DefaultResolverDelegate<org.emftext.language.textAML3.TypeRelationReferenceElement, org.emftext.language.textAML3.TypeAttribute>();
	
	public void resolve(String identifier, org.emftext.language.textAML3.TypeRelationReferenceElement container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolveResult<org.emftext.language.textAML3.TypeAttribute> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.emftext.language.textAML3.TypeAttribute element, org.emftext.language.textAML3.TypeRelationReferenceElement container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
