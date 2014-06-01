/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface ITextAML3Command<ContextType> {
	
	public boolean execute(ContextType context);
}
