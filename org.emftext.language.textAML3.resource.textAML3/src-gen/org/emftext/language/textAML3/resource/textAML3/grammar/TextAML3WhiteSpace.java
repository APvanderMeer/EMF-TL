/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.grammar;

public class TextAML3WhiteSpace extends org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3FormattingElement {
	
	private final int amount;
	
	public TextAML3WhiteSpace(int amount, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3Cardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
