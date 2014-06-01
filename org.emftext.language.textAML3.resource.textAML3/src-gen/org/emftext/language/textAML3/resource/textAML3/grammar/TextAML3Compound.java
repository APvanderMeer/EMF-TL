/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.grammar;

public class TextAML3Compound extends org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3SyntaxElement {
	
	public TextAML3Compound(org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3Choice choice, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3Cardinality cardinality) {
		super(cardinality, new org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3SyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
