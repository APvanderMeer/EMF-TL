/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class TextAML3ProposalPostProcessor {
	
	public java.util.List<org.emftext.language.textAML3.resource.textAML3.ui.TextAML3CompletionProposal> process(java.util.List<org.emftext.language.textAML3.resource.textAML3.ui.TextAML3CompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
