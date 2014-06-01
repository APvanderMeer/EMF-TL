/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.mopp;

public class TextAML3ResourcePostProcessor implements org.emftext.language.textAML3.resource.textAML3.ITextAML3ResourcePostProcessor {
	
	public void process(org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3Resource resource) {
		// Set the overrideResourcePostProcessor option to false to customize resource
		// post processing.
	}
	
	public void terminate() {
		// To signal termination to the process() method, setting a boolean field is
		// recommended. Depending on the value of this field process() can stop its
		// computation. However, this is only required for computation intensive
		// post-processors.
	}
	
}
