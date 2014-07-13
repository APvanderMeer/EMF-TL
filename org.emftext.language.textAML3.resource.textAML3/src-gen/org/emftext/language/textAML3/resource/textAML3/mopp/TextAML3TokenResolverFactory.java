/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.mopp;

/**
 * The TextAML3TokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class TextAML3TokenResolverFactory implements org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolverFactory {
	
	private java.util.Map<String, org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver> featureName2CollectInTokenResolver;
	private static org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver defaultResolver = new org.emftext.language.textAML3.resource.textAML3.analysis.TextAML3DefaultTokenResolver();
	
	public TextAML3TokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver>();
		registerTokenResolver("URL", new org.emftext.language.textAML3.resource.textAML3.analysis.TextAML3URLTokenResolver());
		registerTokenResolver("VARID", new org.emftext.language.textAML3.resource.textAML3.analysis.TextAML3VARIDTokenResolver());
		registerTokenResolver("NUMBER", new org.emftext.language.textAML3.resource.textAML3.analysis.TextAML3NUMBERTokenResolver());
		registerTokenResolver("TEXT", new org.emftext.language.textAML3.resource.textAML3.analysis.TextAML3TEXTTokenResolver());
		registerTokenResolver("REFERENCE", new org.emftext.language.textAML3.resource.textAML3.analysis.TextAML3REFERENCETokenResolver());
		registerTokenResolver("QUOTED_34_34", new org.emftext.language.textAML3.resource.textAML3.analysis.TextAML3QUOTED_34_34TokenResolver());
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver internalCreateResolver(java.util.Map<String, org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver> resolverMap, String key, org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
