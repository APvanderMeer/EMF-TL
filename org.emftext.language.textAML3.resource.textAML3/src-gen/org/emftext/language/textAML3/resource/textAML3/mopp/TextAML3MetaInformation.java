/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.mopp;

public class TextAML3MetaInformation implements org.emftext.language.textAML3.resource.textAML3.ITextAML3MetaInformation {
	
	public String getSyntaxName() {
		return "textAML3";
	}
	
	public String getURI() {
		return "http://www.emftext.org/language/textAML3";
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3TextScanner createLexer() {
		return new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3AntlrScanner(new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3Lexer());
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3TextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3Parser().createInstance(inputStream, encoding);
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3TextPrinter createPrinter(java.io.OutputStream outputStream, org.emftext.language.textAML3.resource.textAML3.ITextAML3TextResource resource) {
		return new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3Printer2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3SyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3SyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ReferenceResolverSwitch();
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolverFactory getTokenResolverFactory() {
		return new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "org.emftext.language.textAML3/metamodel/textAML3.cs";
	}
	
	public String[] getTokenNames() {
		return org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3Parser.tokenNames;
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenStyle getDefaultTokenStyle(String tokenName) {
		return new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.emftext.language.textAML3.resource.textAML3.ITextAML3BracketPair> getBracketPairs() {
		return new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3BracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3FoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ResourceFactory();
	}
	
	public org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3NewFileContentProvider getNewFileContentProvider() {
		return new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3NewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ResourceFactory());
	}
	
	/**
	 * Returns the key of the option that can be used to register a preprocessor that
	 * is used as a pipe when loading resources. This key is language-specific. To
	 * register one preprocessor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getInputStreamPreprocessorProviderOptionKey() {
		return getSyntaxName() + "_" + "INPUT_STREAM_PREPROCESSOR_PROVIDER";
	}
	
	/**
	 * Returns the key of the option that can be used to register a post-processors
	 * that are invoked after loading resources. This key is language-specific. To
	 * register one post-processor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getResourcePostProcessorProviderOptionKey() {
		return getSyntaxName() + "_" + "RESOURCE_POSTPROCESSOR_PROVIDER";
	}
	
	public String getLaunchConfigurationType() {
		return "org.emftext.language.textAML3.resource.textAML3.ui.launchConfigurationType";
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3NameProvider createNameProvider() {
		return new org.emftext.language.textAML3.resource.textAML3.analysis.TextAML3DefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3AntlrTokenHelper tokenHelper = new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3AntlrTokenHelper();
		java.util.List<String> highlightableTokens = new java.util.ArrayList<String>();
		String[] parserTokenNames = getTokenNames();
		for (int i = 0; i < parserTokenNames.length; i++) {
			// If ANTLR is used we need to normalize the token names
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			String tokenName = tokenHelper.getTokenName(parserTokenNames, i);
			if (tokenName == null) {
				continue;
			}
			highlightableTokens.add(tokenName);
		}
		highlightableTokens.add(org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
