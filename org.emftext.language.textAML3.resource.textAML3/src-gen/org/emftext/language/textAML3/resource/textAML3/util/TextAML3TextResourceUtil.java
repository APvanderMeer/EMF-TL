/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.util;

/**
 * Class TextAML3TextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * org.emftext.language.textAML3.resource.textAML3.util.TextAML3ResourceUtil.
 */
public class TextAML3TextResourceUtil {
	
	/**
	 * Use
	 * org.emftext.language.textAML3.resource.textAML3.util.TextAML3ResourceUtil.getRes
	 * ource() instead.
	 */
	@Deprecated	
	public static org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3Resource getResource(org.eclipse.core.resources.IFile file) {
		return new org.emftext.language.textAML3.resource.textAML3.util.TextAML3EclipseProxy().getResource(file);
	}
	
	/**
	 * Use
	 * org.emftext.language.textAML3.resource.textAML3.util.TextAML3ResourceUtil.getRes
	 * ource() instead.
	 */
	@Deprecated	
	public static org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3Resource getResource(java.io.File file, java.util.Map<?,?> options) {
		return org.emftext.language.textAML3.resource.textAML3.util.TextAML3ResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use
	 * org.emftext.language.textAML3.resource.textAML3.util.TextAML3ResourceUtil.getRes
	 * ource() instead.
	 */
	@Deprecated	
	public static org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3Resource getResource(org.eclipse.emf.common.util.URI uri) {
		return org.emftext.language.textAML3.resource.textAML3.util.TextAML3ResourceUtil.getResource(uri);
	}
	
	/**
	 * Use
	 * org.emftext.language.textAML3.resource.textAML3.util.TextAML3ResourceUtil.getRes
	 * ource() instead.
	 */
	@Deprecated	
	public static org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3Resource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return org.emftext.language.textAML3.resource.textAML3.util.TextAML3ResourceUtil.getResource(uri, options);
	}
	
}
