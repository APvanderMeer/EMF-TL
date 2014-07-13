/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class TextAML3SyntaxElement {
	
	private TextAML3SyntaxElement[] children;
	private TextAML3SyntaxElement parent;
	private org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3Cardinality cardinality;
	
	public TextAML3SyntaxElement(org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3Cardinality cardinality, TextAML3SyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (TextAML3SyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(TextAML3SyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public TextAML3SyntaxElement getParent() {
		return parent;
	}
	
	public TextAML3SyntaxElement[] getChildren() {
		if (children == null) {
			return new TextAML3SyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3Cardinality getCardinality() {
		return cardinality;
	}
	
}
