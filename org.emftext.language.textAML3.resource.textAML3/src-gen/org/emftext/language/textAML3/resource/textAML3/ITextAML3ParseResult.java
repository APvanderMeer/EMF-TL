/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3;

/**
 * An interface used to access the result of parsing a document.
 */
public interface ITextAML3ParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<org.emftext.language.textAML3.resource.textAML3.ITextAML3Command<org.emftext.language.textAML3.resource.textAML3.ITextAML3TextResource>> getPostParseCommands();
	
}
