/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.grammar;

public class TextAML3Choice extends org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3SyntaxElement {
	
	public TextAML3Choice(org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3Cardinality cardinality, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3SyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return org.emftext.language.textAML3.resource.textAML3.util.TextAML3StringUtil.explode(getChildren(), "|");
	}
	
}
