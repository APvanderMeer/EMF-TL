package constraints.template

import constraints.Constraint
import constraints.Operator
import constraints.Program
import constraints.Type
import constraints.VariableEquality
import constraints.NodeEquality
import constraints.Contains
import constraints.Variable
import constraints.Element
import constraints.Node
import constraints.VariableReference
import constraints.ObjectNode
import constraints.ListNode
import constraints.Feature
import constraints.SelectNode
import constraints.Literal
import constraints.IndirectReference
import constraints.TypeFeature
import constraints.FoldConstraint
import constraints.Equation
import constraints.ComparisonOperator
import constraints.BinaryNode
import constraints.UnaryNode
import constraints.BinOp

import java.util.Set
import java.util.HashSet
import java.util.List
import java.util.ArrayList
import static extension java.lang.Integer.*
import static extension java.util.regex.Matcher.*

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.EObject

class EclipseTemplate implements IGenerator{

    Program base

    Integer currentid
    
    Integer arraysize
    
    Integer objectSize
    
    String path

    def setFile(String path) {this.path = path}

    override void doGenerate(Resource resource, IFileSystemAccess filesystem) {
    	for (EObject o : resource.contents) {
	            compile(o,filesystem)
	        }
    }

    def dispatch void compile(Program p, IFileSystemAccess filesystem) {
    	setBase(p);
    	currentid = 0;
    	//arraysize = ((p.variables.sortBy(v | v.number).last().number / (p.objectElements.size + 1)) + 1) * (p.objectElements.size + 1);
    	arraysize = p.variables.sortBy(v | v.number).last().number;
    	objectSize = p.objectElements.size + 1;
    	filesystem.generateFile("out.ecl",toEclipseProgram(p))
    }
    
    def dispatch void compile(EObject e, IFileSystemAccess filesystem) {}

    def setBase(Program p) {
    	base = p
    }
    
    def getNextId() {
		currentid = currentid + 1;
		return currentid;
	}

