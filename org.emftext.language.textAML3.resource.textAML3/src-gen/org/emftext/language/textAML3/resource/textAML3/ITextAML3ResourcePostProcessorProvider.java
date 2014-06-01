/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface ITextAML3ResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3ResourcePostProcessor getResourcePostProcessor();
	
}
