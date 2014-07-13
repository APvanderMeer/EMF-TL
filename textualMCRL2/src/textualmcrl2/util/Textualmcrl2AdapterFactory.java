/**
 */
package textualmcrl2.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import textualmcrl2.Allow;
import textualmcrl2.Atom;
import textualmcrl2.AtomicAction;
import textualmcrl2.Bag;
import textualmcrl2.BagEnumElement;
import textualmcrl2.BagEnumeration;
import textualmcrl2.BinaryExpression;
import textualmcrl2.Block;
import textualmcrl2.Bool;
import textualmcrl2.BooleanLiteral;
import textualmcrl2.BoundedInitialisation;
import textualmcrl2.Choice;
import textualmcrl2.Collection;
import textualmcrl2.Communication;
import textualmcrl2.CompositeAction;
import textualmcrl2.ConstraintElement;
import textualmcrl2.ConstraintVar;
import textualmcrl2.Constructor;
import textualmcrl2.DataExpression;
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
import textualmcrl2.Nameable;
import textualmcrl2.Nat;
import textualmcrl2.Op;
import textualmcrl2.Parallelism;
import textualmcrl2.Pos;
import textualmcrl2.ProcessDecl;
import textualmcrl2.ProcessExpr;
import textualmcrl2.Projection;
import textualmcrl2.Quantification;
import textualmcrl2.Real;
import textualmcrl2.Rename;
import textualmcrl2.Renaming;
import textualmcrl2.Sequence;
import textualmcrl2.Set;
import textualmcrl2.SetEnumeration;
import textualmcrl2.Sort;
import textualmcrl2.SortExpr;
import textualmcrl2.SortRef;
import textualmcrl2.Specification;
import textualmcrl2.StructureSort;
import textualmcrl2.Summation;
import textualmcrl2.Synchronization;
import textualmcrl2.Tau;
import textualmcrl2.Textualmcrl2Package;
import textualmcrl2.TimedAction;
import textualmcrl2.UnaryExpression;
import textualmcrl2.WhereClause;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see textualmcrl2.Textualmcrl2Package
 * @generated
 */
