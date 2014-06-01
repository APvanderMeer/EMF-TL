/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class TextAML3ExpectedStructuralFeature extends org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3AbstractExpectedElement {
	
	private org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3Placeholder placeholder;
	
	public TextAML3ExpectedStructuralFeature(org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3Placeholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	/**
	 * Returns the expected placeholder.
	 */
	public org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3SyntaxElement getSymtaxElement() {
		return placeholder;
	}
	
	public String getTokenName() {
		return placeholder.getTokenName();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton(getTokenName());
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof TextAML3ExpectedStructuralFeature) {
			return getFeature().equals(((TextAML3ExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
	@Override	
	public int hashCode() {
		return getFeature().hashCode();
	}
	
}