	def toEclipseProgram(Program p) 	
''':- pragma(expand).
:- lib(branch_and_bound).
:- lib(propia).
:- lib(ic_symbolic).
:- lib(lists).
:- local domain(basetype(«FOR t : p.types.filter(telem | telem.parameters.empty) SEPARATOR ","»«type2eclipse(t)»«ENDFOR»«IF !p.types.exists(telem | telem.name.equals('error'))»,error«ENDIF»,oclundefined)).
«FOR t : p.types.filter(e|!e.parameters.isEmpty)»«typestruct2eclipse(t)»«ENDFOR»

:- local reference(ts).

:- op(500,fxy,getindirect).
«FOR o : p.objectElements »
getindirect(V,«o»,R) :- getfeature(V,constraintvar,C), C = constraintVar{number:W}, R is W + «p.objectElements.indexOf(o) + 1».
«ENDFOR»

:- op(500,fxy,hastype).
«FOR o : p.objectElements »
hastype(V,«o»,T) :- N is getindirect V «o», typeof(N), getval(ts,Ts),arg(N,Ts,T), T \= error.
«ENDFOR»
hastype(X,I,T) :- getfeature(X,I,T), nonvar(T).

hastype2(X,T) :- N is X, typeof(N), getval(ts,Ts), arg(N,Ts,T).

gettypesset(Best) :- dim(Best,[«arraysize»]) , setval(ts,Best), bb_min(typeall(Best,Count),Count,bb_options{strategy:restart,from:0,timeout:60}), once typeall2(Best).

newtypeall(Count) :- (
               for(I,2,«arraysize»,7),
               fromto(0,In,Out,Count)
               do
               hastype2(I,X),
               cost(X,CostX),
               Out is In + CostX
               ).

typeall(Best,Count) :- (
               for(I,1,«arraysize»),
               fromto(0,In,Out,Count),param(Count)
               do
               (
               (mod(I,«objectSize»,1);«IF p.typeAttribute.size > 0»«FOR ta : p.typeAttribute SEPARATOR ";"»mod(I,«objectSize»,«ta»)«ENDFOR»«ELSE»true«ENDIF»)->
               hastype2(I,X),
               cost(X,CostX),
               Out is In + CostX,
               Out =< Count
               ;
               Out = In
               )
               ).
               
typeall2(Ts) :- (
               for(I,1,«p.variables.sortBy(v | v.number).last().number»),
               param(Ts)
               do
               hastype2(I,_)
               ).

getfeature(X,Feature,Y) :- compound(X),
                      functor(X,Name,_),
                      current_struct(Name,Spec),
                      functor(Spec,_,_),
                    (foreacharg(F,Spec),
                     foreacharg(E,X),
                     param(Y),
                     param(Feature)
                     do
                      functor(F,Name,ArityF),
                      (Name = Feature ->
                       Y = E
                       ;
                      ((ArityF > 1, nonvar(E))->
                       getfeature(E,Feature,Y)
                       ;
                       true
                      )
                      )
                    ).

             
:- op(500,fx, widen).
widen(X,X).
widen(X,Y) :- X \= Y, compare(X,Y).
widen(X,Y) :- widenbasic(X,Y).
widen(X,Y) :- widenbasic(Z,Y), widen(X,Z), X \= Z.
«FOR o : p.operators »«operator2eclipse(o)»«ENDFOR»

cost(error,CostX) :- CostX = 100000000.
cost(X,CostX) :- X \= error, not strategybasic(_,X), CostX = 1.
cost(X,CostX) :- nonvar(X), strategybasic(Y,X), cost(Y,CostY), CostX is 10 * CostY.

compare(X,Y) :- compare2(X,Y,_).
compare2(X,Y,_) :- once(X = Y).
compare2(L,R,_) :- ground(L),ground(R), L = constraintVar{number:X}, R = constraintVar{number:Y},hastype2(X,A), hastype2(Y,B), compare(A,B).
compare2(X, Y,_) :- X \= Y,
	functor(X, F, A),
	functor(Y, F, A),	% fail if different functors (or atomic terms),
	( for(I,1,A), param(X,Y) do
	     arg(I, X, XI),
	     arg(I, Y, YI),
	     once(compare(XI, YI))	% unify argument I
	).
compare2(X, Y,left) :- X \= Y,
    type_of(X,compound),
    type_of(Y,compound),
	functor(X, F1, _),
	functor(Y, F2, _),
	F1 \= F2,
	atom(F1),
	atom(F2),
	current_struct(F1,S1),
	(foreacharg(A,S1), foreacharg(V,X),fromto(Supers,Out,In,[]) do
	   functor(A,AN,_),
	   ((AN=(:))->
	   	arg(2,A,S),
	    ((current_struct(S,_),nonvar(V))->
	    Out = [V|In]
	    ;
	    Out = In
	    )
	    ;
	    Out = In
	   )
	),
	member(Super,Supers),
	compare2(Super,Y,left).
compare2(Y, X,right) :- X \= Y,
    type_of(X,compound),
    type_of(Y,compound),
	functor(X, F1, _),
	functor(Y, F2, _),
	F1 \= F2,
	current_struct(F1,S1),
	(foreacharg(A,S1), foreacharg(V,X),fromto(Supers,Out,In,[]) do
	   functor(A,AN,_),
	   ((AN=(:))->
	   	arg(2,A,S),
	    ((current_struct(S,_),nonvar(V))->
	    Out = [V|In]
	    ;
	    Out = In
	    )
	    ;
	    Out = In
	   )
	),
	member(Super,Supers),
	compare2(Y,Super,right).
				
«FOR n : makeNumberList(arraysize)»«IF p.constraints.filter(e | e.equation.left.number == n).size() > 0»«FOR c : p.constraints.filter(e | e.equation.left.number == n)»«constraintToEclipse(c)»«ENDFOR»«ENDIF»«makeError(n)»«ENDFOR»'''

    def type2eclipse(Type t) '''«identifier2eclipse(t.name)»'''

    def typestruct2eclipse(Type t) 
    '''
    :- local struct(«identifier2eclipse(t.name)»(«FOR p :  t.parameters SEPARATOR ","»«identifier2eclipse(p)»«ENDFOR»)).
    '''

