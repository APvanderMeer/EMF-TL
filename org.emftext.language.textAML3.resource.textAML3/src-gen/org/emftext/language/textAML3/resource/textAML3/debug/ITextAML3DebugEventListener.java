/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.debug;

public interface ITextAML3DebugEventListener {
	
	/**
	 * Notification that the given event occurred in the while debugging.
	 */
	public void handleMessage(org.emftext.language.textAML3.resource.textAML3.debug.TextAML3DebugMessage message);
}
