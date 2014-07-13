/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.mopp;

/**
 * A representation for a range in a document where a boolean attribute is
 * expected.
 */
public class TextAML3ExpectedBooleanTerminal extends org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3AbstractExpectedElement {
	
	private org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3BooleanTerminal booleanTerminal;
	
	public TextAML3ExpectedBooleanTerminal(org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3BooleanTerminal booleanTerminal) {
		super(booleanTerminal.getMetaclass());
		this.booleanTerminal = booleanTerminal;
	}
	
	public org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3BooleanTerminal getBooleanTerminal() {
		return booleanTerminal;
	}
	
	/**
	 * Returns the expected boolean terminal.
	 */
	public org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3SyntaxElement getSymtaxElement() {
		return booleanTerminal;
	}
	
	private org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return booleanTerminal.getFeature();
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof TextAML3ExpectedBooleanTerminal) {
			return getFeature().equals(((TextAML3ExpectedBooleanTerminal) o).getFeature());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getFeature().hashCode();
	}
	
	public java.util.Set<String> getTokenNames() {
		// BooleanTerminals are associated with two or one token(s)
		java.util.Set<String> tokenNames = new java.util.LinkedHashSet<String>(2);
		String trueLiteral = booleanTerminal.getTrueLiteral();
		if (!"".equals(trueLiteral)) {
			tokenNames.add("'" + trueLiteral + "'");
		}
		String falseLiteral = booleanTerminal.getFalseLiteral();
		if (!"".equals(falseLiteral)) {
			tokenNames.add("'" + falseLiteral + "'");
		}
		return tokenNames;
	}
	
}