    def operator2eclipse(Operator o) '''
    «o.name»(«element2eclipse(new ArrayList(),o.lhs)»,«element2eclipse(new ArrayList(),o.rhs)»)
    «IF o.constraints.size > 0»:-«FOR lc : o.constraints SEPARATOR ","»«localconstraint2eclipse(lc,o.name)»«ENDFOR»«IF o.lhs.name == o.rhs.name»,«element2eclipse(new ArrayList(),o.lhs)»\=«element2eclipse(new ArrayList(),o.rhs)»«ENDIF»«ENDIF».
    '''

    def makeError(Integer n) '''typeof(«n») :- getval(ts,Ts),once(arg(«n»,Ts,error)).
    '''

    def makeConditionalError(Integer n) '''typeof(«n») :- getval(ts,Ts), «IF ((n / objectSize)*objectSize)+1 != n»once(arg(«((n / objectSize)*objectSize)+1»,Ts,error)),«ENDIF»once(arg(«n»,Ts,error)).
    '''

    def constraintToEclipse(Constraint c) '''
    «FOR e : c.equation SEPARATOR ","»«topequation2eclipse(e)»«ENDFOR»«IF !c.localconstraints.isEmpty»,«FOR lc : c.localconstraints SEPARATOR ","»«localconstraint2eclipse(lc,"widen")»«ENDFOR»«ENDIF».
    '''

    def dispatch topequation2eclipse(VariableEquality e) '''
    «IF !base.variables.contains(e.left)»
    :- «localvariablearg2eclipse(e.left,e.right)»
    «ELSE»
    «variable2eclipse(e.left)» :- «variablearg2eclipse(e.left,'T')»,«variablehastype2eclipse(e.right,'T')»«ENDIF»'''

    def dispatch topequation2eclipse(Equation e) ''''''
//getval(ts,Ts),«IF !hasRightVarRef(e)»once (arg(«e.left.number»,Ts,«element2eclipse(new ArrayList(),e.right)»)«ELSE»arg(«e.left.number»,Ts,«element2eclipse(new ArrayList(),e.right)»«ENDIF»)
    def dispatch topequation2eclipse(NodeEquality e)
    '''
    «variable2eclipse(e.left)»:-getval(ts,Ts),«IF !hasRightVarRef(e)»once (arg(«e.left.number»,Ts,«element2eclipse(new ArrayList(),e.right)»)«ELSE»arg(«e.left.number»,Ts,«element2eclipse(new ArrayList(),e.right)»«ENDIF»)
    '''
//getval(ts,Ts),arg(«e.left.number»,Ts,«element2eclipse(new ArrayList(),value)»)
    def dispatch topequation2eclipse(Contains e)
    '''«FOR value :  e.values SEPARATOR "."»«variable2eclipse(e.left)» :- getval(ts,Ts),arg(«e.left.number»,Ts,«element2eclipse(new ArrayList(),value)»)«ENDFOR»'''

    def variable2eclipse(Variable v)'''typeof(«v.number»)'''

    def linkvariable2eclipse(Variable v) '''hastype(«v.number»,V«v.number»)'''

    def variablehastype2eclipse(Variable myvar, String varname)'''hastype(«myvar.number»,«varname»)'''

    def variablearg2eclipse(Variable myvar, String varname) '''arg(«myvar.number»,Ts,«varname»)'''

    def element2eclipse(List<Element> list, Element e) '''«IF list.contains(e)»Temp«list.indexOf(e)»«ELSE»«element2eclipse2(list,e)»«ENDIF»'''
    
    def dispatch element2eclipse2(List<Element> list, Element e) '''«identifier2eclipse(e.name)»'''

    def dispatch element2eclipse2(List<Element> list, Node n) '''«node2eclipse(list, n)»'''

    def dispatch element2eclipse2(List<Element> list, VariableReference varref) '''«localvariable2eclipse(varref.^var)»'''

    def dispatch node2eclipse(List<Element> list, Node n) '''«identifier2eclipse(n.name)»'''

