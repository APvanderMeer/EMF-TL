/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.mopp;

public class TextAML3Problem implements org.emftext.language.textAML3.resource.textAML3.ITextAML3Problem {
	
	private String message;
	private org.emftext.language.textAML3.resource.textAML3.TextAML3EProblemType type;
	private org.emftext.language.textAML3.resource.textAML3.TextAML3EProblemSeverity severity;
	private java.util.Collection<org.emftext.language.textAML3.resource.textAML3.ITextAML3QuickFix> quickFixes;
	
	public TextAML3Problem(String message, org.emftext.language.textAML3.resource.textAML3.TextAML3EProblemType type, org.emftext.language.textAML3.resource.textAML3.TextAML3EProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<org.emftext.language.textAML3.resource.textAML3.ITextAML3QuickFix>emptySet());
	}
	
	public TextAML3Problem(String message, org.emftext.language.textAML3.resource.textAML3.TextAML3EProblemType type, org.emftext.language.textAML3.resource.textAML3.TextAML3EProblemSeverity severity, org.emftext.language.textAML3.resource.textAML3.ITextAML3QuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public TextAML3Problem(String message, org.emftext.language.textAML3.resource.textAML3.TextAML3EProblemType type, org.emftext.language.textAML3.resource.textAML3.TextAML3EProblemSeverity severity, java.util.Collection<org.emftext.language.textAML3.resource.textAML3.ITextAML3QuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<org.emftext.language.textAML3.resource.textAML3.ITextAML3QuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public org.emftext.language.textAML3.resource.textAML3.TextAML3EProblemType getType() {
		return type;
	}
	
	public org.emftext.language.textAML3.resource.textAML3.TextAML3EProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<org.emftext.language.textAML3.resource.textAML3.ITextAML3QuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
