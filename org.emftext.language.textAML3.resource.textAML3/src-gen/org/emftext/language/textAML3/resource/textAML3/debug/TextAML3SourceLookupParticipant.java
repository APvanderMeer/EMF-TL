/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.debug;

public class TextAML3SourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof org.emftext.language.textAML3.resource.textAML3.debug.TextAML3StackFrame) {
			org.emftext.language.textAML3.resource.textAML3.debug.TextAML3StackFrame frame = (org.emftext.language.textAML3.resource.textAML3.debug.TextAML3StackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