    def dispatch node2eclipse(List<Element> list, ObjectNode n) '''«identifier2eclipse(n.name)»«IF n.name != 'error'»«IF !base.types.findFirst(t | t.name == n.name).parameters.nullOrEmpty»{«FOR f : n.features SEPARATOR ","»«feature2eclipse(list,f)»«ENDFOR»}«ENDIF»«ENDIF»'''

    def dispatch node2eclipse(List<Element> list, ListNode n) '''[«FOR v : n.values SEPARATOR ","»«element2eclipse(list,v)»«ENDFOR»]'''

    def feature2eclipse(List<Element> list, Feature f) '''«identifier2eclipse(f.name)»:«element2eclipse(list,f.value)»'''

    def dispatch node2eclipse(List<Element> list, SelectNode n) '''getconstraint(«localvariable2eclipse(n.object)»,W«n.object.number»)'''

    def dispatch node2eclipse(List<Element> list, Literal l) '''«IF isInt(l.value)»«l.value»«ELSE»"«l.value.replaceAll('\"','\\\\\\\"')»"«ENDIF»'''

    def dispatch node2eclipse(List<Element> list, IndirectReference r)'''hastype «localvariable2eclipse((r.expression as VariableReference).^var)» «r.name» '''
    
    def dispatch node2eclipse(List<Element> list, UnaryNode e)'''«e.operator.toString().toLowerCase()»(«element2eclipse(list,e.left)»)'''
    
    def dispatch node2eclipse(List<Element> list, BinaryNode e)'''«element2eclipse(list,e.left)» «operator2eclipse(e.operation)» «element2eclipse(list,e.right)»'''

    def dispatch identifier2eclipse(String i) '''«IF (!(i == null))»«IF i.contains(':')»«FOR n : i.split(':') SEPARATOR ':'»«n.toFirstLower()»«ENDFOR»«ELSE»«i.toFirstLower()»«ENDIF»«ENDIF»'''

    def dispatch identifier2eclipse(TypeFeature t) '''«t.name.head.toFirstLower()»:«t.type.toFirstLower()»'''

    def dispatch localconstraint2eclipse(Constraint c, String operator) '''«localequation2eclipse(c.equation.head, operator)»'''

    def dispatch localconstraint2eclipse(FoldConstraint c, String operator)
    '''
    («FOR co : c.container SEPARATOR ","»«container2eclipse(co,c.localvariables.get(c.container.indexOf(co)))»«ENDFOR»
     «FOR v : getVariableSet(c)»,«variable2param(v)»«ENDFOR» 
     do 
     «FOR lc : c.localconstraints SEPARATOR ","»«localconstraint2eclipse(lc, operator)»«ENDFOR»)'''

    def container2eclipse(Element e, Variable myvar) '''foreach(«localvariable2eclipse(myvar)»,«element2eclipse(new ArrayList(),e)»)'''

    def variable2param(Variable v) '''param(«localvariable2eclipse(v)»)'''

    def dispatch localequation2eclipse(Equation e, String operator) ''''''

    def dispatch localequation2eclipse(VariableEquality e, String operator) '''«localvariablearg2eclipse(e.right,e.left)»'''

    def dispatch localequation2eclipse(NodeEquality e, String operator) 
    {
    	var i = getNextId();
    	'''
      «initTemp(makeTemp("L"+i,e.left).toString,e.left)»,
      «initTemp(makeTemp("R"+i,e.left).toString,e.right)»,
      «IF (e.operation==ComparisonOperator::EQUAL)»
          compare(«makeTemp("L"+i,e.left)»,«makeTemp("R"+i,e.left)»)
      «ELSE»
          «IF (e.operation==ComparisonOperator::LESS_EQUAL)»
              «operator»(«makeTemp("L"+i,e.left)»,«makeTemp("R"+i,e.left)»)
          «ELSE»
              «IF (e.operation==ComparisonOperator::GREATER_EQUAL)»
                  «operator»(«makeTemp("R"+i,e.left)»,«makeTemp("L"+i,e.left)»)
              «ELSE»
                  member(«makeTemp("L"+i,e.left)»,«makeTemp("R"+i,e.left)»)
              «ENDIF»
          «ENDIF»
      «ENDIF»
      '''
    }
    
    def dispatch initTemp(String i, Void o) '''«i» = oclUndefined'''
    
