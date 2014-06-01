/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class TextAML3AbstractExpectedElement implements org.emftext.language.textAML3.resource.textAML3.ITextAML3ExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<org.emftext.language.textAML3.resource.textAML3.util.TextAML3Pair<org.emftext.language.textAML3.resource.textAML3.ITextAML3ExpectedElement, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContainedFeature[]>> followers = new java.util.LinkedHashSet<org.emftext.language.textAML3.resource.textAML3.util.TextAML3Pair<org.emftext.language.textAML3.resource.textAML3.ITextAML3ExpectedElement, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContainedFeature[]>>();
	
	public TextAML3AbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(org.emftext.language.textAML3.resource.textAML3.ITextAML3ExpectedElement follower, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContainedFeature[] path) {
		followers.add(new org.emftext.language.textAML3.resource.textAML3.util.TextAML3Pair<org.emftext.language.textAML3.resource.textAML3.ITextAML3ExpectedElement, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<org.emftext.language.textAML3.resource.textAML3.util.TextAML3Pair<org.emftext.language.textAML3.resource.textAML3.ITextAML3ExpectedElement, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
