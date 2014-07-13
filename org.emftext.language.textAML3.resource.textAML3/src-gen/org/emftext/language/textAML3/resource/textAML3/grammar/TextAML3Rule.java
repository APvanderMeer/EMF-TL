/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class TextAML3Rule extends org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3SyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public TextAML3Rule(org.eclipse.emf.ecore.EClass metaclass, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3Choice choice, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3Cardinality cardinality) {
		super(cardinality, new org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3SyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3Choice getDefinition() {
		return (org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3Choice) getChildren()[0];
	}
	
}