    def dispatch initTemp(String i, Element elem) '''«IF isIndirect(elem)»«i» is «element2eclipse(getArithExpression(elem),elem)»«ELSE»«IF isConcat(elem)»«makeConcat(i,elem as BinaryNode)»«ELSE»«i» = «element2eclipse(getArithExpression(elem),elem)»«ENDIF»«ENDIF»''' 
    
    def dispatch initTemp(String i, Variable myvar) '''«IF base.variables.contains(myvar)»once(hastype2(«myvar.number»,«i» )) «ELSE»«i» = «localvariable2eclipse(myvar)»«ENDIF»'''
    
    def dispatch localequation2eclipse(List<Element> list, Variable left, Program p, Element right) '''once «element2eclipse(list,right)» is hastype «left.number»'''
    
    def dispatch localequation2eclipse(List<Element> list, Variable left, Constraint c, VariableReference right) '''«IF isLocal(right.^var)»compare(«localvariable2eclipse(left)»,«localvariable2eclipse(right.^var)»)«ELSE»«localvariable2eclipse(left)» is  hastype «right.^var.number»«ENDIF»''' 

    //def dispatch localequation2eclipse(List<Element> list, Variable left, Constraint c, IndirectReference right) '''getconstraint(«localvariable2eclipse((right.expression as VariableReference).^var)»,W«(right.expression as VariableReference).^var.number»), Y«(right.expression as VariableReference).^var.number» is W«(right.expression as VariableReference).^var.number» + «base.objectElements.indexOf(right.name.name) + 1»,hastype(Y«(right.expression as VariableReference).^var.number»,Ts,«localvariable2eclipse(left)»)''' 
    
    def dispatch localequation2eclipse(List<Element> list, Variable left, Constraint c, IndirectReference right) '''hastype «localvariable2eclipse((right.expression as VariableReference).^var)» «right.name» '''
    	
 
    def dispatch localequation2eclipse(List<Element> list, Variable left, Constraint c, Element right) '''«element2eclipse(list,right)»'''
    
    def dispatch localequation2eclipse(List<Element> list, Variable left, Operator o, Element right) '''«element2eclipse(list,right)»'''

    def localvariablearg2eclipse(Variable myvar, Variable localvar) '''hastype2(«myvar.number»,«localvariable2eclipse(localvar)»)'''	

    def localvariable2eclipse(Variable myvar) '''«IF (myvar.equations.size + myvar.references.size) >= 0»V«myvar.number»«ELSE»_«ENDIF»'''

    def makeTemp(String n, Variable myvar) '''«n»«myvar.number»'''

    def makeConcat(String i, BinaryNode b) '''append(«element2eclipse(getArithExpression(b.left),b.left)»,«element2eclipse(getArithExpression(b.right),b.right)»,«i»)'''
    
    def operator2eclipse(BinOp o) {
    	switch o {
    	    case BinOp::ADDITION : '+'
    	    case BinOp::SUBTRACTION : '-'
    	    case BinOp::PROJECTION : '.'
    	    default : o.toString()
    	}
    	
    }

    def dispatch hasRightVarRef(NodeEquality e) {
    	isVariableReference(e.right)
    }
    
    def dispatch hasRightVarRef(VariableEquality e) {
    	true
    }
    
    def dispatch isVariableReference(VariableReference e) {
    	true
    }
    
    def dispatch isVariableReference(Element e) {
    	false
    }

	def getVariableSet(Constraint c) {
		var Set<Variable> varset = new HashSet<Variable>();
		if (c.equation != null) {
		    varset.addAll(getEquationVariableSet(c.equation.head));
        }
		for(localE: c.localconstraints) {
			varset.addAll(getVariableSet(localE));
		}
		var result = new HashSet<Variable>();
		for(localV: varset.filter(v | !c.localvariables.exists(lv | lv.number == v.number))) {
			result.add(localV);
		}
		return result;
	}
	
	def dispatch getEquationVariableSet(VariableEquality e) {
		var Set<Variable> varset = new HashSet<Variable>();
		varset.add(e.left);
		varset.add(e.right);
		return varset;
	}
	
