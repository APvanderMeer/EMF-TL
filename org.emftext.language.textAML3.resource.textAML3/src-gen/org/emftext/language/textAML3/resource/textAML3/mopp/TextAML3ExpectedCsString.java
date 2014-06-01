/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class TextAML3ExpectedCsString extends org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3AbstractExpectedElement {
	
	private org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3Keyword keyword;
	
	public TextAML3ExpectedCsString(org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3Keyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	/**
	 * Returns the expected keyword.
	 */
	public org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3SyntaxElement getSymtaxElement() {
		return keyword;
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof TextAML3ExpectedCsString) {
			return getValue().equals(((TextAML3ExpectedCsString) o).getValue());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getValue().hashCode();
	}
	
}
