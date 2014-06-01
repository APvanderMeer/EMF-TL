/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface ITextAML3ExpectedElement {
	
	/**
	 * Returns the names of all tokens that are expected at the given position.
	 */
	public java.util.Set<String> getTokenNames();
	
	/**
	 * Returns the metaclass of the rule that contains the expected element.
	 */
	public org.eclipse.emf.ecore.EClass getRuleMetaclass();
	
	/**
	 * Returns the syntax element that is expected.
	 */
	public org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3SyntaxElement getSymtaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(org.emftext.language.textAML3.resource.textAML3.ITextAML3ExpectedElement follower, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public java.util.Collection<org.emftext.language.textAML3.resource.textAML3.util.TextAML3Pair<org.emftext.language.textAML3.resource.textAML3.ITextAML3ExpectedElement, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContainedFeature[]>> getFollowers();
	
}
