/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class TextAML3Placeholder extends org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3Terminal {
	
	private final String tokenName;
	
	public TextAML3Placeholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3Cardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
