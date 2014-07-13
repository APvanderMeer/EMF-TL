/**
 */
package textualmcrl2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import textualmcrl2.Allow;
import textualmcrl2.Atom;
import textualmcrl2.AtomicAction;
import textualmcrl2.Bag;
import textualmcrl2.BagEnumElement;
import textualmcrl2.BagEnumeration;
import textualmcrl2.BinaryExpression;
import textualmcrl2.BinaryOps;
import textualmcrl2.Block;
import textualmcrl2.Bool;
import textualmcrl2.BooleanLiteral;
import textualmcrl2.BoundedInitialisation;
import textualmcrl2.Choice;
import textualmcrl2.Communication;
import textualmcrl2.ConstraintVar;
import textualmcrl2.Constructor;
import textualmcrl2.Deadlock;
import textualmcrl2.Eqn;
import textualmcrl2.Equation;
import textualmcrl2.ExpressionSort;
import textualmcrl2.FunctionApplication;
import textualmcrl2.Hide;
import textualmcrl2.HigherOrder;
import textualmcrl2.IdDecl;
import textualmcrl2.Identifier;
import textualmcrl2.Implication;
import textualmcrl2.Int;
import textualmcrl2.Lambda;
import textualmcrl2.LeftMerge;
import textualmcrl2.List;
import textualmcrl2.ListEnumeration;
import textualmcrl2.MapAccess;
import textualmcrl2.MultiAction;
import textualmcrl2.Nat;
import textualmcrl2.Op;
import textualmcrl2.Parallelism;
import textualmcrl2.Pos;
import textualmcrl2.ProcessDecl;
import textualmcrl2.Projection;
import textualmcrl2.Quantification;
import textualmcrl2.Real;
import textualmcrl2.Rename;
import textualmcrl2.Renaming;
import textualmcrl2.Sequence;
import textualmcrl2.Set;
import textualmcrl2.SetEnumeration;
import textualmcrl2.Sort;
import textualmcrl2.SortRef;
import textualmcrl2.Specification;
import textualmcrl2.StructureSort;
import textualmcrl2.Summation;
import textualmcrl2.Synchronization;
import textualmcrl2.Tau;
import textualmcrl2.Textualmcrl2Factory;
import textualmcrl2.Textualmcrl2Package;
import textualmcrl2.TimedAction;
import textualmcrl2.UnaryExpression;
import textualmcrl2.UnaryOps;
import textualmcrl2.WhereClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Textualmcrl2FactoryImpl extends EFactoryImpl implements Textualmcrl2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Textualmcrl2Factory init() {
		try {
			Textualmcrl2Factory theTextualmcrl2Factory = (Textualmcrl2Factory)EPackage.Registry.INSTANCE.getEFactory(Textualmcrl2Package.eNS_URI);
			if (theTextualmcrl2Factory != null) {
				return theTextualmcrl2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Textualmcrl2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Textualmcrl2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Textualmcrl2Package.SPECIFICATION: return createSpecification();
			case Textualmcrl2Package.SORT: return createSort();
			case Textualmcrl2Package.EXPRESSION_SORT: return createExpressionSort();
			case Textualmcrl2Package.STRUCTURE_SORT: return createStructureSort();
			case Textualmcrl2Package.BOOL: return createBool();
			case Textualmcrl2Package.POS: return createPos();
			case Textualmcrl2Package.NAT: return createNat();
			case Textualmcrl2Package.INT: return createInt();
			case Textualmcrl2Package.REAL: return createReal();
			case Textualmcrl2Package.LIST: return createList();
			case Textualmcrl2Package.SET: return createSet();
			case Textualmcrl2Package.BAG: return createBag();
			case Textualmcrl2Package.SORT_REF: return createSortRef();
			case Textualmcrl2Package.HIGHER_ORDER: return createHigherOrder();
			case Textualmcrl2Package.CONSTRUCTOR: return createConstructor();
			case Textualmcrl2Package.PROJECTION: return createProjection();
			case Textualmcrl2Package.OP: return createOp();
			case Textualmcrl2Package.EQN: return createEqn();
			case Textualmcrl2Package.EQUATION: return createEquation();
			case Textualmcrl2Package.ATOM: return createAtom();
			case Textualmcrl2Package.ATOMIC_ACTION: return createAtomicAction();
			case Textualmcrl2Package.DEADLOCK: return createDeadlock();
			case Textualmcrl2Package.TAU: return createTau();
			case Textualmcrl2Package.SUMMATION: return createSummation();
			case Textualmcrl2Package.BLOCK: return createBlock();
			case Textualmcrl2Package.ALLOW: return createAllow();
			case Textualmcrl2Package.HIDE: return createHide();
			case Textualmcrl2Package.RENAME: return createRename();
			case Textualmcrl2Package.RENAMING: return createRenaming();
			case Textualmcrl2Package.COMMUNICATION: return createCommunication();
			case Textualmcrl2Package.MULTI_ACTION: return createMultiAction();
			case Textualmcrl2Package.SYNCHRONIZATION: return createSynchronization();
			case Textualmcrl2Package.TIMED_ACTION: return createTimedAction();
			case Textualmcrl2Package.SEQUENCE: return createSequence();
			case Textualmcrl2Package.IMPLICATION: return createImplication();
			case Textualmcrl2Package.BOUNDED_INITIALISATION: return createBoundedInitialisation();
			case Textualmcrl2Package.PARALLELISM: return createParallelism();
			case Textualmcrl2Package.LEFT_MERGE: return createLeftMerge();
			case Textualmcrl2Package.CHOICE: return createChoice();
			case Textualmcrl2Package.IDENTIFIER: return createIdentifier();
			case Textualmcrl2Package.NUMBER: return createNumber();
			case Textualmcrl2Package.BOOLEAN_LITERAL: return createBooleanLiteral();
			case Textualmcrl2Package.SET_ENUMERATION: return createSetEnumeration();
			case Textualmcrl2Package.LIST_ENUMERATION: return createListEnumeration();
			case Textualmcrl2Package.BAG_ENUMERATION: return createBagEnumeration();
			case Textualmcrl2Package.BAG_ENUM_ELEMENT: return createBagEnumElement();
			case Textualmcrl2Package.FUNCTION_APPLICATION: return createFunctionApplication();
			case Textualmcrl2Package.MAP_ACCESS: return createMapAccess();
			case Textualmcrl2Package.UNARY_EXPRESSION: return createUnaryExpression();
			case Textualmcrl2Package.QUANTIFICATION: return createQuantification();
			case Textualmcrl2Package.ID_DECL: return createIdDecl();
			case Textualmcrl2Package.BINARY_EXPRESSION: return createBinaryExpression();
			case Textualmcrl2Package.LAMBDA: return createLambda();
			case Textualmcrl2Package.WHERE_CLAUSE: return createWhereClause();
			case Textualmcrl2Package.PROCESS: return createProcess();
			case Textualmcrl2Package.PROCESS_DECL: return createProcessDecl();
			case Textualmcrl2Package.CONSTRAINT_VAR: return createConstraintVar();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Textualmcrl2Package.UNARY_OPS:
				return createUnaryOpsFromString(eDataType, initialValue);
			case Textualmcrl2Package.BINARY_OPS:
				return createBinaryOpsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Textualmcrl2Package.UNARY_OPS:
				return convertUnaryOpsToString(eDataType, instanceValue);
			case Textualmcrl2Package.BINARY_OPS:
				return convertBinaryOpsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification createSpecification() {
		SpecificationImpl specification = new SpecificationImpl();
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sort createSort() {
		SortImpl sort = new SortImpl();
		return sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionSort createExpressionSort() {
		ExpressionSortImpl expressionSort = new ExpressionSortImpl();
		return expressionSort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureSort createStructureSort() {
		StructureSortImpl structureSort = new StructureSortImpl();
		return structureSort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bool createBool() {
		BoolImpl bool = new BoolImpl();
		return bool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pos createPos() {
		PosImpl pos = new PosImpl();
		return pos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nat createNat() {
		NatImpl nat = new NatImpl();
		return nat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Int createInt() {
		IntImpl int_ = new IntImpl();
		return int_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Real createReal() {
		RealImpl real = new RealImpl();
		return real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set createSet() {
		SetImpl set = new SetImpl();
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bag createBag() {
		BagImpl bag = new BagImpl();
		return bag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortRef createSortRef() {
		SortRefImpl sortRef = new SortRefImpl();
		return sortRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HigherOrder createHigherOrder() {
		HigherOrderImpl higherOrder = new HigherOrderImpl();
		return higherOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constructor createConstructor() {
		ConstructorImpl constructor = new ConstructorImpl();
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Projection createProjection() {
		ProjectionImpl projection = new ProjectionImpl();
		return projection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Op createOp() {
		OpImpl op = new OpImpl();
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eqn createEqn() {
		EqnImpl eqn = new EqnImpl();
		return eqn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equation createEquation() {
		EquationImpl equation = new EquationImpl();
		return equation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atom createAtom() {
		AtomImpl atom = new AtomImpl();
		return atom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicAction createAtomicAction() {
		AtomicActionImpl atomicAction = new AtomicActionImpl();
		return atomicAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deadlock createDeadlock() {
		DeadlockImpl deadlock = new DeadlockImpl();
		return deadlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tau createTau() {
		TauImpl tau = new TauImpl();
		return tau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Summation createSummation() {
		SummationImpl summation = new SummationImpl();
		return summation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allow createAllow() {
		AllowImpl allow = new AllowImpl();
		return allow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hide createHide() {
		HideImpl hide = new HideImpl();
		return hide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rename createRename() {
		RenameImpl rename = new RenameImpl();
		return rename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Renaming createRenaming() {
		RenamingImpl renaming = new RenamingImpl();
		return renaming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communication createCommunication() {
		CommunicationImpl communication = new CommunicationImpl();
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiAction createMultiAction() {
		MultiActionImpl multiAction = new MultiActionImpl();
		return multiAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronization createSynchronization() {
		SynchronizationImpl synchronization = new SynchronizationImpl();
		return synchronization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedAction createTimedAction() {
		TimedActionImpl timedAction = new TimedActionImpl();
		return timedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implication createImplication() {
		ImplicationImpl implication = new ImplicationImpl();
		return implication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundedInitialisation createBoundedInitialisation() {
		BoundedInitialisationImpl boundedInitialisation = new BoundedInitialisationImpl();
		return boundedInitialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parallelism createParallelism() {
		ParallelismImpl parallelism = new ParallelismImpl();
		return parallelism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftMerge createLeftMerge() {
		LeftMergeImpl leftMerge = new LeftMergeImpl();
		return leftMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice createChoice() {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier createIdentifier() {
		IdentifierImpl identifier = new IdentifierImpl();
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public textualmcrl2.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetEnumeration createSetEnumeration() {
		SetEnumerationImpl setEnumeration = new SetEnumerationImpl();
		return setEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListEnumeration createListEnumeration() {
		ListEnumerationImpl listEnumeration = new ListEnumerationImpl();
		return listEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagEnumeration createBagEnumeration() {
		BagEnumerationImpl bagEnumeration = new BagEnumerationImpl();
		return bagEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagEnumElement createBagEnumElement() {
		BagEnumElementImpl bagEnumElement = new BagEnumElementImpl();
		return bagEnumElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionApplication createFunctionApplication() {
		FunctionApplicationImpl functionApplication = new FunctionApplicationImpl();
		return functionApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapAccess createMapAccess() {
		MapAccessImpl mapAccess = new MapAccessImpl();
		return mapAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpression createUnaryExpression() {
		UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
		return unaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantification createQuantification() {
		QuantificationImpl quantification = new QuantificationImpl();
		return quantification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdDecl createIdDecl() {
		IdDeclImpl idDecl = new IdDeclImpl();
		return idDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpression createBinaryExpression() {
		BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
		return binaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lambda createLambda() {
		LambdaImpl lambda = new LambdaImpl();
		return lambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhereClause createWhereClause() {
		WhereClauseImpl whereClause = new WhereClauseImpl();
		return whereClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public textualmcrl2.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessDecl createProcessDecl() {
		ProcessDeclImpl processDecl = new ProcessDeclImpl();
		return processDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintVar createConstraintVar() {
		ConstraintVarImpl constraintVar = new ConstraintVarImpl();
		return constraintVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOps createUnaryOpsFromString(EDataType eDataType, String initialValue) {
		UnaryOps result = UnaryOps.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnaryOpsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOps createBinaryOpsFromString(EDataType eDataType, String initialValue) {
		BinaryOps result = BinaryOps.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryOpsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Textualmcrl2Package getTextualmcrl2Package() {
		return (Textualmcrl2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Textualmcrl2Package getPackage() {
		return Textualmcrl2Package.eINSTANCE;
	}

} //Textualmcrl2FactoryImpl
