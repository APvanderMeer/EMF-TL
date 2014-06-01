grammar TextAML3;

options {
	superClass = TextAML3ANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package org.emftext.language.textAML3.resource.textAML3.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
	
	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
	}
}
@header{
	package org.emftext.language.textAML3.resource.textAML3.mopp;
}

@members{
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
	
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[0]);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_org_emftext_language_textAML3_TypeSystemDec{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_org_emftext_language_textAML3_TypeSystemDec returns [org.emftext.language.textAML3.TypeSystemDec element = null]
@init{
}
:
	a0 = 'imports' {
		if (element == null) {
			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeSystemDec();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_0_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[1]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[2]);
	}
	
	(
		(
			a1_0 = parse_org_emftext_language_textAML3_PackageElement			{
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
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[3]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[4]);
	}
	
	a2 = 'start' {
		if (element == null) {
			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeSystemDec();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_0_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[5]);
	}
	
	(
		a3 = REFERENCE		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[6]);
	}
	
	a4 = 'typesystem' {
		if (element == null) {
			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeSystemDec();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_0_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[7]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[8]);
	}
	
	(
		(
			a5_0 = parse_org_emftext_language_textAML3_TypeDec			{
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
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[9]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[10]);
	}
	
	a6 = 'widening' {
		if (element == null) {
			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeSystemDec();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_0_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[11]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[12]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[13]);
	}
	
	(
		(
			a7_0 = parse_org_emftext_language_textAML3_Relation			{
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
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[14]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[15]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[16]);
	}
	
	a8 = 'rules' {
		if (element == null) {
			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeSystemDec();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_0_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[17]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[18]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[19]);
	}
	
	(
		(
			(
				a9_0 = parse_org_emftext_language_textAML3_ErrorRule				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[20]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[21]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[22]);
			}
			
			
			|			(
				a10_0 = parse_org_emftext_language_textAML3_TypeRule				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[23]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[24]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[25]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[26]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[27]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[28]);
	}
	
	a11 = 'strategy' {
		if (element == null) {
			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeSystemDec();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_0_0_0_10, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[29]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[30]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[31]);
	}
	
	(
		(
			a12_0 = parse_org_emftext_language_textAML3_Relation			{
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
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[32]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[33]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[34]);
	}
	
	a13 = 'strategytarget' {
		if (element == null) {
			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeSystemDec();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_0_0_0_12, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[35]);
	}
	
	(
		(
			a14 = TEXT			
			{
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
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[36]);
	}
	
;

parse_org_emftext_language_textAML3_PackageElement returns [org.emftext.language.textAML3.PackageElement element = null]
@init{
}
:
	(
		a0 = URL		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[37]);
	}
	
	a1 = ';' {
		if (element == null) {
			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createPackageElement();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_1_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[38]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[39]);
	}
	
;

parse_org_emftext_language_textAML3_TypeDec returns [org.emftext.language.textAML3.TypeDec element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[40]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[41]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[42]);
	}
	
	(
		(
			a1 = '(' {
				if (element == null) {
					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeDec();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_2_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[43]);
			}
			
			(
				a2_0 = parse_org_emftext_language_textAML3_TypeAttribute				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[44]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[45]);
			}
			
			(
				(
					a3 = ',' {
						if (element == null) {
							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeDec();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_2_0_0_1_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[46]);
					}
					
					(
						a4_0 = parse_org_emftext_language_textAML3_TypeAttribute						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[47]);
						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[48]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[49]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[50]);
			}
			
			a5 = ')' {
				if (element == null) {
					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeDec();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_2_0_0_1_0_0_3, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[51]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[52]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[53]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[54]);
	}
	
	(
		(
			(
				a6_0 = parse_org_emftext_language_textAML3_ModelElement				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[55]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[56]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[57]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[58]);
	}
	
	a7 = ';' {
		if (element == null) {
			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeDec();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_2_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[59]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[60]);
	}
	
;

parse_org_emftext_language_textAML3_ModelElement returns [org.emftext.language.textAML3.ModelElement element = null]
@init{
}
:
	(
		(
			a0 = '<' {
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
			|			a1 = '>' {
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
			|			a2 = '=' {
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
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[61]);
	}
	
	(
		a5 = REFERENCE		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[62]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[63]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[64]);
	}
	
	(
		(
			a6 = '(' {
				if (element == null) {
					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElement();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_3_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[65]);
			}
			
			(
				a7 = TEXT				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[66]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[67]);
			}
			
			(
				(
					a8 = ',' {
						if (element == null) {
							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElement();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_3_0_0_2_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[68]);
					}
					
					(
						a9 = TEXT						
						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[69]);
						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[70]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[71]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[72]);
			}
			
			a10 = ')' {
				if (element == null) {
					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElement();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_3_0_0_2_0_0_3, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[73]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[74]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[75]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[76]);
	}
	
;

parse_org_emftext_language_textAML3_TypeRelation returns [org.emftext.language.textAML3.TypeRelation element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_textAML3_TypeRelationReference		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[77]);
	}
	
	(
		(
			a1 = '<' {
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
			|			a2 = '=' {
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
			|			a3 = '>' {
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
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[78]);
	}
	
	(
		a6_0 = parse_org_emftext_language_textAML3_TypeRelationReference		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[79]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[80]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[81]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[82]);
	}
	
	(
		(
			a7 = 'if' {
				if (element == null) {
					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRelation();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_4_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
			}
			{
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
			
			(
				a8_0 = parse_org_emftext_language_textAML3_Condition				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[95]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[96]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[97]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[98]);
			}
			
			(
				(
					a9 = ',' {
						if (element == null) {
							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRelation();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_4_0_0_3_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
					}
					{
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
					
					(
						a10_0 = parse_org_emftext_language_textAML3_Condition						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[111]);
						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[112]);
						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[113]);
						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[114]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[115]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[116]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[117]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[118]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[119]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[120]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[121]);
	}
	
;

parse_org_emftext_language_textAML3_TypeRelationReference returns [org.emftext.language.textAML3.TypeRelationReference element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[122]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[123]);
	}
	
	(
		(
			a1 = '(' {
				if (element == null) {
					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRelationReference();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_5_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelationReference(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[124]);
			}
			
			(
				a2_0 = parse_org_emftext_language_textAML3_TypeRelationReferenceElement				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[125]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[126]);
			}
			
			(
				(
					a3 = ',' {
						if (element == null) {
							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRelationReference();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_5_0_0_1_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelationReference(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[127]);
					}
					
					(
						a4_0 = parse_org_emftext_language_textAML3_TypeRelationReferenceElement						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[128]);
						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[129]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[130]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[131]);
			}
			
			a5 = ')' {
				if (element == null) {
					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRelationReference();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_5_0_0_1_0_0_3, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[132]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[133]);
	}
	
;

parse_org_emftext_language_textAML3_TypeRelationReferenceElement returns [org.emftext.language.textAML3.TypeRelationReferenceElement element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[134]);
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRelationReferenceElement();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_6_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelationReferenceElement(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[135]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelationReferenceElement(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[136]);
	}
	
	(
		a2_0 = parse_org_emftext_language_textAML3_Variable		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[137]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[138]);
	}
	
;

parse_org_emftext_language_textAML3_ModelElementRelation returns [org.emftext.language.textAML3.ModelElementRelation element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_textAML3_RuleElementExpression		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[139]);
	}
	
	(
		(
			a1 = '<' {
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
			|			a2 = '=' {
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
			|			a3 = '>' {
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
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementRelation(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[140]);
	}
	
	(
		a6_0 = parse_org_emftext_language_textAML3_RuleElementExpression		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[141]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[142]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[143]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[144]);
	}
	
	(
		(
			a7 = 'if' {
				if (element == null) {
					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElementRelation();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_7_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
			}
			{
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
			
			(
				a8_0 = parse_org_emftext_language_textAML3_Condition				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[157]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[158]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[159]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[160]);
			}
			
			(
				(
					a9 = ',' {
						if (element == null) {
							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElementRelation();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_7_0_0_3_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
					}
					{
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
					
					(
						a10_0 = parse_org_emftext_language_textAML3_Condition						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[173]);
						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[174]);
						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[175]);
						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[176]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[177]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[178]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[179]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[180]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[181]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[182]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[183]);
	}
	
;

parse_org_emftext_language_textAML3_Generator returns [org.emftext.language.textAML3.Generator element = null]
@init{
}
:
	(
		(
			a0_0 = parse_org_emftext_language_textAML3_Variable			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[184]);
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[185]);
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[186]);
		}
		
		
		|		a1 = '(' {
			if (element == null) {
				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createGenerator();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_10_0_0_0_0_1_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getGenerator(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[187]);
			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getGenerator(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[188]);
		}
		
		(
			a2_0 = parse_org_emftext_language_textAML3_Variable			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[189]);
		}
		
		(
			(
				a3 = ',' {
					if (element == null) {
						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createGenerator();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_10_0_0_0_0_1_2_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getGenerator(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[190]);
					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getGenerator(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[191]);
				}
				
				(
					a4_0 = parse_org_emftext_language_textAML3_Variable					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[192]);
					addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[193]);
				}
				
			)
			
		)+		{
			// expected elements (follow set)
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[194]);
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[195]);
		}
		
		a5 = ')' {
			if (element == null) {
				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createGenerator();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_10_0_0_0_0_1_3, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[196]);
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[197]);
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[198]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[199]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[200]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[201]);
	}
	
	(
		(
			a6 = 'in' {
				if (element == null) {
					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createGenerator();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_10_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
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
			
			(
				a7_0 = parse_org_emftext_language_textAML3_Expression				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[213]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[214]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[215]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[216]);
	}
	
;

parse_org_emftext_language_textAML3_TypeRule returns [org.emftext.language.textAML3.TypeRule element = null]
@init{
}
:
	a0 = 'from' {
		if (element == null) {
			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRule();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_11_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[217]);
	}
	
	(
		a1_0 = parse_org_emftext_language_textAML3_RuleElementExpression		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[218]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[219]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[220]);
	}
	
	(
		(
			a2 = 'in' {
				if (element == null) {
					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRule();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_11_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[221]);
			}
			
			(
				a3_0 = parse_org_emftext_language_textAML3_ContainmentVariable				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[222]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[223]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[224]);
			}
			
			(
				(
					a4 = ',' {
						if (element == null) {
							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRule();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_11_0_0_2_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[225]);
					}
					
					(
						a5_0 = parse_org_emftext_language_textAML3_ContainmentVariable						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[226]);
						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[227]);
						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[228]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[229]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[230]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[231]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[232]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[233]);
	}
	
	(
		(
			a6 = 'with' {
				if (element == null) {
					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRule();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_11_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[234]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[235]);
			}
			
			(
				a7_0 = parse_org_emftext_language_textAML3_Variable				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[236]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[237]);
			}
			
			(
				(
					a8 = ',' {
						if (element == null) {
							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRule();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_11_0_0_3_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[238]);
						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[239]);
					}
					
					(
						a9_0 = parse_org_emftext_language_textAML3_Variable						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[240]);
						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[241]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[242]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[243]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[244]);
	}
	
	a10 = 'to' {
		if (element == null) {
			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRule();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_11_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[245]);
	}
	
	(
		a11_0 = parse_org_emftext_language_textAML3_RuleElementExpression		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[246]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[247]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[248]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[249]);
	}
	
	(
		(
			a12 = 'where' {
				if (element == null) {
					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRule();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_11_0_0_6_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
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
			
			(
				a13_0 = parse_org_emftext_language_textAML3_Condition				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[262]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[263]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[264]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[265]);
			}
			
			(
				(
					a14 = ',' {
						if (element == null) {
							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeRule();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_11_0_0_6_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
					}
					{
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
					
					(
						a15_0 = parse_org_emftext_language_textAML3_Condition						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[278]);
						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[279]);
						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[280]);
						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[281]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[282]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[283]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[284]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[285]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[286]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[287]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[288]);
	}
	
;

parse_org_emftext_language_textAML3_ErrorRule returns [org.emftext.language.textAML3.ErrorRule element = null]
@init{
}
:
	a0 = 'error' {
		if (element == null) {
			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createErrorRule();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_12_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[289]);
	}
	
	(
		a1_0 = parse_org_emftext_language_textAML3_RuleElementExpression		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[290]);
	}
	
	a2 = 'message' {
		if (element == null) {
			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createErrorRule();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_12_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[291]);
	}
	
	(
		a3 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[292]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[293]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[294]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[295]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[296]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[297]);
	}
	
	(
		(
			a4 = 'sourceposition' {
				if (element == null) {
					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createErrorRule();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_12_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
			}
			{
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
			
			(
				a5_0 = parse_org_emftext_language_textAML3_Expression				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[309]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[310]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[311]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[312]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[313]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[314]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[315]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[316]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[317]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[318]);
	}
	
	(
		(
			a6 = 'with' {
				if (element == null) {
					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createErrorRule();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_12_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[319]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[320]);
			}
			
			(
				a7_0 = parse_org_emftext_language_textAML3_Variable				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[321]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[322]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[323]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[324]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[325]);
			}
			
			(
				(
					a8 = ',' {
						if (element == null) {
							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createErrorRule();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_12_0_0_5_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[326]);
						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getErrorRule(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[327]);
					}
					
					(
						a9_0 = parse_org_emftext_language_textAML3_Variable						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[328]);
						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[329]);
						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[330]);
						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[331]);
						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[332]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[333]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[334]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[335]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[336]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[337]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[338]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[339]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[340]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[341]);
	}
	
	(
		(
			a10 = 'where' {
				if (element == null) {
					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createErrorRule();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_12_0_0_6_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
			}
			{
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
			
			(
				a11_0 = parse_org_emftext_language_textAML3_Condition				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[354]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[355]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[356]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[357]);
			}
			
			(
				(
					a12 = ',' {
						if (element == null) {
							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createErrorRule();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_12_0_0_6_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
					}
					{
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
					
					(
						a13_0 = parse_org_emftext_language_textAML3_Condition						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[370]);
						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[371]);
						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[372]);
						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[373]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[374]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[375]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[376]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[377]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[378]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[379]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[380]);
	}
	
;

parse_org_emftext_language_textAML3_RuleElementExpression returns [org.emftext.language.textAML3.RuleElementExpression element = null]
@init{
}
:
	(
		a0 = REFERENCE		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[381]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[382]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[383]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[384]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[385]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[386]);
	}
	
	(
		(
			a1 = '(' {
				if (element == null) {
					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createRuleElementExpression();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_13_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getRuleElementExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[387]);
			}
			
			(
				a2_0 = parse_org_emftext_language_textAML3_RuleElementAttribute				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[388]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[389]);
			}
			
			(
				(
					a3 = ',' {
						if (element == null) {
							element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createRuleElementExpression();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_13_0_0_1_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getRuleElementExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[390]);
					}
					
					(
						a4_0 = parse_org_emftext_language_textAML3_RuleElementAttribute						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[391]);
						addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[392]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[393]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[394]);
			}
			
			a5 = ')' {
				if (element == null) {
					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createRuleElementExpression();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_13_0_0_1_0_0_3, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[395]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[396]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[397]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[398]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[399]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[400]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[401]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[402]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[403]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[404]);
	}
	
;

parse_org_emftext_language_textAML3_RuleElementAttribute returns [org.emftext.language.textAML3.RuleElementAttribute element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[405]);
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createRuleElementAttribute();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_14_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getRuleElementAttribute(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[406]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getRuleElementAttribute(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[407]);
	}
	
	(
		a2_0 = parse_org_emftext_language_textAML3_Variable		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[408]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[409]);
	}
	
;

parse_org_emftext_language_textAML3_AttributeExpression returns [org.emftext.language.textAML3.AttributeExpression element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[410]);
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createAttributeExpression();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_15_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
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
	
	(
		a2_0 = parse_org_emftext_language_textAML3_Expression		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[422]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[423]);
	}
	
;

parse_org_emftext_language_textAML3_Variable returns [org.emftext.language.textAML3.Variable element = null]
@init{
}
:
	(
		a0 = VARID		
		{
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
	)
	{
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
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_org_emftext_language_textAML3_ContainmentVariable{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_textAML3_ContainmentVariable returns [org.emftext.language.textAML3.ContainmentVariable element = null]
@init{
}
:
	(
		a0 = VARID		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[438]);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createContainmentVariable();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_17_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[439]);
	}
	
	(
		a2 = REFERENCE		
		{
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
	)
	{
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
	
;

parse_org_emftext_language_textAML3_TypeReferenceElement returns [org.emftext.language.textAML3.TypeReferenceElement element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[455]);
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeReferenceElement();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_25_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
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
	
	(
		a2_0 = parse_org_emftext_language_textAML3_Expression		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[467]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[468]);
	}
	
;

parse_org_emftext_language_textAML3_TypeAttribute returns [org.emftext.language.textAML3.TypeAttribute element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[469]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[470]);
	}
	
;

parseop_Condition_level_5 returns [org.emftext.language.textAML3.Condition element = null]
@init{
}
:
	c0 = parse_org_emftext_language_textAML3_ComparisonCondition{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_textAML3_FoldCondition{ element = c1; /* this is a subclass or primitive expression choice */ }
;

parse_org_emftext_language_textAML3_ComparisonCondition returns [org.emftext.language.textAML3.ComparisonCondition element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_textAML3_Expression		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[471]);
	}
	
	(
		(
			a1 = '<' {
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
			|			a2 = '=' {
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
			|			a3 = '>' {
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
			|			a4 = 'in' {
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
			|			a5 = '#' {
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
		)
	)
	{
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
	
	(
		a8_0 = parse_org_emftext_language_textAML3_Expression		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[483]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[484]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[485]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[486]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[487]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[488]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[489]);
	}
	
;

parse_org_emftext_language_textAML3_FoldCondition returns [org.emftext.language.textAML3.FoldCondition element = null]
@init{
}
:
	a0 = 'for' {
		if (element == null) {
			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createFoldCondition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_9_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[490]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[491]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[492]);
	}
	
	(
		a1_0 = parse_org_emftext_language_textAML3_Generator		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[493]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[494]);
	}
	
	(
		(
			a2 = ',' {
				if (element == null) {
					element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createFoldCondition();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_9_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[495]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[496]);
				addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getFoldCondition(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[497]);
			}
			
			(
				a3_0 = parse_org_emftext_language_textAML3_Generator				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[498]);
				addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[499]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[500]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[501]);
	}
	
	a4 = ':' {
		if (element == null) {
			element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createFoldCondition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_9_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
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
	
	(
		(
			a5_0 = parse_org_emftext_language_textAML3_Condition			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[515]);
			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[516]);
			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[517]);
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[518]);
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[519]);
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[520]);
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[521]);
		}
		
		
		|		a6 = '(' {
			if (element == null) {
				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createFoldCondition();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_9_0_0_4_0_1_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
		}
		{
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
		
		(
			a7_0 = parse_org_emftext_language_textAML3_Condition			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[534]);
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[535]);
		}
		
		(
			(
				a8 = ',' {
					if (element == null) {
						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createFoldCondition();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_9_0_0_4_0_1_2_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
				}
				{
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
				
				(
					a9_0 = parse_org_emftext_language_textAML3_Condition					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[548]);
					addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[549]);
				}
				
			)
			
		)*		{
			// expected elements (follow set)
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[550]);
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[551]);
		}
		
		a10 = ')' {
			if (element == null) {
				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createFoldCondition();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_9_0_0_4_0_1_3, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[552]);
			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[553]);
			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[554]);
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[555]);
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[556]);
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[557]);
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[558]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[559]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[560]);
		addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[561]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[562]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[563]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[564]);
		addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[565]);
	}
	
;

parseop_Expression_level_1 returns [org.emftext.language.textAML3.Expression element = null]
@init{
}
:
	leftArg = parseop_Expression_level_2	((
		()
		{ element = null; }
		(
			(
				a0 = '+' {
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
				|				a1 = '-' {
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
				|				a2 = '*' {
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
				|				a3 = '.' {
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
				|				a4 = '&' {
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
			)
		)
		{
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
		
		rightArg = parseop_Expression_level_2		{
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
		{
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
		{ leftArg = element; /* this may become an argument in the next iteration */ }
	)+ | /* epsilon */ { element = leftArg; }
	
)
;

parseop_Expression_level_2 returns [org.emftext.language.textAML3.Expression element = null]
@init{
}
:
(
	(
		a0 = 'length' {
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
		|		a1 = 'first' {
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
		|		a2 = 'last' {
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
		|		a3 = 'flatten' {
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
		|		a4 = 'pairs' {
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
	)
)
{
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

arg = parseop_Expression_level_3{
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
|

arg = parseop_Expression_level_3{ element = arg; }
;

parseop_Expression_level_3 returns [org.emftext.language.textAML3.Expression element = null]
@init{
}
:
c0 = parse_org_emftext_language_textAML3_Number{ element = c0; /* this is a subclass or primitive expression choice */ }
|c1 = parse_org_emftext_language_textAML3_SetExpression{ element = c1; /* this is a subclass or primitive expression choice */ }
|c2 = parse_org_emftext_language_textAML3_VariableReference{ element = c2; /* this is a subclass or primitive expression choice */ }
|c3 = parse_org_emftext_language_textAML3_FunctionReference{ element = c3; /* this is a subclass or primitive expression choice */ }
|c4 = parse_org_emftext_language_textAML3_TypeReference{ element = c4; /* this is a subclass or primitive expression choice */ }
|c5 = parse_org_emftext_language_textAML3_ModelElementExpression{ element = c5; /* this is a subclass or primitive expression choice */ }
|c6 = parse_org_emftext_language_textAML3_StringLiteral{ element = c6; /* this is a subclass or primitive expression choice */ }
|c7 = parse_org_emftext_language_textAML3_NullLiteral{ element = c7; /* this is a subclass or primitive expression choice */ }
|c8 = parse_org_emftext_language_textAML3_NestedExpression{ element = c8; /* this is a subclass or primitive expression choice */ }
;

parse_org_emftext_language_textAML3_Number returns [org.emftext.language.textAML3.Number element = null]
@init{
}
:
(
	a0 = NUMBER	
	{
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
)
{
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

;

parse_org_emftext_language_textAML3_SetExpression returns [org.emftext.language.textAML3.SetExpression element = null]
@init{
}
:
a0 = 'set' {
	if (element == null) {
		element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createSetExpression();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_19_0_0_0, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[604]);
}

a1 = '{' {
	if (element == null) {
		element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createSetExpression();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_19_0_0_1, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
}
{
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

(
	(
		(
			a2_0 = parse_org_emftext_language_textAML3_Expression			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[617]);
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[618]);
		}
		
		(
			(
				a3 = ',' {
					if (element == null) {
						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createSetExpression();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_19_0_0_2_0_0_1_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
				}
				{
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
				
				(
					a4_0 = parse_org_emftext_language_textAML3_Expression					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[630]);
					addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[631]);
				}
				
			)
			
		)*		{
			// expected elements (follow set)
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[632]);
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[633]);
		}
		
	)
	
)?{
	// expected elements (follow set)
	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[634]);
}

a5 = '}' {
	if (element == null) {
		element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createSetExpression();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_19_0_0_3, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
}
{
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

;

parse_org_emftext_language_textAML3_VariableReference returns [org.emftext.language.textAML3.VariableReference element = null]
@init{
}
:
(
	a0 = VARID	
	{
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
)
{
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

;

parse_org_emftext_language_textAML3_FunctionReference returns [org.emftext.language.textAML3.FunctionReference element = null]
@init{
}
:
(
	a0 = TEXT	
	{
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
)
{
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

;

parse_org_emftext_language_textAML3_TypeReference returns [org.emftext.language.textAML3.TypeReference element = null]
@init{
}
:
(
	a0 = TEXT	
	{
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
)
{
	// expected elements (follow set)
	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[683]);
}

a1 = '{{' {
	if (element == null) {
		element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeReference();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_24_0_0_1, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
}
{
	// expected elements (follow set)
	addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeReference(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[684]);
	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[685]);
}

(
	(
		(
			a2_0 = parse_org_emftext_language_textAML3_TypeReferenceElement			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[686]);
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[687]);
		}
		
		(
			(
				a3 = ',' {
					if (element == null) {
						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeReference();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_24_0_0_2_0_0_1_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeReference(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[688]);
				}
				
				(
					a4_0 = parse_org_emftext_language_textAML3_TypeReferenceElement					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[689]);
					addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[690]);
				}
				
			)
			
		)*		{
			// expected elements (follow set)
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[691]);
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[692]);
		}
		
	)
	
)?{
	// expected elements (follow set)
	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[693]);
}

a5 = '}}' {
	if (element == null) {
		element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createTypeReference();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_24_0_0_3, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
}
{
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

;

parse_org_emftext_language_textAML3_ModelElementExpression returns [org.emftext.language.textAML3.ModelElementExpression element = null]
@init{
}
:
(
	a0 = REFERENCE	
	{
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
)
{
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

(
	(
		a1 = '(' {
			if (element == null) {
				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElementExpression();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_27_0_0_1_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[727]);
		}
		
		(
			a2_0 = parse_org_emftext_language_textAML3_AttributeExpression			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[728]);
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[729]);
		}
		
		(
			(
				a3 = ',' {
					if (element == null) {
						element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElementExpression();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_27_0_0_1_0_0_2_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementExpression(), org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[730]);
				}
				
				(
					a4_0 = parse_org_emftext_language_textAML3_AttributeExpression					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[731]);
					addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[732]);
				}
				
			)
			
		)*		{
			// expected elements (follow set)
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[733]);
			addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[734]);
		}
		
		a5 = ')' {
			if (element == null) {
				element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createModelElementExpression();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_27_0_0_1_0_0_3, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
		}
		{
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
		
	)
	
)?{
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

;

parse_org_emftext_language_textAML3_StringLiteral returns [org.emftext.language.textAML3.StringLiteral element = null]
@init{
}
:
(
	a0 = QUOTED_34_34	
	{
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
)
{
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

;

parse_org_emftext_language_textAML3_NullLiteral returns [org.emftext.language.textAML3.NullLiteral element = null]
@init{
}
:
a0 = 'OclUndefined' {
	if (element == null) {
		element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createNullLiteral();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_29_0_0_0, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
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

;

parse_org_emftext_language_textAML3_NestedExpression returns [org.emftext.language.textAML3.NestedExpression element = null]
@init{
}
:
a0 = '(' {
	if (element == null) {
		element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createNestedExpression();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_30_0_0_0, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
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

(
	a1_0 = parse_org_emftext_language_textAML3_Expression	{
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
)
{
	// expected elements (follow set)
	addExpectedElement(null, org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ExpectationConstants.EXPECTATIONS[810]);
}

a2 = ')' {
	if (element == null) {
		element = org.emftext.language.textAML3.TextAML3Factory.eINSTANCE.createNestedExpression();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3GrammarInformationProvider.TEXTAML3_30_0_0_2, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
}
{
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

;

parseop_Expression_level_9 returns [org.emftext.language.textAML3.Expression element = null]
@init{
}
:
c0 = parse_org_emftext_language_textAML3_AttributeReference{ element = c0; /* this is a subclass or primitive expression choice */ }
;

parse_org_emftext_language_textAML3_AttributeReference returns [org.emftext.language.textAML3.AttributeReference element = null]
@init{
}
:
(
	a0 = TEXT	
	{
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
)
{
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

;

parse_org_emftext_language_textAML3_Relation returns [org.emftext.language.textAML3.Relation element = null]
:
c0 = parse_org_emftext_language_textAML3_TypeRelation{ element = c0; /* this is a subclass or primitive expression choice */ }
|c1 = parse_org_emftext_language_textAML3_ModelElementRelation{ element = c1; /* this is a subclass or primitive expression choice */ }

;

parse_org_emftext_language_textAML3_Condition returns [org.emftext.language.textAML3.Condition element = null]
:
c = parseop_Condition_level_5{ element = c; /* this rule is an expression root */ }

;

parse_org_emftext_language_textAML3_Expression returns [org.emftext.language.textAML3.Expression element = null]
:
c = parseop_Expression_level_1{ element = c; /* this rule is an expression root */ }

;

URL:
(('A'..'Z' | 'a'..'z'| '_')('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')*'://'(('A'..'Z' | 'a'..'z'| '_')('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')*|('0'..'9' )+)(('.'|'/')(('A'..'Z' | 'a'..'z'| '_')('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')*|('0'..'9' )+))*)
;
WHITESPACE:
((' '|'\t'|'\f'))
{ _channel = 99; }
;
LINEBREAKS:
(('\r\n'|'\r'|'\n'))
{ _channel = 99; }
;
VARID:
('\u0024'('A'..'Z' | 'a'..'z' | '0'..'9')*)
;
NUMBER:
(('0'..'9' )+)
;
TEXT:
(('A'..'Z' | 'a'..'z'| '_')('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')*)
;
REFERENCE:
((('A'..'Z' | 'a'..'z'| '_')('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')*'::')+('A'..'Z' | 'a'..'z'| '_')('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')*)
;
QUOTED_34_34:
(('"')(~('"'))*('"'))
;