	def dispatch getEquationVariableSet(NodeEquality e) {
		var Set<Variable> varset = new HashSet<Variable>();
		varset.add(e.left);
		varset.addAll(getElementVariableSet(e.right));
		return varset;
	}
	
	def dispatch getEquationVariableSet(Contains e) {
		var Set<Variable> varset = new HashSet<Variable>();
		varset.add(e.left);
		for (v : e.values) {
			varset.addAll(getElementVariableSet(v));
		}
		return varset;
	}
	
	def dispatch Set<Variable> getElementVariableSet(Element e) {
		return new HashSet<Variable>();
	}
	
	def dispatch Set<Variable> getElementVariableSet(Literal n) {
		return new HashSet<Variable>();
	}
	
	def dispatch Set<Variable> getElementVariableSet(VariableReference n) {
		var Set<Variable> varset = new HashSet<Variable>();
		varset.add(n.^var); 
		return varset;
	}
	
	def dispatch Set<Variable> getElementVariableSet(ObjectNode n) {
		var Set<Variable> varset = new HashSet<Variable>();
		for (f: n.features) {
			varset.addAll(getElementVariableSet(f.value));
		}
		return varset;
	}
	
	def dispatch Set<Variable> getElementVariableSet(ListNode n) {
		var Set<Variable> varset = new HashSet<Variable>();
		for (e : n.values) {
		    varset.addAll(getElementVariableSet(e));
		}
		return varset;
	}
	
	def dispatch Set<Variable> getElementVariableSet(SelectNode n) {
		var Set<Variable> varset = new HashSet<Variable>();
		varset.add(n.object); 
		return varset;
	}		
	
	def dispatch Set<Variable> getElementVariableSet(BinaryNode n) {
		var Set<Variable> varset = new HashSet<Variable>();
		varset.addAll(getElementVariableSet(n.left));
		varset.addAll(getElementVariableSet(n.right)); 
		return varset;
	}
	
	def List<Element> getArithExpression(ListNode l) {
		var List<Element> templist = new ArrayList<Element>();
		for (e : l.values) {
		    templist.addAll(getArithExpression(e));	
		}
		return templist;
	}

	def dispatch List<Element> getArithExpression(Element e) {
		var List<Element> templist = new ArrayList<Element>();
		return templist;
	}
	
	def dispatch List<Element> getArithExpression(ObjectNode o) {
		var List<Element> templist = new ArrayList<Element>();
		for (f : o.features) {
		    templist.addAll(getArithExpression(f.value));	
		}
		return templist;
	}
	
	def dispatch List<Element> getArithExpression(BinaryNode o) {
		var List<Element> templist = new ArrayList<Element>();
        templist.add(o);
		return templist;
	}
	
	def dispatch List<Element> getArithExpression(UnaryNode o) {
		var List<Element> templist = new ArrayList<Element>();
        templist.add(o);
		return templist;
	}
	
	def dispatch List<Element> getArithExpression(IndirectReference o) {
		var List<Element> templist = new ArrayList<Element>();
        templist.addAll(getArithExpression(o.expression));
		return templist;
	}
	
	def isLocal(Variable v) {
		return !isProgram(v.eContainer);
	}
	
	def dispatch isProgram(EObject o) {
		return false
	}
	
	def dispatch isProgram(Program p) {
		return true
	}
	
	def dispatch isIndirect(Element e) {
		return false
	}
	
	def dispatch isIndirect(IndirectReference i ) {
		return true
	}
	
	def dispatch isConcat(Element e) {
		return false;
	}
	
	def dispatch isConcat(BinaryNode e) {
		return e.operation == BinOp::CONCATENATION;
	}    
	
	def quoteString(String s) {
		return quoteReplacement(s)
	}
	
	def isInt(String s) {
		try {
		    parseInt(s);
		    return true 
		}
		catch (NumberFormatException e) {
			return false
		}
	}
	
	def makeNumberList(Integer n) {
		var List<Integer> list = new ArrayList<Integer>(n);
		var i = 0;
		while ( i <= n) {
			list.add(i);
			i = i + 1
		}
		return list;
	}
	

}