/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class TextAML3Keyword extends org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3SyntaxElement {
	
	private final String value;
	
	public TextAML3Keyword(String value, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3Cardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
