/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.ui;

public class TextAML3HoverTextProvider implements org.emftext.language.textAML3.resource.textAML3.ITextAML3HoverTextProvider {
	
	private org.emftext.language.textAML3.resource.textAML3.ui.TextAML3DefaultHoverTextProvider defaultProvider = new org.emftext.language.textAML3.resource.textAML3.ui.TextAML3DefaultHoverTextProvider();
	
	public String getHoverText(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject referencedObject) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(referencedObject);
	}
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
