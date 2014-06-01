/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.analysis;

public class TextAML3TEXTTokenResolver implements org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver {
	
	private org.emftext.language.textAML3.resource.textAML3.analysis.TextAML3DefaultTokenResolver defaultTokenResolver = new org.emftext.language.textAML3.resource.textAML3.analysis.TextAML3DefaultTokenResolver(true);
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, null, null, null);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, null, null, null);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
