package constraints.template;

import com.google.common.base.Objects;
import constraints.BinOp;
import constraints.BinaryNode;
import constraints.ComparisonOperator;
import constraints.Constraint;
import constraints.Element;
import constraints.Equation;
import constraints.EquationConstraint;
import constraints.Feature;
import constraints.FoldConstraint;
import constraints.Generator;
import constraints.IndirectReference;
import constraints.ListNode;
import constraints.Literal;
import constraints.Node;
import constraints.ObjectNode;
import constraints.Operator;
import constraints.Program;
import constraints.SelectNode;
import constraints.Type;
import constraints.TypeFeature;
import constraints.UnOp;
import constraints.UnaryNode;
import constraints.Variable;
import constraints.VariableReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class EclipseTemplate implements IGenerator {
  private Program base;
  
  private List<Type> objects;
  
  private Integer currentid;
  
  private Integer arraysize;
  
  private Integer objectSize;
  
  private String path;
  
  private String constraintVarName;
  
  public String setFile(final String path) {
    return this.path = path;
  }
  
  public void doGenerate(final Resource resource, final IFileSystemAccess filesystem) {
    EList<EObject> _contents = resource.getContents();
    for (final EObject o : _contents) {
      this.compile(o, filesystem);
    }
  }
  
  protected void _compile(final Program p, final IFileSystemAccess filesystem) {
    this.setBase(p);
    EList<Type> _types = p.getTypes();
    final Function1<Type,Boolean> _function = new Function1<Type,Boolean>() {
      public Boolean apply(final Type telem) {
        EList<String> _parameters = telem.getParameters();
        boolean _isEmpty = _parameters.isEmpty();
        return Boolean.valueOf((!_isEmpty));
      }
    };
    Iterable<Type> _filter = IterableExtensions.<Type>filter(_types, _function);
    List<Type> _list = IterableExtensions.<Type>toList(_filter);
    this.objects = _list;
    this.currentid = Integer.valueOf(0);
    EList<Variable> _variables = p.getVariables();
    final Function1<Variable,Integer> _function_1 = new Function1<Variable,Integer>() {
      public Integer apply(final Variable v) {
        return Integer.valueOf(v.getNumber());
      }
    };
    List<Variable> _sortBy = IterableExtensions.<Variable, Integer>sortBy(_variables, _function_1);
    Variable _last = IterableExtensions.<Variable>last(_sortBy);
    int _number = _last.getNumber();
    this.arraysize = Integer.valueOf(_number);
    EList<String> _objectElements = p.getObjectElements();
    int _size = _objectElements.size();
    int _plus = (_size + 1);
    this.objectSize = Integer.valueOf(_plus);
    EList<Type> _types_1 = p.getTypes();
    final Function1<Type,Boolean> _function_2 = new Function1<Type,Boolean>() {
      public Boolean apply(final Type t) {
        String _name = t.getName();
        return Boolean.valueOf(_name.contains("ConstraintVar"));
      }
    };
    Type _findFirst = IterableExtensions.<Type>findFirst(_types_1, _function_2);
    String _name = _findFirst.getName();
    this.constraintVarName = _name;
    CharSequence _eclipseProgram = this.toEclipseProgram(p);
    filesystem.generateFile("out.ecl", _eclipseProgram);
  }
  
  protected void _compile(final EObject e, final IFileSystemAccess filesystem) {
  }
  
  public Program setBase(final Program p) {
    return this.base = p;
  }
  
  public Integer getNextId() {
    this.currentid = Integer.valueOf(((this.currentid).intValue() + 1));
    return this.currentid;
  }
  
  public CharSequence toEclipseProgram(final Program p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(":- pragma(expand).");
    _builder.newLine();
    _builder.append(":- lib(branch_and_bound).");
    _builder.newLine();
    _builder.append(":- lib(propia).");
    _builder.newLine();
    _builder.append(":- lib(listut).");
    _builder.newLine();
    _builder.append(":- lib(ic_symbolic).");
    _builder.newLine();
    _builder.append(":- lib(lists).");
    _builder.newLine();
    _builder.append(":- local domain(basetype(");
    {
      EList<Type> _types = p.getTypes();
      final Function1<Type,Boolean> _function = new Function1<Type,Boolean>() {
        public Boolean apply(final Type telem) {
          EList<String> _parameters = telem.getParameters();
          return Boolean.valueOf(_parameters.isEmpty());
        }
      };
      Iterable<Type> _filter = IterableExtensions.<Type>filter(_types, _function);
      for(final Type t : _filter) {
        CharSequence _type2eclipse = this.type2eclipse(t);
        _builder.append(_type2eclipse, "");
        _builder.append(",");
      }
    }
    {
      EList<Type> _types_1 = p.getTypes();
      final Function1<Type,Boolean> _function_1 = new Function1<Type,Boolean>() {
        public Boolean apply(final Type telem) {
          String _name = telem.getName();
          return Boolean.valueOf(_name.equals("error"));
        }
      };
      boolean _exists = IterableExtensions.<Type>exists(_types_1, _function_1);
      boolean _not = (!_exists);
      if (_not) {
        _builder.append("error,");
      }
    }
    _builder.append("oclundefined)).");
    _builder.newLineIfNotEmpty();
    {
      for(final Type t_1 : this.objects) {
        CharSequence _typestruct2eclipse = this.typestruct2eclipse(t_1);
        _builder.append(_typestruct2eclipse, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append(":- local struct(error(message)).");
    _builder.newLine();
    _builder.newLine();
    _builder.append(":- local reference(ts).");
    _builder.newLine();
    _builder.newLine();
    _builder.append(":- op(500,fx,getindirect).");
    _builder.newLine();
    _builder.append("getindirect(V,W) :- getfeature(V,constraintvar,C), nonvar(C), C = ");
    _builder.append(this.constraintVarName, "");
    _builder.append("{number:W}.");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(":- op(500,fxy,hastype).");
    _builder.newLine();
    {
      EList<String> _objectElements = p.getObjectElements();
      for(final String o : _objectElements) {
        _builder.append("hastype(V,");
        _builder.append(o, "");
        _builder.append(",T) :- N is getindirect V, typeof(N), getval(ts,Ts), O is N + ");
        EList<String> _objectElements_1 = p.getObjectElements();
        int _indexOf = _objectElements_1.indexOf(o);
        int _plus = (_indexOf + 1);
        _builder.append(_plus, "");
        _builder.append(", arg(O,Ts,T), T \\= error.");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("hastype(X,I,T) :- getfeature(X,I,T), nonvar(T).");
    _builder.newLine();
    _builder.newLine();
    _builder.append("hastype2(X,T) :- N is X, typeof(N), getval(ts,Ts), arg(N,Ts,T).");
    _builder.newLine();
    _builder.newLine();
    _builder.append("gettypesset(Res) :- dim(Best,[");
    _builder.append(this.arraysize, "");
    _builder.append("]) , setval(ts,Best), bb_min(typeall(Best,Count),Count,bb_options{strategy:restart,from:0,timeout:60}),dim(Res,[");
    _builder.append(this.arraysize, "");
    _builder.append("]),geterrormessages(Best,Res).");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("newtypeall(Count) :- (");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("for(I,2,");
    _builder.append(this.arraysize, "               ");
    _builder.append(",7),");
    _builder.newLineIfNotEmpty();
    _builder.append("               ");
    _builder.append("fromto(0,In,Out,Count)");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("do");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("hastype2(I,X),");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("cost(X,CostX),");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("Out is In + CostX");
    _builder.newLine();
    _builder.append("               ");
    _builder.append(").");
    _builder.newLine();
    _builder.newLine();
    _builder.append("typeall(Best,Count) :- (");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("for(I,1,");
    _builder.append(this.arraysize, "               ");
    _builder.append(",");
    _builder.append(this.objectSize, "               ");
    _builder.append("),");
    _builder.newLineIfNotEmpty();
    _builder.append("               ");
    _builder.append("fromto(0,In,Out,Count),param(Count)");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("do");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("hastype2(I,X),");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("cost(X,CostX),");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("getval(ts,Ts),");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("(");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("foreach(O,[");
    {
      EList<Integer> _typeAttribute = p.getTypeAttribute();
      boolean _hasElements = false;
      for(final Integer t_2 : _typeAttribute) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "               ");
        }
        _builder.append(((t_2).intValue() - 1), "               ");
      }
    }
    _builder.append("]),param(Ts),fromto(0,InY,OutY,CostY),param(I)");
    _builder.newLineIfNotEmpty();
    _builder.append("               ");
    _builder.append("do");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("IndexO is I + O,");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("arg(IndexO,Ts,Y),");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("cost(Y,CostZ),");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("OutY is InY + CostZ");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("),");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("Out is In + CostX + CostY,");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("Out =< Count");
    _builder.newLine();
    _builder.append("               ");
    _builder.append(").");
    _builder.newLine();
    _builder.append("               ");
    _builder.newLine();
    _builder.append("typeall2(Ts) :- (");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("for(I,1,");
    EList<Variable> _variables = p.getVariables();
    final Function1<Variable,Integer> _function_2 = new Function1<Variable,Integer>() {
      public Integer apply(final Variable v) {
        return Integer.valueOf(v.getNumber());
      }
    };
    List<Variable> _sortBy = IterableExtensions.<Variable, Integer>sortBy(_variables, _function_2);
    Variable _last = IterableExtensions.<Variable>last(_sortBy);
    int _number = _last.getNumber();
    _builder.append(_number, "               ");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("               ");
    _builder.append("do");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("hastype2(I,_)");
    _builder.newLine();
    _builder.append("               ");
    _builder.append(").");
    _builder.newLine();
    _builder.newLine();
    _builder.append("geterrormessages(In,Out) :- (for(I,1,");
    _builder.append(this.arraysize, "");
    _builder.append("),param(In),param(Out) do arg(I,In,X),(mod(I,");
    _builder.append(this.objectSize, "");
    _builder.append(",1)->((X=error,errormessage(I,M))->(arg(I,Out,error{message:M}));arg(I,Out,X));arg(I,Out,X))).");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("getfeature(X,Feature,Y) :- compound(X),");
    _builder.newLine();
    _builder.append("                      ");
    _builder.append("functor(X,Name,_),");
    _builder.newLine();
    _builder.append("                      ");
    _builder.append("current_struct(Name,Spec),");
    _builder.newLine();
    _builder.append("                      ");
    _builder.append("functor(Spec,_,_),");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("(foreacharg(F,Spec),");
    _builder.newLine();
    _builder.append("                     ");
    _builder.append("foreacharg(E,X),");
    _builder.newLine();
    _builder.append("                     ");
    _builder.append("param(Y),");
    _builder.newLine();
    _builder.append("                     ");
    _builder.append("param(Feature)");
    _builder.newLine();
    _builder.append("                     ");
    _builder.append("do");
    _builder.newLine();
    _builder.append("                      ");
    _builder.append("functor(F,Name,ArityF),");
    _builder.newLine();
    _builder.append("                      ");
    _builder.append("(Name = Feature ->");
    _builder.newLine();
    _builder.append("                       ");
    _builder.append("Y = E");
    _builder.newLine();
    _builder.append("                       ");
    _builder.append(";");
    _builder.newLine();
    _builder.append("                      ");
    _builder.append("((ArityF > 1, nonvar(E))->");
    _builder.newLine();
    _builder.append("                       ");
    _builder.append("getfeature(E,Feature,Y)");
    _builder.newLine();
    _builder.append("                       ");
    _builder.append(";");
    _builder.newLine();
    _builder.append("                       ");
    _builder.append("true");
    _builder.newLine();
    _builder.append("                      ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("                      ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append(").");
    _builder.newLine();
    _builder.newLine();
    _builder.append("genPairs([],[]).");
    _builder.newLine();
    _builder.append("genPairs([A],[]).");
    _builder.newLine();
    _builder.append("genPairs([A,B|X],[(A,B)|Z]) :- genPairs([B|X],Z).");
    _builder.newLine();
    _builder.newLine();
    _builder.append("mylast(X,Y) :- last(Y,X).");
    _builder.newLine();
    _builder.append("             ");
    _builder.newLine();
    _builder.append(":- op(500,fx, widen).");
    _builder.newLine();
    _builder.append("widen(X,X).");
    _builder.newLine();
    _builder.append("widen(X,Y) :- X \\= Y, compare(X,Y).");
    _builder.newLine();
    _builder.append("widen(X,Y) :- widenbasic(X,Y).");
    _builder.newLine();
    _builder.append("widen(X,Y) :- widenbasic(Z,Y), widen(X,Z), X \\= Z.");
    _builder.newLine();
    {
      EList<Operator> _operators = p.getOperators();
      for(final Operator o_1 : _operators) {
        CharSequence _operator2eclipse = this.operator2eclipse(o_1);
        _builder.append(_operator2eclipse, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("cost(error,CostX) :- CostX = 100000000.");
    _builder.newLine();
    _builder.append("cost(X,CostX) :- X \\= error, not strategybasic(_,X), CostX = 1.");
    _builder.newLine();
    _builder.append("cost(X,CostX) :- nonvar(X), strategybasic(Y,X), cost(Y,CostY), CostX is 10 * CostY.");
    _builder.newLine();
    _builder.newLine();
    _builder.append("compare(X,Y) :- compare2(X,Y,_).");
    _builder.newLine();
    _builder.append("compare2(X,Y,_) :- once(X = Y).");
    _builder.newLine();
    _builder.append("compare2(L,R,_) :- ground(L),ground(R), L = ");
    _builder.append(this.constraintVarName, "");
    _builder.append("{number:X}, R = ");
    _builder.append(this.constraintVarName, "");
    _builder.append("{number:Y},hastype2(X,A), hastype2(Y,B), compare(A,B).");
    _builder.newLineIfNotEmpty();
    _builder.append("compare2(X, Y,_) :- X \\= Y,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("functor(X, F, A),");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("functor(Y, F, A),");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("( for(I,1,A), param(X,Y) do");
    _builder.newLine();
    _builder.append("\t     ");
    _builder.append("arg(I, X, XI),");
    _builder.newLine();
    _builder.append("\t     ");
    _builder.append("arg(I, Y, YI),");
    _builder.newLine();
    _builder.append("\t     ");
    _builder.append("once(compare(XI, YI))\t% unify argument I");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(").");
    _builder.newLine();
    _builder.append("compare2(X, Y,left) :- X \\= Y,");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("type_of(X,compound),");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("type_of(Y,compound),");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("functor(X, F1, _),");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("functor(Y, F2, _),");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("F1 \\= F2,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("atom(F1),");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("atom(F2),");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("current_struct(F1,S1),");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("(foreacharg(A,S1), foreacharg(V,X),fromto(Supers,Out,In,[]) do");
    _builder.newLine();
    _builder.append("\t   ");
    _builder.append("functor(A,AN,_),");
    _builder.newLine();
    _builder.append("\t   ");
    _builder.append("((AN=(:))->");
    _builder.newLine();
    _builder.append("\t   \t");
    _builder.append("arg(2,A,S),");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("((current_struct(S,_),nonvar(V))->");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("Out = [V|In]");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append(";");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("Out = In");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append(";");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("Out = In");
    _builder.newLine();
    _builder.append("\t   ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("),");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("member(Super,Supers),");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("compare2(Super,Y,left).");
    _builder.newLine();
    _builder.append("compare2(Y, X,right) :- X \\= Y,");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("type_of(X,compound),");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("type_of(Y,compound),");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("functor(X, F1, _),");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("functor(Y, F2, _),");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("F1 \\= F2,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("current_struct(F1,S1),");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("(foreacharg(A,S1), foreacharg(V,X),fromto(Supers,Out,In,[]) do");
    _builder.newLine();
    _builder.append("\t   ");
    _builder.append("functor(A,AN,_),");
    _builder.newLine();
    _builder.append("\t   ");
    _builder.append("((AN=(:))->");
    _builder.newLine();
    _builder.append("\t   \t");
    _builder.append("arg(2,A,S),");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("((current_struct(S,_),nonvar(V))->");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("Out = [V|In]");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append(";");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("Out = In");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append(";");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("Out = In");
    _builder.newLine();
    _builder.append("\t   ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("),");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("member(Super,Supers),");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("compare2(Y,Super,right).");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Constraint> _constraints = p.getConstraints();
      final Function1<Constraint,Boolean> _function_3 = new Function1<Constraint,Boolean>() {
        public Boolean apply(final Constraint c) {
          String _name = c.getName();
          return Boolean.valueOf(Objects.equal(_name, "type"));
        }
      };
      Iterable<Constraint> _filter_1 = IterableExtensions.<Constraint>filter(_constraints, _function_3);
      final Function1<Constraint,Integer> _function_4 = new Function1<Constraint,Integer>() {
        public Integer apply(final Constraint c) {
          EList<Equation> _equation = ((EquationConstraint) c).getEquation();
          Equation _head = IterableExtensions.<Equation>head(_equation);
          Node _left = _head.getLeft();
          Variable _var = ((VariableReference) _left).getVar();
          return Integer.valueOf(_var.getNumber());
        }
      };
      List<Constraint> _sortBy_1 = IterableExtensions.<Constraint, Integer>sortBy(_filter_1, _function_4);
      for(final Constraint c : _sortBy_1) {
        CharSequence _constraintToEclipse = this.constraintToEclipse(((EquationConstraint) c));
        _builder.append(_constraintToEclipse, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("typeof(X) :- getval(ts,Ts),once (arg(X,Ts,error)).");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Constraint> _constraints_1 = p.getConstraints();
      final Function1<Constraint,Boolean> _function_5 = new Function1<Constraint,Boolean>() {
        public Boolean apply(final Constraint c) {
          String _name = c.getName();
          return Boolean.valueOf(Objects.equal(_name, "error"));
        }
      };
      Iterable<Constraint> _filter_2 = IterableExtensions.<Constraint>filter(_constraints_1, _function_5);
      final Function1<Constraint,Integer> _function_6 = new Function1<Constraint,Integer>() {
        public Integer apply(final Constraint c) {
          EList<Equation> _equation = ((EquationConstraint) c).getEquation();
          Equation _head = IterableExtensions.<Equation>head(_equation);
          Node _left = _head.getLeft();
          Variable _var = ((VariableReference) _left).getVar();
          return Integer.valueOf(_var.getNumber());
        }
      };
      List<Constraint> _sortBy_2 = IterableExtensions.<Constraint, Integer>sortBy(_filter_2, _function_6);
      for(final Constraint c_1 : _sortBy_2) {
        CharSequence _errorToEclipse = this.errorToEclipse(((EquationConstraint) c_1));
        _builder.append(_errorToEclipse, "");
      }
    }
    return _builder;
  }
  
  public CharSequence type2eclipse(final Type t) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = t.getName();
    CharSequence _identifier2eclipse = this.identifier2eclipse(_name);
    _builder.append(_identifier2eclipse, "");
    return _builder;
  }
  
  public CharSequence typestruct2eclipse(final Type t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(":- local struct(");
    String _name = t.getName();
    CharSequence _identifier2eclipse = this.identifier2eclipse(_name);
    _builder.append(_identifier2eclipse, "");
    _builder.append("(");
    {
      EList<String> _parameters = t.getParameters();
      boolean _hasElements = false;
      for(final String p : _parameters) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        CharSequence _identifier2eclipse_1 = this.identifier2eclipse(p);
        _builder.append(_identifier2eclipse_1, "");
      }
    }
    _builder.append(")).");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence operator2eclipse(final Operator o) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = o.getName();
    _builder.append(_name, "");
    _builder.append("(");
    Element _lhs = o.getLhs();
    CharSequence _simpleelement2eclipse = this.simpleelement2eclipse(_lhs);
    _builder.append(_simpleelement2eclipse, "");
    _builder.append(",");
    Element _rhs = o.getRhs();
    CharSequence _simpleelement2eclipse_1 = this.simpleelement2eclipse(_rhs);
    _builder.append(_simpleelement2eclipse_1, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    {
      EList<Constraint> _constraints = o.getConstraints();
      int _size = _constraints.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append(":-");
        {
          EList<Constraint> _constraints_1 = o.getConstraints();
          boolean _hasElements = false;
          for(final Constraint lc : _constraints_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            EList<Constraint> _constraints_2 = o.getConstraints();
            int _indexOf = _constraints_2.indexOf(lc);
            String _name_1 = o.getName();
            CharSequence _localconstraint2eclipse = this.localconstraint2eclipse(Integer.valueOf(_indexOf), lc, _name_1);
            _builder.append(_localconstraint2eclipse, "");
          }
        }
        {
          Element _lhs_1 = o.getLhs();
          String _name_2 = _lhs_1.getName();
          Element _rhs_1 = o.getRhs();
          String _name_3 = _rhs_1.getName();
          boolean _equals = Objects.equal(_name_2, _name_3);
          if (_equals) {
            _builder.append(",");
            Element _lhs_2 = o.getLhs();
            CharSequence _simpleelement2eclipse_2 = this.simpleelement2eclipse(_lhs_2);
            _builder.append(_simpleelement2eclipse_2, "");
            _builder.append("\\=");
            Element _rhs_2 = o.getRhs();
            CharSequence _simpleelement2eclipse_3 = this.simpleelement2eclipse(_rhs_2);
            _builder.append(_simpleelement2eclipse_3, "");
          }
        }
      }
    }
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence makeError(final Integer n) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("typeof(");
    _builder.append(n, "");
    _builder.append(") :- getval(ts,Ts),once(arg(");
    _builder.append(n, "");
    _builder.append(",Ts,error)).");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence makeConditionalError(final Integer n) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("typeof(");
    _builder.append(n, "");
    _builder.append(") :- getval(ts,Ts), ");
    {
      if ((((((n).intValue() / (this.objectSize).intValue()) * (this.objectSize).intValue()) + 1) != (n).intValue())) {
        _builder.append("once(arg(");
        _builder.append(((((n).intValue() / (this.objectSize).intValue()) * (this.objectSize).intValue()) + 1), "");
        _builder.append(",Ts,error)),");
      }
    }
    _builder.append("once(arg(");
    _builder.append(n, "");
    _builder.append(",Ts,error)).");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence constraintToEclipse(final EquationConstraint c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("typeof(");
    EList<Equation> _equation = c.getEquation();
    Equation _head = IterableExtensions.<Equation>head(_equation);
    Node _left = _head.getLeft();
    Variable _var = ((VariableReference) _left).getVar();
    int _number = _var.getNumber();
    _builder.append(_number, "");
    _builder.append(") :- getval(ts,Ts),");
    {
      EList<Equation> _equation_1 = c.getEquation();
      boolean _hasElements = false;
      for(final Equation e : _equation_1) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        CharSequence _pequation2eclipse = this.topequation2eclipse(e);
        _builder.append(_pequation2eclipse, "");
      }
    }
    {
      EList<Constraint> _localconstraints = c.getLocalconstraints();
      boolean _isEmpty = _localconstraints.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(",");
        {
          EList<Constraint> _localconstraints_1 = c.getLocalconstraints();
          boolean _hasElements_1 = false;
          for(final Constraint lc : _localconstraints_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            EList<Constraint> _localconstraints_2 = c.getLocalconstraints();
            int _indexOf = _localconstraints_2.indexOf(lc);
            CharSequence _localconstraint2eclipse = this.localconstraint2eclipse(Integer.valueOf(_indexOf), lc, "widen");
            _builder.append(_localconstraint2eclipse, "");
          }
        }
      }
    }
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence errorToEclipse(final EquationConstraint c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("errormessage(");
    EList<Equation> _equation = c.getEquation();
    Equation _head = IterableExtensions.<Equation>head(_equation);
    Node _left = _head.getLeft();
    Variable _var = ((VariableReference) _left).getVar();
    int _number = _var.getNumber();
    _builder.append(_number, "");
    _builder.append(", Message) :- ");
    {
      EList<Equation> _equation_1 = c.getEquation();
      boolean _hasElements = false;
      for(final Equation e : _equation_1) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        CharSequence _perror2eclipse = this.toperror2eclipse(e);
        _builder.append(_perror2eclipse, "");
      }
    }
    {
      EList<Constraint> _localconstraints = c.getLocalconstraints();
      boolean _isEmpty = _localconstraints.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(",");
        {
          EList<Constraint> _localconstraints_1 = c.getLocalconstraints();
          boolean _hasElements_1 = false;
          for(final Constraint lc : _localconstraints_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            EList<Constraint> _localconstraints_2 = c.getLocalconstraints();
            int _indexOf = _localconstraints_2.indexOf(lc);
            CharSequence _localconstraint2eclipse = this.localconstraint2eclipse(Integer.valueOf(_indexOf), lc, "widen");
            _builder.append(_localconstraint2eclipse, "");
          }
        }
      }
    }
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence topequation2eclipse(final Equation e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _hasRightVarRef = this.hasRightVarRef(e);
      boolean _not = (!_hasRightVarRef);
      if (_not) {
        _builder.append("once (arg(");
        Node _left = e.getLeft();
        Variable _var = ((VariableReference) _left).getVar();
        int _number = _var.getNumber();
        _builder.append(_number, "");
        _builder.append(",Ts,");
        Node _right = e.getRight();
        CharSequence _simpleelement2eclipse = this.simpleelement2eclipse(_right);
        _builder.append(_simpleelement2eclipse, "");
        _builder.append(")");
      } else {
        _builder.append("arg(");
        Node _left_1 = e.getLeft();
        Variable _var_1 = ((VariableReference) _left_1).getVar();
        int _number_1 = _var_1.getNumber();
        _builder.append(_number_1, "");
        _builder.append(",Ts,");
        Node _right_1 = e.getRight();
        CharSequence _simpleelement2eclipse_1 = this.simpleelement2eclipse(_right_1);
        _builder.append(_simpleelement2eclipse_1, "");
      }
    }
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence toperror2eclipse(final Equation e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _hasRightVarRef = this.hasRightVarRef(e);
      boolean _not = (!_hasRightVarRef);
      if (_not) {
        _builder.append("once (Message = ");
        Node _right = e.getRight();
        CharSequence _simpleelement2eclipse = this.simpleelement2eclipse(_right);
        _builder.append(_simpleelement2eclipse, "");
      } else {
        _builder.append("arg(");
        Node _left = e.getLeft();
        Variable _var = ((VariableReference) _left).getVar();
        int _number = _var.getNumber();
        _builder.append(_number, "");
        _builder.append(",Ts,");
        Node _right_1 = e.getRight();
        CharSequence _simpleelement2eclipse_1 = this.simpleelement2eclipse(_right_1);
        _builder.append(_simpleelement2eclipse_1, "");
      }
    }
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence variable2eclipse(final Variable v) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("typeof(");
    int _number = v.getNumber();
    _builder.append(_number, "");
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence linkvariable2eclipse(final Variable v) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("hastype(");
    int _number = v.getNumber();
    _builder.append(_number, "");
    _builder.append(",V");
    int _number_1 = v.getNumber();
    _builder.append(_number_1, "");
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence variablehastype2eclipse(final Variable myvar, final String varname) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("hastype(");
    int _number = myvar.getNumber();
    _builder.append(_number, "");
    _builder.append(",");
    _builder.append(varname, "");
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence variablearg2eclipse(final Variable myvar, final String varname) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("arg(");
    int _number = myvar.getNumber();
    _builder.append(_number, "");
    _builder.append(",Ts,");
    _builder.append(varname, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _simpleelement2eclipse(final Element e) {
    StringConcatenation _builder = new StringConcatenation();
    EClass _eClass = e.eClass();
    String _name = _eClass.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected CharSequence _simpleelement2eclipse(final Node e) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _simplenode2eclipse = this.simplenode2eclipse(e);
    _builder.append(_simplenode2eclipse, "");
    return _builder;
  }
  
  protected CharSequence _simpleelement2eclipse(final VariableReference varref) {
    StringConcatenation _builder = new StringConcatenation();
    Variable _var = varref.getVar();
    CharSequence _localvariable2eclipse = this.localvariable2eclipse(_var);
    _builder.append(_localvariable2eclipse, "");
    return _builder;
  }
  
  protected CharSequence _simplenode2eclipse(final Node n) {
    StringConcatenation _builder = new StringConcatenation();
    EClass _eClass = n.eClass();
    String _name = _eClass.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected CharSequence _simplenode2eclipse(final ObjectNode n) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = n.getName();
    CharSequence _identifier2eclipse = this.identifier2eclipse(_name);
    _builder.append(_identifier2eclipse, "");
    {
      boolean _or = false;
      final Function1<Type,Boolean> _function = new Function1<Type,Boolean>() {
        public Boolean apply(final Type o) {
          String _name = o.getName();
          String _name_1 = n.getName();
          return Boolean.valueOf(Objects.equal(_name, _name_1));
        }
      };
      boolean _exists = IterableExtensions.<Type>exists(this.objects, _function);
      if (_exists) {
        _or = true;
      } else {
        boolean _and = false;
        String _name_1 = n.getName();
        boolean _equalsIgnoreCase = _name_1.equalsIgnoreCase("error");
        if (!_equalsIgnoreCase) {
          _and = false;
        } else {
          EList<Feature> _features = n.getFeatures();
          int _size = _features.size();
          boolean _greaterThan = (_size > 0);
          _and = _greaterThan;
        }
        _or = _and;
      }
      if (_or) {
        _builder.append("{");
        {
          EList<Feature> _features_1 = n.getFeatures();
          boolean _hasElements = false;
          for(final Feature f : _features_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _simplefeature2eclipse = this.simplefeature2eclipse(f);
            _builder.append(_simplefeature2eclipse, "");
          }
        }
        _builder.append("}");
      }
    }
    return _builder;
  }
  
  protected CharSequence _simplenode2eclipse(final SelectNode n) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("getconstraint(");
    Variable _object = n.getObject();
    CharSequence _localvariable2eclipse = this.localvariable2eclipse(_object);
    _builder.append(_localvariable2eclipse, "");
    _builder.append(",W");
    Variable _object_1 = n.getObject();
    int _number = _object_1.getNumber();
    _builder.append(_number, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _simplenode2eclipse(final Literal l) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _value = l.getValue();
      boolean _isInt = this.isInt(_value);
      if (_isInt) {
        String _value_1 = l.getValue();
        _builder.append(_value_1, "");
      } else {
        _builder.append("\"");
        String _value_2 = l.getValue();
        String _replaceAll = _value_2.replaceAll("\"", "\\\\\\\"");
        _builder.append(_replaceAll, "");
        _builder.append("\"");
      }
    }
    return _builder;
  }
  
  protected CharSequence _simplenode2eclipse(final ListNode n) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[");
    {
      EList<Element> _values = n.getValues();
      boolean _hasElements = false;
      for(final Element v : _values) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        Object _simpleelement2eclipse = this.simpleelement2eclipse(v);
        _builder.append(_simpleelement2eclipse, "");
      }
    }
    _builder.append("]");
    return _builder;
  }
  
  public CharSequence simplefeature2eclipse(final Feature f) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = f.getName();
    CharSequence _identifier2eclipse = this.identifier2eclipse(_name);
    _builder.append(_identifier2eclipse, "");
    _builder.append(":");
    Element _value = f.getValue();
    Object _simpleelement2eclipse = this.simpleelement2eclipse(_value);
    _builder.append(_simpleelement2eclipse, "");
    return _builder;
  }
  
  protected CharSequence _identifier2eclipse(final String i) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _equals = Objects.equal(i, null);
      boolean _not = (!_equals);
      if (_not) {
        {
          boolean _contains = i.contains(":");
          if (_contains) {
            {
              String[] _split = i.split(":");
              boolean _hasElements = false;
              for(final String n : _split) {
                if (!_hasElements) {
                  _hasElements = true;
                } else {
                  _builder.appendImmediate(":", "");
                }
                String _firstLower = StringExtensions.toFirstLower(n);
                _builder.append(_firstLower, "");
              }
            }
          } else {
            String _firstLower_1 = StringExtensions.toFirstLower(i);
            _builder.append(_firstLower_1, "");
          }
        }
      }
    }
    return _builder;
  }
  
  protected CharSequence _identifier2eclipse(final TypeFeature t) {
    StringConcatenation _builder = new StringConcatenation();
    EList<String> _name = t.getName();
    String _head = IterableExtensions.<String>head(_name);
    String _firstLower = StringExtensions.toFirstLower(_head);
    _builder.append(_firstLower, "");
    _builder.append(":");
    String _type = t.getType();
    String _firstLower_1 = StringExtensions.toFirstLower(_type);
    _builder.append(_firstLower_1, "");
    return _builder;
  }
  
  protected CharSequence _localconstraint2eclipse(final Integer index, final EquationConstraint c, final String operator) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Equation> _equation = c.getEquation();
      boolean _isEmpty = _equation.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        EList<Equation> _equation_1 = c.getEquation();
        Equation _head = IterableExtensions.<Equation>head(_equation_1);
        CharSequence _localequation2eclipse = this.localequation2eclipse(index, _head, operator);
        _builder.append(_localequation2eclipse, "");
      } else {
        _builder.append("No Equation");
      }
    }
    return _builder;
  }
  
  protected CharSequence _localconstraint2eclipse(final Integer index, final FoldConstraint c, final String operator) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    {
      EList<Generator> _containers = c.getContainers();
      boolean _hasElements = false;
      for(final Generator co : _containers) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        EList<Element> _container = co.getContainer();
        Element _head = IterableExtensions.<Element>head(_container);
        EList<Variable> _variables = co.getVariables();
        CharSequence _container2eclipse = this.container2eclipse(_head, _variables);
        _builder.append(_container2eclipse, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    {
      HashSet<Variable> _foldParams = this.getFoldParams(c);
      for(final Variable v : _foldParams) {
        _builder.append(",");
        CharSequence _variable2param = this.variable2param(v);
        _builder.append(_variable2param, " ");
      }
    }
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("do ");
    _builder.newLine();
    _builder.append(" ");
    {
      EList<Constraint> _localconstraints = c.getLocalconstraints();
      boolean _hasElements_1 = false;
      for(final Constraint lc : _localconstraints) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(",", " ");
        }
        Object _localconstraint2eclipse = this.localconstraint2eclipse(index, lc, operator);
        _builder.append(_localconstraint2eclipse, " ");
      }
    }
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence container2eclipse(final Element e, final List<Variable> myvar) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("foreach(");
    {
      int _size = myvar.size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        _builder.append("(");
        {
          boolean _hasElements = false;
          for(final Variable variable : myvar) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _localvariable2eclipse = this.localvariable2eclipse(variable);
            _builder.append(_localvariable2eclipse, "");
          }
        }
        _builder.append(")");
      } else {
        Variable _head = IterableExtensions.<Variable>head(myvar);
        CharSequence _localvariable2eclipse_1 = this.localvariable2eclipse(_head);
        _builder.append(_localvariable2eclipse_1, "");
      }
    }
    _builder.append(",");
    CharSequence _simpleelement2eclipse = this.simpleelement2eclipse(e);
    _builder.append(_simpleelement2eclipse, "");
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence variable2param(final Variable v) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("param(");
    CharSequence _localvariable2eclipse = this.localvariable2eclipse(v);
    _builder.append(_localvariable2eclipse, "");
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence localequation2eclipse(final Integer index, final Equation e, final String operator) {
    CharSequence _xblockexpression = null;
    {
      Integer i = this.getNextId();
      StringConcatenation _builder = new StringConcatenation();
      Node _left = e.getLeft();
      CharSequence _newlocaleq2eclipse = this.newlocaleq2eclipse(index, _left, ("L" + i));
      _builder.append(_newlocaleq2eclipse, "");
      _builder.append(",");
      {
        EClass _eClass = e.eClass();
        EStructuralFeature _eStructuralFeature = _eClass.getEStructuralFeature("right");
        boolean _eIsSet = e.eIsSet(_eStructuralFeature);
        if (_eIsSet) {
          Node _right = e.getRight();
          CharSequence _newlocaleq2eclipse_1 = this.newlocaleq2eclipse(index, _right, ("R" + i));
          _builder.append(_newlocaleq2eclipse_1, "");
        } else {
          _builder.append(("R" + i), "");
          _builder.append(" = oclUndefined");
        }
      }
      _builder.append(",");
      _builder.newLineIfNotEmpty();
      {
        ComparisonOperator _operation = e.getOperation();
        boolean _equals = Objects.equal(_operation, ComparisonOperator.EQUAL);
        if (_equals) {
          _builder.append("compare(");
          _builder.append(("L" + i), "");
          _builder.append(",");
          _builder.append(("R" + i), "");
          _builder.append(")");
          _builder.newLineIfNotEmpty();
        } else {
          {
            ComparisonOperator _operation_1 = e.getOperation();
            boolean _equals_1 = Objects.equal(_operation_1, ComparisonOperator.LESS_EQUAL);
            if (_equals_1) {
              _builder.append(operator, "");
              _builder.append("(");
              _builder.append(("L" + i), "");
              _builder.append(",");
              _builder.append(("R" + i), "");
              _builder.append(")");
              _builder.newLineIfNotEmpty();
            } else {
              {
                ComparisonOperator _operation_2 = e.getOperation();
                boolean _equals_2 = Objects.equal(_operation_2, ComparisonOperator.GREATER_EQUAL);
                if (_equals_2) {
                  _builder.append(operator, "");
                  _builder.append("(");
                  _builder.append(("R" + i), "");
                  _builder.append(",");
                  _builder.append(("L" + i), "");
                  _builder.append(")");
                  _builder.newLineIfNotEmpty();
                } else {
                  {
                    ComparisonOperator _operation_3 = e.getOperation();
                    boolean _equals_3 = Objects.equal(_operation_3, ComparisonOperator.NOT_EQUAL);
                    if (_equals_3) {
                      _builder.append("not compare(");
                      _builder.append(("L" + i), "");
                      _builder.append(",");
                      _builder.append(("R" + i), "");
                      _builder.append(")");
                      _builder.newLineIfNotEmpty();
                    } else {
                      _builder.append("member(");
                      _builder.append(("L" + i), "");
                      _builder.append(",");
                      _builder.append(("R" + i), "");
                      _builder.append(")");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
            }
          }
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _newlocaleq2eclipse(final Integer index, final Variable e, final String varname) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(varname, "");
    _builder.append(" = ");
    CharSequence _localvariable2eclipse = this.localvariable2eclipse(e);
    _builder.append(_localvariable2eclipse, "");
    return _builder;
  }
  
  protected CharSequence _newlocaleq2eclipse(final Integer index, final EObject e, final String varname) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _newlocaleq2eclipse(final Integer index, final VariableReference e, final String varname) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(varname, "");
    _builder.append(" = ");
    Variable _var = e.getVar();
    CharSequence _localvariable2eclipse = this.localvariable2eclipse(_var);
    _builder.append(_localvariable2eclipse, "");
    return _builder;
  }
  
  protected CharSequence _newlocaleq2eclipse(final Integer index, final ObjectNode n, final String varname) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(varname, "");
    _builder.append(" = ");
    String _name = n.getName();
    CharSequence _identifier2eclipse = this.identifier2eclipse(_name);
    _builder.append(_identifier2eclipse, "");
    {
      boolean _or = false;
      final Function1<Type,Boolean> _function = new Function1<Type,Boolean>() {
        public Boolean apply(final Type o) {
          String _name = o.getName();
          String _name_1 = n.getName();
          return Boolean.valueOf(Objects.equal(_name, _name_1));
        }
      };
      boolean _exists = IterableExtensions.<Type>exists(this.objects, _function);
      if (_exists) {
        _or = true;
      } else {
        boolean _and = false;
        String _name_1 = n.getName();
        boolean _equalsIgnoreCase = _name_1.equalsIgnoreCase("error");
        if (!_equalsIgnoreCase) {
          _and = false;
        } else {
          EList<Feature> _features = n.getFeatures();
          int _size = _features.size();
          boolean _greaterThan = (_size > 0);
          _and = _greaterThan;
        }
        _or = _and;
      }
      if (_or) {
        _builder.append("{");
        {
          EList<Feature> _features_1 = n.getFeatures();
          boolean _hasElements = false;
          for(final Feature f : _features_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _simplefeature2eclipse = this.simplefeature2eclipse(f);
            _builder.append(_simplefeature2eclipse, "");
          }
        }
        _builder.append("}");
      }
    }
    return _builder;
  }
  
  protected CharSequence _newlocaleq2eclipse(final Integer index, final SelectNode n, final String varname) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("getconstraint(");
    Variable _object = n.getObject();
    CharSequence _localvariable2eclipse = this.localvariable2eclipse(_object);
    _builder.append(_localvariable2eclipse, "");
    _builder.append(",");
    _builder.append(varname, "");
    return _builder;
  }
  
  protected CharSequence _newlocaleq2eclipse(final Integer index, final Literal l, final String varname) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(varname, "");
    _builder.append(" = ");
    {
      String _value = l.getValue();
      boolean _isInt = this.isInt(_value);
      if (_isInt) {
        String _value_1 = l.getValue();
        _builder.append(_value_1, "");
      } else {
        _builder.append("\"");
        String _value_2 = l.getValue();
        String _replaceAll = _value_2.replaceAll("\"", "\\\\\\\"");
        _builder.append(_replaceAll, "");
        _builder.append("\"");
      }
    }
    return _builder;
  }
  
  protected CharSequence _newlocaleq2eclipse(final Integer index, final IndirectReference r, final String varname) {
    StringConcatenation _builder = new StringConcatenation();
    Element _expression = r.getExpression();
    Object _newlocaleq2eclipse = this.newlocaleq2eclipse(index, _expression, (varname + "1"));
    _builder.append(_newlocaleq2eclipse, "");
    _builder.append(",hastype(");
    _builder.append((varname + "1"), "");
    _builder.append(",");
    String _name = r.getName();
    _builder.append(_name, "");
    _builder.append(",");
    _builder.append(varname, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _newlocaleq2eclipse(final Integer index, final UnaryNode e, final String varname) {
    StringConcatenation _builder = new StringConcatenation();
    Element _left = e.getLeft();
    Object _newlocaleq2eclipse = this.newlocaleq2eclipse(index, _left, (varname + "1"));
    _builder.append(_newlocaleq2eclipse, "");
    _builder.append(",");
    {
      UnOp _operator = e.getOperator();
      boolean _equals = Objects.equal(_operator, UnOp.LENGTH);
      if (_equals) {
        _builder.append("length(");
        _builder.append((varname + "1"), "");
      } else {
        {
          UnOp _operator_1 = e.getOperator();
          boolean _equals_1 = Objects.equal(_operator_1, UnOp.LAST);
          if (_equals_1) {
            _builder.append("mylast(");
            _builder.append((varname + "1"), "");
          } else {
            {
              UnOp _operator_2 = e.getOperator();
              boolean _equals_2 = Objects.equal(_operator_2, UnOp.FIRST);
              if (_equals_2) {
                _builder.append("nth0(0,");
                _builder.append((varname + "1"), "");
              } else {
                {
                  UnOp _operator_3 = e.getOperator();
                  boolean _equals_3 = Objects.equal(_operator_3, UnOp.FLATTEN);
                  if (_equals_3) {
                    _builder.append("flatten(");
                    _builder.append((varname + "1"), "");
                  } else {
                    _builder.append("genPairs(");
                    _builder.append((varname + "1"), "");
                  }
                }
              }
            }
          }
        }
      }
    }
    _builder.append(",");
    _builder.append(varname, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _newlocaleq2eclipse(final Integer index, final BinaryNode e, final String varname) {
    StringConcatenation _builder = new StringConcatenation();
    Node _left = e.getLeft();
    Object _newlocaleq2eclipse = this.newlocaleq2eclipse(index, _left, (varname + "l"));
    _builder.append(_newlocaleq2eclipse, "");
    _builder.append(",");
    Node _right = e.getRight();
    Object _newlocaleq2eclipse_1 = this.newlocaleq2eclipse(index, _right, (varname + "r"));
    _builder.append(_newlocaleq2eclipse_1, "");
    _builder.append(",");
    BinOp _operation = e.getOperation();
    String _operator2eclipse = this.operator2eclipse(_operation);
    _builder.append(_operator2eclipse, "");
    _builder.append("(");
    _builder.append((varname + "l"), "");
    _builder.append(",");
    _builder.append((varname + "r"), "");
    _builder.append(",");
    _builder.append(varname, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _newlocaleq2eclipse(final Integer index, final ListNode n, final String varname) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(varname, "");
    _builder.append(" = [");
    {
      EList<Element> _values = n.getValues();
      boolean _hasElements = false;
      for(final Element v : _values) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        CharSequence _simpleelement2eclipse = this.simpleelement2eclipse(v);
        _builder.append(_simpleelement2eclipse, "");
      }
    }
    _builder.append("]");
    return _builder;
  }
  
  public CharSequence feature2eclipse(final Integer index, final List<Element> list, final Feature f) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = f.getName();
    CharSequence _identifier2eclipse = this.identifier2eclipse(_name);
    _builder.append(_identifier2eclipse, "");
    _builder.append(":");
    Element _value = f.getValue();
    CharSequence _simpleelement2eclipse = this.simpleelement2eclipse(_value);
    _builder.append(_simpleelement2eclipse, "");
    return _builder;
  }
  
  public CharSequence localvariablearg2eclipse(final Variable myvar, final Variable localvar) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("hastype2(");
    int _number = myvar.getNumber();
    _builder.append(_number, "");
    _builder.append(",");
    CharSequence _localvariable2eclipse = this.localvariable2eclipse(localvar);
    _builder.append(_localvariable2eclipse, "");
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence localvariable2eclipse(final Variable myvar) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _or = false;
      EList<VariableReference> _references = myvar.getReferences();
      int _size = _references.size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        _or = true;
      } else {
        boolean _and = false;
        EObject _eContainer = myvar.eContainer();
        EClass _eClass = _eContainer.eClass();
        String _name = _eClass.getName();
        boolean _equalsIgnoreCase = _name.equalsIgnoreCase("Generator");
        if (!_equalsIgnoreCase) {
          _and = false;
        } else {
          EList<VariableReference> _references_1 = myvar.getReferences();
          int _size_1 = _references_1.size();
          boolean _greaterThan_1 = (_size_1 > 0);
          _and = _greaterThan_1;
        }
        _or = _and;
      }
      if (_or) {
        _builder.append("V");
        int _number = myvar.getNumber();
        _builder.append(_number, "");
      } else {
        _builder.append("_");
      }
    }
    return _builder;
  }
  
  public CharSequence makeTemp(final String n, final Variable myvar) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(n, "");
    int _number = myvar.getNumber();
    _builder.append(_number, "");
    return _builder;
  }
  
  public String operator2eclipse(final BinOp o) {
    String _switchResult = null;
    if (o != null) {
      switch (o) {
        case ADDITION:
          _switchResult = "+";
          break;
        case SUBTRACTION:
          _switchResult = "-";
          break;
        case PROJECTION:
          _switchResult = ".";
          break;
        case CONCATENATION:
          _switchResult = "union";
          break;
        default:
          _switchResult = o.toString();
          break;
      }
    } else {
      _switchResult = o.toString();
    }
    return _switchResult;
  }
  
  public boolean hasRightVarRef(final Equation e) {
    Node _right = e.getRight();
    return this.isVariableReference(_right);
  }
  
  protected boolean _isVariableReference(final VariableReference e) {
    return true;
  }
  
  protected boolean _isVariableReference(final Element e) {
    return false;
  }
  
  public HashSet<Variable> getFoldParams(final FoldConstraint c) {
    Set<Variable> varset = new HashSet<Variable>();
    EList<Constraint> _localconstraints = c.getLocalconstraints();
    for (final Constraint localE : _localconstraints) {
      Set<Variable> _variableSet = this.getVariableSet(localE);
      varset.addAll(_variableSet);
    }
    HashSet<Variable> result = new HashSet<Variable>();
    final Function1<Variable,Boolean> _function = new Function1<Variable,Boolean>() {
      public Boolean apply(final Variable v) {
        boolean _and = false;
        EList<Variable> _localvariables = c.getLocalvariables();
        final Function1<Variable,Boolean> _function = new Function1<Variable,Boolean>() {
          public Boolean apply(final Variable lv) {
            int _number = lv.getNumber();
            int _number_1 = v.getNumber();
            return Boolean.valueOf((_number == _number_1));
          }
        };
        boolean _exists = IterableExtensions.<Variable>exists(_localvariables, _function);
        boolean _not = (!_exists);
        if (!_not) {
          _and = false;
        } else {
          EList<Generator> _containers = c.getContainers();
          final Function1<Generator,Boolean> _function_1 = new Function1<Generator,Boolean>() {
            public Boolean apply(final Generator g) {
              EList<Variable> _variables = g.getVariables();
              final Function1<Variable,Boolean> _function = new Function1<Variable,Boolean>() {
                public Boolean apply(final Variable lv) {
                  int _number = lv.getNumber();
                  int _number_1 = v.getNumber();
                  return Boolean.valueOf((_number == _number_1));
                }
              };
              return Boolean.valueOf(IterableExtensions.<Variable>exists(_variables, _function));
            }
          };
          boolean _exists_1 = IterableExtensions.<Generator>exists(_containers, _function_1);
          boolean _not_1 = (!_exists_1);
          _and = _not_1;
        }
        return Boolean.valueOf(_and);
      }
    };
    Iterable<Variable> _filter = IterableExtensions.<Variable>filter(varset, _function);
    for (final Variable localV : _filter) {
      result.add(localV);
    }
    return result;
  }
  
  protected Set<Variable> _getVariableSet(final EquationConstraint c) {
    Set<Variable> varset = new HashSet<Variable>();
    EList<Equation> _equation = c.getEquation();
    for (final Equation Eq : _equation) {
      Set<Variable> _equationVariableSet = this.getEquationVariableSet(Eq);
      varset.addAll(_equationVariableSet);
    }
    EList<Constraint> _localconstraints = c.getLocalconstraints();
    for (final Constraint localE : _localconstraints) {
      Set<Variable> _variableSet = this.getVariableSet(localE);
      varset.addAll(_variableSet);
    }
    HashSet<Variable> result = new HashSet<Variable>();
    final Function1<Variable,Boolean> _function = new Function1<Variable,Boolean>() {
      public Boolean apply(final Variable v) {
        EList<Variable> _localvariables = c.getLocalvariables();
        final Function1<Variable,Boolean> _function = new Function1<Variable,Boolean>() {
          public Boolean apply(final Variable lv) {
            int _number = lv.getNumber();
            int _number_1 = v.getNumber();
            return Boolean.valueOf((_number == _number_1));
          }
        };
        boolean _exists = IterableExtensions.<Variable>exists(_localvariables, _function);
        return Boolean.valueOf((!_exists));
      }
    };
    Iterable<Variable> _filter = IterableExtensions.<Variable>filter(varset, _function);
    for (final Variable localV : _filter) {
      result.add(localV);
    }
    return result;
  }
  
  protected Set<Variable> _getVariableSet(final FoldConstraint c) {
    Set<Variable> varset = new HashSet<Variable>();
    EList<Generator> _containers = c.getContainers();
    for (final Generator localG : _containers) {
      EList<Element> _container = localG.getContainer();
      for (final Element container : _container) {
        Set<Variable> _elementVariableSet = this.getElementVariableSet(container);
        varset.addAll(_elementVariableSet);
      }
    }
    EList<Constraint> _localconstraints = c.getLocalconstraints();
    for (final Constraint localE : _localconstraints) {
      Set<Variable> _variableSet = this.getVariableSet(localE);
      varset.addAll(_variableSet);
    }
    HashSet<Variable> result = new HashSet<Variable>();
    final Function1<Variable,Boolean> _function = new Function1<Variable,Boolean>() {
      public Boolean apply(final Variable v) {
        boolean _and = false;
        EList<Variable> _localvariables = c.getLocalvariables();
        final Function1<Variable,Boolean> _function = new Function1<Variable,Boolean>() {
          public Boolean apply(final Variable lv) {
            int _number = lv.getNumber();
            int _number_1 = v.getNumber();
            return Boolean.valueOf((_number == _number_1));
          }
        };
        boolean _exists = IterableExtensions.<Variable>exists(_localvariables, _function);
        boolean _not = (!_exists);
        if (!_not) {
          _and = false;
        } else {
          EList<Generator> _containers = c.getContainers();
          final Function1<Generator,Boolean> _function_1 = new Function1<Generator,Boolean>() {
            public Boolean apply(final Generator g) {
              EList<Variable> _variables = g.getVariables();
              final Function1<Variable,Boolean> _function = new Function1<Variable,Boolean>() {
                public Boolean apply(final Variable lv) {
                  int _number = lv.getNumber();
                  int _number_1 = v.getNumber();
                  return Boolean.valueOf((_number == _number_1));
                }
              };
              return Boolean.valueOf(IterableExtensions.<Variable>exists(_variables, _function));
            }
          };
          boolean _exists_1 = IterableExtensions.<Generator>exists(_containers, _function_1);
          boolean _not_1 = (!_exists_1);
          _and = _not_1;
        }
        return Boolean.valueOf(_and);
      }
    };
    Iterable<Variable> _filter = IterableExtensions.<Variable>filter(varset, _function);
    for (final Variable localV : _filter) {
      result.add(localV);
    }
    return result;
  }
  
  public Set<Variable> getEquationVariableSet(final Equation e) {
    Set<Variable> varset = new HashSet<Variable>();
    Node _left = e.getLeft();
    Set<Variable> _elementVariableSet = this.getElementVariableSet(_left);
    varset.addAll(_elementVariableSet);
    Node _right = e.getRight();
    Set<Variable> _elementVariableSet_1 = this.getElementVariableSet(_right);
    varset.addAll(_elementVariableSet_1);
    return varset;
  }
  
  protected Set<Variable> _getElementVariableSet(final Element e) {
    return new HashSet<Variable>();
  }
  
  protected Set<Variable> _getElementVariableSet(final Literal n) {
    return new HashSet<Variable>();
  }
  
  protected Set<Variable> _getElementVariableSet(final VariableReference n) {
    Set<Variable> varset = new HashSet<Variable>();
    Variable _var = n.getVar();
    varset.add(_var);
    return varset;
  }
  
  protected Set<Variable> _getElementVariableSet(final ObjectNode n) {
    Set<Variable> varset = new HashSet<Variable>();
    EList<Feature> _features = n.getFeatures();
    for (final Feature f : _features) {
      Element _value = f.getValue();
      Set<Variable> _elementVariableSet = this.getElementVariableSet(_value);
      varset.addAll(_elementVariableSet);
    }
    return varset;
  }
  
  protected Set<Variable> _getElementVariableSet(final ListNode n) {
    Set<Variable> varset = new HashSet<Variable>();
    EList<Element> _values = n.getValues();
    for (final Element e : _values) {
      Set<Variable> _elementVariableSet = this.getElementVariableSet(e);
      varset.addAll(_elementVariableSet);
    }
    return varset;
  }
  
  protected Set<Variable> _getElementVariableSet(final SelectNode n) {
    Set<Variable> varset = new HashSet<Variable>();
    Variable _object = n.getObject();
    varset.add(_object);
    return varset;
  }
  
  protected Set<Variable> _getElementVariableSet(final BinaryNode n) {
    Set<Variable> varset = new HashSet<Variable>();
    Node _left = n.getLeft();
    Set<Variable> _elementVariableSet = this.getElementVariableSet(_left);
    varset.addAll(_elementVariableSet);
    Node _right = n.getRight();
    Set<Variable> _elementVariableSet_1 = this.getElementVariableSet(_right);
    varset.addAll(_elementVariableSet_1);
    return varset;
  }
  
  protected Set<Variable> _getElementVariableSet(final UnaryNode n) {
    Set<Variable> varset = new HashSet<Variable>();
    Element _left = n.getLeft();
    Set<Variable> _elementVariableSet = this.getElementVariableSet(_left);
    varset.addAll(_elementVariableSet);
    return varset;
  }
  
  protected Set<Variable> _getElementVariableSet(final IndirectReference n) {
    Set<Variable> varset = new HashSet<Variable>();
    Element _expression = n.getExpression();
    Set<Variable> _elementVariableSet = this.getElementVariableSet(_expression);
    varset.addAll(_elementVariableSet);
    return varset;
  }
  
  protected Boolean _isSimple(final ListNode l) {
    return Boolean.valueOf(false);
  }
  
  protected Boolean _isSimple(final ObjectNode l) {
    return Boolean.valueOf(false);
  }
  
  protected Boolean _isSimple(final BinaryNode l) {
    return Boolean.valueOf(false);
  }
  
  public boolean isLocal(final Variable v) {
    EObject _eContainer = v.eContainer();
    boolean _isProgram = this.isProgram(_eContainer);
    return (!_isProgram);
  }
  
  protected boolean _isProgram(final EObject o) {
    return false;
  }
  
  protected boolean _isProgram(final Program p) {
    return true;
  }
  
  protected boolean _isIndirect(final Element e) {
    return false;
  }
  
  protected boolean _isIndirect(final IndirectReference i) {
    return true;
  }
  
  protected boolean _isConcat(final Element e) {
    return false;
  }
  
  protected boolean _isConcat(final BinaryNode e) {
    BinOp _operation = e.getOperation();
    return Objects.equal(_operation, BinOp.CONCATENATION);
  }
  
  public String quoteString(final String s) {
    return Matcher.quoteReplacement(s);
  }
  
  public boolean isInt(final String s) {
    try {
      Integer.parseInt(s);
      return true;
    } catch (final Throwable _t) {
      if (_t instanceof NumberFormatException) {
        final NumberFormatException e = (NumberFormatException)_t;
        return false;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public List<Integer> makeNumberList(final Integer n) {
    List<Integer> list = new ArrayList<Integer>((n).intValue());
    int i = 0;
    boolean _while = (i <= (n).intValue());
    while (_while) {
      {
        list.add(Integer.valueOf(i));
        i = (i + 1);
      }
      _while = (i <= (n).intValue());
    }
    return list;
  }
  
  public void compile(final EObject p, final IFileSystemAccess filesystem) {
    if (p instanceof Program) {
      _compile((Program)p, filesystem);
      return;
    } else if (p != null) {
      _compile(p, filesystem);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(p, filesystem).toString());
    }
  }
  
  public CharSequence simpleelement2eclipse(final Element varref) {
    if (varref instanceof VariableReference) {
      return _simpleelement2eclipse((VariableReference)varref);
    } else if (varref instanceof Node) {
      return _simpleelement2eclipse((Node)varref);
    } else if (varref != null) {
      return _simpleelement2eclipse(varref);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(varref).toString());
    }
  }
  
  public CharSequence simplenode2eclipse(final Node n) {
    if (n instanceof ListNode) {
      return _simplenode2eclipse((ListNode)n);
    } else if (n instanceof Literal) {
      return _simplenode2eclipse((Literal)n);
    } else if (n instanceof ObjectNode) {
      return _simplenode2eclipse((ObjectNode)n);
    } else if (n instanceof SelectNode) {
      return _simplenode2eclipse((SelectNode)n);
    } else if (n != null) {
      return _simplenode2eclipse(n);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(n).toString());
    }
  }
  
  public CharSequence identifier2eclipse(final Object t) {
    if (t instanceof TypeFeature) {
      return _identifier2eclipse((TypeFeature)t);
    } else if (t instanceof String) {
      return _identifier2eclipse((String)t);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(t).toString());
    }
  }
  
  public CharSequence localconstraint2eclipse(final Integer index, final Constraint c, final String operator) {
    if (c instanceof EquationConstraint) {
      return _localconstraint2eclipse(index, (EquationConstraint)c, operator);
    } else if (c instanceof FoldConstraint) {
      return _localconstraint2eclipse(index, (FoldConstraint)c, operator);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(index, c, operator).toString());
    }
  }
  
  public CharSequence newlocaleq2eclipse(final Integer index, final EObject e, final String varname) {
    if (e instanceof BinaryNode) {
      return _newlocaleq2eclipse(index, (BinaryNode)e, varname);
    } else if (e instanceof IndirectReference) {
      return _newlocaleq2eclipse(index, (IndirectReference)e, varname);
    } else if (e instanceof ListNode) {
      return _newlocaleq2eclipse(index, (ListNode)e, varname);
    } else if (e instanceof Literal) {
      return _newlocaleq2eclipse(index, (Literal)e, varname);
    } else if (e instanceof ObjectNode) {
      return _newlocaleq2eclipse(index, (ObjectNode)e, varname);
    } else if (e instanceof SelectNode) {
      return _newlocaleq2eclipse(index, (SelectNode)e, varname);
    } else if (e instanceof UnaryNode) {
      return _newlocaleq2eclipse(index, (UnaryNode)e, varname);
    } else if (e instanceof VariableReference) {
      return _newlocaleq2eclipse(index, (VariableReference)e, varname);
    } else if (e instanceof Variable) {
      return _newlocaleq2eclipse(index, (Variable)e, varname);
    } else if (e != null) {
      return _newlocaleq2eclipse(index, e, varname);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(index, e, varname).toString());
    }
  }
  
  public boolean isVariableReference(final Element e) {
    if (e instanceof VariableReference) {
      return _isVariableReference((VariableReference)e);
    } else if (e != null) {
      return _isVariableReference(e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
  
  public Set<Variable> getVariableSet(final Constraint c) {
    if (c instanceof EquationConstraint) {
      return _getVariableSet((EquationConstraint)c);
    } else if (c instanceof FoldConstraint) {
      return _getVariableSet((FoldConstraint)c);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c).toString());
    }
  }
  
  public Set<Variable> getElementVariableSet(final Element n) {
    if (n instanceof BinaryNode) {
      return _getElementVariableSet((BinaryNode)n);
    } else if (n instanceof IndirectReference) {
      return _getElementVariableSet((IndirectReference)n);
    } else if (n instanceof ListNode) {
      return _getElementVariableSet((ListNode)n);
    } else if (n instanceof Literal) {
      return _getElementVariableSet((Literal)n);
    } else if (n instanceof ObjectNode) {
      return _getElementVariableSet((ObjectNode)n);
    } else if (n instanceof SelectNode) {
      return _getElementVariableSet((SelectNode)n);
    } else if (n instanceof UnaryNode) {
      return _getElementVariableSet((UnaryNode)n);
    } else if (n instanceof VariableReference) {
      return _getElementVariableSet((VariableReference)n);
    } else if (n != null) {
      return _getElementVariableSet(n);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(n).toString());
    }
  }
  
  public Boolean isSimple(final Node l) {
    if (l instanceof BinaryNode) {
      return _isSimple((BinaryNode)l);
    } else if (l instanceof ListNode) {
      return _isSimple((ListNode)l);
    } else if (l instanceof ObjectNode) {
      return _isSimple((ObjectNode)l);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(l).toString());
    }
  }
  
  public boolean isProgram(final EObject p) {
    if (p instanceof Program) {
      return _isProgram((Program)p);
    } else if (p != null) {
      return _isProgram(p);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(p).toString());
    }
  }
  
  public boolean isIndirect(final Element i) {
    if (i instanceof IndirectReference) {
      return _isIndirect((IndirectReference)i);
    } else if (i != null) {
      return _isIndirect(i);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(i).toString());
    }
  }
  
  public boolean isConcat(final Element e) {
    if (e instanceof BinaryNode) {
      return _isConcat((BinaryNode)e);
    } else if (e != null) {
      return _isConcat(e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
}
