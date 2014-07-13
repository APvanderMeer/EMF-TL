/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.mopp;

public class TextAML3ResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public TextAML3ResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3Resource(uri);
	}
	
}
