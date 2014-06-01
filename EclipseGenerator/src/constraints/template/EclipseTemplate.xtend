package constraints.template

import constraints.EquationConstraint
import constraints.Operator
import constraints.UnOp
import constraints.Program
import constraints.Type
import constraints.Equation
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
    
    List<Type> objects

    Integer currentid
    
    Integer arraysize
    
    Integer objectSize
    
    String path
    
    String constraintVarName

    def setFile(String path) {this.path = path}

    override void doGenerate(Resource resource, IFileSystemAccess filesystem) {
    	for (EObject o : resource.contents) {
	            compile(o,filesystem)
	        }
    }

    def dispatch void compile(Program p, IFileSystemAccess filesystem) {
    	setBase(p);
    	objects = p.types.filter(telem | !telem.parameters.empty).toList;
    	currentid = 0;
    	//arraysize = ((p.variables.sortBy(v | v.number).last().number / (p.objectElements.size + 1)) + 1) * (p.objectElements.size + 1);
    	arraysize = p.variables.sortBy(v | v.number).last().number;
    	objectSize = p.objectElements.size + 1;
    	constraintVarName = p.types.findFirst(t | t.name.contains("ConstraintVar")).name;
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
:- lib(listut).
:- lib(ic_symbolic).
:- lib(lists).
:- local domain(basetype(«FOR t : p.types.filter(telem | telem.parameters.empty)»«type2eclipse(t)»,«ENDFOR»«IF !p.types.exists(telem | telem.name.equals('error'))»error,«ENDIF»oclundefined)).
«FOR t : objects»«typestruct2eclipse(t)»«ENDFOR»
:- local struct(error(message)).

:- local reference(ts).

:- op(500,fx,getindirect).
getindirect(V,W) :- getfeature(V,constraintvar,C), nonvar(C), C = «constraintVarName»{number:W}.

:- op(500,fxy,hastype).
«FOR o : p.objectElements »
hastype(V,«o»,T) :- N is getindirect V, typeof(N), getval(ts,Ts), O is N + «p.objectElements.indexOf(o) + 1», arg(O,Ts,T), T \= error.
«ENDFOR»
hastype(X,I,T) :- getfeature(X,I,T), nonvar(T).

hastype2(X,T) :- N is X, typeof(N), getval(ts,Ts), arg(N,Ts,T).

gettypesset(Res) :- dim(Best,[«arraysize»]) , setval(ts,Best), bb_min(typeall(Best,Count),Count,bb_options{strategy:restart,from:0,timeout:60}),dim(Res,[«arraysize»]),geterrormessages(Best,Res).

newtypeall(Count) :- (
               for(I,2,«arraysize»,7),
               fromto(0,In,Out,Count)
               do
               hastype2(I,X),
               cost(X,CostX),
               Out is In + CostX
               ).

typeall(Best,Count) :- (
               for(I,1,«arraysize»,«objectSize»),
               fromto(0,In,Out,Count),param(Count)
               do
               hastype2(I,X),
               cost(X,CostX),
               getval(ts,Ts),
               (
               foreach(O,[«FOR t : p.typeAttribute SEPARATOR ","»«t-1»«ENDFOR»]),param(Ts),fromto(0,InY,OutY,CostY),param(I)
               do
               IndexO is I + O,
               arg(IndexO,Ts,Y),
               cost(Y,CostZ),
               OutY is InY + CostZ
               ),
               Out is In + CostX + CostY,
               Out =< Count
               ).
               
typeall2(Ts) :- (
               for(I,1,«p.variables.sortBy(v | v.number).last().number»)
               do
               hastype2(I,_)
               ).

geterrormessages(In,Out) :- (for(I,1,«arraysize»),param(In),param(Out) do arg(I,In,X),(mod(I,«objectSize»,1)->((X=error,errormessage(I,M))->(arg(I,Out,error{message:M}));arg(I,Out,X));arg(I,Out,X))).

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

genPairs([],[]).
genPairs([A],[]).
genPairs([A,B|X],[(A,B)|Z]) :- genPairs([B|X],Z).

mylast(X,Y) :- last(Y,X).
             
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
compare2(L,R,_) :- ground(L),ground(R), L = «constraintVarName»{number:X}, R = «constraintVarName»{number:Y},hastype2(X,A), hastype2(Y,B), compare(A,B).
compare2(X, Y,_) :- X \= Y,
	functor(X, F, A),
	functor(Y, F, A),
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

«FOR c : p.constraints.filter(c | c.name == 'type').sortBy(c | ((c as EquationConstraint).equation.head.left as VariableReference).^var.number)»«constraintToEclipse((c as EquationConstraint))»«ENDFOR»
typeof(X) :- getval(ts,Ts),once (arg(X,Ts,error)).

«FOR c : p.constraints.filter(c | c.name == 'error').sortBy(c | ((c as EquationConstraint).equation.head.left as VariableReference).^var.number)»«errorToEclipse((c as EquationConstraint))»«ENDFOR»'''

    def type2eclipse(Type t) '''«identifier2eclipse(t.name)»'''

    def typestruct2eclipse(Type t) 
    '''
    :- local struct(«identifier2eclipse(t.name)»(«FOR p :  t.parameters SEPARATOR ","»«identifier2eclipse(p)»«ENDFOR»)).
    '''

    def operator2eclipse(Operator o) '''
    «o.name»(«simpleelement2eclipse(o.lhs)»,«simpleelement2eclipse(o.rhs)»)
    «IF o.constraints.size > 0»:-«FOR lc : o.constraints SEPARATOR ","»«localconstraint2eclipse(o.constraints.indexOf(lc),lc,o.name)»«ENDFOR»«IF o.lhs.name == o.rhs.name»,«simpleelement2eclipse(o.lhs)»\=«simpleelement2eclipse(o.rhs)»«ENDIF»«ENDIF».
    '''

    def makeError(Integer n) '''typeof(«n») :- getval(ts,Ts),once(arg(«n»,Ts,error)).
    '''

    def makeConditionalError(Integer n) '''typeof(«n») :- getval(ts,Ts), «IF ((n / objectSize)*objectSize)+1 != n»once(arg(«((n / objectSize)*objectSize)+1»,Ts,error)),«ENDIF»once(arg(«n»,Ts,error)).
    '''

    def constraintToEclipse(EquationConstraint c) '''
    typeof(«(c.equation.head.left as VariableReference).^var.number») :- getval(ts,Ts),«FOR e : c.equation SEPARATOR ","»«topequation2eclipse(e)»«ENDFOR»«IF !c.localconstraints.isEmpty»,«FOR lc : c.localconstraints SEPARATOR ","»«localconstraint2eclipse(c.localconstraints.indexOf(lc),lc,"widen")»«ENDFOR»«ENDIF».
    '''

    def errorToEclipse(EquationConstraint c) '''
    errormessage(«(c.equation.head.left as VariableReference).^var.number», Message) :- «FOR e : c.equation SEPARATOR ","»«toperror2eclipse(e)»«ENDFOR»«IF !c.localconstraints.isEmpty»,«FOR lc : c.localconstraints SEPARATOR ","»«localconstraint2eclipse(c.localconstraints.indexOf(lc),lc,"widen")»«ENDFOR»«ENDIF».
    '''

//    def dispatch topequation2eclipse(VariableEquality e) '''
//    «IF !base.variables.contains(e.left)»
//    :- «localvariablearg2eclipse(e.left,e.right)»
//    «ELSE»
//    «variable2eclipse(e.left)» :- «variablearg2eclipse(e.left,'T')»,«variablehastype2eclipse(e.right,'T')»«ENDIF»'''

//getval(ts,Ts),«IF !hasRightVarRef(e)»once (arg(«e.left.number»,Ts,«element2eclipse(new ArrayList(),e.right)»)«ELSE»arg(«e.left.number»,Ts,«element2eclipse(new ArrayList(),e.right)»«ENDIF»)
    def topequation2eclipse(Equation e)
    '''
    «IF !hasRightVarRef(e)»once (arg(«(e.left as VariableReference).^var.number»,Ts,«simpleelement2eclipse(e.right)»)«ELSE»arg(«(e.left as VariableReference).^var.number»,Ts,«simpleelement2eclipse(e.right)»«ENDIF»)
    '''
//getval(ts,Ts),«IF !hasRightVarRef(e)»once (arg(«e.left.number»,Ts,«element2eclipse(new ArrayList(),e.right)»)«ELSE»arg(«e.left.number»,Ts,«element2eclipse(new ArrayList(),e.right)»«ENDIF»)
    def  toperror2eclipse(Equation e)
    '''
    «IF !hasRightVarRef(e)»once (Message = «simpleelement2eclipse(e.right)»«ELSE»arg(«(e.left as VariableReference).^var.number»,Ts,«simpleelement2eclipse(e.right)»«ENDIF»)
    '''

    def variable2eclipse(Variable v)'''typeof(«v.number»)'''

    def linkvariable2eclipse(Variable v) '''hastype(«v.number»,V«v.number»)'''

    def variablehastype2eclipse(Variable myvar, String varname)'''hastype(«myvar.number»,«varname»)'''

    def variablearg2eclipse(Variable myvar, String varname) '''arg(«myvar.number»,Ts,«varname»)'''
       
    def dispatch simpleelement2eclipse(Element e) '''«e.eClass.name»'''

    def dispatch simpleelement2eclipse(Node e) '''«simplenode2eclipse(e)»'''

    def dispatch simpleelement2eclipse(VariableReference varref) '''«localvariable2eclipse(varref.^var)»'''

    def dispatch simplenode2eclipse(Node n) '''«n.eClass.name»'''

    def dispatch simplenode2eclipse(ObjectNode n) '''«identifier2eclipse(n.name)»«IF objects.exists(o | o.name == n.name) || (n.name.equalsIgnoreCase('error') && n.features.size > 0)»{«FOR f : n.features SEPARATOR ","»«simplefeature2eclipse(f)»«ENDFOR»}«ENDIF»'''

    def dispatch simplenode2eclipse(SelectNode n) '''getconstraint(«localvariable2eclipse(n.object)»,W«n.object.number»)'''

    def dispatch simplenode2eclipse(Literal l) '''«IF isInt(l.value)»«l.value»«ELSE»"«l.value.replaceAll('\"','\\\\\\\"')»"«ENDIF»'''

    def dispatch simplenode2eclipse(ListNode n) '''[«FOR v : n.values SEPARATOR ","»«simpleelement2eclipse(v)»«ENDFOR»]'''

    def simplefeature2eclipse(Feature f) '''«identifier2eclipse(f.name)»:«simpleelement2eclipse(f.value)»'''
    
//    def element2eclipse(Integer index, List<Element> list, Element e) '''«IF list.contains(e)»Temp«index»«list.indexOf(e)» «ELSE»«element2eclipse2(index,list,e)»«ENDIF»'''
//    
//    def dispatch element2eclipse2(Integer index,List<Element> list, Element e) '''«e.eClass.name»'''
//
//    def dispatch element2eclipse2(Integer index,List<Element> list, Node e) '''«node2eclipse(index,list,e)»'''
//
//    def dispatch element2eclipse2(Integer index,List<Element> list, VariableReference varref) '''(«localvariable2eclipse(varref.^var)» ='''
//
//    def dispatch node2eclipse(Integer index, List<Element> list, Node n) '''«n.eClass.name»'''
//
//    def dispatch node2eclipse(Integer index,List<Element> list, ObjectNode n) '''(«identifier2eclipse(n.name)»«IF objects.exists(o | o.name == n.name) || (n.name.equalsIgnoreCase('error') && n.features.size > 0)»{«FOR f : n.features SEPARATOR ","»«feature2eclipse(index,list,f)»«ENDFOR»}«ENDIF» = '''
//
//    def dispatch node2eclipse(Integer index,List<Element> list, SelectNode n) '''getconstraint(«localvariable2eclipse(n.object)»,W«n.object.number»,'''
//
//    def dispatch node2eclipse(Integer index,List<Element> list, Literal l) '''(«IF isInt(l.value)»«l.value»«ELSE»"«l.value.replaceAll('\"','\\\\\\\"')»"«ENDIF» = '''
//    
//    def dispatch node2eclipse(Integer index,List<Element> list, IndirectReference r)'''hastype(«element2eclipse(index,list,r.expression)»,«r.name», '''
//
//    def dispatch node2eclipse(Integer index,List<Element> list, UnaryNode e)'''«IF e.operator == UnOp::LENGTH»length(«element2eclipse(index,list,e.left)»,«ELSE»«IF e.operator == UnOp::LAST»mylast(«element2eclipse(index,list,e.left)»,«ELSE»«IF e.operator == UnOp::FIRST»nth0(0,«element2eclipse(index,list,e.left)»,«ELSE»flatten(«element2eclipse(index,list,e.left)»,«ENDIF»«ENDIF»«ENDIF»'''
//    
//    def dispatch node2eclipse(Integer index,List<Element> list, BinaryNode e)'''«operator2eclipse(e.operation)»(«element2eclipse(index,list,e.left)»,«element2eclipse(index,list,e.right)»,'''
//
//    def dispatch node2eclipse(Integer index,List<Element> list, ListNode n) '''([«FOR v : n.values SEPARATOR ","»«simpleelement2eclipse(v)»«ENDFOR»] = '''
//
//    def feature2eclipse(Integer index,List<Element> list, Feature f) '''«identifier2eclipse(f.name)»:«simpleelement2eclipse(f.value)»'''

    def dispatch identifier2eclipse(String i) '''«IF (!(i == null))»«IF i.contains(':')»«FOR n : i.split(':') SEPARATOR ':'»«n.toFirstLower()»«ENDFOR»«ELSE»«i.toFirstLower()»«ENDIF»«ENDIF»'''

    def dispatch identifier2eclipse(TypeFeature t) '''«t.name.head.toFirstLower()»:«t.type.toFirstLower()»'''

    def dispatch localconstraint2eclipse(Integer index, EquationConstraint c, String operator) '''«IF !c.equation.empty»«localequation2eclipse(index, c.equation.head, operator)»«ELSE»No Equation«ENDIF»'''

    def dispatch localconstraint2eclipse(Integer index, FoldConstraint c, String operator)
    '''
    («FOR co : c.containers SEPARATOR ","»«container2eclipse(co.container.head,co.variables)»«ENDFOR»
     «FOR v : getFoldParams(c)»,«variable2param(v)»«ENDFOR» 
     do 
     «FOR lc : c.localconstraints SEPARATOR ","»«localconstraint2eclipse(index, lc, operator)»«ENDFOR»)'''

    def container2eclipse(Element e, List<Variable> myvar) '''foreach(«IF myvar.size > 1»(«FOR variable : myvar SEPARATOR ","»«localvariable2eclipse(variable)»«ENDFOR»)«ELSE»«localvariable2eclipse(myvar.head)»«ENDIF»,«simpleelement2eclipse(e)»)'''

    def variable2param(Variable v) '''param(«localvariable2eclipse(v)»)'''

    //def dispatch localequation2eclipse(Integer index, Equation e, String operator) ''''''

    //def dispatch localequation2eclipse(Integer index, VariableEquality e, String operator) '''«localvariablearg2eclipse(e.right,e.left)»'''

    def localequation2eclipse(Integer index, Equation e, String operator) 
    {
    	var i = getNextId();
    	'''
      «newlocaleq2eclipse(index,e.left,"L"+i)»,«IF e.eIsSet(e.eClass.getEStructuralFeature("right"))»«newlocaleq2eclipse(index,e.right,"R"+i)»«ELSE»«"R"+i» = oclUndefined«ENDIF»,
      «IF (e.operation==ComparisonOperator::EQUAL)»
          compare(«"L"+i»,«"R"+i»)
      «ELSE»
          «IF (e.operation==ComparisonOperator::LESS_EQUAL)»
              «operator»(«"L"+i»,«"R"+i»)
          «ELSE»
              «IF (e.operation==ComparisonOperator::GREATER_EQUAL)»
                  «operator»(«"R"+i»,«"L"+i»)
              «ELSE»
                  «IF (e.operation==ComparisonOperator::NOT_EQUAL)»
                      not compare(«"L"+i»,«"R"+i»)
                  «ELSE»
                      member(«"L"+i»,«"R"+i»)
                  «ENDIF»
              «ENDIF»
          «ENDIF»
      «ENDIF»
      '''
    }
    
    def dispatch newlocaleq2eclipse(Integer index, Variable e, String varname) '''«varname» = «localvariable2eclipse(e)»'''
    
    def dispatch newlocaleq2eclipse(Integer index, EObject e, String varname) ''''''
    
    def dispatch newlocaleq2eclipse(Integer index, VariableReference e, String varname) '''«varname» = «localvariable2eclipse(e.^var)»'''
    
    def dispatch newlocaleq2eclipse(Integer index, ObjectNode n, String varname) '''«varname» = «identifier2eclipse(n.name)»«IF objects.exists(o | o.name == n.name) || (n.name.equalsIgnoreCase('error') && n.features.size > 0)»{«FOR f : n.features SEPARATOR ","»«simplefeature2eclipse(f)»«ENDFOR»}«ENDIF»'''
    
    def dispatch newlocaleq2eclipse(Integer index, SelectNode n, String varname) '''getconstraint(«localvariable2eclipse(n.object)»,«varname»'''
    
    def dispatch newlocaleq2eclipse(Integer index, Literal l, String varname) '''«varname» = «IF isInt(l.value)»«l.value»«ELSE»"«l.value.replaceAll('\"','\\\\\\\"')»"«ENDIF»'''
    
    def dispatch newlocaleq2eclipse(Integer index, IndirectReference r, String varname)'''«newlocaleq2eclipse(index,r.expression,varname + "1")»,hastype(«varname + "1"»,«r.name»,«varname»)'''

    def dispatch newlocaleq2eclipse(Integer index, UnaryNode e, String varname)'''«newlocaleq2eclipse(index,e.left,varname + "1")»,«IF e.operator == UnOp::LENGTH»length(«varname + "1"»«ELSE»«IF e.operator == UnOp::LAST»mylast(«varname + "1"»«ELSE»«IF e.operator == UnOp::FIRST»nth0(0,«varname + "1"»«ELSE»«IF e.operator == UnOp::FLATTEN»flatten(«varname + "1"»«ELSE»genPairs(«varname + "1"»«ENDIF»«ENDIF»«ENDIF»«ENDIF»,«varname»)'''
    
    def dispatch newlocaleq2eclipse(Integer index, BinaryNode e, String varname)'''«newlocaleq2eclipse(index,e.left,varname + "l")»,«newlocaleq2eclipse(index,e.right,varname + "r")»,«operator2eclipse(e.operation)»(«varname + "l"»,«varname + "r"»,«varname»)'''

    def dispatch newlocaleq2eclipse(Integer index, ListNode n, String varname) '''«varname» = [«FOR v : n.values SEPARATOR ","»«simpleelement2eclipse(v)»«ENDFOR»]'''

    def feature2eclipse(Integer index,List<Element> list, Feature f) '''«identifier2eclipse(f.name)»:«simpleelement2eclipse(f.value)»'''    
   // def dispatch initTemp(Integer index, String i, Void o) '''«i» = oclUndefined'''
//    def dispatch initTemp(Integer index, String i, Element elem) '''«FOR e : getArithExpression(elem)»«initTempVar(index,getArithExpression(elem).indexOf(e),getArithExpression(elem),e)»,«ENDFOR»«IF isIndirect(elem)»«i» is «element2eclipse(index,getArithExpression(elem),elem)»«ELSE»«IF isConcat(elem)»«makeConcat(i,elem as BinaryNode)»«ELSE»«i» = «element2eclipse(index,getArithExpression(elem),elem)»«ENDIF»«ENDIF»''' 
    //def dispatch initTemp(Integer index, String i, Element elem) '''«FOR e : getArithExpression(elem)»«initTempVar(index,getArithExpression(elem).indexOf(e),getArithExpression(elem),e)»,«ENDFOR»«element2eclipse(index,getArithExpression(elem),elem)» «i»)''' 
    
    //def dispatch initTemp(Integer index, String i, Variable myvar) '''«IF base.variables.contains(myvar)»once(hastype2(«myvar.number»,«i» )) «ELSE»«i» = «localvariable2eclipse(myvar)»«ENDIF»'''
    
    //def initTempVar(Integer index, Integer i,List<Element> list, Element elem) '''Temp«index»«i» «IF list.indexOf(elem) == i»is «element2eclipse2(index,list,elem)»«ELSE»= Temp«index»«list.indexOf(elem)»«ENDIF» '''
    
    //def initTempVar(Integer index, Integer i,List<Element> list, Element elem) '''«element2eclipse2(index,list,elem)»Temp«index»«i»)'''
    
//    def dispatch localequation2eclipse(List<Element> list, Variable left, Program p, Element right) '''once «element2eclipse(0,list,right)» is hastype «left.number»'''
//    
//    def dispatch localequation2eclipse(List<Element> list, Variable left, Constraint c, VariableReference right) '''«IF isLocal(right.^var)»compare(«localvariable2eclipse(left)»,«localvariable2eclipse(right.^var)»)«ELSE»«localvariable2eclipse(left)» is  hastype «right.^var.number»«ENDIF»''' 

    //def dispatch localequation2eclipse(List<Element> list, Variable left, Constraint c, IndirectReference right) '''getconstraint(«localvariable2eclipse((right.expression as VariableReference).^var)»,W«(right.expression as VariableReference).^var.number»), Y«(right.expression as VariableReference).^var.number» is W«(right.expression as VariableReference).^var.number» + «base.objectElements.indexOf(right.name.name) + 1»,hastype(Y«(right.expression as VariableReference).^var.number»,Ts,«localvariable2eclipse(left)»)''' 
    
//    def dispatch localequation2eclipse(List<Element> list, Variable left, Constraint c, IndirectReference right) '''hastype «localvariable2eclipse((right.expression as VariableReference).^var)» «right.name» '''
//    	
// 
//    def dispatch localequation2eclipse(List<Element> list, Variable left, Constraint c, Element right) '''«element2eclipse(0,list,right)»'''
//    
//    def dispatch localequation2eclipse(List<Element> list, Variable left, Operator o, Element right) '''«element2eclipse(0,list,right)»'''

    def localvariablearg2eclipse(Variable myvar, Variable localvar) '''hastype2(«myvar.number»,«localvariable2eclipse(localvar)»)'''	
// (myvar.eContainer.eClass.name.equalsIgnoreCase("Generator"))
    def localvariable2eclipse(Variable myvar) '''«IF ((myvar.references.size > 1) || ((myvar.eContainer.eClass.name.equalsIgnoreCase("Generator")) && (myvar.references.size > 0)))»V«myvar.number»«ELSE»_«ENDIF»'''

    def makeTemp(String n, Variable myvar) '''«n»«myvar.number»'''

//    def makeConcat(String i, BinaryNode b) '''append(«element2eclipse(0,getArithExpression(b.left),b.left)»,«element2eclipse(0,getArithExpression(b.right),b.right)»,«i»)'''
    
    def operator2eclipse(BinOp o) {
    	switch o {
    	    case BinOp::ADDITION : '+'
    	    case BinOp::SUBTRACTION : '-'
    	    case BinOp::PROJECTION : '.'
    	    case BinOp::CONCATENATION : 'union'
//    	    case BinOp::Multiplication : '*'
    	    default : o.toString()
    	}
    	
    }

    def hasRightVarRef(Equation e) {
    	isVariableReference(e.right)
    }
    
    def dispatch isVariableReference(VariableReference e) {
    	true
    }
    
    def dispatch isVariableReference(Element e) {
    	false
    }

	def getFoldParams(FoldConstraint c) {
		var Set<Variable> varset = new HashSet<Variable>();
		for(localE: c.localconstraints) {
			varset.addAll(getVariableSet(localE));
		}
		var result = new HashSet<Variable>();
		for(localV: varset.filter(v | !c.localvariables.exists(lv | lv.number == v.number) && !c.containers.exists(g | g.variables.exists(lv | lv.number == v.number)))) {
			result.add(localV);
		}
		return result;
	}

	def dispatch getVariableSet(EquationConstraint c) {
		var Set<Variable> varset = new HashSet<Variable>();
		for (Eq : c.equation) {
		    varset.addAll(getEquationVariableSet(Eq));
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
	
	def dispatch getVariableSet(FoldConstraint c) {
		var Set<Variable> varset = new HashSet<Variable>();
		for(localG: c.containers) {
			for(container : localG.container) {
			    varset.addAll(getElementVariableSet(container));
			}
		}
		for(localE: c.localconstraints) {
			varset.addAll(getVariableSet(localE));
		}
		var result = new HashSet<Variable>();
		for(localV: varset.filter(v | !c.localvariables.exists(lv | lv.number == v.number) && !c.containers.exists(g | g.variables.exists(lv | lv.number == v.number)))) {
			result.add(localV);
		}
		return result;
	}
	
	def getEquationVariableSet(Equation e) {
		var Set<Variable> varset = new HashSet<Variable>();
		varset.addAll(getElementVariableSet(e.left));
		varset.addAll(getElementVariableSet(e.right));
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

	def dispatch Set<Variable> getElementVariableSet(UnaryNode n) {
		var Set<Variable> varset = new HashSet<Variable>();
		varset.addAll(getElementVariableSet(n.left));
		return varset;
	}

	def dispatch Set<Variable> getElementVariableSet(IndirectReference n) {
		var Set<Variable> varset = new HashSet<Variable>();
		varset.addAll(getElementVariableSet(n.expression));
		return varset;
	}
	
	def dispatch Boolean isSimple(ListNode l) {return false;}
	
	def dispatch Boolean isSimple(ObjectNode l) {return false;}
	
	def dispatch Boolean isSimple(BinaryNode l) {return false;}
	
//	def dispatch List<Element> getArithExpression(ListNode l) {
//		var List<Element> templist = new ArrayList<Element>();
//		for (e : l.values) {
//		    templist.addAll(getArithExpression(e));	
//		}
//		return templist;
//	}
//
//	def dispatch List<Element> getArithExpression(Element e) {
//		var List<Element> templist = new ArrayList<Element>();
//		return templist;
//	}
//	
//	def dispatch List<Element> getArithExpression(ObjectNode o) {
//		var List<Element> templist = new ArrayList<Element>();
//		for (f : o.features) {
//		    templist.addAll(getArithExpression(f.value));	
//		}
//		return templist;
//	}
//	
//	def dispatch List<Element> getArithExpression(BinaryNode o) {
//		var List<Element> templist = new ArrayList<Element>();
//        templist.add(o);
//		return templist;
//	}
//	
//	def dispatch List<Element> getArithExpression(UnaryNode o) {
//		var List<Element> templist = new ArrayList<Element>();
//        templist.add(o);
//		return templist;
//	}
//	
//	def dispatch List<Element> getArithExpression(IndirectReference o) {
//		var List<Element> templist = new ArrayList<Element>();
//		templist.add(o);
//        templist.addAll(getArithExpression(o.expression));
//		return templist;
//	}
//	
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