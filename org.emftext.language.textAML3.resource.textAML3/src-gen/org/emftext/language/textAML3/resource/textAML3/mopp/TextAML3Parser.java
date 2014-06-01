// $ANTLR 3.4

	package org.emftext.language.textAML3.resource.textAML3.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TextAML3Parser extends TextAML3ANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LINEBREAKS", "NUMBER", "QUOTED_34_34", "REFERENCE", "TEXT", "URL", "VARID", "WHITESPACE", "'#'", "'&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "':'", "';'", "'<'", "'='", "'>'", "'OclUndefined'", "'error'", "'first'", "'flatten'", "'for'", "'from'", "'if'", "'imports'", "'in'", "'last'", "'length'", "'message'", "'pairs'", "'rules'", "'set'", "'sourceposition'", "'start'", "'strategy'", "'strategytarget'", "'to'", "'typesystem'", "'where'", "'widening'", "'with'", "'{'", "'{{'", "'}'", "'}}'"
    };

    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int LINEBREAKS=4;
    public static final int NUMBER=5;
    public static final int QUOTED_34_34=6;
    public static final int REFERENCE=7;
    public static final int TEXT=8;
    public static final int URL=9;
    public static final int VARID=10;
    public static final int WHITESPACE=11;

    // delegates
    public TextAML3ANTLRParserBase[] getDelegates() {
        return new TextAML3ANTLRParserBase[] {};
    }

    // delegators


    public TextAML3Parser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public TextAML3Parser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.initializeRuleMemo(114 + 1);
         

    }

    public String[] getTokenNames() { return TextAML3Parser.tokenNames; }
    public String getGrammarFileName() { return "TextAML3.g"; }


    	private org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolverFactory tokenResolverFactory = new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TokenResolverFactory();
    	
    	/**
    	 * the index of the last token that was handled by collectHiddenTokens()
    	 */
    	private int lastPosition;
    	
    	/**
    	 * A flag that indicates whether the parser should remember all expected elements.
    	 * This flag is set to true when using the parse for code completion. Otherwise it
    	 * is set to false.
    	 */
    	private boolean rememberExpectedElements = false;
    	
    	private Object parseToIndexTypeObject;
    	private int lastTokenIndex = 0;
    	
    	/**
    	 * A list of expected elements the were collected while parsing the input stream.
    	 * This list is only filled if <code>rememberExpectedElements</code> is set to
    	 * true.
    	 */
    	private java.util.List<org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectedTerminal> expectedElements = new java.util.ArrayList<org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectedTerminal>();
    	
    	private int mismatchedTokenRecoveryTries = 0;
    	/**
    	 * A helper list to allow a lexer to pass errors to its parser
    	 */
    	protected java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>());
    	
    	/**
    	 * Another helper list to allow a lexer to pass positions of errors to its parser
    	 */
    	protected java.util.List<Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<Integer>());
    	
    	/**
    	 * A stack for incomplete objects. This stack is used filled when the parser is
    	 * used for code completion. Whenever the parser starts to read an object it is
    	 * pushed on the stack. Once the element was parser completely it is popped from
    	 * the stack.
    	 */
    	java.util.List<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
    	
    	private int stopIncludingHiddenTokens;
    	private int stopExcludingHiddenTokens;
    	private int tokenIndexOfLastCompleteElement;
    	
    	private int expectedElementsIndexOfLastCompleteElement;
    	
    	/**
    	 * The offset indicating the cursor position when the parser is used for code
    	 * completion by calling parseToExpectedElements().
    	 */
    	private int cursorOffset;
    	
    	/**
    	 * The offset of the first hidden token of the last expected element. This offset
    	 * is used to discard expected elements, which are not needed for code completion.
    	 */
    	private int lastStartIncludingHidden;
    	
    	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
    		postParseCommands.add(new org.emftext.language.textAML3.resource.textAML3.ITextAML3Command<org.emftext.language.textAML3.resource.textAML3.ITextAML3TextResource>() {
    			public boolean execute(org.emftext.language.textAML3.resource.textAML3.ITextAML3TextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new org.emftext.language.textAML3.resource.textAML3.ITextAML3Problem() {
    					public org.emftext.language.textAML3.resource.textAML3.TextAML3EProblemSeverity getSeverity() {
    						return org.emftext.language.textAML3.resource.textAML3.TextAML3EProblemSeverity.ERROR;
    					}
    					public org.emftext.language.textAML3.resource.textAML3.TextAML3EProblemType getType() {
    						return org.emftext.language.textAML3.resource.textAML3.TextAML3EProblemType.SYNTAX_ERROR;
    					}
    					public String getMessage() {
    						return errorMessage;
    					}
    					public java.util.Collection<org.emftext.language.textAML3.resource.textAML3.ITextAML3QuickFix> getQuickFixes() {
    						return null;
    					}
    				}, column, line, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	public void addExpectedElement(org.eclipse.emf.ecore.EClass eClass, int[] ids) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		int terminalID = ids[0];
    		int followSetID = ids[1];
    		org.emftext.language.textAML3.resource.textAML3.ITextAML3ExpectedElement terminal = org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3FollowSetProvider.TERMINALS[terminalID];
    		org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContainedFeature[] containmentFeatures = new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContainedFeature[ids.length - 2];
    		for (int i = 2; i < ids.length; i++) {
    			containmentFeatures[i - 2] = org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3FollowSetProvider.LINKS[ids[i]];
    		}
    		org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3ContainmentTrace containmentTrace = new org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3ContainmentTrace(eClass, containmentFeatures);
    		org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    		org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectedTerminal expectedElement = new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectedTerminal(container, terminal, followSetID, containmentTrace);
    		setPosition(expectedElement, input.index());
    		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
    		if (lastStartIncludingHidden >= 0 && lastStartIncludingHidden < startIncludingHiddenTokens && cursorOffset > startIncludingHiddenTokens) {
    			// clear list of expected elements
    			this.expectedElements.clear();
    			this.expectedElementsIndexOfLastCompleteElement = 0;
    		}
    		lastStartIncludingHidden = startIncludingHiddenTokens;
    		this.expectedElements.add(expectedElement);
    	}
    	
    	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
    	}
    	
    	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new org.emftext.language.textAML3.resource.textAML3.ITextAML3Command<org.emftext.language.textAML3.resource.textAML3.ITextAML3TextResource>() {
    			public boolean execute(org.emftext.language.textAML3.resource.textAML3.ITextAML3TextResource resource) {
    				org.emftext.language.textAML3.resource.textAML3.ITextAML3LocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharStart(target, locationMap.getCharStart(source));
    				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
    				locationMap.setColumn(target, locationMap.getColumn(source));
    				locationMap.setLine(target, locationMap.getLine(source));
    				return true;
    			}
    		});
    	}
    	
    	protected void copyLocalizationInfos(final org.antlr.runtime3_4_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new org.emftext.language.textAML3.resource.textAML3.ITextAML3Command<org.emftext.language.textAML3.resource.textAML3.ITextAML3TextResource>() {
    			public boolean execute(org.emftext.language.textAML3.resource.textAML3.ITextAML3TextResource resource) {
    				org.emftext.language.textAML3.resource.textAML3.ITextAML3LocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				if (source == null) {
    					return true;
    				}
    				locationMap.setCharStart(target, source.getStartIndex());
    				locationMap.setCharEnd(target, source.getStopIndex());
    				locationMap.setColumn(target, source.getCharPositionInLine());
    				locationMap.setLine(target, source.getLine());
    				return true;
    			}
    		});
    	}
    	
    	/**
    	 * Sets the end character index and the last line for the given object in the
    	 * location map.
    	 */
    	protected void setLocalizationEnd(java.util.Collection<org.emftext.language.textAML3.resource.textAML3.ITextAML3Command<org.emftext.language.textAML3.resource.textAML3.ITextAML3TextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new org.emftext.language.textAML3.resource.textAML3.ITextAML3Command<org.emftext.language.textAML3.resource.textAML3.ITextAML3TextResource>() {
    			public boolean execute(org.emftext.language.textAML3.resource.textAML3.ITextAML3TextResource resource) {
    				org.emftext.language.textAML3.resource.textAML3.ITextAML3LocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharEnd(object, endChar);
    				locationMap.setLine(object, endLine);
    				return true;
    			}
    		});
    	}
    	
    	public org.emftext.language.textAML3.resource.textAML3.ITextAML3TextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new TextAML3Parser(new org.antlr.runtime3_4_0.CommonTokenStream(new TextAML3Lexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new TextAML3Parser(new org.antlr.runtime3_4_0.CommonTokenStream(new TextAML3Lexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			new org.emftext.language.textAML3.resource.textAML3.util.TextAML3RuntimeUtil().logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public TextAML3Parser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_4_0.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((TextAML3Lexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((TextAML3Lexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == org.emftext.language.textAML3.TypeSystemDec.class) {
    				return parse_org_emftext_language_textAML3_TypeSystemDec();
    			}
    			if (type.getInstanceClass() == org.emftext.language.textAML3.PackageElement.class) {
    				return parse_org_emftext_language_textAML3_PackageElement();
    			}
    			if (type.getInstanceClass() == org.emftext.language.textAML3.TypeDec.class) {
    				return parse_org_emftext_language_textAML3_TypeDec();
    			}
    			if (type.getInstanceClass() == org.emftext.language.textAML3.ModelElement.class) {
    				return parse_org_emftext_language_textAML3_ModelElement();
    			}
    			if (type.getInstanceClass() == org.emftext.language.textAML3.TypeRelation.class) {
    				return parse_org_emftext_language_textAML3_TypeRelation();
    			}
    			if (type.getInstanceClass() == org.emftext.language.textAML3.TypeRelationReference.class) {
    				return parse_org_emftext_language_textAML3_TypeRelationReference();
    			}
    			if (type.getInstanceClass() == org.emftext.language.textAML3.TypeRelationReferenceElement.class) {
    				return parse_org_emftext_language_textAML3_TypeRelationReferenceElement();
    			}
    			if (type.getInstanceClass() == org.emftext.language.textAML3.ModelElementRelation.class) {
    				return parse_org_emftext_language_textAML3_ModelElementRelation();
    			}
    			if (type.getInstanceClass() == org.emftext.language.textAML3.Generator.class) {
    				return parse_org_emftext_language_textAML3_Generator();
    			}
    			if (type.getInstanceClass() == org.emftext.language.textAML3.TypeRule.class) {
    				return parse_org_emftext_language_textAML3_TypeRule();
    			}
    			if (type.getInstanceClass() == org.emftext.language.textAML3.ErrorRule.class) {
    				return parse_org_emftext_language_textAML3_ErrorRule();
    			}
    			if (type.getInstanceClass() == org.emftext.language.textAML3.RuleElementExpression.class) {
    				return parse_org_emftext_language_textAML3_RuleElementExpression();
    			}
    			if (type.getInstanceClass() == org.emftext.language.textAML3.RuleElementAttribute.class) {
    				return parse_org_emftext_language_textAML3_RuleElementAttribute();
    			}
    			if (type.getInstanceClass() == org.emftext.language.textAML3.AttributeExpression.class) {
    				return parse_org_emftext_language_textAML3_AttributeExpression();
    			}
    			if (type.getInstanceClass() == org.emftext.language.textAML3.Variable.class) {
    				return parse_org_emftext_language_textAML3_Variable();
    			}
    			if (type.getInstanceClass() == org.emftext.language.textAML3.ContainmentVariable.class) {
    				return parse_org_emftext_language_textAML3_ContainmentVariable();
    			}
    			if (type.getInstanceClass() == org.emftext.language.textAML3.TypeReferenceElement.class) {
    				return parse_org_emftext_language_textAML3_TypeReferenceElement();
    			}
    			if (type.getInstanceClass() == org.emftext.language.textAML3.TypeAttribute.class) {
    				return parse_org_emftext_language_textAML3_TypeAttribute();
    			}
    		}
    		throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3UnexpectedContentTypeException(typeObject);
    	}
    	
    	public int getMismatchedTokenRecoveryTries() {
    		return mismatchedTokenRecoveryTries;
    	}
    	
    	public Object getMissingSymbol(org.antlr.runtime3_4_0.IntStream arg0, org.antlr.runtime3_4_0.RecognitionException arg1, int arg2, org.antlr.runtime3_4_0.BitSet arg3) {
    		mismatchedTokenRecoveryTries++;
    		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
    	}
    	
    	public Object getParseToIndexTypeObject() {
    		return parseToIndexTypeObject;
    	}
    	
    	protected Object getTypeObject() {
    		Object typeObject = getParseToIndexTypeObject();
    		if (typeObject != null) {
    			return typeObject;
    		}
    		java.util.Map<?,?> options = getOptions();
    		if (options != null) {
    			typeObject = options.get(org.emftext.language.textAML3.resource.textAML3.ITextAML3Options.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public org.emftext.language.textAML3.resource.textAML3.ITextAML3ParseResult parse() {
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<org.emftext.language.textAML3.resource.textAML3.ITextAML3Command<org.emftext.language.textAML3.resource.textAML3.ITextAML3TextResource>>();
    		org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ParseResult parseResult = new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ParseResult();
    		try {
    			org.eclipse.emf.ecore.EObject result =  doParse();
    			if (lexerExceptions.isEmpty()) {
    				parseResult.setRoot(result);
    			}
    		} catch (org.antlr.runtime3_4_0.RecognitionException re) {
    			reportError(re);
    		} catch (java.lang.IllegalArgumentException iae) {
    			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
    				// can be caused if a null is set on EMF models where not allowed. this will just
    				// happen if other errors occurred before
    			} else {
    				iae.printStackTrace();
    			}
    		}
    		for (org.antlr.runtime3_4_0.RecognitionException re : lexerExceptions) {
    			reportLexicalError(re);
    		}
    		parseResult.getPostParseCommands().addAll(postParseCommands);
    		return parseResult;
    	}
    	
    	public java.util.List<org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, org.emftext.language.textAML3.resource.textAML3.ITextAML3TextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final org.antlr.runtime3_4_0.CommonTokenStream tokenStream = (org.antlr.runtime3_4_0.CommonTokenStream) getTokenStream();
    		org.emftext.language.textAML3.resource.textAML3.ITextAML3ParseResult result = parse();
    		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
    			org.antlr.runtime3_4_0.Lexer lexer = (org.antlr.runtime3_4_0.Lexer) tokenStream.getTokenSource();
    			int endChar = lexer.getCharIndex();
    			int endLine = lexer.getLine();
    			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
    		}
    		if (result != null) {
    			org.eclipse.emf.ecore.EObject root = result.getRoot();
    			if (root != null) {
    				dummyResource.getContentsInternal().add(root);
    			}
    			for (org.emftext.language.textAML3.resource.textAML3.ITextAML3Command<org.emftext.language.textAML3.resource.textAML3.ITextAML3TextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectedTerminal>();
    		java.util.List<org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectedTerminal> newFollowSet = new java.util.ArrayList<org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 194;
    		int i;
    		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
    			org.antlr.runtime3_4_0.CommonToken nextToken = (org.antlr.runtime3_4_0.CommonToken) tokenStream.get(i);
    			if (nextToken.getType() < 0) {
    				break;
    			}
    			if (nextToken.getChannel() == 99) {
    				// hidden tokens do not reduce the follow set
    			} else {
    				// now that we have found the next visible token the position for that expected
    				// terminals can be set
    				for (org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<org.emftext.language.textAML3.resource.textAML3.util.TextAML3Pair<org.emftext.language.textAML3.resource.textAML3.ITextAML3ExpectedElement, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (org.emftext.language.textAML3.resource.textAML3.util.TextAML3Pair<org.emftext.language.textAML3.resource.textAML3.ITextAML3ExpectedElement, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContainedFeature[]> newFollowerPair : newFollowers) {
    							org.emftext.language.textAML3.resource.textAML3.ITextAML3ExpectedElement newFollower = newFollowerPair.getLeft();
    							org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    							org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3ContainmentTrace containmentTrace = new org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3ContainmentTrace(null, newFollowerPair.getRight());
    							org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectedTerminal newFollowTerminal = new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectedTerminal(container, newFollower, followSetID, containmentTrace);
    							newFollowSet.add(newFollowTerminal);
    							expectedElements.add(newFollowTerminal);
    						}
    					}
    				}
    				currentFollowSet.clear();
    				currentFollowSet.addAll(newFollowSet);
    			}
    			followSetID++;
    		}
    		// after the last token in the stream we must set the position for the elements
    		// that were added during the last iteration of the loop
    		for (org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectedTerminal expectedElement, int tokenIndex) {
    		int currentIndex = Math.max(0, tokenIndex);
    		for (int index = lastTokenIndex; index < currentIndex; index++) {
    			if (index >= input.size()) {
    				break;
    			}
    			org.antlr.runtime3_4_0.CommonToken tokenAtIndex = (org.antlr.runtime3_4_0.CommonToken) input.get(index);
    			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			if (tokenAtIndex.getChannel() != 99 && !anonymousTokens.contains(tokenAtIndex)) {
    				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			}
    		}
    		lastTokenIndex = Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
    	}
    	
    	public Object recoverFromMismatchedToken(org.antlr.runtime3_4_0.IntStream input, int ttype, org.antlr.runtime3_4_0.BitSet follow) throws org.antlr.runtime3_4_0.RecognitionException {
    		if (!rememberExpectedElements) {
    			return super.recoverFromMismatchedToken(input, ttype, follow);
    		} else {
    			return null;
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the parser into human readable messages.
    	 */
    	public void reportError(final org.antlr.runtime3_4_0.RecognitionException e)  {
    		String message = e.getMessage();
    		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
    			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
    			String expectedTokenName = formatTokenName(mte.expecting);
    			String actualTokenName = formatTokenName(e.token.getType());
    			message = "Syntax error on token \"" + e.token.getText() + " (" + actualTokenName + ")\", \"" + expectedTokenName + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedTreeNodeException) {
    			org.antlr.runtime3_4_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_4_0.MismatchedTreeNodeException) e;
    			String expectedTokenName = formatTokenName(mtne.expecting);
    			message = "mismatched tree node: " + "xxx" + "; tokenName " + expectedTokenName;
    		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
    		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
    			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
    			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
    			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
    			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
    			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
    		}
    		// the resource may be null if the parser is used for code completion
    		final String finalMessage = message;
    		if (e.token instanceof org.antlr.runtime3_4_0.CommonToken) {
    			final org.antlr.runtime3_4_0.CommonToken ct = (org.antlr.runtime3_4_0.CommonToken) e.token;
    			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
    		} else {
    			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the lexer into human readable messages.
    	 */
    	public void reportLexicalError(final org.antlr.runtime3_4_0.RecognitionException e)  {
    		String message = "";
    		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
    			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
    			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
    			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
    			org.antlr.runtime3_4_0.EarlyExitException eee = (org.antlr.runtime3_4_0.EarlyExitException) e;
    			message = "required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
    			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
    			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedRangeException) {
    			org.antlr.runtime3_4_0.MismatchedRangeException mre = (org.antlr.runtime3_4_0.MismatchedRangeException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
    		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
    			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
    		}
    		addErrorToResource(message, e.charPositionInLine, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
    	}
    	
    	private void startIncompleteElement(Object object) {
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.incompleteObjects.add((org.eclipse.emf.ecore.EObject) object);
    		}
    	}
    	
    	private void completedElement(Object object, boolean isContainment) {
    		if (isContainment && !this.incompleteObjects.isEmpty()) {
    			boolean exists = this.incompleteObjects.remove(object);
    			if (!exists) {
    			}
    		}
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
    			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
    		}
    	}
    	
    	private org.eclipse.emf.ecore.EObject getLastIncompleteElement() {
    		if (incompleteObjects.isEmpty()) {
    			return null;
    		}
    		return incompleteObjects.get(incompleteObjects.size() - 1);
    	}
    	



    // $ANTLR start "start"
    // TextAML3.g:550:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_org_emftext_language_textAML3_TypeSystemDec ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;

        int start_StartIndex = input.index();

        org.emftext.language.textAML3.TypeSystemDec c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // TextAML3.g:551:2: ( (c0= parse_org_emftext_language_textAML3_TypeSystemDec ) EOF )
            // TextAML3.g:552:2: (c0= parse_org_emftext_language_textAML3_TypeSystemDec ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[0]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // TextAML3.g:557:2: (c0= parse_org_emftext_language_textAML3_TypeSystemDec )
            // TextAML3.g:558:3: c0= parse_org_emftext_language_textAML3_TypeSystemDec
            {
            pushFollow(FOLLOW_parse_org_emftext_language_textAML3_TypeSystemDec_in_start82);
            c0=parse_org_emftext_language_textAML3_TypeSystemDec();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; }

            }


            match(input,EOF,FOLLOW_EOF_in_start89); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		retrieveLayoutInformation(element, null, null, false);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "start"



    // $ANTLR start "parse_org_emftext_language_textAML3_TypeSystemDec"
    // TextAML3.g:566:1: parse_org_emftext_language_textAML3_TypeSystemDec returns [org.emftext.language.textAML3.TypeSystemDec element = null] : a0= 'imports' ( (a1_0= parse_org_emftext_language_textAML3_PackageElement ) )* a2= 'start' (a3= REFERENCE ) a4= 'typesystem' ( (a5_0= parse_org_emftext_language_textAML3_TypeDec ) )* a6= 'widening' ( (a7_0= parse_org_emftext_language_textAML3_Relation ) )* a8= 'rules' ( ( (a9_0= parse_org_emftext_language_textAML3_ErrorRule ) | (a10_0= parse_org_emftext_language_textAML3_TypeRule ) ) )* a11= 'strategy' ( (a12_0= parse_org_emftext_language_textAML3_Relation ) )* a13= 'strategytarget' ( (a14= TEXT ) )* ;
    public final org.emftext.language.textAML3.TypeSystemDec parse_org_emftext_language_textAML3_TypeSystemDec() throws RecognitionException {
        org.emftext.language.textAML3.TypeSystemDec element =  null;

        int parse_org_emftext_language_textAML3_TypeSystemDec_StartIndex = input.index();

        Token a0=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a6=null;
        Token a8=null;
        Token a11=null;
        Token a13=null;
        Token a14=null;
        org.emftext.language.textAML3.PackageElement a1_0 =null;

        org.emftext.language.textAML3.TypeDec a5_0 =null;

        org.emftext.language.textAML3.Relation a7_0 =null;

        org.emftext.language.textAML3.ErrorRule a9_0 =null;

        org.emftext.language.textAML3.TypeRule a10_0 =null;

        org.emftext.language.textAML3.Relation a12_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // TextAML3.g:569:2: (a0= 'imports' ( (a1_0= parse_org_emftext_language_textAML3_PackageElement ) )* a2= 'start' (a3= REFERENCE ) a4= 'typesystem' ( (a5_0= parse_org_emftext_language_textAML3_TypeDec ) )* a6= 'widening' ( (a7_0= parse_org_emftext_language_textAML3_Relation ) )* a8= 'rules' ( ( (a9_0= parse_org_emftext_language_textAML3_ErrorRule ) | (a10_0= parse_org_emftext_language_textAML3_TypeRule ) ) )* a11= 'strategy' ( (a12_0= parse_org_emftext_language_textAML3_Relation ) )* a13= 'strategytarget' ( (a14= TEXT ) )* )
            // TextAML3.g:570:2: a0= 'imports' ( (a1_0= parse_org_emftext_language_textAML3_PackageElement ) )* a2= 'start' (a3= REFERENCE ) a4= 'typesystem' ( (a5_0= parse_org_emftext_language_textAML3_TypeDec ) )* a6= 'widening' ( (a7_0= parse_org_emftext_language_textAML3_Relation ) )* a8= 'rules' ( ( (a9_0= parse_org_emftext_language_textAML3_ErrorRule ) | (a10_0= parse_org_emftext_language_textAML3_TypeRule ) ) )* a11= 'strategy' ( (a12_0= parse_org_emftext_language_textAML3_Relation ) )* a13= 'strategytarget' ( (a14= TEXT ) )*
            {
            a0=(Token)match(input,33,FOLLOW_33_in_parse_org_emftext_language_textAML3_TypeSystemDec115); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeSystemDec();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_0_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[1]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[2]);
            	}

            // TextAML3.g:585:2: ( (a1_0= parse_org_emftext_language_textAML3_PackageElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==URL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // TextAML3.g:586:3: (a1_0= parse_org_emftext_language_textAML3_PackageElement )
            	    {
            	    // TextAML3.g:586:3: (a1_0= parse_org_emftext_language_textAML3_PackageElement )
            	    // TextAML3.g:587:4: a1_0= parse_org_emftext_language_textAML3_PackageElement
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_PackageElement_in_parse_org_emftext_language_textAML3_TypeSystemDec138);
            	    a1_0=parse_org_emftext_language_textAML3_PackageElement();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeSystemDec();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a1_0 != null) {
            	    					if (a1_0 != null) {
            	    						Object value = a1_0;
            	    						addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.TYPE_SYSTEM_DEC__PACKAGES, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_0_0_0_1, a1_0, true);
            	    					copyLocalizationInfos(a1_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[3]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[4]);
            	}

            a2=(Token)match(input,42,FOLLOW_42_in_parse_org_emftext_language_textAML3_TypeSystemDec164); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeSystemDec();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_0_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[5]);
            	}

            // TextAML3.g:628:2: (a3= REFERENCE )
            // TextAML3.g:629:3: a3= REFERENCE
            {
            a3=(Token)match(input,REFERENCE,FOLLOW_REFERENCE_in_parse_org_emftext_language_textAML3_TypeSystemDec182); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeSystemDec();
            				startIncompleteElement(element);
            			}
            			if (a3 != null) {
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REFERENCE");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_SYSTEM_DEC__BASECLASS), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.eclipse.emf.ecore.EClass proxy = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEClass();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContextDependentURIFragmentFactory<org.emftext.language.textAML3.TypeSystemDec, org.eclipse.emf.ecore.EClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeSystemDecBaseclassReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_SYSTEM_DEC__BASECLASS), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_SYSTEM_DEC__BASECLASS), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_0_0_0_3, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[6]);
            	}

            a4=(Token)match(input,46,FOLLOW_46_in_parse_org_emftext_language_textAML3_TypeSystemDec203); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeSystemDec();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_0_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[7]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[8]);
            	}

            // TextAML3.g:683:2: ( (a5_0= parse_org_emftext_language_textAML3_TypeDec ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TEXT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // TextAML3.g:684:3: (a5_0= parse_org_emftext_language_textAML3_TypeDec )
            	    {
            	    // TextAML3.g:684:3: (a5_0= parse_org_emftext_language_textAML3_TypeDec )
            	    // TextAML3.g:685:4: a5_0= parse_org_emftext_language_textAML3_TypeDec
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_TypeDec_in_parse_org_emftext_language_textAML3_TypeSystemDec226);
            	    a5_0=parse_org_emftext_language_textAML3_TypeDec();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeSystemDec();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a5_0 != null) {
            	    					if (a5_0 != null) {
            	    						Object value = a5_0;
            	    						addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.TYPE_SYSTEM_DEC__TYPEVALUES, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_0_0_0_5, a5_0, true);
            	    					copyLocalizationInfos(a5_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[9]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[10]);
            	}

            a6=(Token)match(input,48,FOLLOW_48_in_parse_org_emftext_language_textAML3_TypeSystemDec252); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeSystemDec();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_0_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[11]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[12]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[13]);
            	}

            // TextAML3.g:728:2: ( (a7_0= parse_org_emftext_language_textAML3_Relation ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= REFERENCE && LA3_0 <= TEXT)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // TextAML3.g:729:3: (a7_0= parse_org_emftext_language_textAML3_Relation )
            	    {
            	    // TextAML3.g:729:3: (a7_0= parse_org_emftext_language_textAML3_Relation )
            	    // TextAML3.g:730:4: a7_0= parse_org_emftext_language_textAML3_Relation
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Relation_in_parse_org_emftext_language_textAML3_TypeSystemDec275);
            	    a7_0=parse_org_emftext_language_textAML3_Relation();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeSystemDec();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a7_0 != null) {
            	    					if (a7_0 != null) {
            	    						Object value = a7_0;
            	    						addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.TYPE_SYSTEM_DEC__WIDENING, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_0_0_0_7, a7_0, true);
            	    					copyLocalizationInfos(a7_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[14]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[15]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[16]);
            	}

            a8=(Token)match(input,39,FOLLOW_39_in_parse_org_emftext_language_textAML3_TypeSystemDec301); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeSystemDec();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_0_0_0_8, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[17]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[18]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[19]);
            	}

            // TextAML3.g:774:2: ( ( (a9_0= parse_org_emftext_language_textAML3_ErrorRule ) | (a10_0= parse_org_emftext_language_textAML3_TypeRule ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27||LA5_0==31) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // TextAML3.g:775:3: ( (a9_0= parse_org_emftext_language_textAML3_ErrorRule ) | (a10_0= parse_org_emftext_language_textAML3_TypeRule ) )
            	    {
            	    // TextAML3.g:775:3: ( (a9_0= parse_org_emftext_language_textAML3_ErrorRule ) | (a10_0= parse_org_emftext_language_textAML3_TypeRule ) )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==27) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==31) ) {
            	        alt4=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // TextAML3.g:776:4: (a9_0= parse_org_emftext_language_textAML3_ErrorRule )
            	            {
            	            // TextAML3.g:776:4: (a9_0= parse_org_emftext_language_textAML3_ErrorRule )
            	            // TextAML3.g:777:5: a9_0= parse_org_emftext_language_textAML3_ErrorRule
            	            {
            	            pushFollow(FOLLOW_parse_org_emftext_language_textAML3_ErrorRule_in_parse_org_emftext_language_textAML3_TypeSystemDec330);
            	            a9_0=parse_org_emftext_language_textAML3_ErrorRule();

            	            state._fsp--;
            	            if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (terminateParsing) {
            	            						throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            	            					}
            	            					if (element == null) {
            	            						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeSystemDec();
            	            						startIncompleteElement(element);
            	            					}
            	            					if (a9_0 != null) {
            	            						if (a9_0 != null) {
            	            							Object value = a9_0;
            	            							addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.TYPE_SYSTEM_DEC__ERRORRULES, value);
            	            							completedElement(value, true);
            	            						}
            	            						collectHiddenTokens(element);
            	            						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_0_0_0_9_0_0_0, a9_0, true);
            	            						copyLocalizationInfos(a9_0, element);
            	            					}
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[20]);
            	            				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[21]);
            	            				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[22]);
            	            			}

            	            }
            	            break;
            	        case 2 :
            	            // TextAML3.g:805:8: (a10_0= parse_org_emftext_language_textAML3_TypeRule )
            	            {
            	            // TextAML3.g:805:8: (a10_0= parse_org_emftext_language_textAML3_TypeRule )
            	            // TextAML3.g:806:5: a10_0= parse_org_emftext_language_textAML3_TypeRule
            	            {
            	            pushFollow(FOLLOW_parse_org_emftext_language_textAML3_TypeRule_in_parse_org_emftext_language_textAML3_TypeSystemDec372);
            	            a10_0=parse_org_emftext_language_textAML3_TypeRule();

            	            state._fsp--;
            	            if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (terminateParsing) {
            	            						throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            	            					}
            	            					if (element == null) {
            	            						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeSystemDec();
            	            						startIncompleteElement(element);
            	            					}
            	            					if (a10_0 != null) {
            	            						if (a10_0 != null) {
            	            							Object value = a10_0;
            	            							addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.TYPE_SYSTEM_DEC__RULESYSTEM, value);
            	            							completedElement(value, true);
            	            						}
            	            						collectHiddenTokens(element);
            	            						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_0_0_0_9_0_1_0, a10_0, true);
            	            						copyLocalizationInfos(a10_0, element);
            	            					}
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[23]);
            	            				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[24]);
            	            				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[25]);
            	            			}

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[26]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[27]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[28]);
            	}

            a11=(Token)match(input,43,FOLLOW_43_in_parse_org_emftext_language_textAML3_TypeSystemDec413); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeSystemDec();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_0_0_0_10, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[29]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[30]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[31]);
            	}

            // TextAML3.g:858:2: ( (a12_0= parse_org_emftext_language_textAML3_Relation ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= REFERENCE && LA6_0 <= TEXT)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // TextAML3.g:859:3: (a12_0= parse_org_emftext_language_textAML3_Relation )
            	    {
            	    // TextAML3.g:859:3: (a12_0= parse_org_emftext_language_textAML3_Relation )
            	    // TextAML3.g:860:4: a12_0= parse_org_emftext_language_textAML3_Relation
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Relation_in_parse_org_emftext_language_textAML3_TypeSystemDec436);
            	    a12_0=parse_org_emftext_language_textAML3_Relation();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeSystemDec();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a12_0 != null) {
            	    					if (a12_0 != null) {
            	    						Object value = a12_0;
            	    						addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.TYPE_SYSTEM_DEC__STRATEGY, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_0_0_0_11, a12_0, true);
            	    					copyLocalizationInfos(a12_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[32]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[33]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[34]);
            	}

            a13=(Token)match(input,44,FOLLOW_44_in_parse_org_emftext_language_textAML3_TypeSystemDec462); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeSystemDec();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_0_0_0_12, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[35]);
            	}

            // TextAML3.g:902:2: ( (a14= TEXT ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==TEXT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // TextAML3.g:903:3: (a14= TEXT )
            	    {
            	    // TextAML3.g:903:3: (a14= TEXT )
            	    // TextAML3.g:904:4: a14= TEXT
            	    {
            	    a14=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_TypeSystemDec485); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeSystemDec();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a14 != null) {
            	    					org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            	    					tokenResolver.setOptions(getOptions());
            	    					org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result = getFreshTokenResolveResult();
            	    					tokenResolver.resolve(a14.getText(), element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_SYSTEM_DEC__STRATEGYTARGET), result);
            	    					Object resolvedObject = result.getResolvedToken();
            	    					if (resolvedObject == null) {
            	    						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a14).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a14).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a14).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a14).getStopIndex());
            	    					}
            	    					String resolved = (String) resolvedObject;
            	    					org.eclipse.emf.ecore.EStructuralFeature proxy = createDynamicProxy(org.eclipse.emf.ecore.EStructuralFeature.class);
            	    					collectHiddenTokens(element);
            	    					registerContextDependentProxy(new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContextDependentURIFragmentFactory<org.emftext.language.textAML3.TypeSystemDec, org.eclipse.emf.ecore.EStructuralFeature>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeSystemDecStrategytargetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_SYSTEM_DEC__STRATEGYTARGET), resolved, proxy);
            	    					if (proxy != null) {
            	    						Object value = proxy;
            	    						addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.TYPE_SYSTEM_DEC__STRATEGYTARGET, value);
            	    						completedElement(value, false);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_0_0_0_13, proxy, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a14, element);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a14, proxy);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[36]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, parse_org_emftext_language_textAML3_TypeSystemDec_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_TypeSystemDec"



    // $ANTLR start "parse_org_emftext_language_textAML3_PackageElement"
    // TextAML3.g:946:1: parse_org_emftext_language_textAML3_PackageElement returns [org.emftext.language.textAML3.PackageElement element = null] : (a0= URL ) a1= ';' ;
    public final org.emftext.language.textAML3.PackageElement parse_org_emftext_language_textAML3_PackageElement() throws RecognitionException {
        org.emftext.language.textAML3.PackageElement element =  null;

        int parse_org_emftext_language_textAML3_PackageElement_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // TextAML3.g:949:2: ( (a0= URL ) a1= ';' )
            // TextAML3.g:950:2: (a0= URL ) a1= ';'
            {
            // TextAML3.g:950:2: (a0= URL )
            // TextAML3.g:951:3: a0= URL
            {
            a0=(Token)match(input,URL,FOLLOW_URL_in_parse_org_emftext_language_textAML3_PackageElement534); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createPackageElement();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("URL");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.PACKAGE_ELEMENT__TARGETPACKAGE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.eclipse.emf.ecore.EPackage proxy = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEPackage();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContextDependentURIFragmentFactory<org.emftext.language.textAML3.PackageElement, org.eclipse.emf.ecore.EPackage>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getPackageElementTargetpackageReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.PACKAGE_ELEMENT__TARGETPACKAGE), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.PACKAGE_ELEMENT__TARGETPACKAGE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_1_0_0_0, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[37]);
            	}

            a1=(Token)match(input,22,FOLLOW_22_in_parse_org_emftext_language_textAML3_PackageElement555); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createPackageElement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_1_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[38]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[39]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, parse_org_emftext_language_textAML3_PackageElement_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_PackageElement"



    // $ANTLR start "parse_org_emftext_language_textAML3_TypeDec"
    // TextAML3.g:1007:1: parse_org_emftext_language_textAML3_TypeDec returns [org.emftext.language.textAML3.TypeDec element = null] : (a0= TEXT ) ( (a1= '(' (a2_0= parse_org_emftext_language_textAML3_TypeAttribute ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeAttribute ) ) )* a5= ')' ) )? ( ( (a6_0= parse_org_emftext_language_textAML3_ModelElement ) ) )* a7= ';' ;
    public final org.emftext.language.textAML3.TypeDec parse_org_emftext_language_textAML3_TypeDec() throws RecognitionException {
        org.emftext.language.textAML3.TypeDec element =  null;

        int parse_org_emftext_language_textAML3_TypeDec_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a5=null;
        Token a7=null;
        org.emftext.language.textAML3.TypeAttribute a2_0 =null;

        org.emftext.language.textAML3.TypeAttribute a4_0 =null;

        org.emftext.language.textAML3.ModelElement a6_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // TextAML3.g:1010:2: ( (a0= TEXT ) ( (a1= '(' (a2_0= parse_org_emftext_language_textAML3_TypeAttribute ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeAttribute ) ) )* a5= ')' ) )? ( ( (a6_0= parse_org_emftext_language_textAML3_ModelElement ) ) )* a7= ';' )
            // TextAML3.g:1011:2: (a0= TEXT ) ( (a1= '(' (a2_0= parse_org_emftext_language_textAML3_TypeAttribute ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeAttribute ) ) )* a5= ')' ) )? ( ( (a6_0= parse_org_emftext_language_textAML3_ModelElement ) ) )* a7= ';'
            {
            // TextAML3.g:1011:2: (a0= TEXT )
            // TextAML3.g:1012:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_TypeDec588); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeDec();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_DEC__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_DEC__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_2_0_0_0, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[40]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[41]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[42]);
            	}

            // TextAML3.g:1049:2: ( (a1= '(' (a2_0= parse_org_emftext_language_textAML3_TypeAttribute ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeAttribute ) ) )* a5= ')' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // TextAML3.g:1050:3: (a1= '(' (a2_0= parse_org_emftext_language_textAML3_TypeAttribute ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeAttribute ) ) )* a5= ')' )
                    {
                    // TextAML3.g:1050:3: (a1= '(' (a2_0= parse_org_emftext_language_textAML3_TypeAttribute ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeAttribute ) ) )* a5= ')' )
                    // TextAML3.g:1051:4: a1= '(' (a2_0= parse_org_emftext_language_textAML3_TypeAttribute ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeAttribute ) ) )* a5= ')'
                    {
                    a1=(Token)match(input,14,FOLLOW_14_in_parse_org_emftext_language_textAML3_TypeDec618); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeDec();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_2_0_0_1_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[43]);
                    			}

                    // TextAML3.g:1065:4: (a2_0= parse_org_emftext_language_textAML3_TypeAttribute )
                    // TextAML3.g:1066:5: a2_0= parse_org_emftext_language_textAML3_TypeAttribute
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_TypeAttribute_in_parse_org_emftext_language_textAML3_TypeDec644);
                    a2_0=parse_org_emftext_language_textAML3_TypeAttribute();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeDec();
                    						startIncompleteElement(element);
                    					}
                    					if (a2_0 != null) {
                    						if (a2_0 != null) {
                    							Object value = a2_0;
                    							addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.TYPE_DEC__ATTRIBUTES, value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_2_0_0_1_0_0_1, a2_0, true);
                    						copyLocalizationInfos(a2_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[44]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[45]);
                    			}

                    // TextAML3.g:1092:4: ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeAttribute ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==18) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // TextAML3.g:1093:5: (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeAttribute ) )
                    	    {
                    	    // TextAML3.g:1093:5: (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeAttribute ) )
                    	    // TextAML3.g:1094:6: a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeAttribute )
                    	    {
                    	    a3=(Token)match(input,18,FOLLOW_18_in_parse_org_emftext_language_textAML3_TypeDec685); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeDec();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_2_0_0_1_0_0_2_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[46]);
                    	    					}

                    	    // TextAML3.g:1108:6: (a4_0= parse_org_emftext_language_textAML3_TypeAttribute )
                    	    // TextAML3.g:1109:7: a4_0= parse_org_emftext_language_textAML3_TypeAttribute
                    	    {
                    	    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_TypeAttribute_in_parse_org_emftext_language_textAML3_TypeDec719);
                    	    a4_0=parse_org_emftext_language_textAML3_TypeAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    							if (terminateParsing) {
                    	    								throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    	    							}
                    	    							if (element == null) {
                    	    								element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeDec();
                    	    								startIncompleteElement(element);
                    	    							}
                    	    							if (a4_0 != null) {
                    	    								if (a4_0 != null) {
                    	    									Object value = a4_0;
                    	    									addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.TYPE_DEC__ATTRIBUTES, value);
                    	    									completedElement(value, true);
                    	    								}
                    	    								collectHiddenTokens(element);
                    	    								retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_2_0_0_1_0_0_2_0_0_1, a4_0, true);
                    	    								copyLocalizationInfos(a4_0, element);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[47]);
                    	    						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[48]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[49]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[50]);
                    			}

                    a5=(Token)match(input,15,FOLLOW_15_in_parse_org_emftext_language_textAML3_TypeDec780); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeDec();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_2_0_0_1_0_0_3, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[51]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[52]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[53]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[54]);
            	}

            // TextAML3.g:1166:2: ( ( (a6_0= parse_org_emftext_language_textAML3_ModelElement ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= 23 && LA10_0 <= 25)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // TextAML3.g:1167:3: ( (a6_0= parse_org_emftext_language_textAML3_ModelElement ) )
            	    {
            	    // TextAML3.g:1167:3: ( (a6_0= parse_org_emftext_language_textAML3_ModelElement ) )
            	    // TextAML3.g:1168:4: (a6_0= parse_org_emftext_language_textAML3_ModelElement )
            	    {
            	    // TextAML3.g:1168:4: (a6_0= parse_org_emftext_language_textAML3_ModelElement )
            	    // TextAML3.g:1169:5: a6_0= parse_org_emftext_language_textAML3_ModelElement
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_ModelElement_in_parse_org_emftext_language_textAML3_TypeDec828);
            	    a6_0=parse_org_emftext_language_textAML3_ModelElement();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeDec();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a6_0 != null) {
            	    						if (a6_0 != null) {
            	    							Object value = a6_0;
            	    							addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.TYPE_DEC__REPRESENTATION, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_2_0_0_2_0_0_0, a6_0, true);
            	    						copyLocalizationInfos(a6_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[55]);
            	    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[56]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[57]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[58]);
            	}

            a7=(Token)match(input,22,FOLLOW_22_in_parse_org_emftext_language_textAML3_TypeDec869); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeDec();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_2_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[59]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[60]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, parse_org_emftext_language_textAML3_TypeDec_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_TypeDec"



    // $ANTLR start "parse_org_emftext_language_textAML3_ModelElement"
    // TextAML3.g:1220:1: parse_org_emftext_language_textAML3_ModelElement returns [org.emftext.language.textAML3.ModelElement element = null] : ( (a0= '<' |a1= '>' |a2= '=' ) ) (a5= REFERENCE ) ( (a6= '(' (a7= TEXT ) ( (a8= ',' (a9= TEXT ) ) )* a10= ')' ) )? ;
    public final org.emftext.language.textAML3.ModelElement parse_org_emftext_language_textAML3_ModelElement() throws RecognitionException {
        org.emftext.language.textAML3.ModelElement element =  null;

        int parse_org_emftext_language_textAML3_ModelElement_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // TextAML3.g:1223:2: ( ( (a0= '<' |a1= '>' |a2= '=' ) ) (a5= REFERENCE ) ( (a6= '(' (a7= TEXT ) ( (a8= ',' (a9= TEXT ) ) )* a10= ')' ) )? )
            // TextAML3.g:1224:2: ( (a0= '<' |a1= '>' |a2= '=' ) ) (a5= REFERENCE ) ( (a6= '(' (a7= TEXT ) ( (a8= ',' (a9= TEXT ) ) )* a10= ')' ) )?
            {
            // TextAML3.g:1224:2: ( (a0= '<' |a1= '>' |a2= '=' ) )
            // TextAML3.g:1225:3: (a0= '<' |a1= '>' |a2= '=' )
            {
            // TextAML3.g:1225:3: (a0= '<' |a1= '>' |a2= '=' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            case 24:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // TextAML3.g:1226:4: a0= '<'
                    {
                    a0=(Token)match(input,23,FOLLOW_23_in_parse_org_emftext_language_textAML3_ModelElement907); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElement();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_3_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementConnection().getEEnumLiteral(org.emftext.language.textAML3.ModelElementConnection.IN_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.MODEL_ELEMENT__RELATION), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // TextAML3.g:1239:8: a1= '>'
                    {
                    a1=(Token)match(input,25,FOLLOW_25_in_parse_org_emftext_language_textAML3_ModelElement922); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElement();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_3_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementConnection().getEEnumLiteral(org.emftext.language.textAML3.ModelElementConnection.OUT_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.MODEL_ELEMENT__RELATION), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 3 :
                    // TextAML3.g:1252:8: a2= '='
                    {
                    a2=(Token)match(input,24,FOLLOW_24_in_parse_org_emftext_language_textAML3_ModelElement937); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElement();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_3_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementConnection().getEEnumLiteral(org.emftext.language.textAML3.ModelElementConnection.IN_OUT_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.MODEL_ELEMENT__RELATION), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[61]);
            	}

            // TextAML3.g:1272:2: (a5= REFERENCE )
            // TextAML3.g:1273:3: a5= REFERENCE
            {
            a5=(Token)match(input,REFERENCE,FOLLOW_REFERENCE_in_parse_org_emftext_language_textAML3_ModelElement962); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElement();
            				startIncompleteElement(element);
            			}
            			if (a5 != null) {
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REFERENCE");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.MODEL_ELEMENT__TARGETCLASS), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.eclipse.emf.ecore.EClass proxy = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEClass();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContextDependentURIFragmentFactory<org.emftext.language.textAML3.ModelElement, org.eclipse.emf.ecore.EClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getModelElementTargetclassReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.MODEL_ELEMENT__TARGETCLASS), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.MODEL_ELEMENT__TARGETCLASS), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_3_0_0_1, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[62]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[63]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[64]);
            	}

            // TextAML3.g:1314:2: ( (a6= '(' (a7= TEXT ) ( (a8= ',' (a9= TEXT ) ) )* a10= ')' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==14) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // TextAML3.g:1315:3: (a6= '(' (a7= TEXT ) ( (a8= ',' (a9= TEXT ) ) )* a10= ')' )
                    {
                    // TextAML3.g:1315:3: (a6= '(' (a7= TEXT ) ( (a8= ',' (a9= TEXT ) ) )* a10= ')' )
                    // TextAML3.g:1316:4: a6= '(' (a7= TEXT ) ( (a8= ',' (a9= TEXT ) ) )* a10= ')'
                    {
                    a6=(Token)match(input,14,FOLLOW_14_in_parse_org_emftext_language_textAML3_ModelElement992); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElement();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_3_0_0_2_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[65]);
                    			}

                    // TextAML3.g:1330:4: (a7= TEXT )
                    // TextAML3.g:1331:5: a7= TEXT
                    {
                    a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_ModelElement1018); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElement();
                    						startIncompleteElement(element);
                    					}
                    					if (a7 != null) {
                    						org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                    						tokenResolver.setOptions(getOptions());
                    						org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.MODEL_ELEMENT__ATTRIBUTES), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
                    						}
                    						String resolved = (String) resolvedObject;
                    						org.eclipse.emf.ecore.EStructuralFeature proxy = createDynamicProxy(org.eclipse.emf.ecore.EStructuralFeature.class);
                    						collectHiddenTokens(element);
                    						registerContextDependentProxy(new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContextDependentURIFragmentFactory<org.emftext.language.textAML3.ModelElement, org.eclipse.emf.ecore.EStructuralFeature>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getModelElementAttributesReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.MODEL_ELEMENT__ATTRIBUTES), resolved, proxy);
                    						if (proxy != null) {
                    							Object value = proxy;
                    							addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.MODEL_ELEMENT__ATTRIBUTES, value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_3_0_0_2_0_0_1, proxy, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, proxy);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[66]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[67]);
                    			}

                    // TextAML3.g:1371:4: ( (a8= ',' (a9= TEXT ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==18) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // TextAML3.g:1372:5: (a8= ',' (a9= TEXT ) )
                    	    {
                    	    // TextAML3.g:1372:5: (a8= ',' (a9= TEXT ) )
                    	    // TextAML3.g:1373:6: a8= ',' (a9= TEXT )
                    	    {
                    	    a8=(Token)match(input,18,FOLLOW_18_in_parse_org_emftext_language_textAML3_ModelElement1064); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElement();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_3_0_0_2_0_0_2_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[68]);
                    	    					}

                    	    // TextAML3.g:1387:6: (a9= TEXT )
                    	    // TextAML3.g:1388:7: a9= TEXT
                    	    {
                    	    a9=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_ModelElement1098); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    							if (terminateParsing) {
                    	    								throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    	    							}
                    	    							if (element == null) {
                    	    								element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElement();
                    	    								startIncompleteElement(element);
                    	    							}
                    	    							if (a9 != null) {
                    	    								org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                    	    								tokenResolver.setOptions(getOptions());
                    	    								org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result = getFreshTokenResolveResult();
                    	    								tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.MODEL_ELEMENT__ATTRIBUTES), result);
                    	    								Object resolvedObject = result.getResolvedToken();
                    	    								if (resolvedObject == null) {
                    	    									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a9).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a9).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a9).getStopIndex());
                    	    								}
                    	    								String resolved = (String) resolvedObject;
                    	    								org.eclipse.emf.ecore.EStructuralFeature proxy = createDynamicProxy(org.eclipse.emf.ecore.EStructuralFeature.class);
                    	    								collectHiddenTokens(element);
                    	    								registerContextDependentProxy(new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContextDependentURIFragmentFactory<org.emftext.language.textAML3.ModelElement, org.eclipse.emf.ecore.EStructuralFeature>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getModelElementAttributesReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.MODEL_ELEMENT__ATTRIBUTES), resolved, proxy);
                    	    								if (proxy != null) {
                    	    									Object value = proxy;
                    	    									addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.MODEL_ELEMENT__ATTRIBUTES, value);
                    	    									completedElement(value, false);
                    	    								}
                    	    								collectHiddenTokens(element);
                    	    								retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_3_0_0_2_0_0_2_0_0_1, proxy, true);
                    	    								copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a9, element);
                    	    								copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a9, proxy);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[69]);
                    	    						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[70]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[71]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[72]);
                    			}

                    a10=(Token)match(input,15,FOLLOW_15_in_parse_org_emftext_language_textAML3_ModelElement1166); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElement();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_3_0_0_2_0_0_3, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[73]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[74]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[75]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[76]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_org_emftext_language_textAML3_ModelElement_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_ModelElement"



    // $ANTLR start "parse_org_emftext_language_textAML3_TypeRelation"
    // TextAML3.g:1461:1: parse_org_emftext_language_textAML3_TypeRelation returns [org.emftext.language.textAML3.TypeRelation element = null] : (a0_0= parse_org_emftext_language_textAML3_TypeRelationReference ) ( (a1= '<' |a2= '=' |a3= '>' ) ) (a6_0= parse_org_emftext_language_textAML3_TypeRelationReference ) ( (a7= 'if' (a8_0= parse_org_emftext_language_textAML3_Condition ) ( (a9= ',' (a10_0= parse_org_emftext_language_textAML3_Condition ) ) )* ) )? ;
    public final org.emftext.language.textAML3.TypeRelation parse_org_emftext_language_textAML3_TypeRelation() throws RecognitionException {
        org.emftext.language.textAML3.TypeRelation element =  null;

        int parse_org_emftext_language_textAML3_TypeRelation_StartIndex = input.index();

        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a7=null;
        Token a9=null;
        org.emftext.language.textAML3.TypeRelationReference a0_0 =null;

        org.emftext.language.textAML3.TypeRelationReference a6_0 =null;

        org.emftext.language.textAML3.Condition a8_0 =null;

        org.emftext.language.textAML3.Condition a10_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // TextAML3.g:1464:2: ( (a0_0= parse_org_emftext_language_textAML3_TypeRelationReference ) ( (a1= '<' |a2= '=' |a3= '>' ) ) (a6_0= parse_org_emftext_language_textAML3_TypeRelationReference ) ( (a7= 'if' (a8_0= parse_org_emftext_language_textAML3_Condition ) ( (a9= ',' (a10_0= parse_org_emftext_language_textAML3_Condition ) ) )* ) )? )
            // TextAML3.g:1465:2: (a0_0= parse_org_emftext_language_textAML3_TypeRelationReference ) ( (a1= '<' |a2= '=' |a3= '>' ) ) (a6_0= parse_org_emftext_language_textAML3_TypeRelationReference ) ( (a7= 'if' (a8_0= parse_org_emftext_language_textAML3_Condition ) ( (a9= ',' (a10_0= parse_org_emftext_language_textAML3_Condition ) ) )* ) )?
            {
            // TextAML3.g:1465:2: (a0_0= parse_org_emftext_language_textAML3_TypeRelationReference )
            // TextAML3.g:1466:3: a0_0= parse_org_emftext_language_textAML3_TypeRelationReference
            {
            pushFollow(FOLLOW_parse_org_emftext_language_textAML3_TypeRelationReference_in_parse_org_emftext_language_textAML3_TypeRelation1218);
            a0_0=parse_org_emftext_language_textAML3_TypeRelationReference();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRelation();
            				startIncompleteElement(element);
            			}
            			if (a0_0 != null) {
            				if (a0_0 != null) {
            					Object value = a0_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_RELATION__LHS), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_4_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[77]);
            	}

            // TextAML3.g:1491:2: ( (a1= '<' |a2= '=' |a3= '>' ) )
            // TextAML3.g:1492:3: (a1= '<' |a2= '=' |a3= '>' )
            {
            // TextAML3.g:1492:3: (a1= '<' |a2= '=' |a3= '>' )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt14=1;
                }
                break;
            case 24:
                {
                alt14=2;
                }
                break;
            case 25:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // TextAML3.g:1493:4: a1= '<'
                    {
                    a1=(Token)match(input,23,FOLLOW_23_in_parse_org_emftext_language_textAML3_TypeRelation1245); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRelation();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_4_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getComparisonOperator().getEEnumLiteral(org.emftext.language.textAML3.ComparisonOperator.LESS_EQUAL_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_RELATION__OPERATOR), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // TextAML3.g:1506:8: a2= '='
                    {
                    a2=(Token)match(input,24,FOLLOW_24_in_parse_org_emftext_language_textAML3_TypeRelation1260); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRelation();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_4_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getComparisonOperator().getEEnumLiteral(org.emftext.language.textAML3.ComparisonOperator.EQUAL_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_RELATION__OPERATOR), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 3 :
                    // TextAML3.g:1519:8: a3= '>'
                    {
                    a3=(Token)match(input,25,FOLLOW_25_in_parse_org_emftext_language_textAML3_TypeRelation1275); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRelation();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_4_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getComparisonOperator().getEEnumLiteral(org.emftext.language.textAML3.ComparisonOperator.GREATER_EQUAL_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_RELATION__OPERATOR), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[78]);
            	}

            // TextAML3.g:1539:2: (a6_0= parse_org_emftext_language_textAML3_TypeRelationReference )
            // TextAML3.g:1540:3: a6_0= parse_org_emftext_language_textAML3_TypeRelationReference
            {
            pushFollow(FOLLOW_parse_org_emftext_language_textAML3_TypeRelationReference_in_parse_org_emftext_language_textAML3_TypeRelation1300);
            a6_0=parse_org_emftext_language_textAML3_TypeRelationReference();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRelation();
            				startIncompleteElement(element);
            			}
            			if (a6_0 != null) {
            				if (a6_0 != null) {
            					Object value = a6_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_RELATION__RHS), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_4_0_0_2, a6_0, true);
            				copyLocalizationInfos(a6_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[79]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[80]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[81]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[82]);
            	}

            // TextAML3.g:1568:2: ( (a7= 'if' (a8_0= parse_org_emftext_language_textAML3_Condition ) ( (a9= ',' (a10_0= parse_org_emftext_language_textAML3_Condition ) ) )* ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // TextAML3.g:1569:3: (a7= 'if' (a8_0= parse_org_emftext_language_textAML3_Condition ) ( (a9= ',' (a10_0= parse_org_emftext_language_textAML3_Condition ) ) )* )
                    {
                    // TextAML3.g:1569:3: (a7= 'if' (a8_0= parse_org_emftext_language_textAML3_Condition ) ( (a9= ',' (a10_0= parse_org_emftext_language_textAML3_Condition ) ) )* )
                    // TextAML3.g:1570:4: a7= 'if' (a8_0= parse_org_emftext_language_textAML3_Condition ) ( (a9= ',' (a10_0= parse_org_emftext_language_textAML3_Condition ) ) )*
                    {
                    a7=(Token)match(input,32,FOLLOW_32_in_parse_org_emftext_language_textAML3_TypeRelation1327); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRelation();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_4_0_0_3_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[83]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[84]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[85]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[86]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[87]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[88]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[89]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[90]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[91]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[92]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[93]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[94]);
                    			}

                    // TextAML3.g:1595:4: (a8_0= parse_org_emftext_language_textAML3_Condition )
                    // TextAML3.g:1596:5: a8_0= parse_org_emftext_language_textAML3_Condition
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Condition_in_parse_org_emftext_language_textAML3_TypeRelation1353);
                    a8_0=parse_org_emftext_language_textAML3_Condition();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRelation();
                    						startIncompleteElement(element);
                    					}
                    					if (a8_0 != null) {
                    						if (a8_0 != null) {
                    							Object value = a8_0;
                    							addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.TYPE_RELATION__CONDITIONS, value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_4_0_0_3_0_0_1, a8_0, true);
                    						copyLocalizationInfos(a8_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[95]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[96]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[97]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[98]);
                    			}

                    // TextAML3.g:1624:4: ( (a9= ',' (a10_0= parse_org_emftext_language_textAML3_Condition ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==18) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // TextAML3.g:1625:5: (a9= ',' (a10_0= parse_org_emftext_language_textAML3_Condition ) )
                    	    {
                    	    // TextAML3.g:1625:5: (a9= ',' (a10_0= parse_org_emftext_language_textAML3_Condition ) )
                    	    // TextAML3.g:1626:6: a9= ',' (a10_0= parse_org_emftext_language_textAML3_Condition )
                    	    {
                    	    a9=(Token)match(input,18,FOLLOW_18_in_parse_org_emftext_language_textAML3_TypeRelation1394); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRelation();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_4_0_0_3_0_0_2_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[99]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[100]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[101]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[102]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[103]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[104]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[105]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[106]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[107]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[108]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[109]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[110]);
                    	    					}

                    	    // TextAML3.g:1651:6: (a10_0= parse_org_emftext_language_textAML3_Condition )
                    	    // TextAML3.g:1652:7: a10_0= parse_org_emftext_language_textAML3_Condition
                    	    {
                    	    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Condition_in_parse_org_emftext_language_textAML3_TypeRelation1428);
                    	    a10_0=parse_org_emftext_language_textAML3_Condition();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    							if (terminateParsing) {
                    	    								throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    	    							}
                    	    							if (element == null) {
                    	    								element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRelation();
                    	    								startIncompleteElement(element);
                    	    							}
                    	    							if (a10_0 != null) {
                    	    								if (a10_0 != null) {
                    	    									Object value = a10_0;
                    	    									addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.TYPE_RELATION__CONDITIONS, value);
                    	    									completedElement(value, true);
                    	    								}
                    	    								collectHiddenTokens(element);
                    	    								retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_4_0_0_3_0_0_2_0_0_1, a10_0, true);
                    	    								copyLocalizationInfos(a10_0, element);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[111]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[112]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[113]);
                    	    						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[114]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[115]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[116]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[117]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[118]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[119]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[120]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[121]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, parse_org_emftext_language_textAML3_TypeRelation_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_TypeRelation"



    // $ANTLR start "parse_org_emftext_language_textAML3_TypeRelationReference"
    // TextAML3.g:1701:1: parse_org_emftext_language_textAML3_TypeRelationReference returns [org.emftext.language.textAML3.TypeRelationReference element = null] : (a0= TEXT ) ( (a1= '(' (a2_0= parse_org_emftext_language_textAML3_TypeRelationReferenceElement ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeRelationReferenceElement ) ) )* a5= ')' ) )? ;
    public final org.emftext.language.textAML3.TypeRelationReference parse_org_emftext_language_textAML3_TypeRelationReference() throws RecognitionException {
        org.emftext.language.textAML3.TypeRelationReference element =  null;

        int parse_org_emftext_language_textAML3_TypeRelationReference_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a5=null;
        org.emftext.language.textAML3.TypeRelationReferenceElement a2_0 =null;

        org.emftext.language.textAML3.TypeRelationReferenceElement a4_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // TextAML3.g:1704:2: ( (a0= TEXT ) ( (a1= '(' (a2_0= parse_org_emftext_language_textAML3_TypeRelationReferenceElement ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeRelationReferenceElement ) ) )* a5= ')' ) )? )
            // TextAML3.g:1705:2: (a0= TEXT ) ( (a1= '(' (a2_0= parse_org_emftext_language_textAML3_TypeRelationReferenceElement ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeRelationReferenceElement ) ) )* a5= ')' ) )?
            {
            // TextAML3.g:1705:2: (a0= TEXT )
            // TextAML3.g:1706:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_TypeRelationReference1521); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRelationReference();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_RELATION_REFERENCE__TARGET), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.emftext.language.textAML3.TypeDec proxy = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeDec();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContextDependentURIFragmentFactory<org.emftext.language.textAML3.TypeRelationReference, org.emftext.language.textAML3.TypeDec>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeRelationReferenceTargetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_RELATION_REFERENCE__TARGET), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_RELATION_REFERENCE__TARGET), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_5_0_0_0, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[122]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[123]);
            	}

            // TextAML3.g:1746:2: ( (a1= '(' (a2_0= parse_org_emftext_language_textAML3_TypeRelationReferenceElement ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeRelationReferenceElement ) ) )* a5= ')' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // TextAML3.g:1747:3: (a1= '(' (a2_0= parse_org_emftext_language_textAML3_TypeRelationReferenceElement ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeRelationReferenceElement ) ) )* a5= ')' )
                    {
                    // TextAML3.g:1747:3: (a1= '(' (a2_0= parse_org_emftext_language_textAML3_TypeRelationReferenceElement ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeRelationReferenceElement ) ) )* a5= ')' )
                    // TextAML3.g:1748:4: a1= '(' (a2_0= parse_org_emftext_language_textAML3_TypeRelationReferenceElement ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeRelationReferenceElement ) ) )* a5= ')'
                    {
                    a1=(Token)match(input,14,FOLLOW_14_in_parse_org_emftext_language_textAML3_TypeRelationReference1551); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRelationReference();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_5_0_0_1_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelationReference(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[124]);
                    			}

                    // TextAML3.g:1762:4: (a2_0= parse_org_emftext_language_textAML3_TypeRelationReferenceElement )
                    // TextAML3.g:1763:5: a2_0= parse_org_emftext_language_textAML3_TypeRelationReferenceElement
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_TypeRelationReferenceElement_in_parse_org_emftext_language_textAML3_TypeRelationReference1577);
                    a2_0=parse_org_emftext_language_textAML3_TypeRelationReferenceElement();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRelationReference();
                    						startIncompleteElement(element);
                    					}
                    					if (a2_0 != null) {
                    						if (a2_0 != null) {
                    							Object value = a2_0;
                    							addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.TYPE_RELATION_REFERENCE__ARGUMENTS, value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_5_0_0_1_0_0_1, a2_0, true);
                    						copyLocalizationInfos(a2_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[125]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[126]);
                    			}

                    // TextAML3.g:1789:4: ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeRelationReferenceElement ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==18) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // TextAML3.g:1790:5: (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeRelationReferenceElement ) )
                    	    {
                    	    // TextAML3.g:1790:5: (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeRelationReferenceElement ) )
                    	    // TextAML3.g:1791:6: a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeRelationReferenceElement )
                    	    {
                    	    a3=(Token)match(input,18,FOLLOW_18_in_parse_org_emftext_language_textAML3_TypeRelationReference1618); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRelationReference();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_5_0_0_1_0_0_2_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelationReference(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[127]);
                    	    					}

                    	    // TextAML3.g:1805:6: (a4_0= parse_org_emftext_language_textAML3_TypeRelationReferenceElement )
                    	    // TextAML3.g:1806:7: a4_0= parse_org_emftext_language_textAML3_TypeRelationReferenceElement
                    	    {
                    	    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_TypeRelationReferenceElement_in_parse_org_emftext_language_textAML3_TypeRelationReference1652);
                    	    a4_0=parse_org_emftext_language_textAML3_TypeRelationReferenceElement();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    							if (terminateParsing) {
                    	    								throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    	    							}
                    	    							if (element == null) {
                    	    								element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRelationReference();
                    	    								startIncompleteElement(element);
                    	    							}
                    	    							if (a4_0 != null) {
                    	    								if (a4_0 != null) {
                    	    									Object value = a4_0;
                    	    									addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.TYPE_RELATION_REFERENCE__ARGUMENTS, value);
                    	    									completedElement(value, true);
                    	    								}
                    	    								collectHiddenTokens(element);
                    	    								retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_5_0_0_1_0_0_2_0_0_1, a4_0, true);
                    	    								copyLocalizationInfos(a4_0, element);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[128]);
                    	    						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[129]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[130]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[131]);
                    			}

                    a5=(Token)match(input,15,FOLLOW_15_in_parse_org_emftext_language_textAML3_TypeRelationReference1713); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRelationReference();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_5_0_0_1_0_0_3, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[132]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[133]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, parse_org_emftext_language_textAML3_TypeRelationReference_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_TypeRelationReference"



    // $ANTLR start "parse_org_emftext_language_textAML3_TypeRelationReferenceElement"
    // TextAML3.g:1863:1: parse_org_emftext_language_textAML3_TypeRelationReferenceElement returns [org.emftext.language.textAML3.TypeRelationReferenceElement element = null] : (a0= TEXT ) a1= '=' (a2_0= parse_org_emftext_language_textAML3_Variable ) ;
    public final org.emftext.language.textAML3.TypeRelationReferenceElement parse_org_emftext_language_textAML3_TypeRelationReferenceElement() throws RecognitionException {
        org.emftext.language.textAML3.TypeRelationReferenceElement element =  null;

        int parse_org_emftext_language_textAML3_TypeRelationReferenceElement_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        org.emftext.language.textAML3.Variable a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }

            // TextAML3.g:1866:2: ( (a0= TEXT ) a1= '=' (a2_0= parse_org_emftext_language_textAML3_Variable ) )
            // TextAML3.g:1867:2: (a0= TEXT ) a1= '=' (a2_0= parse_org_emftext_language_textAML3_Variable )
            {
            // TextAML3.g:1867:2: (a0= TEXT )
            // TextAML3.g:1868:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_TypeRelationReferenceElement1765); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRelationReferenceElement();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_RELATION_REFERENCE_ELEMENT__TYPEATTRIBUTE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.emftext.language.textAML3.TypeAttribute proxy = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeAttribute();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContextDependentURIFragmentFactory<org.emftext.language.textAML3.TypeRelationReferenceElement, org.emftext.language.textAML3.TypeAttribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeRelationReferenceElementTypeattributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_RELATION_REFERENCE_ELEMENT__TYPEATTRIBUTE), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_RELATION_REFERENCE_ELEMENT__TYPEATTRIBUTE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_6_0_0_0, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[134]);
            	}

            a1=(Token)match(input,24,FOLLOW_24_in_parse_org_emftext_language_textAML3_TypeRelationReferenceElement1786); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRelationReferenceElement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_6_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelationReferenceElement(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[135]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelationReferenceElement(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[136]);
            	}

            // TextAML3.g:1922:2: (a2_0= parse_org_emftext_language_textAML3_Variable )
            // TextAML3.g:1923:3: a2_0= parse_org_emftext_language_textAML3_Variable
            {
            pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Variable_in_parse_org_emftext_language_textAML3_TypeRelationReferenceElement1804);
            a2_0=parse_org_emftext_language_textAML3_Variable();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRelationReferenceElement();
            				startIncompleteElement(element);
            			}
            			if (a2_0 != null) {
            				if (a2_0 != null) {
            					Object value = a2_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_RELATION_REFERENCE_ELEMENT__VALUE), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_6_0_0_2, a2_0, true);
            				copyLocalizationInfos(a2_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[137]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[138]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, parse_org_emftext_language_textAML3_TypeRelationReferenceElement_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_TypeRelationReferenceElement"



    // $ANTLR start "parse_org_emftext_language_textAML3_ModelElementRelation"
    // TextAML3.g:1951:1: parse_org_emftext_language_textAML3_ModelElementRelation returns [org.emftext.language.textAML3.ModelElementRelation element = null] : (a0_0= parse_org_emftext_language_textAML3_RuleElementExpression ) ( (a1= '<' |a2= '=' |a3= '>' ) ) (a6_0= parse_org_emftext_language_textAML3_RuleElementExpression ) ( (a7= 'if' (a8_0= parse_org_emftext_language_textAML3_Condition ) ( (a9= ',' (a10_0= parse_org_emftext_language_textAML3_Condition ) ) )* ) )? ;
    public final org.emftext.language.textAML3.ModelElementRelation parse_org_emftext_language_textAML3_ModelElementRelation() throws RecognitionException {
        org.emftext.language.textAML3.ModelElementRelation element =  null;

        int parse_org_emftext_language_textAML3_ModelElementRelation_StartIndex = input.index();

        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a7=null;
        Token a9=null;
        org.emftext.language.textAML3.RuleElementExpression a0_0 =null;

        org.emftext.language.textAML3.RuleElementExpression a6_0 =null;

        org.emftext.language.textAML3.Condition a8_0 =null;

        org.emftext.language.textAML3.Condition a10_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }

            // TextAML3.g:1954:2: ( (a0_0= parse_org_emftext_language_textAML3_RuleElementExpression ) ( (a1= '<' |a2= '=' |a3= '>' ) ) (a6_0= parse_org_emftext_language_textAML3_RuleElementExpression ) ( (a7= 'if' (a8_0= parse_org_emftext_language_textAML3_Condition ) ( (a9= ',' (a10_0= parse_org_emftext_language_textAML3_Condition ) ) )* ) )? )
            // TextAML3.g:1955:2: (a0_0= parse_org_emftext_language_textAML3_RuleElementExpression ) ( (a1= '<' |a2= '=' |a3= '>' ) ) (a6_0= parse_org_emftext_language_textAML3_RuleElementExpression ) ( (a7= 'if' (a8_0= parse_org_emftext_language_textAML3_Condition ) ( (a9= ',' (a10_0= parse_org_emftext_language_textAML3_Condition ) ) )* ) )?
            {
            // TextAML3.g:1955:2: (a0_0= parse_org_emftext_language_textAML3_RuleElementExpression )
            // TextAML3.g:1956:3: a0_0= parse_org_emftext_language_textAML3_RuleElementExpression
            {
            pushFollow(FOLLOW_parse_org_emftext_language_textAML3_RuleElementExpression_in_parse_org_emftext_language_textAML3_ModelElementRelation1841);
            a0_0=parse_org_emftext_language_textAML3_RuleElementExpression();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElementRelation();
            				startIncompleteElement(element);
            			}
            			if (a0_0 != null) {
            				if (a0_0 != null) {
            					Object value = a0_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.MODEL_ELEMENT_RELATION__LHS), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_7_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[139]);
            	}

            // TextAML3.g:1981:2: ( (a1= '<' |a2= '=' |a3= '>' ) )
            // TextAML3.g:1982:3: (a1= '<' |a2= '=' |a3= '>' )
            {
            // TextAML3.g:1982:3: (a1= '<' |a2= '=' |a3= '>' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt19=1;
                }
                break;
            case 24:
                {
                alt19=2;
                }
                break;
            case 25:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // TextAML3.g:1983:4: a1= '<'
                    {
                    a1=(Token)match(input,23,FOLLOW_23_in_parse_org_emftext_language_textAML3_ModelElementRelation1868); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElementRelation();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_7_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getComparisonOperator().getEEnumLiteral(org.emftext.language.textAML3.ComparisonOperator.LESS_EQUAL_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.MODEL_ELEMENT_RELATION__OPERATOR), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // TextAML3.g:1996:8: a2= '='
                    {
                    a2=(Token)match(input,24,FOLLOW_24_in_parse_org_emftext_language_textAML3_ModelElementRelation1883); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElementRelation();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_7_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getComparisonOperator().getEEnumLiteral(org.emftext.language.textAML3.ComparisonOperator.EQUAL_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.MODEL_ELEMENT_RELATION__OPERATOR), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 3 :
                    // TextAML3.g:2009:8: a3= '>'
                    {
                    a3=(Token)match(input,25,FOLLOW_25_in_parse_org_emftext_language_textAML3_ModelElementRelation1898); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElementRelation();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_7_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getComparisonOperator().getEEnumLiteral(org.emftext.language.textAML3.ComparisonOperator.GREATER_EQUAL_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.MODEL_ELEMENT_RELATION__OPERATOR), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[140]);
            	}

            // TextAML3.g:2029:2: (a6_0= parse_org_emftext_language_textAML3_RuleElementExpression )
            // TextAML3.g:2030:3: a6_0= parse_org_emftext_language_textAML3_RuleElementExpression
            {
            pushFollow(FOLLOW_parse_org_emftext_language_textAML3_RuleElementExpression_in_parse_org_emftext_language_textAML3_ModelElementRelation1923);
            a6_0=parse_org_emftext_language_textAML3_RuleElementExpression();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElementRelation();
            				startIncompleteElement(element);
            			}
            			if (a6_0 != null) {
            				if (a6_0 != null) {
            					Object value = a6_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.MODEL_ELEMENT_RELATION__RHS), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_7_0_0_2, a6_0, true);
            				copyLocalizationInfos(a6_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[141]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[142]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[143]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[144]);
            	}

            // TextAML3.g:2058:2: ( (a7= 'if' (a8_0= parse_org_emftext_language_textAML3_Condition ) ( (a9= ',' (a10_0= parse_org_emftext_language_textAML3_Condition ) ) )* ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // TextAML3.g:2059:3: (a7= 'if' (a8_0= parse_org_emftext_language_textAML3_Condition ) ( (a9= ',' (a10_0= parse_org_emftext_language_textAML3_Condition ) ) )* )
                    {
                    // TextAML3.g:2059:3: (a7= 'if' (a8_0= parse_org_emftext_language_textAML3_Condition ) ( (a9= ',' (a10_0= parse_org_emftext_language_textAML3_Condition ) ) )* )
                    // TextAML3.g:2060:4: a7= 'if' (a8_0= parse_org_emftext_language_textAML3_Condition ) ( (a9= ',' (a10_0= parse_org_emftext_language_textAML3_Condition ) ) )*
                    {
                    a7=(Token)match(input,32,FOLLOW_32_in_parse_org_emftext_language_textAML3_ModelElementRelation1950); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElementRelation();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_7_0_0_3_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[145]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[146]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[147]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[148]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[149]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[150]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[151]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[152]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[153]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[154]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[155]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[156]);
                    			}

                    // TextAML3.g:2085:4: (a8_0= parse_org_emftext_language_textAML3_Condition )
                    // TextAML3.g:2086:5: a8_0= parse_org_emftext_language_textAML3_Condition
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Condition_in_parse_org_emftext_language_textAML3_ModelElementRelation1976);
                    a8_0=parse_org_emftext_language_textAML3_Condition();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElementRelation();
                    						startIncompleteElement(element);
                    					}
                    					if (a8_0 != null) {
                    						if (a8_0 != null) {
                    							Object value = a8_0;
                    							addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.MODEL_ELEMENT_RELATION__CONDITIONS, value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_7_0_0_3_0_0_1, a8_0, true);
                    						copyLocalizationInfos(a8_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[157]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[158]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[159]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[160]);
                    			}

                    // TextAML3.g:2114:4: ( (a9= ',' (a10_0= parse_org_emftext_language_textAML3_Condition ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==18) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // TextAML3.g:2115:5: (a9= ',' (a10_0= parse_org_emftext_language_textAML3_Condition ) )
                    	    {
                    	    // TextAML3.g:2115:5: (a9= ',' (a10_0= parse_org_emftext_language_textAML3_Condition ) )
                    	    // TextAML3.g:2116:6: a9= ',' (a10_0= parse_org_emftext_language_textAML3_Condition )
                    	    {
                    	    a9=(Token)match(input,18,FOLLOW_18_in_parse_org_emftext_language_textAML3_ModelElementRelation2017); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElementRelation();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_7_0_0_3_0_0_2_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[161]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[162]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[163]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[164]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[165]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[166]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[167]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[168]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[169]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[170]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[171]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[172]);
                    	    					}

                    	    // TextAML3.g:2141:6: (a10_0= parse_org_emftext_language_textAML3_Condition )
                    	    // TextAML3.g:2142:7: a10_0= parse_org_emftext_language_textAML3_Condition
                    	    {
                    	    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Condition_in_parse_org_emftext_language_textAML3_ModelElementRelation2051);
                    	    a10_0=parse_org_emftext_language_textAML3_Condition();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    							if (terminateParsing) {
                    	    								throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    	    							}
                    	    							if (element == null) {
                    	    								element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElementRelation();
                    	    								startIncompleteElement(element);
                    	    							}
                    	    							if (a10_0 != null) {
                    	    								if (a10_0 != null) {
                    	    									Object value = a10_0;
                    	    									addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.MODEL_ELEMENT_RELATION__CONDITIONS, value);
                    	    									completedElement(value, true);
                    	    								}
                    	    								collectHiddenTokens(element);
                    	    								retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_7_0_0_3_0_0_2_0_0_1, a10_0, true);
                    	    								copyLocalizationInfos(a10_0, element);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[173]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[174]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[175]);
                    	    						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[176]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[177]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[178]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[179]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[180]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[181]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[182]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[183]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, parse_org_emftext_language_textAML3_ModelElementRelation_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_ModelElementRelation"



    // $ANTLR start "parse_org_emftext_language_textAML3_Generator"
    // TextAML3.g:2191:1: parse_org_emftext_language_textAML3_Generator returns [org.emftext.language.textAML3.Generator element = null] : ( (a0_0= parse_org_emftext_language_textAML3_Variable ) |a1= '(' (a2_0= parse_org_emftext_language_textAML3_Variable ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_Variable ) ) )+ a5= ')' ) ( (a6= 'in' (a7_0= parse_org_emftext_language_textAML3_Expression ) ) )? ;
    public final org.emftext.language.textAML3.Generator parse_org_emftext_language_textAML3_Generator() throws RecognitionException {
        org.emftext.language.textAML3.Generator element =  null;

        int parse_org_emftext_language_textAML3_Generator_StartIndex = input.index();

        Token a1=null;
        Token a3=null;
        Token a5=null;
        Token a6=null;
        org.emftext.language.textAML3.Variable a0_0 =null;

        org.emftext.language.textAML3.Variable a2_0 =null;

        org.emftext.language.textAML3.Variable a4_0 =null;

        org.emftext.language.textAML3.Expression a7_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }

            // TextAML3.g:2194:2: ( ( (a0_0= parse_org_emftext_language_textAML3_Variable ) |a1= '(' (a2_0= parse_org_emftext_language_textAML3_Variable ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_Variable ) ) )+ a5= ')' ) ( (a6= 'in' (a7_0= parse_org_emftext_language_textAML3_Expression ) ) )? )
            // TextAML3.g:2195:2: ( (a0_0= parse_org_emftext_language_textAML3_Variable ) |a1= '(' (a2_0= parse_org_emftext_language_textAML3_Variable ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_Variable ) ) )+ a5= ')' ) ( (a6= 'in' (a7_0= parse_org_emftext_language_textAML3_Expression ) ) )?
            {
            // TextAML3.g:2195:2: ( (a0_0= parse_org_emftext_language_textAML3_Variable ) |a1= '(' (a2_0= parse_org_emftext_language_textAML3_Variable ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_Variable ) ) )+ a5= ')' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==VARID) ) {
                alt23=1;
            }
            else if ( (LA23_0==14) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // TextAML3.g:2196:3: (a0_0= parse_org_emftext_language_textAML3_Variable )
                    {
                    // TextAML3.g:2196:3: (a0_0= parse_org_emftext_language_textAML3_Variable )
                    // TextAML3.g:2197:4: a0_0= parse_org_emftext_language_textAML3_Variable
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Variable_in_parse_org_emftext_language_textAML3_Generator2149);
                    a0_0=parse_org_emftext_language_textAML3_Variable();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (terminateParsing) {
                    					throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    				}
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createGenerator();
                    					startIncompleteElement(element);
                    				}
                    				if (a0_0 != null) {
                    					if (a0_0 != null) {
                    						Object value = a0_0;
                    						addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.GENERATOR__VARIABLE, value);
                    						completedElement(value, true);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_10_0_0_0_0_0_0, a0_0, true);
                    					copyLocalizationInfos(a0_0, element);
                    				}
                    			}

                    }


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[184]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[185]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[186]);
                    		}

                    }
                    break;
                case 2 :
                    // TextAML3.g:2225:6: a1= '(' (a2_0= parse_org_emftext_language_textAML3_Variable ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_Variable ) ) )+ a5= ')'
                    {
                    a1=(Token)match(input,14,FOLLOW_14_in_parse_org_emftext_language_textAML3_Generator2178); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createGenerator();
                    				startIncompleteElement(element);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_10_0_0_0_0_1_0, null, true);
                    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getGenerator(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[187]);
                    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getGenerator(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[188]);
                    		}

                    // TextAML3.g:2240:3: (a2_0= parse_org_emftext_language_textAML3_Variable )
                    // TextAML3.g:2241:4: a2_0= parse_org_emftext_language_textAML3_Variable
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Variable_in_parse_org_emftext_language_textAML3_Generator2200);
                    a2_0=parse_org_emftext_language_textAML3_Variable();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (terminateParsing) {
                    					throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    				}
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createGenerator();
                    					startIncompleteElement(element);
                    				}
                    				if (a2_0 != null) {
                    					if (a2_0 != null) {
                    						Object value = a2_0;
                    						addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.GENERATOR__VARIABLE, value);
                    						completedElement(value, true);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_10_0_0_0_0_1_1, a2_0, true);
                    					copyLocalizationInfos(a2_0, element);
                    				}
                    			}

                    }


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[189]);
                    		}

                    // TextAML3.g:2266:3: ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_Variable ) ) )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==18) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // TextAML3.g:2267:4: (a3= ',' (a4_0= parse_org_emftext_language_textAML3_Variable ) )
                    	    {
                    	    // TextAML3.g:2267:4: (a3= ',' (a4_0= parse_org_emftext_language_textAML3_Variable ) )
                    	    // TextAML3.g:2268:5: a3= ',' (a4_0= parse_org_emftext_language_textAML3_Variable )
                    	    {
                    	    a3=(Token)match(input,18,FOLLOW_18_in_parse_org_emftext_language_textAML3_Generator2234); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    					if (element == null) {
                    	    						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createGenerator();
                    	    						startIncompleteElement(element);
                    	    					}
                    	    					collectHiddenTokens(element);
                    	    					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_10_0_0_0_0_1_2_0_0_0, null, true);
                    	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    	    				}

                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getGenerator(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[190]);
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getGenerator(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[191]);
                    	    				}

                    	    // TextAML3.g:2283:5: (a4_0= parse_org_emftext_language_textAML3_Variable )
                    	    // TextAML3.g:2284:6: a4_0= parse_org_emftext_language_textAML3_Variable
                    	    {
                    	    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Variable_in_parse_org_emftext_language_textAML3_Generator2264);
                    	    a4_0=parse_org_emftext_language_textAML3_Variable();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (terminateParsing) {
                    	    							throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    	    						}
                    	    						if (element == null) {
                    	    							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createGenerator();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						if (a4_0 != null) {
                    	    							if (a4_0 != null) {
                    	    								Object value = a4_0;
                    	    								addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.GENERATOR__VARIABLE, value);
                    	    								completedElement(value, true);
                    	    							}
                    	    							collectHiddenTokens(element);
                    	    							retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_10_0_0_0_0_1_2_0_0_1, a4_0, true);
                    	    							copyLocalizationInfos(a4_0, element);
                    	    						}
                    	    					}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[192]);
                    	    					addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[193]);
                    	    				}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[194]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[195]);
                    		}

                    a5=(Token)match(input,15,FOLLOW_15_in_parse_org_emftext_language_textAML3_Generator2315); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createGenerator();
                    				startIncompleteElement(element);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_10_0_0_0_0_1_3, null, true);
                    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[196]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[197]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[198]);
                    		}

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[199]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[200]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[201]);
            	}

            // TextAML3.g:2342:2: ( (a6= 'in' (a7_0= parse_org_emftext_language_textAML3_Expression ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // TextAML3.g:2343:3: (a6= 'in' (a7_0= parse_org_emftext_language_textAML3_Expression ) )
                    {
                    // TextAML3.g:2343:3: (a6= 'in' (a7_0= parse_org_emftext_language_textAML3_Expression ) )
                    // TextAML3.g:2344:4: a6= 'in' (a7_0= parse_org_emftext_language_textAML3_Expression )
                    {
                    a6=(Token)match(input,34,FOLLOW_34_in_parse_org_emftext_language_textAML3_Generator2348); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createGenerator();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_10_0_0_1_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getGenerator(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[202]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getGenerator(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[203]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getGenerator(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[204]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getGenerator(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[205]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getGenerator(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[206]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getGenerator(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[207]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getGenerator(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[208]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getGenerator(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[209]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getGenerator(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[210]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getGenerator(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[211]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getGenerator(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[212]);
                    			}

                    // TextAML3.g:2368:4: (a7_0= parse_org_emftext_language_textAML3_Expression )
                    // TextAML3.g:2369:5: a7_0= parse_org_emftext_language_textAML3_Expression
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Expression_in_parse_org_emftext_language_textAML3_Generator2374);
                    a7_0=parse_org_emftext_language_textAML3_Expression();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createGenerator();
                    						startIncompleteElement(element);
                    					}
                    					if (a7_0 != null) {
                    						if (a7_0 != null) {
                    							Object value = a7_0;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.GENERATOR__CONTAINER), value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_10_0_0_1_0_0_1, a7_0, true);
                    						copyLocalizationInfos(a7_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[213]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[214]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[215]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[216]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, parse_org_emftext_language_textAML3_Generator_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_Generator"



    // $ANTLR start "parse_org_emftext_language_textAML3_TypeRule"
    // TextAML3.g:2405:1: parse_org_emftext_language_textAML3_TypeRule returns [org.emftext.language.textAML3.TypeRule element = null] : a0= 'from' (a1_0= parse_org_emftext_language_textAML3_RuleElementExpression ) ( (a2= 'in' (a3_0= parse_org_emftext_language_textAML3_ContainmentVariable ) ( (a4= ',' (a5_0= parse_org_emftext_language_textAML3_ContainmentVariable ) ) )* ) )? ( (a6= 'with' (a7_0= parse_org_emftext_language_textAML3_Variable ) ( (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Variable ) ) )* ) )? a10= 'to' (a11_0= parse_org_emftext_language_textAML3_RuleElementExpression ) ( (a12= 'where' (a13_0= parse_org_emftext_language_textAML3_Condition ) ( (a14= ',' (a15_0= parse_org_emftext_language_textAML3_Condition ) ) )* ) )? ;
    public final org.emftext.language.textAML3.TypeRule parse_org_emftext_language_textAML3_TypeRule() throws RecognitionException {
        org.emftext.language.textAML3.TypeRule element =  null;

        int parse_org_emftext_language_textAML3_TypeRule_StartIndex = input.index();

        Token a0=null;
        Token a2=null;
        Token a4=null;
        Token a6=null;
        Token a8=null;
        Token a10=null;
        Token a12=null;
        Token a14=null;
        org.emftext.language.textAML3.RuleElementExpression a1_0 =null;

        org.emftext.language.textAML3.ContainmentVariable a3_0 =null;

        org.emftext.language.textAML3.ContainmentVariable a5_0 =null;

        org.emftext.language.textAML3.Variable a7_0 =null;

        org.emftext.language.textAML3.Variable a9_0 =null;

        org.emftext.language.textAML3.RuleElementExpression a11_0 =null;

        org.emftext.language.textAML3.Condition a13_0 =null;

        org.emftext.language.textAML3.Condition a15_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }

            // TextAML3.g:2408:2: (a0= 'from' (a1_0= parse_org_emftext_language_textAML3_RuleElementExpression ) ( (a2= 'in' (a3_0= parse_org_emftext_language_textAML3_ContainmentVariable ) ( (a4= ',' (a5_0= parse_org_emftext_language_textAML3_ContainmentVariable ) ) )* ) )? ( (a6= 'with' (a7_0= parse_org_emftext_language_textAML3_Variable ) ( (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Variable ) ) )* ) )? a10= 'to' (a11_0= parse_org_emftext_language_textAML3_RuleElementExpression ) ( (a12= 'where' (a13_0= parse_org_emftext_language_textAML3_Condition ) ( (a14= ',' (a15_0= parse_org_emftext_language_textAML3_Condition ) ) )* ) )? )
            // TextAML3.g:2409:2: a0= 'from' (a1_0= parse_org_emftext_language_textAML3_RuleElementExpression ) ( (a2= 'in' (a3_0= parse_org_emftext_language_textAML3_ContainmentVariable ) ( (a4= ',' (a5_0= parse_org_emftext_language_textAML3_ContainmentVariable ) ) )* ) )? ( (a6= 'with' (a7_0= parse_org_emftext_language_textAML3_Variable ) ( (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Variable ) ) )* ) )? a10= 'to' (a11_0= parse_org_emftext_language_textAML3_RuleElementExpression ) ( (a12= 'where' (a13_0= parse_org_emftext_language_textAML3_Condition ) ( (a14= ',' (a15_0= parse_org_emftext_language_textAML3_Condition ) ) )* ) )?
            {
            a0=(Token)match(input,31,FOLLOW_31_in_parse_org_emftext_language_textAML3_TypeRule2430); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRule();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_11_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[217]);
            	}

            // TextAML3.g:2423:2: (a1_0= parse_org_emftext_language_textAML3_RuleElementExpression )
            // TextAML3.g:2424:3: a1_0= parse_org_emftext_language_textAML3_RuleElementExpression
            {
            pushFollow(FOLLOW_parse_org_emftext_language_textAML3_RuleElementExpression_in_parse_org_emftext_language_textAML3_TypeRule2448);
            a1_0=parse_org_emftext_language_textAML3_RuleElementExpression();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRule();
            				startIncompleteElement(element);
            			}
            			if (a1_0 != null) {
            				if (a1_0 != null) {
            					Object value = a1_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_RULE__SOURCE), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_11_0_0_1, a1_0, true);
            				copyLocalizationInfos(a1_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[218]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[219]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[220]);
            	}

            // TextAML3.g:2451:2: ( (a2= 'in' (a3_0= parse_org_emftext_language_textAML3_ContainmentVariable ) ( (a4= ',' (a5_0= parse_org_emftext_language_textAML3_ContainmentVariable ) ) )* ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // TextAML3.g:2452:3: (a2= 'in' (a3_0= parse_org_emftext_language_textAML3_ContainmentVariable ) ( (a4= ',' (a5_0= parse_org_emftext_language_textAML3_ContainmentVariable ) ) )* )
                    {
                    // TextAML3.g:2452:3: (a2= 'in' (a3_0= parse_org_emftext_language_textAML3_ContainmentVariable ) ( (a4= ',' (a5_0= parse_org_emftext_language_textAML3_ContainmentVariable ) ) )* )
                    // TextAML3.g:2453:4: a2= 'in' (a3_0= parse_org_emftext_language_textAML3_ContainmentVariable ) ( (a4= ',' (a5_0= parse_org_emftext_language_textAML3_ContainmentVariable ) ) )*
                    {
                    a2=(Token)match(input,34,FOLLOW_34_in_parse_org_emftext_language_textAML3_TypeRule2475); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRule();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_11_0_0_2_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[221]);
                    			}

                    // TextAML3.g:2467:4: (a3_0= parse_org_emftext_language_textAML3_ContainmentVariable )
                    // TextAML3.g:2468:5: a3_0= parse_org_emftext_language_textAML3_ContainmentVariable
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_ContainmentVariable_in_parse_org_emftext_language_textAML3_TypeRule2501);
                    a3_0=parse_org_emftext_language_textAML3_ContainmentVariable();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRule();
                    						startIncompleteElement(element);
                    					}
                    					if (a3_0 != null) {
                    						if (a3_0 != null) {
                    							Object value = a3_0;
                    							addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.TYPE_RULE__CONTAINMENTS, value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_11_0_0_2_0_0_1, a3_0, true);
                    						copyLocalizationInfos(a3_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[222]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[223]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[224]);
                    			}

                    // TextAML3.g:2495:4: ( (a4= ',' (a5_0= parse_org_emftext_language_textAML3_ContainmentVariable ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==18) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // TextAML3.g:2496:5: (a4= ',' (a5_0= parse_org_emftext_language_textAML3_ContainmentVariable ) )
                    	    {
                    	    // TextAML3.g:2496:5: (a4= ',' (a5_0= parse_org_emftext_language_textAML3_ContainmentVariable ) )
                    	    // TextAML3.g:2497:6: a4= ',' (a5_0= parse_org_emftext_language_textAML3_ContainmentVariable )
                    	    {
                    	    a4=(Token)match(input,18,FOLLOW_18_in_parse_org_emftext_language_textAML3_TypeRule2542); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRule();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_11_0_0_2_0_0_2_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[225]);
                    	    					}

                    	    // TextAML3.g:2511:6: (a5_0= parse_org_emftext_language_textAML3_ContainmentVariable )
                    	    // TextAML3.g:2512:7: a5_0= parse_org_emftext_language_textAML3_ContainmentVariable
                    	    {
                    	    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_ContainmentVariable_in_parse_org_emftext_language_textAML3_TypeRule2576);
                    	    a5_0=parse_org_emftext_language_textAML3_ContainmentVariable();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    							if (terminateParsing) {
                    	    								throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    	    							}
                    	    							if (element == null) {
                    	    								element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRule();
                    	    								startIncompleteElement(element);
                    	    							}
                    	    							if (a5_0 != null) {
                    	    								if (a5_0 != null) {
                    	    									Object value = a5_0;
                    	    									addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.TYPE_RULE__CONTAINMENTS, value);
                    	    									completedElement(value, true);
                    	    								}
                    	    								collectHiddenTokens(element);
                    	    								retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_11_0_0_2_0_0_2_0_0_1, a5_0, true);
                    	    								copyLocalizationInfos(a5_0, element);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[226]);
                    	    						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[227]);
                    	    						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[228]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[229]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[230]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[231]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[232]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[233]);
            	}

            // TextAML3.g:2556:2: ( (a6= 'with' (a7_0= parse_org_emftext_language_textAML3_Variable ) ( (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Variable ) ) )* ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==49) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // TextAML3.g:2557:3: (a6= 'with' (a7_0= parse_org_emftext_language_textAML3_Variable ) ( (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Variable ) ) )* )
                    {
                    // TextAML3.g:2557:3: (a6= 'with' (a7_0= parse_org_emftext_language_textAML3_Variable ) ( (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Variable ) ) )* )
                    // TextAML3.g:2558:4: a6= 'with' (a7_0= parse_org_emftext_language_textAML3_Variable ) ( (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Variable ) ) )*
                    {
                    a6=(Token)match(input,49,FOLLOW_49_in_parse_org_emftext_language_textAML3_TypeRule2659); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRule();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_11_0_0_3_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[234]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[235]);
                    			}

                    // TextAML3.g:2573:4: (a7_0= parse_org_emftext_language_textAML3_Variable )
                    // TextAML3.g:2574:5: a7_0= parse_org_emftext_language_textAML3_Variable
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Variable_in_parse_org_emftext_language_textAML3_TypeRule2685);
                    a7_0=parse_org_emftext_language_textAML3_Variable();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRule();
                    						startIncompleteElement(element);
                    					}
                    					if (a7_0 != null) {
                    						if (a7_0 != null) {
                    							Object value = a7_0;
                    							addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.TYPE_RULE__VARIABLES, value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_11_0_0_3_0_0_1, a7_0, true);
                    						copyLocalizationInfos(a7_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[236]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[237]);
                    			}

                    // TextAML3.g:2600:4: ( (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Variable ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==18) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // TextAML3.g:2601:5: (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Variable ) )
                    	    {
                    	    // TextAML3.g:2601:5: (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Variable ) )
                    	    // TextAML3.g:2602:6: a8= ',' (a9_0= parse_org_emftext_language_textAML3_Variable )
                    	    {
                    	    a8=(Token)match(input,18,FOLLOW_18_in_parse_org_emftext_language_textAML3_TypeRule2726); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRule();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_11_0_0_3_0_0_2_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[238]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[239]);
                    	    					}

                    	    // TextAML3.g:2617:6: (a9_0= parse_org_emftext_language_textAML3_Variable )
                    	    // TextAML3.g:2618:7: a9_0= parse_org_emftext_language_textAML3_Variable
                    	    {
                    	    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Variable_in_parse_org_emftext_language_textAML3_TypeRule2760);
                    	    a9_0=parse_org_emftext_language_textAML3_Variable();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    							if (terminateParsing) {
                    	    								throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    	    							}
                    	    							if (element == null) {
                    	    								element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRule();
                    	    								startIncompleteElement(element);
                    	    							}
                    	    							if (a9_0 != null) {
                    	    								if (a9_0 != null) {
                    	    									Object value = a9_0;
                    	    									addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.TYPE_RULE__VARIABLES, value);
                    	    									completedElement(value, true);
                    	    								}
                    	    								collectHiddenTokens(element);
                    	    								retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_11_0_0_3_0_0_2_0_0_1, a9_0, true);
                    	    								copyLocalizationInfos(a9_0, element);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[240]);
                    	    						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[241]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[242]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[243]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[244]);
            	}

            a10=(Token)match(input,45,FOLLOW_45_in_parse_org_emftext_language_textAML3_TypeRule2834); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRule();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_11_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[245]);
            	}

            // TextAML3.g:2673:2: (a11_0= parse_org_emftext_language_textAML3_RuleElementExpression )
            // TextAML3.g:2674:3: a11_0= parse_org_emftext_language_textAML3_RuleElementExpression
            {
            pushFollow(FOLLOW_parse_org_emftext_language_textAML3_RuleElementExpression_in_parse_org_emftext_language_textAML3_TypeRule2852);
            a11_0=parse_org_emftext_language_textAML3_RuleElementExpression();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRule();
            				startIncompleteElement(element);
            			}
            			if (a11_0 != null) {
            				if (a11_0 != null) {
            					Object value = a11_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_RULE__TARGET), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_11_0_0_5, a11_0, true);
            				copyLocalizationInfos(a11_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[246]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[247]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[248]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[249]);
            	}

            // TextAML3.g:2702:2: ( (a12= 'where' (a13_0= parse_org_emftext_language_textAML3_Condition ) ( (a14= ',' (a15_0= parse_org_emftext_language_textAML3_Condition ) ) )* ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==47) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // TextAML3.g:2703:3: (a12= 'where' (a13_0= parse_org_emftext_language_textAML3_Condition ) ( (a14= ',' (a15_0= parse_org_emftext_language_textAML3_Condition ) ) )* )
                    {
                    // TextAML3.g:2703:3: (a12= 'where' (a13_0= parse_org_emftext_language_textAML3_Condition ) ( (a14= ',' (a15_0= parse_org_emftext_language_textAML3_Condition ) ) )* )
                    // TextAML3.g:2704:4: a12= 'where' (a13_0= parse_org_emftext_language_textAML3_Condition ) ( (a14= ',' (a15_0= parse_org_emftext_language_textAML3_Condition ) ) )*
                    {
                    a12=(Token)match(input,47,FOLLOW_47_in_parse_org_emftext_language_textAML3_TypeRule2879); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRule();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_11_0_0_6_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[250]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[251]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[252]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[253]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[254]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[255]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[256]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[257]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[258]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[259]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[260]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[261]);
                    			}

                    // TextAML3.g:2729:4: (a13_0= parse_org_emftext_language_textAML3_Condition )
                    // TextAML3.g:2730:5: a13_0= parse_org_emftext_language_textAML3_Condition
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Condition_in_parse_org_emftext_language_textAML3_TypeRule2905);
                    a13_0=parse_org_emftext_language_textAML3_Condition();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRule();
                    						startIncompleteElement(element);
                    					}
                    					if (a13_0 != null) {
                    						if (a13_0 != null) {
                    							Object value = a13_0;
                    							addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.TYPE_RULE__CONDITIONS, value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_11_0_0_6_0_0_1, a13_0, true);
                    						copyLocalizationInfos(a13_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[262]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[263]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[264]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[265]);
                    			}

                    // TextAML3.g:2758:4: ( (a14= ',' (a15_0= parse_org_emftext_language_textAML3_Condition ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==18) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // TextAML3.g:2759:5: (a14= ',' (a15_0= parse_org_emftext_language_textAML3_Condition ) )
                    	    {
                    	    // TextAML3.g:2759:5: (a14= ',' (a15_0= parse_org_emftext_language_textAML3_Condition ) )
                    	    // TextAML3.g:2760:6: a14= ',' (a15_0= parse_org_emftext_language_textAML3_Condition )
                    	    {
                    	    a14=(Token)match(input,18,FOLLOW_18_in_parse_org_emftext_language_textAML3_TypeRule2946); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRule();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_11_0_0_6_0_0_2_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[266]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[267]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[268]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[269]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[270]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[271]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[272]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[273]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[274]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[275]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[276]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[277]);
                    	    					}

                    	    // TextAML3.g:2785:6: (a15_0= parse_org_emftext_language_textAML3_Condition )
                    	    // TextAML3.g:2786:7: a15_0= parse_org_emftext_language_textAML3_Condition
                    	    {
                    	    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Condition_in_parse_org_emftext_language_textAML3_TypeRule2980);
                    	    a15_0=parse_org_emftext_language_textAML3_Condition();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    							if (terminateParsing) {
                    	    								throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    	    							}
                    	    							if (element == null) {
                    	    								element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRule();
                    	    								startIncompleteElement(element);
                    	    							}
                    	    							if (a15_0 != null) {
                    	    								if (a15_0 != null) {
                    	    									Object value = a15_0;
                    	    									addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.TYPE_RULE__CONDITIONS, value);
                    	    									completedElement(value, true);
                    	    								}
                    	    								collectHiddenTokens(element);
                    	    								retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_11_0_0_6_0_0_2_0_0_1, a15_0, true);
                    	    								copyLocalizationInfos(a15_0, element);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[278]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[279]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[280]);
                    	    						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[281]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[282]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[283]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[284]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[285]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[286]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[287]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[288]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, parse_org_emftext_language_textAML3_TypeRule_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_TypeRule"



    // $ANTLR start "parse_org_emftext_language_textAML3_ErrorRule"
    // TextAML3.g:2835:1: parse_org_emftext_language_textAML3_ErrorRule returns [org.emftext.language.textAML3.ErrorRule element = null] : a0= 'error' (a1_0= parse_org_emftext_language_textAML3_RuleElementExpression ) a2= 'message' (a3= QUOTED_34_34 ) ( (a4= 'sourceposition' (a5_0= parse_org_emftext_language_textAML3_Expression ) ) )? ( (a6= 'with' (a7_0= parse_org_emftext_language_textAML3_Variable ) ( (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Variable ) ) )* ) )? ( (a10= 'where' (a11_0= parse_org_emftext_language_textAML3_Condition ) ( (a12= ',' (a13_0= parse_org_emftext_language_textAML3_Condition ) ) )* ) )? ;
    public final org.emftext.language.textAML3.ErrorRule parse_org_emftext_language_textAML3_ErrorRule() throws RecognitionException {
        org.emftext.language.textAML3.ErrorRule element =  null;

        int parse_org_emftext_language_textAML3_ErrorRule_StartIndex = input.index();

        Token a0=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a6=null;
        Token a8=null;
        Token a10=null;
        Token a12=null;
        org.emftext.language.textAML3.RuleElementExpression a1_0 =null;

        org.emftext.language.textAML3.Expression a5_0 =null;

        org.emftext.language.textAML3.Variable a7_0 =null;

        org.emftext.language.textAML3.Variable a9_0 =null;

        org.emftext.language.textAML3.Condition a11_0 =null;

        org.emftext.language.textAML3.Condition a13_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }

            // TextAML3.g:2838:2: (a0= 'error' (a1_0= parse_org_emftext_language_textAML3_RuleElementExpression ) a2= 'message' (a3= QUOTED_34_34 ) ( (a4= 'sourceposition' (a5_0= parse_org_emftext_language_textAML3_Expression ) ) )? ( (a6= 'with' (a7_0= parse_org_emftext_language_textAML3_Variable ) ( (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Variable ) ) )* ) )? ( (a10= 'where' (a11_0= parse_org_emftext_language_textAML3_Condition ) ( (a12= ',' (a13_0= parse_org_emftext_language_textAML3_Condition ) ) )* ) )? )
            // TextAML3.g:2839:2: a0= 'error' (a1_0= parse_org_emftext_language_textAML3_RuleElementExpression ) a2= 'message' (a3= QUOTED_34_34 ) ( (a4= 'sourceposition' (a5_0= parse_org_emftext_language_textAML3_Expression ) ) )? ( (a6= 'with' (a7_0= parse_org_emftext_language_textAML3_Variable ) ( (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Variable ) ) )* ) )? ( (a10= 'where' (a11_0= parse_org_emftext_language_textAML3_Condition ) ( (a12= ',' (a13_0= parse_org_emftext_language_textAML3_Condition ) ) )* ) )?
            {
            a0=(Token)match(input,27,FOLLOW_27_in_parse_org_emftext_language_textAML3_ErrorRule3069); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createErrorRule();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_12_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[289]);
            	}

            // TextAML3.g:2853:2: (a1_0= parse_org_emftext_language_textAML3_RuleElementExpression )
            // TextAML3.g:2854:3: a1_0= parse_org_emftext_language_textAML3_RuleElementExpression
            {
            pushFollow(FOLLOW_parse_org_emftext_language_textAML3_RuleElementExpression_in_parse_org_emftext_language_textAML3_ErrorRule3087);
            a1_0=parse_org_emftext_language_textAML3_RuleElementExpression();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createErrorRule();
            				startIncompleteElement(element);
            			}
            			if (a1_0 != null) {
            				if (a1_0 != null) {
            					Object value = a1_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.ERROR_RULE__SOURCE), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_12_0_0_1, a1_0, true);
            				copyLocalizationInfos(a1_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[290]);
            	}

            a2=(Token)match(input,37,FOLLOW_37_in_parse_org_emftext_language_textAML3_ErrorRule3105); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createErrorRule();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_12_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[291]);
            	}

            // TextAML3.g:2893:2: (a3= QUOTED_34_34 )
            // TextAML3.g:2894:3: a3= QUOTED_34_34
            {
            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_emftext_language_textAML3_ErrorRule3123); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createErrorRule();
            				startIncompleteElement(element);
            			}
            			if (a3 != null) {
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.ERROR_RULE__MESSAGE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.ERROR_RULE__MESSAGE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_12_0_0_3, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[292]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[293]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[294]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[295]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[296]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[297]);
            	}

            // TextAML3.g:2934:2: ( (a4= 'sourceposition' (a5_0= parse_org_emftext_language_textAML3_Expression ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==41) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // TextAML3.g:2935:3: (a4= 'sourceposition' (a5_0= parse_org_emftext_language_textAML3_Expression ) )
                    {
                    // TextAML3.g:2935:3: (a4= 'sourceposition' (a5_0= parse_org_emftext_language_textAML3_Expression ) )
                    // TextAML3.g:2936:4: a4= 'sourceposition' (a5_0= parse_org_emftext_language_textAML3_Expression )
                    {
                    a4=(Token)match(input,41,FOLLOW_41_in_parse_org_emftext_language_textAML3_ErrorRule3153); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createErrorRule();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_12_0_0_4_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[298]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[299]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[300]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[301]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[302]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[303]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[304]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[305]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[306]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[307]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[308]);
                    			}

                    // TextAML3.g:2960:4: (a5_0= parse_org_emftext_language_textAML3_Expression )
                    // TextAML3.g:2961:5: a5_0= parse_org_emftext_language_textAML3_Expression
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Expression_in_parse_org_emftext_language_textAML3_ErrorRule3179);
                    a5_0=parse_org_emftext_language_textAML3_Expression();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createErrorRule();
                    						startIncompleteElement(element);
                    					}
                    					if (a5_0 != null) {
                    						if (a5_0 != null) {
                    							Object value = a5_0;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.ERROR_RULE__POSITION), value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_12_0_0_4_0_0_1, a5_0, true);
                    						copyLocalizationInfos(a5_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[309]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[310]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[311]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[312]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[313]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[314]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[315]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[316]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[317]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[318]);
            	}

            // TextAML3.g:3001:2: ( (a6= 'with' (a7_0= parse_org_emftext_language_textAML3_Variable ) ( (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Variable ) ) )* ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==49) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // TextAML3.g:3002:3: (a6= 'with' (a7_0= parse_org_emftext_language_textAML3_Variable ) ( (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Variable ) ) )* )
                    {
                    // TextAML3.g:3002:3: (a6= 'with' (a7_0= parse_org_emftext_language_textAML3_Variable ) ( (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Variable ) ) )* )
                    // TextAML3.g:3003:4: a6= 'with' (a7_0= parse_org_emftext_language_textAML3_Variable ) ( (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Variable ) ) )*
                    {
                    a6=(Token)match(input,49,FOLLOW_49_in_parse_org_emftext_language_textAML3_ErrorRule3229); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createErrorRule();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_12_0_0_5_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[319]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[320]);
                    			}

                    // TextAML3.g:3018:4: (a7_0= parse_org_emftext_language_textAML3_Variable )
                    // TextAML3.g:3019:5: a7_0= parse_org_emftext_language_textAML3_Variable
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Variable_in_parse_org_emftext_language_textAML3_ErrorRule3255);
                    a7_0=parse_org_emftext_language_textAML3_Variable();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createErrorRule();
                    						startIncompleteElement(element);
                    					}
                    					if (a7_0 != null) {
                    						if (a7_0 != null) {
                    							Object value = a7_0;
                    							addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.ERROR_RULE__VARIABLES, value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_12_0_0_5_0_0_1, a7_0, true);
                    						copyLocalizationInfos(a7_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[321]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[322]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[323]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[324]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[325]);
                    			}

                    // TextAML3.g:3048:4: ( (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Variable ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==18) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // TextAML3.g:3049:5: (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Variable ) )
                    	    {
                    	    // TextAML3.g:3049:5: (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Variable ) )
                    	    // TextAML3.g:3050:6: a8= ',' (a9_0= parse_org_emftext_language_textAML3_Variable )
                    	    {
                    	    a8=(Token)match(input,18,FOLLOW_18_in_parse_org_emftext_language_textAML3_ErrorRule3296); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createErrorRule();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_12_0_0_5_0_0_2_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[326]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[327]);
                    	    					}

                    	    // TextAML3.g:3065:6: (a9_0= parse_org_emftext_language_textAML3_Variable )
                    	    // TextAML3.g:3066:7: a9_0= parse_org_emftext_language_textAML3_Variable
                    	    {
                    	    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Variable_in_parse_org_emftext_language_textAML3_ErrorRule3330);
                    	    a9_0=parse_org_emftext_language_textAML3_Variable();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    							if (terminateParsing) {
                    	    								throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    	    							}
                    	    							if (element == null) {
                    	    								element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createErrorRule();
                    	    								startIncompleteElement(element);
                    	    							}
                    	    							if (a9_0 != null) {
                    	    								if (a9_0 != null) {
                    	    									Object value = a9_0;
                    	    									addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.ERROR_RULE__VARIABLES, value);
                    	    									completedElement(value, true);
                    	    								}
                    	    								collectHiddenTokens(element);
                    	    								retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_12_0_0_5_0_0_2_0_0_1, a9_0, true);
                    	    								copyLocalizationInfos(a9_0, element);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[328]);
                    	    						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[329]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[330]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[331]);
                    	    						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[332]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[333]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[334]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[335]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[336]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[337]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[338]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[339]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[340]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[341]);
            	}

            // TextAML3.g:3116:2: ( (a10= 'where' (a11_0= parse_org_emftext_language_textAML3_Condition ) ( (a12= ',' (a13_0= parse_org_emftext_language_textAML3_Condition ) ) )* ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==47) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // TextAML3.g:3117:3: (a10= 'where' (a11_0= parse_org_emftext_language_textAML3_Condition ) ( (a12= ',' (a13_0= parse_org_emftext_language_textAML3_Condition ) ) )* )
                    {
                    // TextAML3.g:3117:3: (a10= 'where' (a11_0= parse_org_emftext_language_textAML3_Condition ) ( (a12= ',' (a13_0= parse_org_emftext_language_textAML3_Condition ) ) )* )
                    // TextAML3.g:3118:4: a10= 'where' (a11_0= parse_org_emftext_language_textAML3_Condition ) ( (a12= ',' (a13_0= parse_org_emftext_language_textAML3_Condition ) ) )*
                    {
                    a10=(Token)match(input,47,FOLLOW_47_in_parse_org_emftext_language_textAML3_ErrorRule3413); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createErrorRule();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_12_0_0_6_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[342]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[343]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[344]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[345]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[346]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[347]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[348]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[349]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[350]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[351]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[352]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[353]);
                    			}

                    // TextAML3.g:3143:4: (a11_0= parse_org_emftext_language_textAML3_Condition )
                    // TextAML3.g:3144:5: a11_0= parse_org_emftext_language_textAML3_Condition
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Condition_in_parse_org_emftext_language_textAML3_ErrorRule3439);
                    a11_0=parse_org_emftext_language_textAML3_Condition();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createErrorRule();
                    						startIncompleteElement(element);
                    					}
                    					if (a11_0 != null) {
                    						if (a11_0 != null) {
                    							Object value = a11_0;
                    							addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.ERROR_RULE__CONDITIONS, value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_12_0_0_6_0_0_1, a11_0, true);
                    						copyLocalizationInfos(a11_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[354]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[355]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[356]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[357]);
                    			}

                    // TextAML3.g:3172:4: ( (a12= ',' (a13_0= parse_org_emftext_language_textAML3_Condition ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==18) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // TextAML3.g:3173:5: (a12= ',' (a13_0= parse_org_emftext_language_textAML3_Condition ) )
                    	    {
                    	    // TextAML3.g:3173:5: (a12= ',' (a13_0= parse_org_emftext_language_textAML3_Condition ) )
                    	    // TextAML3.g:3174:6: a12= ',' (a13_0= parse_org_emftext_language_textAML3_Condition )
                    	    {
                    	    a12=(Token)match(input,18,FOLLOW_18_in_parse_org_emftext_language_textAML3_ErrorRule3480); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createErrorRule();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_12_0_0_6_0_0_2_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[358]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[359]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[360]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[361]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[362]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[363]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[364]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[365]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[366]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[367]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[368]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[369]);
                    	    					}

                    	    // TextAML3.g:3199:6: (a13_0= parse_org_emftext_language_textAML3_Condition )
                    	    // TextAML3.g:3200:7: a13_0= parse_org_emftext_language_textAML3_Condition
                    	    {
                    	    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Condition_in_parse_org_emftext_language_textAML3_ErrorRule3514);
                    	    a13_0=parse_org_emftext_language_textAML3_Condition();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    							if (terminateParsing) {
                    	    								throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    	    							}
                    	    							if (element == null) {
                    	    								element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createErrorRule();
                    	    								startIncompleteElement(element);
                    	    							}
                    	    							if (a13_0 != null) {
                    	    								if (a13_0 != null) {
                    	    									Object value = a13_0;
                    	    									addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.ERROR_RULE__CONDITIONS, value);
                    	    									completedElement(value, true);
                    	    								}
                    	    								collectHiddenTokens(element);
                    	    								retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_12_0_0_6_0_0_2_0_0_1, a13_0, true);
                    	    								copyLocalizationInfos(a13_0, element);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[370]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[371]);
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[372]);
                    	    						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[373]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[374]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[375]);
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[376]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[377]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[378]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[379]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[380]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, parse_org_emftext_language_textAML3_ErrorRule_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_ErrorRule"



    // $ANTLR start "parse_org_emftext_language_textAML3_RuleElementExpression"
    // TextAML3.g:3249:1: parse_org_emftext_language_textAML3_RuleElementExpression returns [org.emftext.language.textAML3.RuleElementExpression element = null] : (a0= REFERENCE ) ( (a1= '(' (a2_0= parse_org_emftext_language_textAML3_RuleElementAttribute ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_RuleElementAttribute ) ) )* a5= ')' ) )? ;
    public final org.emftext.language.textAML3.RuleElementExpression parse_org_emftext_language_textAML3_RuleElementExpression() throws RecognitionException {
        org.emftext.language.textAML3.RuleElementExpression element =  null;

        int parse_org_emftext_language_textAML3_RuleElementExpression_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a5=null;
        org.emftext.language.textAML3.RuleElementAttribute a2_0 =null;

        org.emftext.language.textAML3.RuleElementAttribute a4_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }

            // TextAML3.g:3252:2: ( (a0= REFERENCE ) ( (a1= '(' (a2_0= parse_org_emftext_language_textAML3_RuleElementAttribute ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_RuleElementAttribute ) ) )* a5= ')' ) )? )
            // TextAML3.g:3253:2: (a0= REFERENCE ) ( (a1= '(' (a2_0= parse_org_emftext_language_textAML3_RuleElementAttribute ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_RuleElementAttribute ) ) )* a5= ')' ) )?
            {
            // TextAML3.g:3253:2: (a0= REFERENCE )
            // TextAML3.g:3254:3: a0= REFERENCE
            {
            a0=(Token)match(input,REFERENCE,FOLLOW_REFERENCE_in_parse_org_emftext_language_textAML3_RuleElementExpression3607); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createRuleElementExpression();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REFERENCE");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.RULE_ELEMENT_EXPRESSION__BASECLASS), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.eclipse.emf.ecore.EClass proxy = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEClass();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContextDependentURIFragmentFactory<org.emftext.language.textAML3.RuleElementExpression, org.eclipse.emf.ecore.EClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getRuleElementExpressionBaseclassReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.RULE_ELEMENT_EXPRESSION__BASECLASS), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.RULE_ELEMENT_EXPRESSION__BASECLASS), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_13_0_0_0, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[381]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[382]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[383]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[384]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[385]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[386]);
            	}

            // TextAML3.g:3298:2: ( (a1= '(' (a2_0= parse_org_emftext_language_textAML3_RuleElementAttribute ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_RuleElementAttribute ) ) )* a5= ')' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==14) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // TextAML3.g:3299:3: (a1= '(' (a2_0= parse_org_emftext_language_textAML3_RuleElementAttribute ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_RuleElementAttribute ) ) )* a5= ')' )
                    {
                    // TextAML3.g:3299:3: (a1= '(' (a2_0= parse_org_emftext_language_textAML3_RuleElementAttribute ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_RuleElementAttribute ) ) )* a5= ')' )
                    // TextAML3.g:3300:4: a1= '(' (a2_0= parse_org_emftext_language_textAML3_RuleElementAttribute ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_RuleElementAttribute ) ) )* a5= ')'
                    {
                    a1=(Token)match(input,14,FOLLOW_14_in_parse_org_emftext_language_textAML3_RuleElementExpression3637); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createRuleElementExpression();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_13_0_0_1_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getRuleElementExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[387]);
                    			}

                    // TextAML3.g:3314:4: (a2_0= parse_org_emftext_language_textAML3_RuleElementAttribute )
                    // TextAML3.g:3315:5: a2_0= parse_org_emftext_language_textAML3_RuleElementAttribute
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_RuleElementAttribute_in_parse_org_emftext_language_textAML3_RuleElementExpression3663);
                    a2_0=parse_org_emftext_language_textAML3_RuleElementAttribute();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createRuleElementExpression();
                    						startIncompleteElement(element);
                    					}
                    					if (a2_0 != null) {
                    						if (a2_0 != null) {
                    							Object value = a2_0;
                    							addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.RULE_ELEMENT_EXPRESSION__ATTRIBUTES, value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_13_0_0_1_0_0_1, a2_0, true);
                    						copyLocalizationInfos(a2_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[388]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[389]);
                    			}

                    // TextAML3.g:3341:4: ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_RuleElementAttribute ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==18) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // TextAML3.g:3342:5: (a3= ',' (a4_0= parse_org_emftext_language_textAML3_RuleElementAttribute ) )
                    	    {
                    	    // TextAML3.g:3342:5: (a3= ',' (a4_0= parse_org_emftext_language_textAML3_RuleElementAttribute ) )
                    	    // TextAML3.g:3343:6: a3= ',' (a4_0= parse_org_emftext_language_textAML3_RuleElementAttribute )
                    	    {
                    	    a3=(Token)match(input,18,FOLLOW_18_in_parse_org_emftext_language_textAML3_RuleElementExpression3704); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createRuleElementExpression();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_13_0_0_1_0_0_2_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getRuleElementExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[390]);
                    	    					}

                    	    // TextAML3.g:3357:6: (a4_0= parse_org_emftext_language_textAML3_RuleElementAttribute )
                    	    // TextAML3.g:3358:7: a4_0= parse_org_emftext_language_textAML3_RuleElementAttribute
                    	    {
                    	    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_RuleElementAttribute_in_parse_org_emftext_language_textAML3_RuleElementExpression3738);
                    	    a4_0=parse_org_emftext_language_textAML3_RuleElementAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    							if (terminateParsing) {
                    	    								throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    	    							}
                    	    							if (element == null) {
                    	    								element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createRuleElementExpression();
                    	    								startIncompleteElement(element);
                    	    							}
                    	    							if (a4_0 != null) {
                    	    								if (a4_0 != null) {
                    	    									Object value = a4_0;
                    	    									addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.RULE_ELEMENT_EXPRESSION__ATTRIBUTES, value);
                    	    									completedElement(value, true);
                    	    								}
                    	    								collectHiddenTokens(element);
                    	    								retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_13_0_0_1_0_0_2_0_0_1, a4_0, true);
                    	    								copyLocalizationInfos(a4_0, element);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[391]);
                    	    						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[392]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[393]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[394]);
                    			}

                    a5=(Token)match(input,15,FOLLOW_15_in_parse_org_emftext_language_textAML3_RuleElementExpression3799); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createRuleElementExpression();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_13_0_0_1_0_0_3, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[395]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[396]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[397]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[398]);
                    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[399]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[400]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[401]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[402]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[403]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[404]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, parse_org_emftext_language_textAML3_RuleElementExpression_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_RuleElementExpression"



    // $ANTLR start "parse_org_emftext_language_textAML3_RuleElementAttribute"
    // TextAML3.g:3423:1: parse_org_emftext_language_textAML3_RuleElementAttribute returns [org.emftext.language.textAML3.RuleElementAttribute element = null] : (a0= TEXT ) a1= '=' (a2_0= parse_org_emftext_language_textAML3_Variable ) ;
    public final org.emftext.language.textAML3.RuleElementAttribute parse_org_emftext_language_textAML3_RuleElementAttribute() throws RecognitionException {
        org.emftext.language.textAML3.RuleElementAttribute element =  null;

        int parse_org_emftext_language_textAML3_RuleElementAttribute_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        org.emftext.language.textAML3.Variable a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }

            // TextAML3.g:3426:2: ( (a0= TEXT ) a1= '=' (a2_0= parse_org_emftext_language_textAML3_Variable ) )
            // TextAML3.g:3427:2: (a0= TEXT ) a1= '=' (a2_0= parse_org_emftext_language_textAML3_Variable )
            {
            // TextAML3.g:3427:2: (a0= TEXT )
            // TextAML3.g:3428:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_RuleElementAttribute3851); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createRuleElementAttribute();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.RULE_ELEMENT_ATTRIBUTE__MYATTRIBUTE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.eclipse.emf.ecore.EStructuralFeature proxy = createDynamicProxy(org.eclipse.emf.ecore.EStructuralFeature.class);
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContextDependentURIFragmentFactory<org.emftext.language.textAML3.RuleElementAttribute, org.eclipse.emf.ecore.EStructuralFeature>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getRuleElementAttributeMyattributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.RULE_ELEMENT_ATTRIBUTE__MYATTRIBUTE), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.RULE_ELEMENT_ATTRIBUTE__MYATTRIBUTE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_14_0_0_0, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[405]);
            	}

            a1=(Token)match(input,24,FOLLOW_24_in_parse_org_emftext_language_textAML3_RuleElementAttribute3872); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createRuleElementAttribute();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_14_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getRuleElementAttribute(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[406]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getRuleElementAttribute(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[407]);
            	}

            // TextAML3.g:3482:2: (a2_0= parse_org_emftext_language_textAML3_Variable )
            // TextAML3.g:3483:3: a2_0= parse_org_emftext_language_textAML3_Variable
            {
            pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Variable_in_parse_org_emftext_language_textAML3_RuleElementAttribute3890);
            a2_0=parse_org_emftext_language_textAML3_Variable();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createRuleElementAttribute();
            				startIncompleteElement(element);
            			}
            			if (a2_0 != null) {
            				if (a2_0 != null) {
            					Object value = a2_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.RULE_ELEMENT_ATTRIBUTE__VARIABLE), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_14_0_0_2, a2_0, true);
            				copyLocalizationInfos(a2_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[408]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[409]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, parse_org_emftext_language_textAML3_RuleElementAttribute_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_RuleElementAttribute"



    // $ANTLR start "parse_org_emftext_language_textAML3_AttributeExpression"
    // TextAML3.g:3511:1: parse_org_emftext_language_textAML3_AttributeExpression returns [org.emftext.language.textAML3.AttributeExpression element = null] : (a0= TEXT ) a1= '=' (a2_0= parse_org_emftext_language_textAML3_Expression ) ;
    public final org.emftext.language.textAML3.AttributeExpression parse_org_emftext_language_textAML3_AttributeExpression() throws RecognitionException {
        org.emftext.language.textAML3.AttributeExpression element =  null;

        int parse_org_emftext_language_textAML3_AttributeExpression_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        org.emftext.language.textAML3.Expression a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }

            // TextAML3.g:3514:2: ( (a0= TEXT ) a1= '=' (a2_0= parse_org_emftext_language_textAML3_Expression ) )
            // TextAML3.g:3515:2: (a0= TEXT ) a1= '=' (a2_0= parse_org_emftext_language_textAML3_Expression )
            {
            // TextAML3.g:3515:2: (a0= TEXT )
            // TextAML3.g:3516:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_AttributeExpression3927); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createAttributeExpression();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.ATTRIBUTE_EXPRESSION__MYATTRIBUTE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.eclipse.emf.ecore.EStructuralFeature proxy = createDynamicProxy(org.eclipse.emf.ecore.EStructuralFeature.class);
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContextDependentURIFragmentFactory<org.emftext.language.textAML3.AttributeExpression, org.eclipse.emf.ecore.EStructuralFeature>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAttributeExpressionMyattributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.ATTRIBUTE_EXPRESSION__MYATTRIBUTE), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.ATTRIBUTE_EXPRESSION__MYATTRIBUTE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_15_0_0_0, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[410]);
            	}

            a1=(Token)match(input,24,FOLLOW_24_in_parse_org_emftext_language_textAML3_AttributeExpression3948); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createAttributeExpression();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_15_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getAttributeExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[411]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getAttributeExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[412]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getAttributeExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[413]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getAttributeExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[414]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getAttributeExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[415]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getAttributeExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[416]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getAttributeExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[417]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getAttributeExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[418]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getAttributeExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[419]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getAttributeExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[420]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getAttributeExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[421]);
            	}

            // TextAML3.g:3579:2: (a2_0= parse_org_emftext_language_textAML3_Expression )
            // TextAML3.g:3580:3: a2_0= parse_org_emftext_language_textAML3_Expression
            {
            pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Expression_in_parse_org_emftext_language_textAML3_AttributeExpression3966);
            a2_0=parse_org_emftext_language_textAML3_Expression();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createAttributeExpression();
            				startIncompleteElement(element);
            			}
            			if (a2_0 != null) {
            				if (a2_0 != null) {
            					Object value = a2_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.ATTRIBUTE_EXPRESSION__VALUE), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_15_0_0_2, a2_0, true);
            				copyLocalizationInfos(a2_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[422]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[423]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, parse_org_emftext_language_textAML3_AttributeExpression_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_AttributeExpression"



    // $ANTLR start "parse_org_emftext_language_textAML3_Variable"
    // TextAML3.g:3608:1: parse_org_emftext_language_textAML3_Variable returns [org.emftext.language.textAML3.Variable element = null] : ( (a0= VARID ) |c0= parse_org_emftext_language_textAML3_ContainmentVariable );
    public final org.emftext.language.textAML3.Variable parse_org_emftext_language_textAML3_Variable() throws RecognitionException {
        org.emftext.language.textAML3.Variable element =  null;

        int parse_org_emftext_language_textAML3_Variable_StartIndex = input.index();

        Token a0=null;
        org.emftext.language.textAML3.ContainmentVariable c0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }

            // TextAML3.g:3611:2: ( (a0= VARID ) |c0= parse_org_emftext_language_textAML3_ContainmentVariable )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==VARID) ) {
                int LA38_1 = input.LA(2);

                if ( (synpred41_TextAML3()) ) {
                    alt38=1;
                }
                else if ( (true) ) {
                    alt38=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // TextAML3.g:3612:2: (a0= VARID )
                    {
                    // TextAML3.g:3612:2: (a0= VARID )
                    // TextAML3.g:3613:3: a0= VARID
                    {
                    a0=(Token)match(input,VARID,FOLLOW_VARID_in_parse_org_emftext_language_textAML3_Variable4003); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (terminateParsing) {
                    				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    			}
                    			if (element == null) {
                    				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createVariable();
                    				startIncompleteElement(element);
                    			}
                    			if (a0 != null) {
                    				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("VARID");
                    				tokenResolver.setOptions(getOptions());
                    				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result = getFreshTokenResolveResult();
                    				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.VARIABLE__VARNAME), result);
                    				Object resolvedObject = result.getResolvedToken();
                    				if (resolvedObject == null) {
                    					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
                    				}
                    				java.lang.String resolved = (java.lang.String) resolvedObject;
                    				if (resolved != null) {
                    					Object value = resolved;
                    					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.VARIABLE__VARNAME), value);
                    					completedElement(value, false);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_16_0_0_0, resolved, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
                    			}
                    		}

                    }


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[424]);
                    		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[425]);
                    		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[426]);
                    		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[427]);
                    		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[428]);
                    		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[429]);
                    		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[430]);
                    		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[431]);
                    		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[432]);
                    		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[433]);
                    		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[434]);
                    		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[435]);
                    		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[436]);
                    		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[437]);
                    	}

                    }
                    break;
                case 2 :
                    // TextAML3.g:3663:2: c0= parse_org_emftext_language_textAML3_ContainmentVariable
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_ContainmentVariable_in_parse_org_emftext_language_textAML3_Variable4029);
                    c0=parse_org_emftext_language_textAML3_ContainmentVariable();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, parse_org_emftext_language_textAML3_Variable_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_Variable"



    // $ANTLR start "parse_org_emftext_language_textAML3_ContainmentVariable"
    // TextAML3.g:3667:1: parse_org_emftext_language_textAML3_ContainmentVariable returns [org.emftext.language.textAML3.ContainmentVariable element = null] : (a0= VARID ) a1= ':' (a2= REFERENCE ) ;
    public final org.emftext.language.textAML3.ContainmentVariable parse_org_emftext_language_textAML3_ContainmentVariable() throws RecognitionException {
        org.emftext.language.textAML3.ContainmentVariable element =  null;

        int parse_org_emftext_language_textAML3_ContainmentVariable_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }

            // TextAML3.g:3670:2: ( (a0= VARID ) a1= ':' (a2= REFERENCE ) )
            // TextAML3.g:3671:2: (a0= VARID ) a1= ':' (a2= REFERENCE )
            {
            // TextAML3.g:3671:2: (a0= VARID )
            // TextAML3.g:3672:3: a0= VARID
            {
            a0=(Token)match(input,VARID,FOLLOW_VARID_in_parse_org_emftext_language_textAML3_ContainmentVariable4058); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createContainmentVariable();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("VARID");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.CONTAINMENT_VARIABLE__VARNAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.CONTAINMENT_VARIABLE__VARNAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_17_0_0_0, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[438]);
            	}

            a1=(Token)match(input,21,FOLLOW_21_in_parse_org_emftext_language_textAML3_ContainmentVariable4079); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createContainmentVariable();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_17_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[439]);
            	}

            // TextAML3.g:3721:2: (a2= REFERENCE )
            // TextAML3.g:3722:3: a2= REFERENCE
            {
            a2=(Token)match(input,REFERENCE,FOLLOW_REFERENCE_in_parse_org_emftext_language_textAML3_ContainmentVariable4097); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createContainmentVariable();
            				startIncompleteElement(element);
            			}
            			if (a2 != null) {
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REFERENCE");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.CONTAINMENT_VARIABLE__CONTAINER), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.eclipse.emf.ecore.EClass proxy = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEClass();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContextDependentURIFragmentFactory<org.emftext.language.textAML3.ContainmentVariable, org.eclipse.emf.ecore.EClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getContainmentVariableContainerReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.CONTAINMENT_VARIABLE__CONTAINER), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.CONTAINMENT_VARIABLE__CONTAINER), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_17_0_0_2, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[440]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[441]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[442]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[443]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[444]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[445]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[446]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[447]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[448]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[449]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[450]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[451]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[452]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[453]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[454]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, parse_org_emftext_language_textAML3_ContainmentVariable_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_ContainmentVariable"



    // $ANTLR start "parse_org_emftext_language_textAML3_TypeReferenceElement"
    // TextAML3.g:3777:1: parse_org_emftext_language_textAML3_TypeReferenceElement returns [org.emftext.language.textAML3.TypeReferenceElement element = null] : (a0= TEXT ) a1= '=' (a2_0= parse_org_emftext_language_textAML3_Expression ) ;
    public final org.emftext.language.textAML3.TypeReferenceElement parse_org_emftext_language_textAML3_TypeReferenceElement() throws RecognitionException {
        org.emftext.language.textAML3.TypeReferenceElement element =  null;

        int parse_org_emftext_language_textAML3_TypeReferenceElement_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        org.emftext.language.textAML3.Expression a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }

            // TextAML3.g:3780:2: ( (a0= TEXT ) a1= '=' (a2_0= parse_org_emftext_language_textAML3_Expression ) )
            // TextAML3.g:3781:2: (a0= TEXT ) a1= '=' (a2_0= parse_org_emftext_language_textAML3_Expression )
            {
            // TextAML3.g:3781:2: (a0= TEXT )
            // TextAML3.g:3782:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_TypeReferenceElement4137); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeReferenceElement();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_REFERENCE_ELEMENT__TYPEATTRIBUTE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.emftext.language.textAML3.TypeAttribute proxy = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeAttribute();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContextDependentURIFragmentFactory<org.emftext.language.textAML3.TypeReferenceElement, org.emftext.language.textAML3.TypeAttribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeReferenceElementTypeattributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_REFERENCE_ELEMENT__TYPEATTRIBUTE), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_REFERENCE_ELEMENT__TYPEATTRIBUTE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_25_0_0_0, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[455]);
            	}

            a1=(Token)match(input,24,FOLLOW_24_in_parse_org_emftext_language_textAML3_TypeReferenceElement4158); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeReferenceElement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_25_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeReferenceElement(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[456]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeReferenceElement(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[457]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeReferenceElement(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[458]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeReferenceElement(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[459]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeReferenceElement(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[460]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeReferenceElement(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[461]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeReferenceElement(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[462]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeReferenceElement(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[463]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeReferenceElement(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[464]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeReferenceElement(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[465]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeReferenceElement(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[466]);
            	}

            // TextAML3.g:3845:2: (a2_0= parse_org_emftext_language_textAML3_Expression )
            // TextAML3.g:3846:3: a2_0= parse_org_emftext_language_textAML3_Expression
            {
            pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Expression_in_parse_org_emftext_language_textAML3_TypeReferenceElement4176);
            a2_0=parse_org_emftext_language_textAML3_Expression();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeReferenceElement();
            				startIncompleteElement(element);
            			}
            			if (a2_0 != null) {
            				if (a2_0 != null) {
            					Object value = a2_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_REFERENCE_ELEMENT__VALUE), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_25_0_0_2, a2_0, true);
            				copyLocalizationInfos(a2_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[467]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[468]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, parse_org_emftext_language_textAML3_TypeReferenceElement_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_TypeReferenceElement"



    // $ANTLR start "parse_org_emftext_language_textAML3_TypeAttribute"
    // TextAML3.g:3874:1: parse_org_emftext_language_textAML3_TypeAttribute returns [org.emftext.language.textAML3.TypeAttribute element = null] : (a0= TEXT ) ;
    public final org.emftext.language.textAML3.TypeAttribute parse_org_emftext_language_textAML3_TypeAttribute() throws RecognitionException {
        org.emftext.language.textAML3.TypeAttribute element =  null;

        int parse_org_emftext_language_textAML3_TypeAttribute_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }

            // TextAML3.g:3877:2: ( (a0= TEXT ) )
            // TextAML3.g:3878:2: (a0= TEXT )
            {
            // TextAML3.g:3878:2: (a0= TEXT )
            // TextAML3.g:3879:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_TypeAttribute4213); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeAttribute();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_ATTRIBUTE__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_ATTRIBUTE__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_31_0_0_0, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[469]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[470]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, parse_org_emftext_language_textAML3_TypeAttribute_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_TypeAttribute"



    // $ANTLR start "parseop_Condition_level_5"
    // TextAML3.g:3917:1: parseop_Condition_level_5 returns [org.emftext.language.textAML3.Condition element = null] : (c0= parse_org_emftext_language_textAML3_ComparisonCondition |c1= parse_org_emftext_language_textAML3_FoldCondition );
    public final org.emftext.language.textAML3.Condition parseop_Condition_level_5() throws RecognitionException {
        org.emftext.language.textAML3.Condition element =  null;

        int parseop_Condition_level_5_StartIndex = input.index();

        org.emftext.language.textAML3.ComparisonCondition c0 =null;

        org.emftext.language.textAML3.FoldCondition c1 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }

            // TextAML3.g:3920:2: (c0= parse_org_emftext_language_textAML3_ComparisonCondition |c1= parse_org_emftext_language_textAML3_FoldCondition )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0 >= NUMBER && LA39_0 <= TEXT)||LA39_0==VARID||LA39_0==14||LA39_0==26||(LA39_0 >= 28 && LA39_0 <= 29)||(LA39_0 >= 35 && LA39_0 <= 36)||LA39_0==38||LA39_0==40) ) {
                alt39=1;
            }
            else if ( (LA39_0==30) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // TextAML3.g:3921:2: c0= parse_org_emftext_language_textAML3_ComparisonCondition
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_ComparisonCondition_in_parseop_Condition_level_54249);
                    c0=parse_org_emftext_language_textAML3_ComparisonCondition();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // TextAML3.g:3922:4: c1= parse_org_emftext_language_textAML3_FoldCondition
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_FoldCondition_in_parseop_Condition_level_54259);
                    c1=parse_org_emftext_language_textAML3_FoldCondition();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, parseop_Condition_level_5_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parseop_Condition_level_5"



    // $ANTLR start "parse_org_emftext_language_textAML3_ComparisonCondition"
    // TextAML3.g:3925:1: parse_org_emftext_language_textAML3_ComparisonCondition returns [org.emftext.language.textAML3.ComparisonCondition element = null] : (a0_0= parse_org_emftext_language_textAML3_Expression ) ( (a1= '<' |a2= '=' |a3= '>' |a4= 'in' |a5= '#' ) ) (a8_0= parse_org_emftext_language_textAML3_Expression ) ;
    public final org.emftext.language.textAML3.ComparisonCondition parse_org_emftext_language_textAML3_ComparisonCondition() throws RecognitionException {
        org.emftext.language.textAML3.ComparisonCondition element =  null;

        int parse_org_emftext_language_textAML3_ComparisonCondition_StartIndex = input.index();

        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        org.emftext.language.textAML3.Expression a0_0 =null;

        org.emftext.language.textAML3.Expression a8_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return element; }

            // TextAML3.g:3928:2: ( (a0_0= parse_org_emftext_language_textAML3_Expression ) ( (a1= '<' |a2= '=' |a3= '>' |a4= 'in' |a5= '#' ) ) (a8_0= parse_org_emftext_language_textAML3_Expression ) )
            // TextAML3.g:3929:2: (a0_0= parse_org_emftext_language_textAML3_Expression ) ( (a1= '<' |a2= '=' |a3= '>' |a4= 'in' |a5= '#' ) ) (a8_0= parse_org_emftext_language_textAML3_Expression )
            {
            // TextAML3.g:3929:2: (a0_0= parse_org_emftext_language_textAML3_Expression )
            // TextAML3.g:3930:3: a0_0= parse_org_emftext_language_textAML3_Expression
            {
            pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Expression_in_parse_org_emftext_language_textAML3_ComparisonCondition4286);
            a0_0=parse_org_emftext_language_textAML3_Expression();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createComparisonCondition();
            				startIncompleteElement(element);
            			}
            			if (a0_0 != null) {
            				if (a0_0 != null) {
            					Object value = a0_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.COMPARISON_CONDITION__LEFT), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_8_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[471]);
            	}

            // TextAML3.g:3955:2: ( (a1= '<' |a2= '=' |a3= '>' |a4= 'in' |a5= '#' ) )
            // TextAML3.g:3956:3: (a1= '<' |a2= '=' |a3= '>' |a4= 'in' |a5= '#' )
            {
            // TextAML3.g:3956:3: (a1= '<' |a2= '=' |a3= '>' |a4= 'in' |a5= '#' )
            int alt40=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt40=1;
                }
                break;
            case 24:
                {
                alt40=2;
                }
                break;
            case 25:
                {
                alt40=3;
                }
                break;
            case 34:
                {
                alt40=4;
                }
                break;
            case 12:
                {
                alt40=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }

            switch (alt40) {
                case 1 :
                    // TextAML3.g:3957:4: a1= '<'
                    {
                    a1=(Token)match(input,23,FOLLOW_23_in_parse_org_emftext_language_textAML3_ComparisonCondition4313); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createComparisonCondition();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_8_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getComparisonOperator().getEEnumLiteral(org.emftext.language.textAML3.ComparisonOperator.LESS_EQUAL_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.COMPARISON_CONDITION__OPERATOR), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // TextAML3.g:3970:8: a2= '='
                    {
                    a2=(Token)match(input,24,FOLLOW_24_in_parse_org_emftext_language_textAML3_ComparisonCondition4328); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createComparisonCondition();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_8_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getComparisonOperator().getEEnumLiteral(org.emftext.language.textAML3.ComparisonOperator.EQUAL_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.COMPARISON_CONDITION__OPERATOR), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 3 :
                    // TextAML3.g:3983:8: a3= '>'
                    {
                    a3=(Token)match(input,25,FOLLOW_25_in_parse_org_emftext_language_textAML3_ComparisonCondition4343); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createComparisonCondition();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_8_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getComparisonOperator().getEEnumLiteral(org.emftext.language.textAML3.ComparisonOperator.GREATER_EQUAL_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.COMPARISON_CONDITION__OPERATOR), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 4 :
                    // TextAML3.g:3996:8: a4= 'in'
                    {
                    a4=(Token)match(input,34,FOLLOW_34_in_parse_org_emftext_language_textAML3_ComparisonCondition4358); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createComparisonCondition();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_8_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getComparisonOperator().getEEnumLiteral(org.emftext.language.textAML3.ComparisonOperator.ELEMENT_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.COMPARISON_CONDITION__OPERATOR), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 5 :
                    // TextAML3.g:4009:8: a5= '#'
                    {
                    a5=(Token)match(input,12,FOLLOW_12_in_parse_org_emftext_language_textAML3_ComparisonCondition4373); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createComparisonCondition();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_8_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getComparisonOperator().getEEnumLiteral(org.emftext.language.textAML3.ComparisonOperator.NOT_EQUAL_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.COMPARISON_CONDITION__OPERATOR), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getComparisonCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[472]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getComparisonCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[473]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getComparisonCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[474]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getComparisonCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[475]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getComparisonCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[476]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getComparisonCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[477]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getComparisonCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[478]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getComparisonCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[479]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getComparisonCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[480]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getComparisonCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[481]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getComparisonCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[482]);
            	}

            // TextAML3.g:4039:2: (a8_0= parse_org_emftext_language_textAML3_Expression )
            // TextAML3.g:4040:3: a8_0= parse_org_emftext_language_textAML3_Expression
            {
            pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Expression_in_parse_org_emftext_language_textAML3_ComparisonCondition4398);
            a8_0=parse_org_emftext_language_textAML3_Expression();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createComparisonCondition();
            				startIncompleteElement(element);
            			}
            			if (a8_0 != null) {
            				if (a8_0 != null) {
            					Object value = a8_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.COMPARISON_CONDITION__RIGHT), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_8_0_0_2, a8_0, true);
            				copyLocalizationInfos(a8_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[483]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[484]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[485]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[486]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[487]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[488]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[489]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, parse_org_emftext_language_textAML3_ComparisonCondition_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_ComparisonCondition"



    // $ANTLR start "parse_org_emftext_language_textAML3_FoldCondition"
    // TextAML3.g:4073:1: parse_org_emftext_language_textAML3_FoldCondition returns [org.emftext.language.textAML3.FoldCondition element = null] : a0= 'for' (a1_0= parse_org_emftext_language_textAML3_Generator ) ( (a2= ',' (a3_0= parse_org_emftext_language_textAML3_Generator ) ) )* a4= ':' ( (a5_0= parse_org_emftext_language_textAML3_Condition ) |a6= '(' (a7_0= parse_org_emftext_language_textAML3_Condition ) ( (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Condition ) ) )* a10= ')' ) ;
    public final org.emftext.language.textAML3.FoldCondition parse_org_emftext_language_textAML3_FoldCondition() throws RecognitionException {
        org.emftext.language.textAML3.FoldCondition element =  null;

        int parse_org_emftext_language_textAML3_FoldCondition_StartIndex = input.index();

        Token a0=null;
        Token a2=null;
        Token a4=null;
        Token a6=null;
        Token a8=null;
        Token a10=null;
        org.emftext.language.textAML3.Generator a1_0 =null;

        org.emftext.language.textAML3.Generator a3_0 =null;

        org.emftext.language.textAML3.Condition a5_0 =null;

        org.emftext.language.textAML3.Condition a7_0 =null;

        org.emftext.language.textAML3.Condition a9_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return element; }

            // TextAML3.g:4076:2: (a0= 'for' (a1_0= parse_org_emftext_language_textAML3_Generator ) ( (a2= ',' (a3_0= parse_org_emftext_language_textAML3_Generator ) ) )* a4= ':' ( (a5_0= parse_org_emftext_language_textAML3_Condition ) |a6= '(' (a7_0= parse_org_emftext_language_textAML3_Condition ) ( (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Condition ) ) )* a10= ')' ) )
            // TextAML3.g:4077:2: a0= 'for' (a1_0= parse_org_emftext_language_textAML3_Generator ) ( (a2= ',' (a3_0= parse_org_emftext_language_textAML3_Generator ) ) )* a4= ':' ( (a5_0= parse_org_emftext_language_textAML3_Condition ) |a6= '(' (a7_0= parse_org_emftext_language_textAML3_Condition ) ( (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Condition ) ) )* a10= ')' )
            {
            a0=(Token)match(input,30,FOLLOW_30_in_parse_org_emftext_language_textAML3_FoldCondition4431); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createFoldCondition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_9_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[490]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[491]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[492]);
            	}

            // TextAML3.g:4093:2: (a1_0= parse_org_emftext_language_textAML3_Generator )
            // TextAML3.g:4094:3: a1_0= parse_org_emftext_language_textAML3_Generator
            {
            pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Generator_in_parse_org_emftext_language_textAML3_FoldCondition4449);
            a1_0=parse_org_emftext_language_textAML3_Generator();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createFoldCondition();
            				startIncompleteElement(element);
            			}
            			if (a1_0 != null) {
            				if (a1_0 != null) {
            					Object value = a1_0;
            					addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.FOLD_CONDITION__GENERATOR, value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_9_0_0_1, a1_0, true);
            				copyLocalizationInfos(a1_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[493]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[494]);
            	}

            // TextAML3.g:4120:2: ( (a2= ',' (a3_0= parse_org_emftext_language_textAML3_Generator ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==18) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // TextAML3.g:4121:3: (a2= ',' (a3_0= parse_org_emftext_language_textAML3_Generator ) )
            	    {
            	    // TextAML3.g:4121:3: (a2= ',' (a3_0= parse_org_emftext_language_textAML3_Generator ) )
            	    // TextAML3.g:4122:4: a2= ',' (a3_0= parse_org_emftext_language_textAML3_Generator )
            	    {
            	    a2=(Token)match(input,18,FOLLOW_18_in_parse_org_emftext_language_textAML3_FoldCondition4476); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createFoldCondition();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_9_0_0_2_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[495]);
            	    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[496]);
            	    				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[497]);
            	    			}

            	    // TextAML3.g:4138:4: (a3_0= parse_org_emftext_language_textAML3_Generator )
            	    // TextAML3.g:4139:5: a3_0= parse_org_emftext_language_textAML3_Generator
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Generator_in_parse_org_emftext_language_textAML3_FoldCondition4502);
            	    a3_0=parse_org_emftext_language_textAML3_Generator();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createFoldCondition();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a3_0 != null) {
            	    						if (a3_0 != null) {
            	    							Object value = a3_0;
            	    							addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.FOLD_CONDITION__GENERATOR, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_9_0_0_2_0_0_1, a3_0, true);
            	    						copyLocalizationInfos(a3_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[498]);
            	    				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[499]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[500]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[501]);
            	}

            a4=(Token)match(input,21,FOLLOW_21_in_parse_org_emftext_language_textAML3_FoldCondition4543); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createFoldCondition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_9_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[502]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[503]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[504]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[505]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[506]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[507]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[508]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[509]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[510]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[511]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[512]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[513]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[514]);
            	}

            // TextAML3.g:4199:2: ( (a5_0= parse_org_emftext_language_textAML3_Condition ) |a6= '(' (a7_0= parse_org_emftext_language_textAML3_Condition ) ( (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Condition ) ) )* a10= ')' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0 >= NUMBER && LA43_0 <= TEXT)||LA43_0==VARID||LA43_0==26||(LA43_0 >= 28 && LA43_0 <= 30)||(LA43_0 >= 35 && LA43_0 <= 36)||LA43_0==38||LA43_0==40) ) {
                alt43=1;
            }
            else if ( (LA43_0==14) ) {
                int LA43_13 = input.LA(2);

                if ( (synpred48_TextAML3()) ) {
                    alt43=1;
                }
                else if ( (true) ) {
                    alt43=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 13, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }
            switch (alt43) {
                case 1 :
                    // TextAML3.g:4200:3: (a5_0= parse_org_emftext_language_textAML3_Condition )
                    {
                    // TextAML3.g:4200:3: (a5_0= parse_org_emftext_language_textAML3_Condition )
                    // TextAML3.g:4201:4: a5_0= parse_org_emftext_language_textAML3_Condition
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Condition_in_parse_org_emftext_language_textAML3_FoldCondition4566);
                    a5_0=parse_org_emftext_language_textAML3_Condition();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (terminateParsing) {
                    					throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    				}
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createFoldCondition();
                    					startIncompleteElement(element);
                    				}
                    				if (a5_0 != null) {
                    					if (a5_0 != null) {
                    						Object value = a5_0;
                    						addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.FOLD_CONDITION__CONDITION, value);
                    						completedElement(value, true);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_9_0_0_4_0_0_0, a5_0, true);
                    					copyLocalizationInfos(a5_0, element);
                    				}
                    			}

                    }


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[515]);
                    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[516]);
                    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[517]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[518]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[519]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[520]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[521]);
                    		}

                    }
                    break;
                case 2 :
                    // TextAML3.g:4233:6: a6= '(' (a7_0= parse_org_emftext_language_textAML3_Condition ) ( (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Condition ) ) )* a10= ')'
                    {
                    a6=(Token)match(input,14,FOLLOW_14_in_parse_org_emftext_language_textAML3_FoldCondition4595); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createFoldCondition();
                    				startIncompleteElement(element);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_9_0_0_4_0_1_0, null, true);
                    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[522]);
                    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[523]);
                    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[524]);
                    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[525]);
                    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[526]);
                    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[527]);
                    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[528]);
                    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[529]);
                    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[530]);
                    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[531]);
                    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[532]);
                    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[533]);
                    		}

                    // TextAML3.g:4258:3: (a7_0= parse_org_emftext_language_textAML3_Condition )
                    // TextAML3.g:4259:4: a7_0= parse_org_emftext_language_textAML3_Condition
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Condition_in_parse_org_emftext_language_textAML3_FoldCondition4617);
                    a7_0=parse_org_emftext_language_textAML3_Condition();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (terminateParsing) {
                    					throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    				}
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createFoldCondition();
                    					startIncompleteElement(element);
                    				}
                    				if (a7_0 != null) {
                    					if (a7_0 != null) {
                    						Object value = a7_0;
                    						addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.FOLD_CONDITION__CONDITION, value);
                    						completedElement(value, true);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_9_0_0_4_0_1_1, a7_0, true);
                    					copyLocalizationInfos(a7_0, element);
                    				}
                    			}

                    }


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[534]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[535]);
                    		}

                    // TextAML3.g:4285:3: ( (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Condition ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==18) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // TextAML3.g:4286:4: (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Condition ) )
                    	    {
                    	    // TextAML3.g:4286:4: (a8= ',' (a9_0= parse_org_emftext_language_textAML3_Condition ) )
                    	    // TextAML3.g:4287:5: a8= ',' (a9_0= parse_org_emftext_language_textAML3_Condition )
                    	    {
                    	    a8=(Token)match(input,18,FOLLOW_18_in_parse_org_emftext_language_textAML3_FoldCondition4651); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    					if (element == null) {
                    	    						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createFoldCondition();
                    	    						startIncompleteElement(element);
                    	    					}
                    	    					collectHiddenTokens(element);
                    	    					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_9_0_0_4_0_1_2_0_0_0, null, true);
                    	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
                    	    				}

                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[536]);
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[537]);
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[538]);
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[539]);
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[540]);
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[541]);
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[542]);
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[543]);
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[544]);
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[545]);
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[546]);
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[547]);
                    	    				}

                    	    // TextAML3.g:4312:5: (a9_0= parse_org_emftext_language_textAML3_Condition )
                    	    // TextAML3.g:4313:6: a9_0= parse_org_emftext_language_textAML3_Condition
                    	    {
                    	    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Condition_in_parse_org_emftext_language_textAML3_FoldCondition4681);
                    	    a9_0=parse_org_emftext_language_textAML3_Condition();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (terminateParsing) {
                    	    							throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    	    						}
                    	    						if (element == null) {
                    	    							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createFoldCondition();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						if (a9_0 != null) {
                    	    							if (a9_0 != null) {
                    	    								Object value = a9_0;
                    	    								addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.FOLD_CONDITION__CONDITION, value);
                    	    								completedElement(value, true);
                    	    							}
                    	    							collectHiddenTokens(element);
                    	    							retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_9_0_0_4_0_1_2_0_0_1, a9_0, true);
                    	    							copyLocalizationInfos(a9_0, element);
                    	    						}
                    	    					}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[548]);
                    	    					addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[549]);
                    	    				}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[550]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[551]);
                    		}

                    a10=(Token)match(input,15,FOLLOW_15_in_parse_org_emftext_language_textAML3_FoldCondition4732); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createFoldCondition();
                    				startIncompleteElement(element);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_9_0_0_4_0_1_3, null, true);
                    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[552]);
                    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[553]);
                    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[554]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[555]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[556]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[557]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[558]);
                    		}

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[559]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[560]);
            		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[561]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[562]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[563]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[564]);
            		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[565]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, parse_org_emftext_language_textAML3_FoldCondition_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_FoldCondition"



    // $ANTLR start "parseop_Expression_level_1"
    // TextAML3.g:4381:1: parseop_Expression_level_1 returns [org.emftext.language.textAML3.Expression element = null] : leftArg= parseop_Expression_level_2 ( ( () ( (a0= '+' |a1= '-' |a2= '*' |a3= '.' |a4= '&' ) ) rightArg= parseop_Expression_level_2 )+ |) ;
    public final org.emftext.language.textAML3.Expression parseop_Expression_level_1() throws RecognitionException {
        org.emftext.language.textAML3.Expression element =  null;

        int parseop_Expression_level_1_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        org.emftext.language.textAML3.Expression leftArg =null;

        org.emftext.language.textAML3.Expression rightArg =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return element; }

            // TextAML3.g:4384:2: (leftArg= parseop_Expression_level_2 ( ( () ( (a0= '+' |a1= '-' |a2= '*' |a3= '.' |a4= '&' ) ) rightArg= parseop_Expression_level_2 )+ |) )
            // TextAML3.g:4385:2: leftArg= parseop_Expression_level_2 ( ( () ( (a0= '+' |a1= '-' |a2= '*' |a3= '.' |a4= '&' ) ) rightArg= parseop_Expression_level_2 )+ |)
            {
            pushFollow(FOLLOW_parseop_Expression_level_2_in_parseop_Expression_level_14771);
            leftArg=parseop_Expression_level_2();

            state._fsp--;
            if (state.failed) return element;

            // TextAML3.g:4385:39: ( ( () ( (a0= '+' |a1= '-' |a2= '*' |a3= '.' |a4= '&' ) ) rightArg= parseop_Expression_level_2 )+ |)
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==13||(LA46_0 >= 16 && LA46_0 <= 17)||(LA46_0 >= 19 && LA46_0 <= 20)) ) {
                alt46=1;
            }
            else if ( (LA46_0==EOF||(LA46_0 >= REFERENCE && LA46_0 <= TEXT)||LA46_0==12||LA46_0==15||LA46_0==18||LA46_0==21||(LA46_0 >= 23 && LA46_0 <= 25)||LA46_0==27||LA46_0==31||LA46_0==34||LA46_0==39||(LA46_0 >= 43 && LA46_0 <= 44)||LA46_0==47||LA46_0==49||(LA46_0 >= 52 && LA46_0 <= 53)) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }
            switch (alt46) {
                case 1 :
                    // TextAML3.g:4385:40: ( () ( (a0= '+' |a1= '-' |a2= '*' |a3= '.' |a4= '&' ) ) rightArg= parseop_Expression_level_2 )+
                    {
                    // TextAML3.g:4385:40: ( () ( (a0= '+' |a1= '-' |a2= '*' |a3= '.' |a4= '&' ) ) rightArg= parseop_Expression_level_2 )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==13||(LA45_0 >= 16 && LA45_0 <= 17)||(LA45_0 >= 19 && LA45_0 <= 20)) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // TextAML3.g:4386:3: () ( (a0= '+' |a1= '-' |a2= '*' |a3= '.' |a4= '&' ) ) rightArg= parseop_Expression_level_2
                    	    {
                    	    // TextAML3.g:4386:3: ()
                    	    // TextAML3.g:4386:4: 
                    	    {
                    	    }


                    	    if ( state.backtracking==0 ) { element = null; }

                    	    // TextAML3.g:4388:3: ( (a0= '+' |a1= '-' |a2= '*' |a3= '.' |a4= '&' ) )
                    	    // TextAML3.g:4389:4: (a0= '+' |a1= '-' |a2= '*' |a3= '.' |a4= '&' )
                    	    {
                    	    // TextAML3.g:4389:4: (a0= '+' |a1= '-' |a2= '*' |a3= '.' |a4= '&' )
                    	    int alt44=5;
                    	    switch ( input.LA(1) ) {
                    	    case 17:
                    	        {
                    	        alt44=1;
                    	        }
                    	        break;
                    	    case 19:
                    	        {
                    	        alt44=2;
                    	        }
                    	        break;
                    	    case 16:
                    	        {
                    	        alt44=3;
                    	        }
                    	        break;
                    	    case 20:
                    	        {
                    	        alt44=4;
                    	        }
                    	        break;
                    	    case 13:
                    	        {
                    	        alt44=5;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return element;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 44, 0, input);

                    	        throw nvae;

                    	    }

                    	    switch (alt44) {
                    	        case 1 :
                    	            // TextAML3.g:4390:5: a0= '+'
                    	            {
                    	            a0=(Token)match(input,17,FOLLOW_17_in_parseop_Expression_level_14802); if (state.failed) return element;

                    	            if ( state.backtracking==0 ) {
                    	            					if (element == null) {
                    	            						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createBinaryExpression();
                    	            						startIncompleteElement(element);
                    	            					}
                    	            					collectHiddenTokens(element);
                    	            					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_20_0_0_1, null, true);
                    	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    	            					// set value of enumeration attribute
                    	            					Object value = org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getBinaryOperator().getEEnumLiteral(org.emftext.language.textAML3.BinaryOperator.ADDITION_VALUE).getInstance();
                    	            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.BINARY_EXPRESSION__OPERATOR), value);
                    	            					completedElement(value, false);
                    	            				}

                    	            }
                    	            break;
                    	        case 2 :
                    	            // TextAML3.g:4403:10: a1= '-'
                    	            {
                    	            a1=(Token)match(input,19,FOLLOW_19_in_parseop_Expression_level_14819); if (state.failed) return element;

                    	            if ( state.backtracking==0 ) {
                    	            					if (element == null) {
                    	            						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createBinaryExpression();
                    	            						startIncompleteElement(element);
                    	            					}
                    	            					collectHiddenTokens(element);
                    	            					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_20_0_0_1, null, true);
                    	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    	            					// set value of enumeration attribute
                    	            					Object value = org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getBinaryOperator().getEEnumLiteral(org.emftext.language.textAML3.BinaryOperator.SUBTRACTION_VALUE).getInstance();
                    	            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.BINARY_EXPRESSION__OPERATOR), value);
                    	            					completedElement(value, false);
                    	            				}

                    	            }
                    	            break;
                    	        case 3 :
                    	            // TextAML3.g:4416:10: a2= '*'
                    	            {
                    	            a2=(Token)match(input,16,FOLLOW_16_in_parseop_Expression_level_14836); if (state.failed) return element;

                    	            if ( state.backtracking==0 ) {
                    	            					if (element == null) {
                    	            						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createBinaryExpression();
                    	            						startIncompleteElement(element);
                    	            					}
                    	            					collectHiddenTokens(element);
                    	            					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_20_0_0_1, null, true);
                    	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    	            					// set value of enumeration attribute
                    	            					Object value = org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getBinaryOperator().getEEnumLiteral(org.emftext.language.textAML3.BinaryOperator.MULTIPLICATION_VALUE).getInstance();
                    	            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.BINARY_EXPRESSION__OPERATOR), value);
                    	            					completedElement(value, false);
                    	            				}

                    	            }
                    	            break;
                    	        case 4 :
                    	            // TextAML3.g:4429:10: a3= '.'
                    	            {
                    	            a3=(Token)match(input,20,FOLLOW_20_in_parseop_Expression_level_14853); if (state.failed) return element;

                    	            if ( state.backtracking==0 ) {
                    	            					if (element == null) {
                    	            						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createBinaryExpression();
                    	            						startIncompleteElement(element);
                    	            					}
                    	            					collectHiddenTokens(element);
                    	            					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_20_0_0_1, null, true);
                    	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    	            					// set value of enumeration attribute
                    	            					Object value = org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getBinaryOperator().getEEnumLiteral(org.emftext.language.textAML3.BinaryOperator.PROJECTION_VALUE).getInstance();
                    	            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.BINARY_EXPRESSION__OPERATOR), value);
                    	            					completedElement(value, false);
                    	            				}

                    	            }
                    	            break;
                    	        case 5 :
                    	            // TextAML3.g:4442:10: a4= '&'
                    	            {
                    	            a4=(Token)match(input,13,FOLLOW_13_in_parseop_Expression_level_14870); if (state.failed) return element;

                    	            if ( state.backtracking==0 ) {
                    	            					if (element == null) {
                    	            						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createBinaryExpression();
                    	            						startIncompleteElement(element);
                    	            					}
                    	            					collectHiddenTokens(element);
                    	            					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_20_0_0_1, null, true);
                    	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    	            					// set value of enumeration attribute
                    	            					Object value = org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getBinaryOperator().getEEnumLiteral(org.emftext.language.textAML3.BinaryOperator.CONCATENATION_VALUE).getInstance();
                    	            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.BINARY_EXPRESSION__OPERATOR), value);
                    	            					completedElement(value, false);
                    	            				}

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    			// expected elements (follow set)
                    	    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getBinaryExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[566]);
                    	    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getBinaryExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[567]);
                    	    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getBinaryExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[568]);
                    	    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getBinaryExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[569]);
                    	    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getBinaryExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[570]);
                    	    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getBinaryExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[571]);
                    	    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getBinaryExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[572]);
                    	    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getBinaryExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[573]);
                    	    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getBinaryExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[574]);
                    	    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getBinaryExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[575]);
                    	    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getBinaryExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[576]);
                    	    		}

                    	    pushFollow(FOLLOW_parseop_Expression_level_2_in_parseop_Expression_level_14896);
                    	    rightArg=parseop_Expression_level_2();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    			if (terminateParsing) {
                    	    				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    	    			}
                    	    			if (element == null) {
                    	    				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createBinaryExpression();
                    	    				startIncompleteElement(element);
                    	    			}
                    	    			if (leftArg != null) {
                    	    				if (leftArg != null) {
                    	    					Object value = leftArg;
                    	    					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.BINARY_EXPRESSION__LEFT), value);
                    	    					completedElement(value, true);
                    	    				}
                    	    				collectHiddenTokens(element);
                    	    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_20_0_0_0, leftArg, true);
                    	    				copyLocalizationInfos(leftArg, element);
                    	    			}
                    	    		}

                    	    if ( state.backtracking==0 ) {
                    	    			if (terminateParsing) {
                    	    				throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    	    			}
                    	    			if (element == null) {
                    	    				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createBinaryExpression();
                    	    				startIncompleteElement(element);
                    	    			}
                    	    			if (rightArg != null) {
                    	    				if (rightArg != null) {
                    	    					Object value = rightArg;
                    	    					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.BINARY_EXPRESSION__RIGHT), value);
                    	    					completedElement(value, true);
                    	    				}
                    	    				collectHiddenTokens(element);
                    	    				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_20_0_0_2, rightArg, true);
                    	    				copyLocalizationInfos(rightArg, element);
                    	    			}
                    	    		}

                    	    if ( state.backtracking==0 ) { leftArg = element; /* this may become an argument in the next iteration */ }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt45 >= 1 ) break loop45;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(45, input);
                                throw eee;
                        }
                        cnt45++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // TextAML3.g:4511:21: 
                    {
                    if ( state.backtracking==0 ) { element = leftArg; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 23, parseop_Expression_level_1_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parseop_Expression_level_1"



    // $ANTLR start "parseop_Expression_level_2"
    // TextAML3.g:4516:1: parseop_Expression_level_2 returns [org.emftext.language.textAML3.Expression element = null] : ( ( (a0= 'length' |a1= 'first' |a2= 'last' |a3= 'flatten' |a4= 'pairs' ) ) arg= parseop_Expression_level_3 |arg= parseop_Expression_level_3 );
    public final org.emftext.language.textAML3.Expression parseop_Expression_level_2() throws RecognitionException {
        org.emftext.language.textAML3.Expression element =  null;

        int parseop_Expression_level_2_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        org.emftext.language.textAML3.Expression arg =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return element; }

            // TextAML3.g:4519:0: ( ( (a0= 'length' |a1= 'first' |a2= 'last' |a3= 'flatten' |a4= 'pairs' ) ) arg= parseop_Expression_level_3 |arg= parseop_Expression_level_3 )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0 >= 28 && LA48_0 <= 29)||(LA48_0 >= 35 && LA48_0 <= 36)||LA48_0==38) ) {
                alt48=1;
            }
            else if ( ((LA48_0 >= NUMBER && LA48_0 <= TEXT)||LA48_0==VARID||LA48_0==14||LA48_0==26||LA48_0==40) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }
            switch (alt48) {
                case 1 :
                    // TextAML3.g:4520:0: ( (a0= 'length' |a1= 'first' |a2= 'last' |a3= 'flatten' |a4= 'pairs' ) ) arg= parseop_Expression_level_3
                    {
                    // TextAML3.g:4520:2: ( (a0= 'length' |a1= 'first' |a2= 'last' |a3= 'flatten' |a4= 'pairs' ) )
                    // TextAML3.g:4521:2: (a0= 'length' |a1= 'first' |a2= 'last' |a3= 'flatten' |a4= 'pairs' )
                    {
                    // TextAML3.g:4521:2: (a0= 'length' |a1= 'first' |a2= 'last' |a3= 'flatten' |a4= 'pairs' )
                    int alt47=5;
                    switch ( input.LA(1) ) {
                    case 36:
                        {
                        alt47=1;
                        }
                        break;
                    case 28:
                        {
                        alt47=2;
                        }
                        break;
                    case 35:
                        {
                        alt47=3;
                        }
                        break;
                    case 29:
                        {
                        alt47=4;
                        }
                        break;
                    case 38:
                        {
                        alt47=5;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;

                    }

                    switch (alt47) {
                        case 1 :
                            // TextAML3.g:4522:3: a0= 'length'
                            {
                            a0=(Token)match(input,36,FOLLOW_36_in_parseop_Expression_level_24949); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            			if (element == null) {
                            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createUnaryExpression();
                            				startIncompleteElement(element);
                            			}
                            			collectHiddenTokens(element);
                            			retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_21_0_0_0, null, true);
                            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                            			// set value of enumeration attribute
                            			Object value = org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getUnaryOperator().getEEnumLiteral(org.emftext.language.textAML3.UnaryOperator.LENGTH_VALUE).getInstance();
                            			element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.UNARY_EXPRESSION__OPERATOR), value);
                            			completedElement(value, false);
                            		}

                            }
                            break;
                        case 2 :
                            // TextAML3.g:4535:6: a1= 'first'
                            {
                            a1=(Token)match(input,28,FOLLOW_28_in_parseop_Expression_level_24962); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            			if (element == null) {
                            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createUnaryExpression();
                            				startIncompleteElement(element);
                            			}
                            			collectHiddenTokens(element);
                            			retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_21_0_0_0, null, true);
                            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                            			// set value of enumeration attribute
                            			Object value = org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getUnaryOperator().getEEnumLiteral(org.emftext.language.textAML3.UnaryOperator.FIRST_VALUE).getInstance();
                            			element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.UNARY_EXPRESSION__OPERATOR), value);
                            			completedElement(value, false);
                            		}

                            }
                            break;
                        case 3 :
                            // TextAML3.g:4548:6: a2= 'last'
                            {
                            a2=(Token)match(input,35,FOLLOW_35_in_parseop_Expression_level_24975); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            			if (element == null) {
                            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createUnaryExpression();
                            				startIncompleteElement(element);
                            			}
                            			collectHiddenTokens(element);
                            			retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_21_0_0_0, null, true);
                            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                            			// set value of enumeration attribute
                            			Object value = org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getUnaryOperator().getEEnumLiteral(org.emftext.language.textAML3.UnaryOperator.LAST_VALUE).getInstance();
                            			element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.UNARY_EXPRESSION__OPERATOR), value);
                            			completedElement(value, false);
                            		}

                            }
                            break;
                        case 4 :
                            // TextAML3.g:4561:6: a3= 'flatten'
                            {
                            a3=(Token)match(input,29,FOLLOW_29_in_parseop_Expression_level_24988); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            			if (element == null) {
                            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createUnaryExpression();
                            				startIncompleteElement(element);
                            			}
                            			collectHiddenTokens(element);
                            			retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_21_0_0_0, null, true);
                            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                            			// set value of enumeration attribute
                            			Object value = org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getUnaryOperator().getEEnumLiteral(org.emftext.language.textAML3.UnaryOperator.FLATTEN_VALUE).getInstance();
                            			element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.UNARY_EXPRESSION__OPERATOR), value);
                            			completedElement(value, false);
                            		}

                            }
                            break;
                        case 5 :
                            // TextAML3.g:4574:6: a4= 'pairs'
                            {
                            a4=(Token)match(input,38,FOLLOW_38_in_parseop_Expression_level_25001); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            			if (element == null) {
                            				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createUnaryExpression();
                            				startIncompleteElement(element);
                            			}
                            			collectHiddenTokens(element);
                            			retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_21_0_0_0, null, true);
                            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                            			// set value of enumeration attribute
                            			Object value = org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getUnaryOperator().getEEnumLiteral(org.emftext.language.textAML3.UnaryOperator.PAIRS_VALUE).getInstance();
                            			element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.UNARY_EXPRESSION__OPERATOR), value);
                            			completedElement(value, false);
                            		}

                            }
                            break;

                    }


                    }


                    if ( state.backtracking==0 ) {
                    	// expected elements (follow set)
                    	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getUnaryExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[577]);
                    	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getUnaryExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[578]);
                    	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getUnaryExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[579]);
                    	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getUnaryExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[580]);
                    	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getUnaryExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[581]);
                    	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getUnaryExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[582]);
                    	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getUnaryExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[583]);
                    	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getUnaryExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[584]);
                    	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getUnaryExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[585]);
                    	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getUnaryExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[586]);
                    	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getUnaryExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[587]);
                    }

                    pushFollow(FOLLOW_parseop_Expression_level_3_in_parseop_Expression_level_25017);
                    arg=parseop_Expression_level_3();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    	if (terminateParsing) {
                    		throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    	}
                    	if (element == null) {
                    		element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createUnaryExpression();
                    		startIncompleteElement(element);
                    	}
                    	if (arg != null) {
                    		if (arg != null) {
                    			Object value = arg;
                    			element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.UNARY_EXPRESSION__LEFT), value);
                    			completedElement(value, true);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_21_0_0_1, arg, true);
                    		copyLocalizationInfos(arg, element);
                    	}
                    }

                    }
                    break;
                case 2 :
                    // TextAML3.g:4625:5: arg= parseop_Expression_level_3
                    {
                    pushFollow(FOLLOW_parseop_Expression_level_3_in_parseop_Expression_level_25027);
                    arg=parseop_Expression_level_3();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = arg; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 24, parseop_Expression_level_2_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parseop_Expression_level_2"



    // $ANTLR start "parseop_Expression_level_3"
    // TextAML3.g:4628:1: parseop_Expression_level_3 returns [org.emftext.language.textAML3.Expression element = null] : (c0= parse_org_emftext_language_textAML3_Number |c1= parse_org_emftext_language_textAML3_SetExpression |c2= parse_org_emftext_language_textAML3_VariableReference |c3= parse_org_emftext_language_textAML3_FunctionReference |c4= parse_org_emftext_language_textAML3_TypeReference |c5= parse_org_emftext_language_textAML3_ModelElementExpression |c6= parse_org_emftext_language_textAML3_StringLiteral |c7= parse_org_emftext_language_textAML3_NullLiteral |c8= parse_org_emftext_language_textAML3_NestedExpression );
    public final org.emftext.language.textAML3.Expression parseop_Expression_level_3() throws RecognitionException {
        org.emftext.language.textAML3.Expression element =  null;

        int parseop_Expression_level_3_StartIndex = input.index();

        org.emftext.language.textAML3.Number c0 =null;

        org.emftext.language.textAML3.SetExpression c1 =null;

        org.emftext.language.textAML3.VariableReference c2 =null;

        org.emftext.language.textAML3.FunctionReference c3 =null;

        org.emftext.language.textAML3.TypeReference c4 =null;

        org.emftext.language.textAML3.ModelElementExpression c5 =null;

        org.emftext.language.textAML3.StringLiteral c6 =null;

        org.emftext.language.textAML3.NullLiteral c7 =null;

        org.emftext.language.textAML3.NestedExpression c8 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return element; }

            // TextAML3.g:4631:0: (c0= parse_org_emftext_language_textAML3_Number |c1= parse_org_emftext_language_textAML3_SetExpression |c2= parse_org_emftext_language_textAML3_VariableReference |c3= parse_org_emftext_language_textAML3_FunctionReference |c4= parse_org_emftext_language_textAML3_TypeReference |c5= parse_org_emftext_language_textAML3_ModelElementExpression |c6= parse_org_emftext_language_textAML3_StringLiteral |c7= parse_org_emftext_language_textAML3_NullLiteral |c8= parse_org_emftext_language_textAML3_NestedExpression )
            int alt49=9;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt49=1;
                }
                break;
            case 40:
                {
                alt49=2;
                }
                break;
            case VARID:
                {
                alt49=3;
                }
                break;
            case TEXT:
                {
                int LA49_4 = input.LA(2);

                if ( (LA49_4==EOF||(LA49_4 >= REFERENCE && LA49_4 <= TEXT)||(LA49_4 >= 12 && LA49_4 <= 13)||(LA49_4 >= 15 && LA49_4 <= 21)||(LA49_4 >= 23 && LA49_4 <= 25)||LA49_4==27||LA49_4==31||LA49_4==34||LA49_4==39||(LA49_4 >= 43 && LA49_4 <= 44)||LA49_4==47||LA49_4==49||(LA49_4 >= 52 && LA49_4 <= 53)) ) {
                    alt49=4;
                }
                else if ( (LA49_4==51) ) {
                    alt49=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 4, input);

                    throw nvae;

                }
                }
                break;
            case REFERENCE:
                {
                alt49=6;
                }
                break;
            case QUOTED_34_34:
                {
                alt49=7;
                }
                break;
            case 26:
                {
                alt49=8;
                }
                break;
            case 14:
                {
                alt49=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }

            switch (alt49) {
                case 1 :
                    // TextAML3.g:4632:0: c0= parse_org_emftext_language_textAML3_Number
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Number_in_parseop_Expression_level_35049);
                    c0=parse_org_emftext_language_textAML3_Number();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // TextAML3.g:4633:2: c1= parse_org_emftext_language_textAML3_SetExpression
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_SetExpression_in_parseop_Expression_level_35057);
                    c1=parse_org_emftext_language_textAML3_SetExpression();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // TextAML3.g:4634:2: c2= parse_org_emftext_language_textAML3_VariableReference
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_VariableReference_in_parseop_Expression_level_35065);
                    c2=parse_org_emftext_language_textAML3_VariableReference();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 4 :
                    // TextAML3.g:4635:2: c3= parse_org_emftext_language_textAML3_FunctionReference
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_FunctionReference_in_parseop_Expression_level_35073);
                    c3=parse_org_emftext_language_textAML3_FunctionReference();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c3; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 5 :
                    // TextAML3.g:4636:2: c4= parse_org_emftext_language_textAML3_TypeReference
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_TypeReference_in_parseop_Expression_level_35081);
                    c4=parse_org_emftext_language_textAML3_TypeReference();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c4; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 6 :
                    // TextAML3.g:4637:2: c5= parse_org_emftext_language_textAML3_ModelElementExpression
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_ModelElementExpression_in_parseop_Expression_level_35089);
                    c5=parse_org_emftext_language_textAML3_ModelElementExpression();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c5; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 7 :
                    // TextAML3.g:4638:2: c6= parse_org_emftext_language_textAML3_StringLiteral
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_StringLiteral_in_parseop_Expression_level_35097);
                    c6=parse_org_emftext_language_textAML3_StringLiteral();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c6; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 8 :
                    // TextAML3.g:4639:2: c7= parse_org_emftext_language_textAML3_NullLiteral
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_NullLiteral_in_parseop_Expression_level_35105);
                    c7=parse_org_emftext_language_textAML3_NullLiteral();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c7; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 9 :
                    // TextAML3.g:4640:2: c8= parse_org_emftext_language_textAML3_NestedExpression
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_NestedExpression_in_parseop_Expression_level_35113);
                    c8=parse_org_emftext_language_textAML3_NestedExpression();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c8; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 25, parseop_Expression_level_3_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parseop_Expression_level_3"



    // $ANTLR start "parse_org_emftext_language_textAML3_Number"
    // TextAML3.g:4643:1: parse_org_emftext_language_textAML3_Number returns [org.emftext.language.textAML3.Number element = null] : (a0= NUMBER ) ;
    public final org.emftext.language.textAML3.Number parse_org_emftext_language_textAML3_Number() throws RecognitionException {
        org.emftext.language.textAML3.Number element =  null;

        int parse_org_emftext_language_textAML3_Number_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return element; }

            // TextAML3.g:4646:2: ( (a0= NUMBER ) )
            // TextAML3.g:4647:2: (a0= NUMBER )
            {
            // TextAML3.g:4647:2: (a0= NUMBER )
            // TextAML3.g:4648:2: a0= NUMBER
            {
            a0=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_parse_org_emftext_language_textAML3_Number5138); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (terminateParsing) {
            			throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            		}
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createNumber();
            			startIncompleteElement(element);
            		}
            		if (a0 != null) {
            			org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NUMBER");
            			tokenResolver.setOptions(getOptions());
            			org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result = getFreshTokenResolveResult();
            			tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.NUMBER__VALUE), result);
            			Object resolvedObject = result.getResolvedToken();
            			if (resolvedObject == null) {
            				addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            			}
            			java.math.BigInteger resolved = (java.math.BigInteger) resolvedObject;
            			if (resolved != null) {
            				Object value = resolved;
            				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.NUMBER__VALUE), value);
            				completedElement(value, false);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_18_0_0_0, resolved, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            		}
            	}

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[588]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[589]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[590]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[591]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[592]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[593]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[594]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[595]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[596]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[597]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[598]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[599]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[600]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[601]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[602]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[603]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 26, parse_org_emftext_language_textAML3_Number_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_Number"



    // $ANTLR start "parse_org_emftext_language_textAML3_SetExpression"
    // TextAML3.g:4700:1: parse_org_emftext_language_textAML3_SetExpression returns [org.emftext.language.textAML3.SetExpression element = null] : a0= 'set' a1= '{' ( ( (a2_0= parse_org_emftext_language_textAML3_Expression ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_Expression ) ) )* ) )? a5= '}' ;
    public final org.emftext.language.textAML3.SetExpression parse_org_emftext_language_textAML3_SetExpression() throws RecognitionException {
        org.emftext.language.textAML3.SetExpression element =  null;

        int parse_org_emftext_language_textAML3_SetExpression_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a5=null;
        org.emftext.language.textAML3.Expression a2_0 =null;

        org.emftext.language.textAML3.Expression a4_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return element; }

            // TextAML3.g:4703:4: (a0= 'set' a1= '{' ( ( (a2_0= parse_org_emftext_language_textAML3_Expression ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_Expression ) ) )* ) )? a5= '}' )
            // TextAML3.g:4704:4: a0= 'set' a1= '{' ( ( (a2_0= parse_org_emftext_language_textAML3_Expression ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_Expression ) ) )* ) )? a5= '}'
            {
            a0=(Token)match(input,40,FOLLOW_40_in_parse_org_emftext_language_textAML3_SetExpression5168); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createSetExpression();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_19_0_0_0, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[604]);
            }

            a1=(Token)match(input,50,FOLLOW_50_in_parse_org_emftext_language_textAML3_SetExpression5179); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createSetExpression();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_19_0_0_1, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getSetExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[605]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getSetExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[606]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getSetExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[607]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getSetExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[608]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getSetExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[609]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getSetExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[610]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getSetExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[611]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getSetExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[612]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getSetExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[613]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getSetExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[614]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getSetExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[615]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[616]);
            }

            // TextAML3.g:4743:2: ( ( (a2_0= parse_org_emftext_language_textAML3_Expression ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_Expression ) ) )* ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0 >= NUMBER && LA51_0 <= TEXT)||LA51_0==VARID||LA51_0==14||LA51_0==26||(LA51_0 >= 28 && LA51_0 <= 29)||(LA51_0 >= 35 && LA51_0 <= 36)||LA51_0==38||LA51_0==40) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // TextAML3.g:4744:2: ( (a2_0= parse_org_emftext_language_textAML3_Expression ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_Expression ) ) )* )
                    {
                    // TextAML3.g:4744:2: ( (a2_0= parse_org_emftext_language_textAML3_Expression ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_Expression ) ) )* )
                    // TextAML3.g:4745:3: (a2_0= parse_org_emftext_language_textAML3_Expression ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_Expression ) ) )*
                    {
                    // TextAML3.g:4745:3: (a2_0= parse_org_emftext_language_textAML3_Expression )
                    // TextAML3.g:4746:4: a2_0= parse_org_emftext_language_textAML3_Expression
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Expression_in_parse_org_emftext_language_textAML3_SetExpression5202);
                    a2_0=parse_org_emftext_language_textAML3_Expression();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (terminateParsing) {
                    					throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    				}
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createSetExpression();
                    					startIncompleteElement(element);
                    				}
                    				if (a2_0 != null) {
                    					if (a2_0 != null) {
                    						Object value = a2_0;
                    						addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.SET_EXPRESSION__VALUES, value);
                    						completedElement(value, true);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_19_0_0_2_0_0_0, a2_0, true);
                    					copyLocalizationInfos(a2_0, element);
                    				}
                    			}

                    }


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[617]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[618]);
                    		}

                    // TextAML3.g:4772:3: ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_Expression ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==18) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // TextAML3.g:4773:4: (a3= ',' (a4_0= parse_org_emftext_language_textAML3_Expression ) )
                    	    {
                    	    // TextAML3.g:4773:4: (a3= ',' (a4_0= parse_org_emftext_language_textAML3_Expression ) )
                    	    // TextAML3.g:4774:5: a3= ',' (a4_0= parse_org_emftext_language_textAML3_Expression )
                    	    {
                    	    a3=(Token)match(input,18,FOLLOW_18_in_parse_org_emftext_language_textAML3_SetExpression5236); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    					if (element == null) {
                    	    						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createSetExpression();
                    	    						startIncompleteElement(element);
                    	    					}
                    	    					collectHiddenTokens(element);
                    	    					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_19_0_0_2_0_0_1_0_0_0, null, true);
                    	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    	    				}

                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getSetExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[619]);
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getSetExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[620]);
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getSetExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[621]);
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getSetExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[622]);
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getSetExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[623]);
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getSetExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[624]);
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getSetExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[625]);
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getSetExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[626]);
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getSetExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[627]);
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getSetExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[628]);
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getSetExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[629]);
                    	    				}

                    	    // TextAML3.g:4798:5: (a4_0= parse_org_emftext_language_textAML3_Expression )
                    	    // TextAML3.g:4799:6: a4_0= parse_org_emftext_language_textAML3_Expression
                    	    {
                    	    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Expression_in_parse_org_emftext_language_textAML3_SetExpression5266);
                    	    a4_0=parse_org_emftext_language_textAML3_Expression();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (terminateParsing) {
                    	    							throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    	    						}
                    	    						if (element == null) {
                    	    							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createSetExpression();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						if (a4_0 != null) {
                    	    							if (a4_0 != null) {
                    	    								Object value = a4_0;
                    	    								addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.SET_EXPRESSION__VALUES, value);
                    	    								completedElement(value, true);
                    	    							}
                    	    							collectHiddenTokens(element);
                    	    							retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_19_0_0_2_0_0_1_0_0_1, a4_0, true);
                    	    							copyLocalizationInfos(a4_0, element);
                    	    						}
                    	    					}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[630]);
                    	    					addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[631]);
                    	    				}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[632]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[633]);
                    		}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[634]);
            }

            a5=(Token)match(input,52,FOLLOW_52_in_parse_org_emftext_language_textAML3_SetExpression5325); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createSetExpression();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_19_0_0_3, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[635]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[636]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[637]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[638]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[639]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[640]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[641]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[642]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[643]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[644]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[645]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[646]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[647]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[648]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[649]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[650]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 27, parse_org_emftext_language_textAML3_SetExpression_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_SetExpression"



    // $ANTLR start "parse_org_emftext_language_textAML3_VariableReference"
    // TextAML3.g:4871:1: parse_org_emftext_language_textAML3_VariableReference returns [org.emftext.language.textAML3.VariableReference element = null] : (a0= VARID ) ;
    public final org.emftext.language.textAML3.VariableReference parse_org_emftext_language_textAML3_VariableReference() throws RecognitionException {
        org.emftext.language.textAML3.VariableReference element =  null;

        int parse_org_emftext_language_textAML3_VariableReference_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return element; }

            // TextAML3.g:4874:2: ( (a0= VARID ) )
            // TextAML3.g:4875:2: (a0= VARID )
            {
            // TextAML3.g:4875:2: (a0= VARID )
            // TextAML3.g:4876:2: a0= VARID
            {
            a0=(Token)match(input,VARID,FOLLOW_VARID_in_parse_org_emftext_language_textAML3_VariableReference5354); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (terminateParsing) {
            			throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            		}
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createVariableReference();
            			startIncompleteElement(element);
            		}
            		if (a0 != null) {
            			org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("VARID");
            			tokenResolver.setOptions(getOptions());
            			org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result = getFreshTokenResolveResult();
            			tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.VARIABLE_REFERENCE__TARGET), result);
            			Object resolvedObject = result.getResolvedToken();
            			if (resolvedObject == null) {
            				addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            			}
            			String resolved = (String) resolvedObject;
            			org.emftext.language.textAML3.Variable proxy = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createVariable();
            			collectHiddenTokens(element);
            			registerContextDependentProxy(new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContextDependentURIFragmentFactory<org.emftext.language.textAML3.VariableReference, org.emftext.language.textAML3.Variable>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getVariableReferenceTargetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.VARIABLE_REFERENCE__TARGET), resolved, proxy);
            			if (proxy != null) {
            				Object value = proxy;
            				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.VARIABLE_REFERENCE__TARGET), value);
            				completedElement(value, false);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_22_0_0_0, proxy, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
            		}
            	}

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[651]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[652]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[653]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[654]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[655]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[656]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[657]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[658]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[659]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[660]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[661]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[662]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[663]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[664]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[665]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[666]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 28, parse_org_emftext_language_textAML3_VariableReference_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_VariableReference"



    // $ANTLR start "parse_org_emftext_language_textAML3_FunctionReference"
    // TextAML3.g:4932:1: parse_org_emftext_language_textAML3_FunctionReference returns [org.emftext.language.textAML3.FunctionReference element = null] : (a0= TEXT ) ;
    public final org.emftext.language.textAML3.FunctionReference parse_org_emftext_language_textAML3_FunctionReference() throws RecognitionException {
        org.emftext.language.textAML3.FunctionReference element =  null;

        int parse_org_emftext_language_textAML3_FunctionReference_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return element; }

            // TextAML3.g:4935:2: ( (a0= TEXT ) )
            // TextAML3.g:4936:2: (a0= TEXT )
            {
            // TextAML3.g:4936:2: (a0= TEXT )
            // TextAML3.g:4937:2: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_FunctionReference5387); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (terminateParsing) {
            			throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            		}
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createFunctionReference();
            			startIncompleteElement(element);
            		}
            		if (a0 != null) {
            			org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            			tokenResolver.setOptions(getOptions());
            			org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result = getFreshTokenResolveResult();
            			tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.FUNCTION_REFERENCE__FUNCTION), result);
            			Object resolvedObject = result.getResolvedToken();
            			if (resolvedObject == null) {
            				addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            			}
            			java.lang.String resolved = (java.lang.String) resolvedObject;
            			if (resolved != null) {
            				Object value = resolved;
            				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.FUNCTION_REFERENCE__FUNCTION), value);
            				completedElement(value, false);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_23_0_0_0, resolved, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            		}
            	}

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[667]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[668]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[669]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[670]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[671]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[672]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[673]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[674]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[675]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[676]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[677]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[678]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[679]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[680]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[681]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[682]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, parse_org_emftext_language_textAML3_FunctionReference_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_FunctionReference"



    // $ANTLR start "parse_org_emftext_language_textAML3_TypeReference"
    // TextAML3.g:4989:1: parse_org_emftext_language_textAML3_TypeReference returns [org.emftext.language.textAML3.TypeReference element = null] : (a0= TEXT ) a1= '{{' ( ( (a2_0= parse_org_emftext_language_textAML3_TypeReferenceElement ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeReferenceElement ) ) )* ) )? a5= '}}' ;
    public final org.emftext.language.textAML3.TypeReference parse_org_emftext_language_textAML3_TypeReference() throws RecognitionException {
        org.emftext.language.textAML3.TypeReference element =  null;

        int parse_org_emftext_language_textAML3_TypeReference_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a5=null;
        org.emftext.language.textAML3.TypeReferenceElement a2_0 =null;

        org.emftext.language.textAML3.TypeReferenceElement a4_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return element; }

            // TextAML3.g:4992:2: ( (a0= TEXT ) a1= '{{' ( ( (a2_0= parse_org_emftext_language_textAML3_TypeReferenceElement ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeReferenceElement ) ) )* ) )? a5= '}}' )
            // TextAML3.g:4993:2: (a0= TEXT ) a1= '{{' ( ( (a2_0= parse_org_emftext_language_textAML3_TypeReferenceElement ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeReferenceElement ) ) )* ) )? a5= '}}'
            {
            // TextAML3.g:4993:2: (a0= TEXT )
            // TextAML3.g:4994:2: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_TypeReference5420); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (terminateParsing) {
            			throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            		}
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeReference();
            			startIncompleteElement(element);
            		}
            		if (a0 != null) {
            			org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            			tokenResolver.setOptions(getOptions());
            			org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result = getFreshTokenResolveResult();
            			tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_REFERENCE__TARGET), result);
            			Object resolvedObject = result.getResolvedToken();
            			if (resolvedObject == null) {
            				addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            			}
            			String resolved = (String) resolvedObject;
            			org.emftext.language.textAML3.TypeDec proxy = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeDec();
            			collectHiddenTokens(element);
            			registerContextDependentProxy(new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContextDependentURIFragmentFactory<org.emftext.language.textAML3.TypeReference, org.emftext.language.textAML3.TypeDec>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeReferenceTargetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_REFERENCE__TARGET), resolved, proxy);
            			if (proxy != null) {
            				Object value = proxy;
            				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.TYPE_REFERENCE__TARGET), value);
            				completedElement(value, false);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_24_0_0_0, proxy, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
            		}
            	}

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[683]);
            }

            a1=(Token)match(input,51,FOLLOW_51_in_parse_org_emftext_language_textAML3_TypeReference5435); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeReference();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_24_0_0_1, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeReference(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[684]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[685]);
            }

            // TextAML3.g:5048:2: ( ( (a2_0= parse_org_emftext_language_textAML3_TypeReferenceElement ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeReferenceElement ) ) )* ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==TEXT) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // TextAML3.g:5049:2: ( (a2_0= parse_org_emftext_language_textAML3_TypeReferenceElement ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeReferenceElement ) ) )* )
                    {
                    // TextAML3.g:5049:2: ( (a2_0= parse_org_emftext_language_textAML3_TypeReferenceElement ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeReferenceElement ) ) )* )
                    // TextAML3.g:5050:3: (a2_0= parse_org_emftext_language_textAML3_TypeReferenceElement ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeReferenceElement ) ) )*
                    {
                    // TextAML3.g:5050:3: (a2_0= parse_org_emftext_language_textAML3_TypeReferenceElement )
                    // TextAML3.g:5051:4: a2_0= parse_org_emftext_language_textAML3_TypeReferenceElement
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_TypeReferenceElement_in_parse_org_emftext_language_textAML3_TypeReference5458);
                    a2_0=parse_org_emftext_language_textAML3_TypeReferenceElement();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (terminateParsing) {
                    					throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    				}
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeReference();
                    					startIncompleteElement(element);
                    				}
                    				if (a2_0 != null) {
                    					if (a2_0 != null) {
                    						Object value = a2_0;
                    						addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.TYPE_REFERENCE__ARGUMENTS, value);
                    						completedElement(value, true);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_24_0_0_2_0_0_0, a2_0, true);
                    					copyLocalizationInfos(a2_0, element);
                    				}
                    			}

                    }


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[686]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[687]);
                    		}

                    // TextAML3.g:5077:3: ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeReferenceElement ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==18) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // TextAML3.g:5078:4: (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeReferenceElement ) )
                    	    {
                    	    // TextAML3.g:5078:4: (a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeReferenceElement ) )
                    	    // TextAML3.g:5079:5: a3= ',' (a4_0= parse_org_emftext_language_textAML3_TypeReferenceElement )
                    	    {
                    	    a3=(Token)match(input,18,FOLLOW_18_in_parse_org_emftext_language_textAML3_TypeReference5492); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    					if (element == null) {
                    	    						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeReference();
                    	    						startIncompleteElement(element);
                    	    					}
                    	    					collectHiddenTokens(element);
                    	    					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_24_0_0_2_0_0_1_0_0_0, null, true);
                    	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    	    				}

                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeReference(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[688]);
                    	    				}

                    	    // TextAML3.g:5093:5: (a4_0= parse_org_emftext_language_textAML3_TypeReferenceElement )
                    	    // TextAML3.g:5094:6: a4_0= parse_org_emftext_language_textAML3_TypeReferenceElement
                    	    {
                    	    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_TypeReferenceElement_in_parse_org_emftext_language_textAML3_TypeReference5522);
                    	    a4_0=parse_org_emftext_language_textAML3_TypeReferenceElement();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (terminateParsing) {
                    	    							throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    	    						}
                    	    						if (element == null) {
                    	    							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeReference();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						if (a4_0 != null) {
                    	    							if (a4_0 != null) {
                    	    								Object value = a4_0;
                    	    								addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.TYPE_REFERENCE__ARGUMENTS, value);
                    	    								completedElement(value, true);
                    	    							}
                    	    							collectHiddenTokens(element);
                    	    							retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_24_0_0_2_0_0_1_0_0_1, a4_0, true);
                    	    							copyLocalizationInfos(a4_0, element);
                    	    						}
                    	    					}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[689]);
                    	    					addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[690]);
                    	    				}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[691]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[692]);
                    		}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[693]);
            }

            a5=(Token)match(input,53,FOLLOW_53_in_parse_org_emftext_language_textAML3_TypeReference5581); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeReference();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_24_0_0_3, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[694]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[695]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[696]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[697]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[698]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[699]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[700]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[701]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[702]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[703]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[704]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[705]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[706]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[707]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[708]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[709]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 30, parse_org_emftext_language_textAML3_TypeReference_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_TypeReference"



    // $ANTLR start "parse_org_emftext_language_textAML3_ModelElementExpression"
    // TextAML3.g:5166:1: parse_org_emftext_language_textAML3_ModelElementExpression returns [org.emftext.language.textAML3.ModelElementExpression element = null] : (a0= REFERENCE ) ( (a1= '(' (a2_0= parse_org_emftext_language_textAML3_AttributeExpression ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_AttributeExpression ) ) )* a5= ')' ) )? ;
    public final org.emftext.language.textAML3.ModelElementExpression parse_org_emftext_language_textAML3_ModelElementExpression() throws RecognitionException {
        org.emftext.language.textAML3.ModelElementExpression element =  null;

        int parse_org_emftext_language_textAML3_ModelElementExpression_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a5=null;
        org.emftext.language.textAML3.AttributeExpression a2_0 =null;

        org.emftext.language.textAML3.AttributeExpression a4_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return element; }

            // TextAML3.g:5169:2: ( (a0= REFERENCE ) ( (a1= '(' (a2_0= parse_org_emftext_language_textAML3_AttributeExpression ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_AttributeExpression ) ) )* a5= ')' ) )? )
            // TextAML3.g:5170:2: (a0= REFERENCE ) ( (a1= '(' (a2_0= parse_org_emftext_language_textAML3_AttributeExpression ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_AttributeExpression ) ) )* a5= ')' ) )?
            {
            // TextAML3.g:5170:2: (a0= REFERENCE )
            // TextAML3.g:5171:2: a0= REFERENCE
            {
            a0=(Token)match(input,REFERENCE,FOLLOW_REFERENCE_in_parse_org_emftext_language_textAML3_ModelElementExpression5610); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (terminateParsing) {
            			throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            		}
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElementExpression();
            			startIncompleteElement(element);
            		}
            		if (a0 != null) {
            			org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REFERENCE");
            			tokenResolver.setOptions(getOptions());
            			org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result = getFreshTokenResolveResult();
            			tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.MODEL_ELEMENT_EXPRESSION__BASECLASS), result);
            			Object resolvedObject = result.getResolvedToken();
            			if (resolvedObject == null) {
            				addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            			}
            			String resolved = (String) resolvedObject;
            			org.eclipse.emf.ecore.ENamedElement proxy = createDynamicProxy(org.eclipse.emf.ecore.ENamedElement.class);
            			collectHiddenTokens(element);
            			registerContextDependentProxy(new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContextDependentURIFragmentFactory<org.emftext.language.textAML3.ModelElementExpression, org.eclipse.emf.ecore.ENamedElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getModelElementExpressionBaseclassReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.MODEL_ELEMENT_EXPRESSION__BASECLASS), resolved, proxy);
            			if (proxy != null) {
            				Object value = proxy;
            				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.MODEL_ELEMENT_EXPRESSION__BASECLASS), value);
            				completedElement(value, false);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_27_0_0_0, proxy, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
            		}
            	}

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[710]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[711]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[712]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[713]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[714]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[715]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[716]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[717]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[718]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[719]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[720]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[721]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[722]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[723]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[724]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[725]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[726]);
            }

            // TextAML3.g:5226:2: ( (a1= '(' (a2_0= parse_org_emftext_language_textAML3_AttributeExpression ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_AttributeExpression ) ) )* a5= ')' ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==14) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // TextAML3.g:5227:2: (a1= '(' (a2_0= parse_org_emftext_language_textAML3_AttributeExpression ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_AttributeExpression ) ) )* a5= ')' )
                    {
                    // TextAML3.g:5227:2: (a1= '(' (a2_0= parse_org_emftext_language_textAML3_AttributeExpression ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_AttributeExpression ) ) )* a5= ')' )
                    // TextAML3.g:5228:3: a1= '(' (a2_0= parse_org_emftext_language_textAML3_AttributeExpression ) ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_AttributeExpression ) ) )* a5= ')'
                    {
                    a1=(Token)match(input,14,FOLLOW_14_in_parse_org_emftext_language_textAML3_ModelElementExpression5632); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElementExpression();
                    				startIncompleteElement(element);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_27_0_0_1_0_0_0, null, true);
                    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[727]);
                    		}

                    // TextAML3.g:5242:3: (a2_0= parse_org_emftext_language_textAML3_AttributeExpression )
                    // TextAML3.g:5243:4: a2_0= parse_org_emftext_language_textAML3_AttributeExpression
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_AttributeExpression_in_parse_org_emftext_language_textAML3_ModelElementExpression5654);
                    a2_0=parse_org_emftext_language_textAML3_AttributeExpression();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (terminateParsing) {
                    					throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    				}
                    				if (element == null) {
                    					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElementExpression();
                    					startIncompleteElement(element);
                    				}
                    				if (a2_0 != null) {
                    					if (a2_0 != null) {
                    						Object value = a2_0;
                    						addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.MODEL_ELEMENT_EXPRESSION__ATTRIBUTES, value);
                    						completedElement(value, true);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_27_0_0_1_0_0_1, a2_0, true);
                    					copyLocalizationInfos(a2_0, element);
                    				}
                    			}

                    }


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[728]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[729]);
                    		}

                    // TextAML3.g:5269:3: ( (a3= ',' (a4_0= parse_org_emftext_language_textAML3_AttributeExpression ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==18) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // TextAML3.g:5270:4: (a3= ',' (a4_0= parse_org_emftext_language_textAML3_AttributeExpression ) )
                    	    {
                    	    // TextAML3.g:5270:4: (a3= ',' (a4_0= parse_org_emftext_language_textAML3_AttributeExpression ) )
                    	    // TextAML3.g:5271:5: a3= ',' (a4_0= parse_org_emftext_language_textAML3_AttributeExpression )
                    	    {
                    	    a3=(Token)match(input,18,FOLLOW_18_in_parse_org_emftext_language_textAML3_ModelElementExpression5688); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    					if (element == null) {
                    	    						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElementExpression();
                    	    						startIncompleteElement(element);
                    	    					}
                    	    					collectHiddenTokens(element);
                    	    					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_27_0_0_1_0_0_2_0_0_0, null, true);
                    	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    	    				}

                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[730]);
                    	    				}

                    	    // TextAML3.g:5285:5: (a4_0= parse_org_emftext_language_textAML3_AttributeExpression )
                    	    // TextAML3.g:5286:6: a4_0= parse_org_emftext_language_textAML3_AttributeExpression
                    	    {
                    	    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_AttributeExpression_in_parse_org_emftext_language_textAML3_ModelElementExpression5718);
                    	    a4_0=parse_org_emftext_language_textAML3_AttributeExpression();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (terminateParsing) {
                    	    							throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
                    	    						}
                    	    						if (element == null) {
                    	    							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElementExpression();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						if (a4_0 != null) {
                    	    							if (a4_0 != null) {
                    	    								Object value = a4_0;
                    	    								addObjectToList(element, org.emftext.language.textAML3.TextAML3Package.MODEL_ELEMENT_EXPRESSION__ATTRIBUTES, value);
                    	    								completedElement(value, true);
                    	    							}
                    	    							collectHiddenTokens(element);
                    	    							retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_27_0_0_1_0_0_2_0_0_1, a4_0, true);
                    	    							copyLocalizationInfos(a4_0, element);
                    	    						}
                    	    					}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[731]);
                    	    					addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[732]);
                    	    				}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[733]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[734]);
                    		}

                    a5=(Token)match(input,15,FOLLOW_15_in_parse_org_emftext_language_textAML3_ModelElementExpression5769); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElementExpression();
                    				startIncompleteElement(element);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_27_0_0_1_0_0_3, null, true);
                    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[735]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[736]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[737]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[738]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[739]);
                    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[740]);
                    			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[741]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[742]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[743]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[744]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[745]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[746]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[747]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[748]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[749]);
                    			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[750]);
                    		}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[751]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[752]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[753]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[754]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[755]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[756]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[757]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[758]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[759]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[760]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[761]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[762]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[763]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[764]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[765]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[766]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 31, parse_org_emftext_language_textAML3_ModelElementExpression_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_ModelElementExpression"



    // $ANTLR start "parse_org_emftext_language_textAML3_StringLiteral"
    // TextAML3.g:5373:1: parse_org_emftext_language_textAML3_StringLiteral returns [org.emftext.language.textAML3.StringLiteral element = null] : (a0= QUOTED_34_34 ) ;
    public final org.emftext.language.textAML3.StringLiteral parse_org_emftext_language_textAML3_StringLiteral() throws RecognitionException {
        org.emftext.language.textAML3.StringLiteral element =  null;

        int parse_org_emftext_language_textAML3_StringLiteral_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return element; }

            // TextAML3.g:5376:2: ( (a0= QUOTED_34_34 ) )
            // TextAML3.g:5377:2: (a0= QUOTED_34_34 )
            {
            // TextAML3.g:5377:2: (a0= QUOTED_34_34 )
            // TextAML3.g:5378:2: a0= QUOTED_34_34
            {
            a0=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_emftext_language_textAML3_StringLiteral5812); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (terminateParsing) {
            			throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            		}
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createStringLiteral();
            			startIncompleteElement(element);
            		}
            		if (a0 != null) {
            			org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            			tokenResolver.setOptions(getOptions());
            			org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result = getFreshTokenResolveResult();
            			tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.STRING_LITERAL__VALUE), result);
            			Object resolvedObject = result.getResolvedToken();
            			if (resolvedObject == null) {
            				addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            			}
            			java.lang.String resolved = (java.lang.String) resolvedObject;
            			if (resolved != null) {
            				Object value = resolved;
            				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.STRING_LITERAL__VALUE), value);
            				completedElement(value, false);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_28_0_0_0, resolved, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            		}
            	}

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[767]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[768]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[769]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[770]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[771]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[772]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[773]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[774]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[775]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[776]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[777]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[778]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[779]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[780]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[781]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[782]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 32, parse_org_emftext_language_textAML3_StringLiteral_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_StringLiteral"



    // $ANTLR start "parse_org_emftext_language_textAML3_NullLiteral"
    // TextAML3.g:5430:1: parse_org_emftext_language_textAML3_NullLiteral returns [org.emftext.language.textAML3.NullLiteral element = null] : a0= 'OclUndefined' ;
    public final org.emftext.language.textAML3.NullLiteral parse_org_emftext_language_textAML3_NullLiteral() throws RecognitionException {
        org.emftext.language.textAML3.NullLiteral element =  null;

        int parse_org_emftext_language_textAML3_NullLiteral_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return element; }

            // TextAML3.g:5433:4: (a0= 'OclUndefined' )
            // TextAML3.g:5434:4: a0= 'OclUndefined'
            {
            a0=(Token)match(input,26,FOLLOW_26_in_parse_org_emftext_language_textAML3_NullLiteral5842); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createNullLiteral();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_29_0_0_0, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[783]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[784]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[785]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[786]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[787]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[788]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[789]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[790]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[791]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[792]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[793]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[794]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[795]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[796]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[797]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[798]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 33, parse_org_emftext_language_textAML3_NullLiteral_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_NullLiteral"



    // $ANTLR start "parse_org_emftext_language_textAML3_NestedExpression"
    // TextAML3.g:5465:1: parse_org_emftext_language_textAML3_NestedExpression returns [org.emftext.language.textAML3.NestedExpression element = null] : a0= '(' (a1_0= parse_org_emftext_language_textAML3_Expression ) a2= ')' ;
    public final org.emftext.language.textAML3.NestedExpression parse_org_emftext_language_textAML3_NestedExpression() throws RecognitionException {
        org.emftext.language.textAML3.NestedExpression element =  null;

        int parse_org_emftext_language_textAML3_NestedExpression_StartIndex = input.index();

        Token a0=null;
        Token a2=null;
        org.emftext.language.textAML3.Expression a1_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return element; }

            // TextAML3.g:5468:4: (a0= '(' (a1_0= parse_org_emftext_language_textAML3_Expression ) a2= ')' )
            // TextAML3.g:5469:4: a0= '(' (a1_0= parse_org_emftext_language_textAML3_Expression ) a2= ')'
            {
            a0=(Token)match(input,14,FOLLOW_14_in_parse_org_emftext_language_textAML3_NestedExpression5868); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createNestedExpression();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_30_0_0_0, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getNestedExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[799]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getNestedExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[800]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getNestedExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[801]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getNestedExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[802]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getNestedExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[803]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getNestedExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[804]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getNestedExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[805]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getNestedExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[806]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getNestedExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[807]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getNestedExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[808]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getNestedExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[809]);
            }

            // TextAML3.g:5493:2: (a1_0= parse_org_emftext_language_textAML3_Expression )
            // TextAML3.g:5494:2: a1_0= parse_org_emftext_language_textAML3_Expression
            {
            pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Expression_in_parse_org_emftext_language_textAML3_NestedExpression5882);
            a1_0=parse_org_emftext_language_textAML3_Expression();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (terminateParsing) {
            			throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            		}
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createNestedExpression();
            			startIncompleteElement(element);
            		}
            		if (a1_0 != null) {
            			if (a1_0 != null) {
            				Object value = a1_0;
            				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.NESTED_EXPRESSION__EXPRESSION), value);
            				completedElement(value, true);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_30_0_0_1, a1_0, true);
            			copyLocalizationInfos(a1_0, element);
            		}
            	}

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[810]);
            }

            a2=(Token)match(input,15,FOLLOW_15_in_parse_org_emftext_language_textAML3_NestedExpression5895); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createNestedExpression();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_30_0_0_2, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[811]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[812]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[813]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[814]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[815]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[816]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[817]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[818]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[819]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[820]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[821]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[822]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[823]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[824]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[825]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[826]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 34, parse_org_emftext_language_textAML3_NestedExpression_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_NestedExpression"



    // $ANTLR start "parseop_Expression_level_9"
    // TextAML3.g:5550:1: parseop_Expression_level_9 returns [org.emftext.language.textAML3.Expression element = null] : c0= parse_org_emftext_language_textAML3_AttributeReference ;
    public final org.emftext.language.textAML3.Expression parseop_Expression_level_9() throws RecognitionException {
        org.emftext.language.textAML3.Expression element =  null;

        int parseop_Expression_level_9_StartIndex = input.index();

        org.emftext.language.textAML3.AttributeReference c0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return element; }

            // TextAML3.g:5553:4: (c0= parse_org_emftext_language_textAML3_AttributeReference )
            // TextAML3.g:5554:4: c0= parse_org_emftext_language_textAML3_AttributeReference
            {
            pushFollow(FOLLOW_parse_org_emftext_language_textAML3_AttributeReference_in_parseop_Expression_level_95921);
            c0=parse_org_emftext_language_textAML3_AttributeReference();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 35, parseop_Expression_level_9_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parseop_Expression_level_9"



    // $ANTLR start "parse_org_emftext_language_textAML3_AttributeReference"
    // TextAML3.g:5557:1: parse_org_emftext_language_textAML3_AttributeReference returns [org.emftext.language.textAML3.AttributeReference element = null] : (a0= TEXT ) ;
    public final org.emftext.language.textAML3.AttributeReference parse_org_emftext_language_textAML3_AttributeReference() throws RecognitionException {
        org.emftext.language.textAML3.AttributeReference element =  null;

        int parse_org_emftext_language_textAML3_AttributeReference_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return element; }

            // TextAML3.g:5560:2: ( (a0= TEXT ) )
            // TextAML3.g:5561:2: (a0= TEXT )
            {
            // TextAML3.g:5561:2: (a0= TEXT )
            // TextAML3.g:5562:2: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_AttributeReference5946); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (terminateParsing) {
            			throw new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3TerminateParsingException();
            		}
            		if (element == null) {
            			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createAttributeReference();
            			startIncompleteElement(element);
            		}
            		if (a0 != null) {
            			org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            			tokenResolver.setOptions(getOptions());
            			org.emftext.language.textAML3.resource.textAML3.ITextAML3TokenResolveResult result = getFreshTokenResolveResult();
            			tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.ATTRIBUTE_REFERENCE__TARGET), result);
            			Object resolvedObject = result.getResolvedToken();
            			if (resolvedObject == null) {
            				addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            			}
            			String resolved = (String) resolvedObject;
            			org.emftext.language.textAML3.TypeAttribute proxy = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeAttribute();
            			collectHiddenTokens(element);
            			registerContextDependentProxy(new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContextDependentURIFragmentFactory<org.emftext.language.textAML3.AttributeReference, org.emftext.language.textAML3.TypeAttribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAttributeReferenceTargetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.ATTRIBUTE_REFERENCE__TARGET), resolved, proxy);
            			if (proxy != null) {
            				Object value = proxy;
            				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.textAML3.TextAML3Package.ATTRIBUTE_REFERENCE__TARGET), value);
            				completedElement(value, false);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_26_0_0_0, proxy, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
            		}
            	}

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[827]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[828]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[829]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[830]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[831]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[832]);
            	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[833]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[834]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[835]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[836]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[837]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[838]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[839]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[840]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[841]);
            	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[842]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 36, parse_org_emftext_language_textAML3_AttributeReference_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_AttributeReference"



    // $ANTLR start "parse_org_emftext_language_textAML3_Relation"
    // TextAML3.g:5618:1: parse_org_emftext_language_textAML3_Relation returns [org.emftext.language.textAML3.Relation element = null] : (c0= parse_org_emftext_language_textAML3_TypeRelation |c1= parse_org_emftext_language_textAML3_ModelElementRelation );
    public final org.emftext.language.textAML3.Relation parse_org_emftext_language_textAML3_Relation() throws RecognitionException {
        org.emftext.language.textAML3.Relation element =  null;

        int parse_org_emftext_language_textAML3_Relation_StartIndex = input.index();

        org.emftext.language.textAML3.TypeRelation c0 =null;

        org.emftext.language.textAML3.ModelElementRelation c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return element; }

            // TextAML3.g:5619:0: (c0= parse_org_emftext_language_textAML3_TypeRelation |c1= parse_org_emftext_language_textAML3_ModelElementRelation )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==TEXT) ) {
                alt56=1;
            }
            else if ( (LA56_0==REFERENCE) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }
            switch (alt56) {
                case 1 :
                    // TextAML3.g:5620:0: c0= parse_org_emftext_language_textAML3_TypeRelation
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_TypeRelation_in_parse_org_emftext_language_textAML3_Relation5972);
                    c0=parse_org_emftext_language_textAML3_TypeRelation();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // TextAML3.g:5621:2: c1= parse_org_emftext_language_textAML3_ModelElementRelation
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_textAML3_ModelElementRelation_in_parse_org_emftext_language_textAML3_Relation5980);
                    c1=parse_org_emftext_language_textAML3_ModelElementRelation();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 37, parse_org_emftext_language_textAML3_Relation_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_Relation"



    // $ANTLR start "parse_org_emftext_language_textAML3_Condition"
    // TextAML3.g:5625:1: parse_org_emftext_language_textAML3_Condition returns [org.emftext.language.textAML3.Condition element = null] : c= parseop_Condition_level_5 ;
    public final org.emftext.language.textAML3.Condition parse_org_emftext_language_textAML3_Condition() throws RecognitionException {
        org.emftext.language.textAML3.Condition element =  null;

        int parse_org_emftext_language_textAML3_Condition_StartIndex = input.index();

        org.emftext.language.textAML3.Condition c =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return element; }

            // TextAML3.g:5626:3: (c= parseop_Condition_level_5 )
            // TextAML3.g:5627:3: c= parseop_Condition_level_5
            {
            pushFollow(FOLLOW_parseop_Condition_level_5_in_parse_org_emftext_language_textAML3_Condition5999);
            c=parseop_Condition_level_5();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c; /* this rule is an expression root */ }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 38, parse_org_emftext_language_textAML3_Condition_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_Condition"



    // $ANTLR start "parse_org_emftext_language_textAML3_Expression"
    // TextAML3.g:5631:1: parse_org_emftext_language_textAML3_Expression returns [org.emftext.language.textAML3.Expression element = null] : c= parseop_Expression_level_1 ;
    public final org.emftext.language.textAML3.Expression parse_org_emftext_language_textAML3_Expression() throws RecognitionException {
        org.emftext.language.textAML3.Expression element =  null;

        int parse_org_emftext_language_textAML3_Expression_StartIndex = input.index();

        org.emftext.language.textAML3.Expression c =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return element; }

            // TextAML3.g:5632:3: (c= parseop_Expression_level_1 )
            // TextAML3.g:5633:3: c= parseop_Expression_level_1
            {
            pushFollow(FOLLOW_parseop_Expression_level_1_in_parse_org_emftext_language_textAML3_Expression6018);
            c=parseop_Expression_level_1();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c; /* this rule is an expression root */ }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 39, parse_org_emftext_language_textAML3_Expression_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_textAML3_Expression"

    // $ANTLR start synpred41_TextAML3
    public final void synpred41_TextAML3_fragment() throws RecognitionException {
        Token a0=null;

        // TextAML3.g:3612:2: ( (a0= VARID ) )
        // TextAML3.g:3612:2: (a0= VARID )
        {
        // TextAML3.g:3612:2: (a0= VARID )
        // TextAML3.g:3613:3: a0= VARID
        {
        a0=(Token)match(input,VARID,FOLLOW_VARID_in_synpred41_TextAML34003); if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred41_TextAML3

    // $ANTLR start synpred48_TextAML3
    public final void synpred48_TextAML3_fragment() throws RecognitionException {
        org.emftext.language.textAML3.Condition a5_0 =null;


        // TextAML3.g:4200:3: ( (a5_0= parse_org_emftext_language_textAML3_Condition ) )
        // TextAML3.g:4200:3: (a5_0= parse_org_emftext_language_textAML3_Condition )
        {
        // TextAML3.g:4200:3: (a5_0= parse_org_emftext_language_textAML3_Condition )
        // TextAML3.g:4201:4: a5_0= parse_org_emftext_language_textAML3_Condition
        {
        pushFollow(FOLLOW_parse_org_emftext_language_textAML3_Condition_in_synpred48_TextAML34566);
        a5_0=parse_org_emftext_language_textAML3_Condition();

        state._fsp--;
        if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred48_TextAML3

    // Delegated rules

    public final boolean synpred48_TextAML3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_TextAML3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_TextAML3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_TextAML3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_TypeSystemDec_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_parse_org_emftext_language_textAML3_TypeSystemDec115 = new BitSet(new long[]{0x0000040000000200L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_PackageElement_in_parse_org_emftext_language_textAML3_TypeSystemDec138 = new BitSet(new long[]{0x0000040000000200L});
    public static final BitSet FOLLOW_42_in_parse_org_emftext_language_textAML3_TypeSystemDec164 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_REFERENCE_in_parse_org_emftext_language_textAML3_TypeSystemDec182 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_parse_org_emftext_language_textAML3_TypeSystemDec203 = new BitSet(new long[]{0x0001000000000100L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_TypeDec_in_parse_org_emftext_language_textAML3_TypeSystemDec226 = new BitSet(new long[]{0x0001000000000100L});
    public static final BitSet FOLLOW_48_in_parse_org_emftext_language_textAML3_TypeSystemDec252 = new BitSet(new long[]{0x0000008000000180L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Relation_in_parse_org_emftext_language_textAML3_TypeSystemDec275 = new BitSet(new long[]{0x0000008000000180L});
    public static final BitSet FOLLOW_39_in_parse_org_emftext_language_textAML3_TypeSystemDec301 = new BitSet(new long[]{0x0000080088000000L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_ErrorRule_in_parse_org_emftext_language_textAML3_TypeSystemDec330 = new BitSet(new long[]{0x0000080088000000L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_TypeRule_in_parse_org_emftext_language_textAML3_TypeSystemDec372 = new BitSet(new long[]{0x0000080088000000L});
    public static final BitSet FOLLOW_43_in_parse_org_emftext_language_textAML3_TypeSystemDec413 = new BitSet(new long[]{0x0000100000000180L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Relation_in_parse_org_emftext_language_textAML3_TypeSystemDec436 = new BitSet(new long[]{0x0000100000000180L});
    public static final BitSet FOLLOW_44_in_parse_org_emftext_language_textAML3_TypeSystemDec462 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_TypeSystemDec485 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_URL_in_parse_org_emftext_language_textAML3_PackageElement534 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_org_emftext_language_textAML3_PackageElement555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_TypeDec588 = new BitSet(new long[]{0x0000000003C04000L});
    public static final BitSet FOLLOW_14_in_parse_org_emftext_language_textAML3_TypeDec618 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_TypeAttribute_in_parse_org_emftext_language_textAML3_TypeDec644 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_parse_org_emftext_language_textAML3_TypeDec685 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_TypeAttribute_in_parse_org_emftext_language_textAML3_TypeDec719 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_parse_org_emftext_language_textAML3_TypeDec780 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_ModelElement_in_parse_org_emftext_language_textAML3_TypeDec828 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_22_in_parse_org_emftext_language_textAML3_TypeDec869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_parse_org_emftext_language_textAML3_ModelElement907 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_25_in_parse_org_emftext_language_textAML3_ModelElement922 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_24_in_parse_org_emftext_language_textAML3_ModelElement937 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_REFERENCE_in_parse_org_emftext_language_textAML3_ModelElement962 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_parse_org_emftext_language_textAML3_ModelElement992 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_ModelElement1018 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_parse_org_emftext_language_textAML3_ModelElement1064 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_ModelElement1098 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_parse_org_emftext_language_textAML3_ModelElement1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_TypeRelationReference_in_parse_org_emftext_language_textAML3_TypeRelation1218 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_23_in_parse_org_emftext_language_textAML3_TypeRelation1245 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_24_in_parse_org_emftext_language_textAML3_TypeRelation1260 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_25_in_parse_org_emftext_language_textAML3_TypeRelation1275 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_TypeRelationReference_in_parse_org_emftext_language_textAML3_TypeRelation1300 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_parse_org_emftext_language_textAML3_TypeRelation1327 = new BitSet(new long[]{0x00000158740045E0L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Condition_in_parse_org_emftext_language_textAML3_TypeRelation1353 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_parse_org_emftext_language_textAML3_TypeRelation1394 = new BitSet(new long[]{0x00000158740045E0L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Condition_in_parse_org_emftext_language_textAML3_TypeRelation1428 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_TypeRelationReference1521 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_parse_org_emftext_language_textAML3_TypeRelationReference1551 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_TypeRelationReferenceElement_in_parse_org_emftext_language_textAML3_TypeRelationReference1577 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_parse_org_emftext_language_textAML3_TypeRelationReference1618 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_TypeRelationReferenceElement_in_parse_org_emftext_language_textAML3_TypeRelationReference1652 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_parse_org_emftext_language_textAML3_TypeRelationReference1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_TypeRelationReferenceElement1765 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_emftext_language_textAML3_TypeRelationReferenceElement1786 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Variable_in_parse_org_emftext_language_textAML3_TypeRelationReferenceElement1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_RuleElementExpression_in_parse_org_emftext_language_textAML3_ModelElementRelation1841 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_23_in_parse_org_emftext_language_textAML3_ModelElementRelation1868 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_24_in_parse_org_emftext_language_textAML3_ModelElementRelation1883 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_25_in_parse_org_emftext_language_textAML3_ModelElementRelation1898 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_RuleElementExpression_in_parse_org_emftext_language_textAML3_ModelElementRelation1923 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_parse_org_emftext_language_textAML3_ModelElementRelation1950 = new BitSet(new long[]{0x00000158740045E0L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Condition_in_parse_org_emftext_language_textAML3_ModelElementRelation1976 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_parse_org_emftext_language_textAML3_ModelElementRelation2017 = new BitSet(new long[]{0x00000158740045E0L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Condition_in_parse_org_emftext_language_textAML3_ModelElementRelation2051 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Variable_in_parse_org_emftext_language_textAML3_Generator2149 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_14_in_parse_org_emftext_language_textAML3_Generator2178 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Variable_in_parse_org_emftext_language_textAML3_Generator2200 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_org_emftext_language_textAML3_Generator2234 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Variable_in_parse_org_emftext_language_textAML3_Generator2264 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_parse_org_emftext_language_textAML3_Generator2315 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_parse_org_emftext_language_textAML3_Generator2348 = new BitSet(new long[]{0x00000158340045E0L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Expression_in_parse_org_emftext_language_textAML3_Generator2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_parse_org_emftext_language_textAML3_TypeRule2430 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_RuleElementExpression_in_parse_org_emftext_language_textAML3_TypeRule2448 = new BitSet(new long[]{0x0002200400000000L});
    public static final BitSet FOLLOW_34_in_parse_org_emftext_language_textAML3_TypeRule2475 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_ContainmentVariable_in_parse_org_emftext_language_textAML3_TypeRule2501 = new BitSet(new long[]{0x0002200000040000L});
    public static final BitSet FOLLOW_18_in_parse_org_emftext_language_textAML3_TypeRule2542 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_ContainmentVariable_in_parse_org_emftext_language_textAML3_TypeRule2576 = new BitSet(new long[]{0x0002200000040000L});
    public static final BitSet FOLLOW_49_in_parse_org_emftext_language_textAML3_TypeRule2659 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Variable_in_parse_org_emftext_language_textAML3_TypeRule2685 = new BitSet(new long[]{0x0000200000040000L});
    public static final BitSet FOLLOW_18_in_parse_org_emftext_language_textAML3_TypeRule2726 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Variable_in_parse_org_emftext_language_textAML3_TypeRule2760 = new BitSet(new long[]{0x0000200000040000L});
    public static final BitSet FOLLOW_45_in_parse_org_emftext_language_textAML3_TypeRule2834 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_RuleElementExpression_in_parse_org_emftext_language_textAML3_TypeRule2852 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_parse_org_emftext_language_textAML3_TypeRule2879 = new BitSet(new long[]{0x00000158740045E0L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Condition_in_parse_org_emftext_language_textAML3_TypeRule2905 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_parse_org_emftext_language_textAML3_TypeRule2946 = new BitSet(new long[]{0x00000158740045E0L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Condition_in_parse_org_emftext_language_textAML3_TypeRule2980 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_27_in_parse_org_emftext_language_textAML3_ErrorRule3069 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_RuleElementExpression_in_parse_org_emftext_language_textAML3_ErrorRule3087 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_parse_org_emftext_language_textAML3_ErrorRule3105 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_emftext_language_textAML3_ErrorRule3123 = new BitSet(new long[]{0x0002820000000002L});
    public static final BitSet FOLLOW_41_in_parse_org_emftext_language_textAML3_ErrorRule3153 = new BitSet(new long[]{0x00000158340045E0L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Expression_in_parse_org_emftext_language_textAML3_ErrorRule3179 = new BitSet(new long[]{0x0002800000000002L});
    public static final BitSet FOLLOW_49_in_parse_org_emftext_language_textAML3_ErrorRule3229 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Variable_in_parse_org_emftext_language_textAML3_ErrorRule3255 = new BitSet(new long[]{0x0000800000040002L});
    public static final BitSet FOLLOW_18_in_parse_org_emftext_language_textAML3_ErrorRule3296 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Variable_in_parse_org_emftext_language_textAML3_ErrorRule3330 = new BitSet(new long[]{0x0000800000040002L});
    public static final BitSet FOLLOW_47_in_parse_org_emftext_language_textAML3_ErrorRule3413 = new BitSet(new long[]{0x00000158740045E0L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Condition_in_parse_org_emftext_language_textAML3_ErrorRule3439 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_parse_org_emftext_language_textAML3_ErrorRule3480 = new BitSet(new long[]{0x00000158740045E0L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Condition_in_parse_org_emftext_language_textAML3_ErrorRule3514 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_REFERENCE_in_parse_org_emftext_language_textAML3_RuleElementExpression3607 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_parse_org_emftext_language_textAML3_RuleElementExpression3637 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_RuleElementAttribute_in_parse_org_emftext_language_textAML3_RuleElementExpression3663 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_parse_org_emftext_language_textAML3_RuleElementExpression3704 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_RuleElementAttribute_in_parse_org_emftext_language_textAML3_RuleElementExpression3738 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_parse_org_emftext_language_textAML3_RuleElementExpression3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_RuleElementAttribute3851 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_emftext_language_textAML3_RuleElementAttribute3872 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Variable_in_parse_org_emftext_language_textAML3_RuleElementAttribute3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_AttributeExpression3927 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_emftext_language_textAML3_AttributeExpression3948 = new BitSet(new long[]{0x00000158340045E0L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Expression_in_parse_org_emftext_language_textAML3_AttributeExpression3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARID_in_parse_org_emftext_language_textAML3_Variable4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_ContainmentVariable_in_parse_org_emftext_language_textAML3_Variable4029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARID_in_parse_org_emftext_language_textAML3_ContainmentVariable4058 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_emftext_language_textAML3_ContainmentVariable4079 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_REFERENCE_in_parse_org_emftext_language_textAML3_ContainmentVariable4097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_TypeReferenceElement4137 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_emftext_language_textAML3_TypeReferenceElement4158 = new BitSet(new long[]{0x00000158340045E0L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Expression_in_parse_org_emftext_language_textAML3_TypeReferenceElement4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_TypeAttribute4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_ComparisonCondition_in_parseop_Condition_level_54249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_FoldCondition_in_parseop_Condition_level_54259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Expression_in_parse_org_emftext_language_textAML3_ComparisonCondition4286 = new BitSet(new long[]{0x0000000403801000L});
    public static final BitSet FOLLOW_23_in_parse_org_emftext_language_textAML3_ComparisonCondition4313 = new BitSet(new long[]{0x00000158340045E0L});
    public static final BitSet FOLLOW_24_in_parse_org_emftext_language_textAML3_ComparisonCondition4328 = new BitSet(new long[]{0x00000158340045E0L});
    public static final BitSet FOLLOW_25_in_parse_org_emftext_language_textAML3_ComparisonCondition4343 = new BitSet(new long[]{0x00000158340045E0L});
    public static final BitSet FOLLOW_34_in_parse_org_emftext_language_textAML3_ComparisonCondition4358 = new BitSet(new long[]{0x00000158340045E0L});
    public static final BitSet FOLLOW_12_in_parse_org_emftext_language_textAML3_ComparisonCondition4373 = new BitSet(new long[]{0x00000158340045E0L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Expression_in_parse_org_emftext_language_textAML3_ComparisonCondition4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_parse_org_emftext_language_textAML3_FoldCondition4431 = new BitSet(new long[]{0x0000000000004400L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Generator_in_parse_org_emftext_language_textAML3_FoldCondition4449 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_18_in_parse_org_emftext_language_textAML3_FoldCondition4476 = new BitSet(new long[]{0x0000000000004400L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Generator_in_parse_org_emftext_language_textAML3_FoldCondition4502 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21_in_parse_org_emftext_language_textAML3_FoldCondition4543 = new BitSet(new long[]{0x00000158740045E0L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Condition_in_parse_org_emftext_language_textAML3_FoldCondition4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_parse_org_emftext_language_textAML3_FoldCondition4595 = new BitSet(new long[]{0x00000158740045E0L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Condition_in_parse_org_emftext_language_textAML3_FoldCondition4617 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_parse_org_emftext_language_textAML3_FoldCondition4651 = new BitSet(new long[]{0x00000158740045E0L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Condition_in_parse_org_emftext_language_textAML3_FoldCondition4681 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_parse_org_emftext_language_textAML3_FoldCondition4732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseop_Expression_level_2_in_parseop_Expression_level_14771 = new BitSet(new long[]{0x00000000001B2002L});
    public static final BitSet FOLLOW_17_in_parseop_Expression_level_14802 = new BitSet(new long[]{0x00000158340045E0L});
    public static final BitSet FOLLOW_19_in_parseop_Expression_level_14819 = new BitSet(new long[]{0x00000158340045E0L});
    public static final BitSet FOLLOW_16_in_parseop_Expression_level_14836 = new BitSet(new long[]{0x00000158340045E0L});
    public static final BitSet FOLLOW_20_in_parseop_Expression_level_14853 = new BitSet(new long[]{0x00000158340045E0L});
    public static final BitSet FOLLOW_13_in_parseop_Expression_level_14870 = new BitSet(new long[]{0x00000158340045E0L});
    public static final BitSet FOLLOW_parseop_Expression_level_2_in_parseop_Expression_level_14896 = new BitSet(new long[]{0x00000000001B2002L});
    public static final BitSet FOLLOW_36_in_parseop_Expression_level_24949 = new BitSet(new long[]{0x00000100040045E0L});
    public static final BitSet FOLLOW_28_in_parseop_Expression_level_24962 = new BitSet(new long[]{0x00000100040045E0L});
    public static final BitSet FOLLOW_35_in_parseop_Expression_level_24975 = new BitSet(new long[]{0x00000100040045E0L});
    public static final BitSet FOLLOW_29_in_parseop_Expression_level_24988 = new BitSet(new long[]{0x00000100040045E0L});
    public static final BitSet FOLLOW_38_in_parseop_Expression_level_25001 = new BitSet(new long[]{0x00000100040045E0L});
    public static final BitSet FOLLOW_parseop_Expression_level_3_in_parseop_Expression_level_25017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseop_Expression_level_3_in_parseop_Expression_level_25027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Number_in_parseop_Expression_level_35049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_SetExpression_in_parseop_Expression_level_35057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_VariableReference_in_parseop_Expression_level_35065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_FunctionReference_in_parseop_Expression_level_35073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_TypeReference_in_parseop_Expression_level_35081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_ModelElementExpression_in_parseop_Expression_level_35089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_StringLiteral_in_parseop_Expression_level_35097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_NullLiteral_in_parseop_Expression_level_35105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_NestedExpression_in_parseop_Expression_level_35113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_parse_org_emftext_language_textAML3_Number5138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_parse_org_emftext_language_textAML3_SetExpression5168 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_parse_org_emftext_language_textAML3_SetExpression5179 = new BitSet(new long[]{0x00100158340045E0L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Expression_in_parse_org_emftext_language_textAML3_SetExpression5202 = new BitSet(new long[]{0x0010000000040000L});
    public static final BitSet FOLLOW_18_in_parse_org_emftext_language_textAML3_SetExpression5236 = new BitSet(new long[]{0x00000158340045E0L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Expression_in_parse_org_emftext_language_textAML3_SetExpression5266 = new BitSet(new long[]{0x0010000000040000L});
    public static final BitSet FOLLOW_52_in_parse_org_emftext_language_textAML3_SetExpression5325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARID_in_parse_org_emftext_language_textAML3_VariableReference5354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_FunctionReference5387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_TypeReference5420 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_parse_org_emftext_language_textAML3_TypeReference5435 = new BitSet(new long[]{0x0020000000000100L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_TypeReferenceElement_in_parse_org_emftext_language_textAML3_TypeReference5458 = new BitSet(new long[]{0x0020000000040000L});
    public static final BitSet FOLLOW_18_in_parse_org_emftext_language_textAML3_TypeReference5492 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_TypeReferenceElement_in_parse_org_emftext_language_textAML3_TypeReference5522 = new BitSet(new long[]{0x0020000000040000L});
    public static final BitSet FOLLOW_53_in_parse_org_emftext_language_textAML3_TypeReference5581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCE_in_parse_org_emftext_language_textAML3_ModelElementExpression5610 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_parse_org_emftext_language_textAML3_ModelElementExpression5632 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_AttributeExpression_in_parse_org_emftext_language_textAML3_ModelElementExpression5654 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_parse_org_emftext_language_textAML3_ModelElementExpression5688 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_AttributeExpression_in_parse_org_emftext_language_textAML3_ModelElementExpression5718 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_parse_org_emftext_language_textAML3_ModelElementExpression5769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_emftext_language_textAML3_StringLiteral5812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_parse_org_emftext_language_textAML3_NullLiteral5842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_parse_org_emftext_language_textAML3_NestedExpression5868 = new BitSet(new long[]{0x00000158340045E0L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Expression_in_parse_org_emftext_language_textAML3_NestedExpression5882 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_org_emftext_language_textAML3_NestedExpression5895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_AttributeReference_in_parseop_Expression_level_95921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_textAML3_AttributeReference5946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_TypeRelation_in_parse_org_emftext_language_textAML3_Relation5972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_ModelElementRelation_in_parse_org_emftext_language_textAML3_Relation5980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseop_Condition_level_5_in_parse_org_emftext_language_textAML3_Condition5999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseop_Expression_level_1_in_parse_org_emftext_language_textAML3_Expression6018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARID_in_synpred41_TextAML34003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_textAML3_Condition_in_synpred48_TextAML34566 = new BitSet(new long[]{0x0000000000000002L});

}