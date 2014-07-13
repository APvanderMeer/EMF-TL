/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.grammar;

public class TextAML3Sequence extends org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3SyntaxElement {
	
	public TextAML3Sequence(org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3Cardinality cardinality, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3SyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return org.emftext.language.textAML3.resource.textAML3.util.TextAML3StringUtil.explode(getChildren(), " ");
	}
	
}
