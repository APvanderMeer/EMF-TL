/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.mopp;

public class TextAML3BracketInformationProvider {
	
	public class BracketPair implements org.emftext.language.textAML3.resource.textAML3.ITextAML3BracketPair {
		
		private String opening;
		private String closing;
		private boolean closingEnabledInside;
		
		public BracketPair(String opening, String closing, boolean closingEnabledInside) {
			super();
			this.opening = opening;
			this.closing = closing;
			this.closingEnabledInside = closingEnabledInside;
		}
		
		public String getOpeningBracket() {
			return opening;
		}
		
		public String getClosingBracket() {
			return closing;
		}
		
		public boolean isClosingEnabledInside() {
			return closingEnabledInside;
		}
	}
	
	public java.util.Collection<org.emftext.language.textAML3.resource.textAML3.ITextAML3BracketPair> getBracketPairs() {
		java.util.Collection<org.emftext.language.textAML3.resource.textAML3.ITextAML3BracketPair> result = new java.util.ArrayList<org.emftext.language.textAML3.resource.textAML3.ITextAML3BracketPair>();
		result.add(new BracketPair("(", ")", true));
		result.add(new BracketPair("{", "}", true));
		result.add(new BracketPair("\"", "\"", false));
		return result;
	}
	
}
