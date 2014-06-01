/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3;

public interface ITextAML3Problem {
	public String getMessage();
	public org.emftext.language.textAML3.resource.textAML3.TextAML3EProblemSeverity getSeverity();
	public org.emftext.language.textAML3.resource.textAML3.TextAML3EProblemType getType();
	public java.util.Collection<org.emftext.language.textAML3.resource.textAML3.ITextAML3QuickFix> getQuickFixes();
}