public class Textualmcrl2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Textualmcrl2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Textualmcrl2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Textualmcrl2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Textualmcrl2Switch<Adapter> modelSwitch =
		new Textualmcrl2Switch<Adapter>() {
			@Override
			public Adapter caseSpecification(Specification object) {
				return createSpecificationAdapter();
			}
			@Override
			public Adapter caseSort(Sort object) {
				return createSortAdapter();
			}
			@Override
			public Adapter caseExpressionSort(ExpressionSort object) {
				return createExpressionSortAdapter();
			}
			@Override
			public Adapter caseStructureSort(StructureSort object) {
				return createStructureSortAdapter();
			}
			@Override
			public Adapter caseSortExpr(SortExpr object) {
				return createSortExprAdapter();
			}
			@Override
			public Adapter caseBool(Bool object) {
				return createBoolAdapter();
			}
			@Override
			public Adapter casePos(Pos object) {
				return createPosAdapter();
			}
			@Override
			public Adapter caseNat(Nat object) {
				return createNatAdapter();
			}
			@Override
			public Adapter caseInt(Int object) {
				return createIntAdapter();
			}
			@Override
			public Adapter caseReal(Real object) {
				return createRealAdapter();
			}
			@Override
			public Adapter caseList(List object) {
				return createListAdapter();
			}
			@Override
			public Adapter caseSet(Set object) {
				return createSetAdapter();
			}
			@Override
			public Adapter caseBag(Bag object) {
				return createBagAdapter();
			}
			@Override
			public Adapter caseSortRef(SortRef object) {
				return createSortRefAdapter();
			}
			@Override
			public Adapter caseHigherOrder(HigherOrder object) {
				return createHigherOrderAdapter();
			}
			@Override
			public Adapter caseConstructor(Constructor object) {
				return createConstructorAdapter();
			}
			@Override
			public Adapter caseProjection(Projection object) {
				return createProjectionAdapter();
			}
			@Override
			public Adapter caseOp(Op object) {
				return createOpAdapter();
			}
			@Override
			public Adapter caseEqn(Eqn object) {
				return createEqnAdapter();
			}
			@Override
			public Adapter caseEquation(Equation object) {
				return createEquationAdapter();
			}
			@Override
			public Adapter caseAtom(Atom object) {
				return createAtomAdapter();
			}
			@Override
			public Adapter caseProcessExpr(ProcessExpr object) {
				return createProcessExprAdapter();
			}
			@Override
			public Adapter caseAtomicAction(AtomicAction object) {
				return createAtomicActionAdapter();
			}
			@Override
			public Adapter caseDeadlock(Deadlock object) {
				return createDeadlockAdapter();
			}
			@Override
			public Adapter caseTau(Tau object) {
				return createTauAdapter();
			}
			@Override
			public Adapter caseSummation(Summation object) {
				return createSummationAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseAllow(Allow object) {
				return createAllowAdapter();
			}
			@Override
			public Adapter caseHide(Hide object) {
				return createHideAdapter();
			}
			@Override
			public Adapter caseRename(Rename object) {
				return createRenameAdapter();
			}
			@Override
			public Adapter caseRenaming(Renaming object) {
				return createRenamingAdapter();
			}
			@Override
			public Adapter caseCommunication(Communication object) {
				return createCommunicationAdapter();
			}
			@Override
			public Adapter caseMultiAction(MultiAction object) {
				return createMultiActionAdapter();
			}
			@Override
			public Adapter caseCompositeAction(CompositeAction object) {
				return createCompositeActionAdapter();
			}
			@Override
			public Adapter caseSynchronization(Synchronization object) {
				return createSynchronizationAdapter();
			}
			@Override
			public Adapter caseTimedAction(TimedAction object) {
				return createTimedActionAdapter();
			}
			@Override
			public Adapter caseSequence(Sequence object) {
				return createSequenceAdapter();
			}
			@Override
			public Adapter caseImplication(Implication object) {
				return createImplicationAdapter();
			}
			@Override
			public Adapter caseBoundedInitialisation(BoundedInitialisation object) {
				return createBoundedInitialisationAdapter();
			}
			@Override
			public Adapter caseParallelism(Parallelism object) {
				return createParallelismAdapter();
			}
			@Override
			public Adapter caseLeftMerge(LeftMerge object) {
				return createLeftMergeAdapter();
			}
			@Override
			public Adapter caseChoice(Choice object) {
				return createChoiceAdapter();
			}
			@Override
			public Adapter caseNameable(Nameable object) {
				return createNameableAdapter();
			}
			@Override
			public Adapter caseDataExpression(DataExpression object) {
				return createDataExpressionAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseNumber(textualmcrl2.Number object) {
				return createNumberAdapter();
			}
			@Override
			public Adapter caseBooleanLiteral(BooleanLiteral object) {
				return createBooleanLiteralAdapter();
			}
			@Override
			public Adapter caseCollection(Collection object) {
				return createCollectionAdapter();
			}
			@Override
			public Adapter caseSetEnumeration(SetEnumeration object) {
				return createSetEnumerationAdapter();
			}
			@Override
			public Adapter caseListEnumeration(ListEnumeration object) {
				return createListEnumerationAdapter();
			}
			@Override
			public Adapter caseBagEnumeration(BagEnumeration object) {
				return createBagEnumerationAdapter();
			}
			@Override
			public Adapter caseBagEnumElement(BagEnumElement object) {
				return createBagEnumElementAdapter();
			}
			@Override
			public Adapter caseFunctionApplication(FunctionApplication object) {
				return createFunctionApplicationAdapter();
			}
			@Override
			public Adapter caseMapAccess(MapAccess object) {
				return createMapAccessAdapter();
			}
			@Override
			public Adapter caseUnaryExpression(UnaryExpression object) {
				return createUnaryExpressionAdapter();
			}
			@Override
			public Adapter caseQuantification(Quantification object) {
				return createQuantificationAdapter();
			}
			@Override
			public Adapter caseIdDecl(IdDecl object) {
				return createIdDeclAdapter();
			}
			@Override
			public Adapter caseBinaryExpression(BinaryExpression object) {
				return createBinaryExpressionAdapter();
			}
			@Override
			public Adapter caseLambda(Lambda object) {
				return createLambdaAdapter();
			}
			@Override
			public Adapter caseWhereClause(WhereClause object) {
				return createWhereClauseAdapter();
			}
			@Override
			public Adapter caseProcess(textualmcrl2.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseProcessDecl(ProcessDecl object) {
				return createProcessDeclAdapter();
			}
			@Override
			public Adapter caseConstraintElement(ConstraintElement object) {
				return createConstraintElementAdapter();
			}
			@Override
			public Adapter caseConstraintVar(ConstraintVar object) {
				return createConstraintVarAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Specification
	 * @generated
	 */
	public Adapter createSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Sort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Sort
	 * @generated
	 */
	public Adapter createSortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.ExpressionSort <em>Expression Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.ExpressionSort
	 * @generated
	 */
	public Adapter createExpressionSortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.StructureSort <em>Structure Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.StructureSort
	 * @generated
	 */
	public Adapter createStructureSortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.SortExpr <em>Sort Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.SortExpr
	 * @generated
	 */
	public Adapter createSortExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Bool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Bool
	 * @generated
	 */
	public Adapter createBoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Pos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Pos
	 * @generated
	 */
	public Adapter createPosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Nat <em>Nat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Nat
	 * @generated
	 */
	public Adapter createNatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Int <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Int
	 * @generated
	 */
	public Adapter createIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Real <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Real
	 * @generated
	 */
	public Adapter createRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.List
	 * @generated
	 */
	public Adapter createListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Set
	 * @generated
	 */
	public Adapter createSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Bag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Bag
	 * @generated
	 */
	public Adapter createBagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.SortRef <em>Sort Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.SortRef
	 * @generated
	 */
	public Adapter createSortRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.HigherOrder <em>Higher Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.HigherOrder
	 * @generated
	 */
	public Adapter createHigherOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Constructor
	 * @generated
	 */
	public Adapter createConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Projection <em>Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Projection
	 * @generated
	 */
	public Adapter createProjectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Op <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Op
	 * @generated
	 */
	public Adapter createOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Eqn <em>Eqn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Eqn
	 * @generated
	 */
	public Adapter createEqnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Equation <em>Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Equation
	 * @generated
	 */
	public Adapter createEquationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Atom
	 * @generated
	 */
	public Adapter createAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.ProcessExpr <em>Process Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.ProcessExpr
	 * @generated
	 */
	public Adapter createProcessExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.AtomicAction <em>Atomic Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.AtomicAction
	 * @generated
	 */
	public Adapter createAtomicActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Deadlock <em>Deadlock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Deadlock
	 * @generated
	 */
	public Adapter createDeadlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Tau <em>Tau</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Tau
	 * @generated
	 */
	public Adapter createTauAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Summation <em>Summation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Summation
	 * @generated
	 */
	public Adapter createSummationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Allow <em>Allow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Allow
	 * @generated
	 */
	public Adapter createAllowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Hide <em>Hide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Hide
	 * @generated
	 */
	public Adapter createHideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Rename <em>Rename</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Rename
	 * @generated
	 */
	public Adapter createRenameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Renaming <em>Renaming</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Renaming
	 * @generated
	 */
	public Adapter createRenamingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Communication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Communication
	 * @generated
	 */
	public Adapter createCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.MultiAction <em>Multi Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.MultiAction
	 * @generated
	 */
	public Adapter createMultiActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.CompositeAction <em>Composite Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.CompositeAction
	 * @generated
	 */
	public Adapter createCompositeActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Synchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Synchronization
	 * @generated
	 */
	public Adapter createSynchronizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.TimedAction <em>Timed Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.TimedAction
	 * @generated
	 */
	public Adapter createTimedActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Implication <em>Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Implication
	 * @generated
	 */
	public Adapter createImplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.BoundedInitialisation <em>Bounded Initialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.BoundedInitialisation
	 * @generated
	 */
	public Adapter createBoundedInitialisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Parallelism <em>Parallelism</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Parallelism
	 * @generated
	 */
	public Adapter createParallelismAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.LeftMerge <em>Left Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.LeftMerge
	 * @generated
	 */
	public Adapter createLeftMergeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Nameable <em>Nameable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Nameable
	 * @generated
	 */
	public Adapter createNameableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.DataExpression <em>Data Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.DataExpression
	 * @generated
	 */
	public Adapter createDataExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Number
	 * @generated
	 */
	public Adapter createNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.BooleanLiteral
	 * @generated
	 */
	public Adapter createBooleanLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Collection
	 * @generated
	 */
	public Adapter createCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.SetEnumeration <em>Set Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.SetEnumeration
	 * @generated
	 */
	public Adapter createSetEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.ListEnumeration <em>List Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.ListEnumeration
	 * @generated
	 */
	public Adapter createListEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.BagEnumeration <em>Bag Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.BagEnumeration
	 * @generated
	 */
	public Adapter createBagEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.BagEnumElement <em>Bag Enum Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.BagEnumElement
	 * @generated
	 */
	public Adapter createBagEnumElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.FunctionApplication <em>Function Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.FunctionApplication
	 * @generated
	 */
	public Adapter createFunctionApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.MapAccess <em>Map Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.MapAccess
	 * @generated
	 */
	public Adapter createMapAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.UnaryExpression
	 * @generated
	 */
	public Adapter createUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Quantification <em>Quantification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Quantification
	 * @generated
	 */
	public Adapter createQuantificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.IdDecl <em>Id Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.IdDecl
	 * @generated
	 */
	public Adapter createIdDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.BinaryExpression
	 * @generated
	 */
	public Adapter createBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Lambda <em>Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Lambda
	 * @generated
	 */
	public Adapter createLambdaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.WhereClause <em>Where Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.WhereClause
	 * @generated
	 */
	public Adapter createWhereClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.ProcessDecl <em>Process Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.ProcessDecl
	 * @generated
	 */
	public Adapter createProcessDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.ConstraintElement <em>Constraint Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.ConstraintElement
	 * @generated
	 */
	public Adapter createConstraintElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link textualmcrl2.ConstraintVar <em>Constraint Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see textualmcrl2.ConstraintVar
	 * @generated
	 */
	public Adapter createConstraintVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Textualmcrl2AdapterFactory
