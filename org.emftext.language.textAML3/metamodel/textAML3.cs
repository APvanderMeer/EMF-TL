SYNTAXDEF textAML3
FOR <http://www.emftext.org/language/textAML3>
START TypeSystemDec

OPTIONS {
    usePredefinedTokens = "false";
    disableTokenSorting = "true";
	reloadGeneratorModel = "true";
}

TOKENS {
    DEFINE URL TEXT + $'://'$ + $($ + TEXT + $|$ + NUMBER + $)$ + $($ + $('.'|'/')$ + $($ + TEXT + $|$ + NUMBER + $)$ + $)*$;
    
    DEFINE WHITESPACE $(' '|'\t'|'\f')$;
	DEFINE LINEBREAKS $('\r\n'|'\r'|'\n')$;
	
	
	DEFINE VARID $'\u0024'$ + $('A'..'Z' | 'a'..'z' | '0'..'9')*$;

//    DEFINE VARID $('A'..'Z' | 'a'..'z' | '0'..'9')+$;

    DEFINE NUMBER $('0'..'9' )+$;

    DEFINE TEXT $('A'..'Z' | 'a'..'z'| '_')('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')*$;
    
    DEFINE REFERENCE $($ + TEXT + $'::'$ + $)+$ + TEXT;
		
//	DEFINE TEXT $('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' | '::')+$;
	
//	DEFINE QUALIFIEDREFERENCE $(('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-') + '::')+$ + $('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')$;
}

RULES {
	TypeSystemDec   ::= "imports" packages*
	                    "start" baseclass[REFERENCE]
	                    "typesystem" typevalues* 
	                    "widening"  widening*
	                    "rules"    (errorrules | rulesystem)*  
	                    "strategy"   strategy*
	                    "strategytarget" strategytarget[]*;
	
	PackageElement ::= targetpackage[URL] ";";
	
	TypeDec ::= name[] ("("attributes ("," attributes)* ")")? (representation)* ";";
	
	ModelElement ::= relation[In : "<", Out : ">", InOut : "="] targetclass[REFERENCE]("(" attributes[] ("," attributes[])*")")?;
	
	TypeRelation ::= lhs operator[LessEqual : "<", Equal : "=", GreaterEqual : ">"] rhs
	                 ("if" conditions ("," conditions)*)?;

	TypeRelationReference ::= target[] ("(" arguments ("," arguments)* ")")?;
	
	TypeRelationReferenceElement ::= typeattribute[] "=" value;
	
	ModelElementRelation ::= lhs operator[LessEqual : "<", Equal : "=", GreaterEqual : ">"] rhs
	                 ("if" conditions ("," conditions)*)?;
	
	@Operator(type="primitive", weight="5",superclass="Condition")
	ComparisonCondition ::= left operator[LessEqual : "<", Equal : "=", GreaterEqual : ">", Element : "in", NotEqual : "#"] right;
	
	@Operator(type="primitive", weight="5",superclass="Condition")
	FoldCondition ::= "for" generator ("," generator)* ":" (condition | "(" condition ("," condition)* ")");
	
	Generator ::= (variable | "(" variable ("," variable)+ ")") ("in" container)?;
	
	TypeRule ::= "from" source : RuleElementExpression
	             ("in" containments ("," containments)*)?
	             ("with" variables ("," variables)*)?
	             "to" target : RuleElementExpression
	             ("where" conditions ("," conditions)*)?;

	ErrorRule ::= "error" source : RuleElementExpression
	              "message" message['"','"']
	              ("sourceposition" position)?
	             ("with" variables ("," variables)*)?
	             ("where" conditions ("," conditions)*)?;
	                         
	RuleElementExpression ::= baseclass[REFERENCE] ("(" attributes ("," attributes)* ")")?;
	
	RuleElementAttribute ::= myattribute[] "=" variable;
	
	AttributeExpression ::= myattribute[] "=" value;
	
	Variable ::= varname[VARID];
	
	ContainmentVariable ::= varname[VARID] ":" container[REFERENCE];
	
	@Operator(type="primitive", weight="3",superclass="Expression")
	Number ::= value[NUMBER];
	
	@Operator(type="primitive", weight="3",superclass="Expression")
	SetExpression ::= "set" "{" (values ("," values)*)? "}" ;
	
	@Operator(type="binary_left_associative",weight="1",superclass="Expression")
	BinaryExpression ::= left operator[Addition : "+", Subtraction : "-", Multiplication : "*", Projection : ".", Concatenation : "&"] right;
	
	@Operator(type="unary_prefix",weight="2",superclass="Expression")
	UnaryExpression ::= operator[Length : "length", First : "first", Last : "last", Flatten : "flatten", Pairs : "pairs"] left;
	
    @Operator(type="primitive", weight="3",superclass="Expression")
	VariableReference ::= target[VARID];
	
	@Operator(type="primitive", weight="3",superclass="Expression")
	FunctionReference ::= function[];
	
	@Operator(type="primitive", weight="3",superclass="Expression")
	TypeReference ::= target[] "{{" (arguments ("," arguments)*)? "}}";
	
	TypeReferenceElement ::= typeattribute[] "=" value;
	
	@Operator(type="primitive", weight="9",superclass="Expression")
	AttributeReference ::= target[];

	@Operator(type="primitive", weight="3",superclass="Expression")	
	ModelElementExpression ::= baseclass[REFERENCE] ("(" attributes ("," attributes)* ")")?;
	
	@Operator(type="primitive", weight="3",superclass="Expression")
	StringLiteral ::= value['"','"'];
	
	@Operator(type="primitive", weight="3",superclass="Expression")
	NullLiteral ::= "OclUndefined";	
	
	@Operator(type="primitive", weight="3",superclass="Expression")
	NestedExpression ::= "(" expression ")";
	
	TypeAttribute ::= name[];
	
}