/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.mopp;

public class TextAML3AntlrScanner implements org.emftext.language.textAML3.resource.textAML3.ITextAML3TextScanner {
	
	private org.antlr.runtime3_4_0.Lexer antlrLexer;
	
	public TextAML3AntlrScanner(org.antlr.runtime3_4_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3TextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_4_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		org.emftext.language.textAML3.resource.textAML3.ITextAML3TextToken result = new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ANTLRTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_4_0.ANTLRStringStream(text));
	}
	
}
