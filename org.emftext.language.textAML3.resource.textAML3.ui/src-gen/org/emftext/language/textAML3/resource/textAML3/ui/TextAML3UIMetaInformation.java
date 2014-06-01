/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.ui;

public class TextAML3UIMetaInformation extends org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3MetaInformation {
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3HoverTextProvider getHoverTextProvider() {
		return new org.emftext.language.textAML3.resource.textAML3.ui.TextAML3HoverTextProvider();
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ui.TextAML3ImageProvider getImageProvider() {
		return org.emftext.language.textAML3.resource.textAML3.ui.TextAML3ImageProvider.INSTANCE;
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ui.TextAML3ColorManager createColorManager() {
		return new org.emftext.language.textAML3.resource.textAML3.ui.TextAML3ColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.emftext.language.textAML3.resource.textAML3.ITextAML3Text
	 * Resource,
	 * org.emftext.language.textAML3.resource.textAML3.ui.TextAML3ColorManager)
	 * instead.
	 */
	public org.emftext.language.textAML3.resource.textAML3.ui.TextAML3TokenScanner createTokenScanner(org.emftext.language.textAML3.resource.textAML3.ui.TextAML3ColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ui.TextAML3TokenScanner createTokenScanner(org.emftext.language.textAML3.resource.textAML3.ITextAML3TextResource resource, org.emftext.language.textAML3.resource.textAML3.ui.TextAML3ColorManager colorManager) {
		return new org.emftext.language.textAML3.resource.textAML3.ui.TextAML3TokenScanner(resource, colorManager);
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ui.TextAML3CodeCompletionHelper createCodeCompletionHelper() {
		return new org.emftext.language.textAML3.resource.textAML3.ui.TextAML3CodeCompletionHelper();
	}
	
}
