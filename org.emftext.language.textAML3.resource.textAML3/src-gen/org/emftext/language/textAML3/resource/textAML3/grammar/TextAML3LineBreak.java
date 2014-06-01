/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.grammar;

public class TextAML3LineBreak extends org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3FormattingElement {
	
	private final int tabs;
	
	public TextAML3LineBreak(org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3Cardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
