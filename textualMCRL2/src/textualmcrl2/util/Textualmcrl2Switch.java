/**
 */
package textualmcrl2.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see textualmcrl2.Textualmcrl2Package
 * @generated
 */
public class Textualmcrl2Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Textualmcrl2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Textualmcrl2Switch() {
		if (modelPackage == null) {
			modelPackage = Textualmcrl2Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Textualmcrl2Package.SPECIFICATION: {
				Specification specification = (Specification)theEObject;
				T result = caseSpecification(specification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.SORT: {
				Sort sort = (Sort)theEObject;
				T result = caseSort(sort);
				if (result == null) result = caseNameable(sort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.EXPRESSION_SORT: {
				ExpressionSort expressionSort = (ExpressionSort)theEObject;
				T result = caseExpressionSort(expressionSort);
				if (result == null) result = caseSort(expressionSort);
				if (result == null) result = caseNameable(expressionSort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.STRUCTURE_SORT: {
				StructureSort structureSort = (StructureSort)theEObject;
				T result = caseStructureSort(structureSort);
				if (result == null) result = caseSort(structureSort);
				if (result == null) result = caseNameable(structureSort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.SORT_EXPR: {
				SortExpr sortExpr = (SortExpr)theEObject;
				T result = caseSortExpr(sortExpr);
				if (result == null) result = caseConstraintElement(sortExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.BOOL: {
				Bool bool = (Bool)theEObject;
				T result = caseBool(bool);
				if (result == null) result = caseSortExpr(bool);
				if (result == null) result = caseConstraintElement(bool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.POS: {
				Pos pos = (Pos)theEObject;
				T result = casePos(pos);
				if (result == null) result = caseSortExpr(pos);
				if (result == null) result = caseConstraintElement(pos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.NAT: {
				Nat nat = (Nat)theEObject;
				T result = caseNat(nat);
				if (result == null) result = caseSortExpr(nat);
				if (result == null) result = caseConstraintElement(nat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.INT: {
				Int int_ = (Int)theEObject;
				T result = caseInt(int_);
				if (result == null) result = caseSortExpr(int_);
				if (result == null) result = caseConstraintElement(int_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.REAL: {
				Real real = (Real)theEObject;
				T result = caseReal(real);
				if (result == null) result = caseSortExpr(real);
				if (result == null) result = caseConstraintElement(real);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.LIST: {
				List list = (List)theEObject;
				T result = caseList(list);
				if (result == null) result = caseSortExpr(list);
				if (result == null) result = caseConstraintElement(list);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.SET: {
				Set set = (Set)theEObject;
				T result = caseSet(set);
				if (result == null) result = caseSortExpr(set);
				if (result == null) result = caseConstraintElement(set);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.BAG: {
				Bag bag = (Bag)theEObject;
				T result = caseBag(bag);
				if (result == null) result = caseSortExpr(bag);
				if (result == null) result = caseConstraintElement(bag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.SORT_REF: {
				SortRef sortRef = (SortRef)theEObject;
				T result = caseSortRef(sortRef);
				if (result == null) result = caseSortExpr(sortRef);
				if (result == null) result = caseConstraintElement(sortRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.HIGHER_ORDER: {
				HigherOrder higherOrder = (HigherOrder)theEObject;
				T result = caseHigherOrder(higherOrder);
				if (result == null) result = caseSortExpr(higherOrder);
				if (result == null) result = caseConstraintElement(higherOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.CONSTRUCTOR: {
				Constructor constructor = (Constructor)theEObject;
				T result = caseConstructor(constructor);
				if (result == null) result = caseNameable(constructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.PROJECTION: {
				Projection projection = (Projection)theEObject;
				T result = caseProjection(projection);
				if (result == null) result = caseNameable(projection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.OP: {
				Op op = (Op)theEObject;
				T result = caseOp(op);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.EQN: {
				Eqn eqn = (Eqn)theEObject;
				T result = caseEqn(eqn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.EQUATION: {
				Equation equation = (Equation)theEObject;
				T result = caseEquation(equation);
				if (result == null) result = caseConstraintElement(equation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.ATOM: {
				Atom atom = (Atom)theEObject;
				T result = caseAtom(atom);
				if (result == null) result = caseNameable(atom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.PROCESS_EXPR: {
				ProcessExpr processExpr = (ProcessExpr)theEObject;
				T result = caseProcessExpr(processExpr);
				if (result == null) result = caseConstraintElement(processExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.ATOMIC_ACTION: {
				AtomicAction atomicAction = (AtomicAction)theEObject;
				T result = caseAtomicAction(atomicAction);
				if (result == null) result = caseProcessExpr(atomicAction);
				if (result == null) result = caseConstraintElement(atomicAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.DEADLOCK: {
				Deadlock deadlock = (Deadlock)theEObject;
				T result = caseDeadlock(deadlock);
				if (result == null) result = caseProcessExpr(deadlock);
				if (result == null) result = caseConstraintElement(deadlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.TAU: {
				Tau tau = (Tau)theEObject;
				T result = caseTau(tau);
				if (result == null) result = caseProcessExpr(tau);
				if (result == null) result = caseConstraintElement(tau);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.SUMMATION: {
				Summation summation = (Summation)theEObject;
				T result = caseSummation(summation);
				if (result == null) result = caseProcessExpr(summation);
				if (result == null) result = caseConstraintElement(summation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseProcessExpr(block);
				if (result == null) result = caseConstraintElement(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.ALLOW: {
				Allow allow = (Allow)theEObject;
				T result = caseAllow(allow);
				if (result == null) result = caseProcessExpr(allow);
				if (result == null) result = caseConstraintElement(allow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.HIDE: {
				Hide hide = (Hide)theEObject;
				T result = caseHide(hide);
				if (result == null) result = caseProcessExpr(hide);
				if (result == null) result = caseConstraintElement(hide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.RENAME: {
				Rename rename = (Rename)theEObject;
				T result = caseRename(rename);
				if (result == null) result = caseProcessExpr(rename);
				if (result == null) result = caseConstraintElement(rename);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.RENAMING: {
				Renaming renaming = (Renaming)theEObject;
				T result = caseRenaming(renaming);
				if (result == null) result = caseConstraintElement(renaming);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.COMMUNICATION: {
				Communication communication = (Communication)theEObject;
				T result = caseCommunication(communication);
				if (result == null) result = caseProcessExpr(communication);
				if (result == null) result = caseConstraintElement(communication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.MULTI_ACTION: {
				MultiAction multiAction = (MultiAction)theEObject;
				T result = caseMultiAction(multiAction);
				if (result == null) result = caseConstraintElement(multiAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.COMPOSITE_ACTION: {
				CompositeAction compositeAction = (CompositeAction)theEObject;
				T result = caseCompositeAction(compositeAction);
				if (result == null) result = caseProcessExpr(compositeAction);
				if (result == null) result = caseConstraintElement(compositeAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.SYNCHRONIZATION: {
				Synchronization synchronization = (Synchronization)theEObject;
				T result = caseSynchronization(synchronization);
				if (result == null) result = caseCompositeAction(synchronization);
				if (result == null) result = caseProcessExpr(synchronization);
				if (result == null) result = caseConstraintElement(synchronization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.TIMED_ACTION: {
				TimedAction timedAction = (TimedAction)theEObject;
				T result = caseTimedAction(timedAction);
				if (result == null) result = caseCompositeAction(timedAction);
				if (result == null) result = caseProcessExpr(timedAction);
				if (result == null) result = caseConstraintElement(timedAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.SEQUENCE: {
				Sequence sequence = (Sequence)theEObject;
				T result = caseSequence(sequence);
				if (result == null) result = caseCompositeAction(sequence);
				if (result == null) result = caseProcessExpr(sequence);
				if (result == null) result = caseConstraintElement(sequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.IMPLICATION: {
				Implication implication = (Implication)theEObject;
				T result = caseImplication(implication);
				if (result == null) result = caseProcessExpr(implication);
				if (result == null) result = caseConstraintElement(implication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.BOUNDED_INITIALISATION: {
				BoundedInitialisation boundedInitialisation = (BoundedInitialisation)theEObject;
				T result = caseBoundedInitialisation(boundedInitialisation);
				if (result == null) result = caseCompositeAction(boundedInitialisation);
				if (result == null) result = caseProcessExpr(boundedInitialisation);
				if (result == null) result = caseConstraintElement(boundedInitialisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.PARALLELISM: {
				Parallelism parallelism = (Parallelism)theEObject;
				T result = caseParallelism(parallelism);
				if (result == null) result = caseCompositeAction(parallelism);
				if (result == null) result = caseProcessExpr(parallelism);
				if (result == null) result = caseConstraintElement(parallelism);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.LEFT_MERGE: {
				LeftMerge leftMerge = (LeftMerge)theEObject;
				T result = caseLeftMerge(leftMerge);
				if (result == null) result = caseCompositeAction(leftMerge);
				if (result == null) result = caseProcessExpr(leftMerge);
				if (result == null) result = caseConstraintElement(leftMerge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.CHOICE: {
				Choice choice = (Choice)theEObject;
				T result = caseChoice(choice);
				if (result == null) result = caseCompositeAction(choice);
				if (result == null) result = caseProcessExpr(choice);
				if (result == null) result = caseConstraintElement(choice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.NAMEABLE: {
				Nameable nameable = (Nameable)theEObject;
				T result = caseNameable(nameable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.DATA_EXPRESSION: {
				DataExpression dataExpression = (DataExpression)theEObject;
				T result = caseDataExpression(dataExpression);
				if (result == null) result = caseConstraintElement(dataExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.IDENTIFIER: {
				Identifier identifier = (Identifier)theEObject;
				T result = caseIdentifier(identifier);
				if (result == null) result = caseDataExpression(identifier);
				if (result == null) result = caseConstraintElement(identifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.NUMBER: {
				textualmcrl2.Number number = (textualmcrl2.Number)theEObject;
				T result = caseNumber(number);
				if (result == null) result = caseDataExpression(number);
				if (result == null) result = caseConstraintElement(number);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.BOOLEAN_LITERAL: {
				BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
				T result = caseBooleanLiteral(booleanLiteral);
				if (result == null) result = caseDataExpression(booleanLiteral);
				if (result == null) result = caseConstraintElement(booleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.COLLECTION: {
				Collection collection = (Collection)theEObject;
				T result = caseCollection(collection);
				if (result == null) result = caseDataExpression(collection);
				if (result == null) result = caseConstraintElement(collection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.SET_ENUMERATION: {
				SetEnumeration setEnumeration = (SetEnumeration)theEObject;
				T result = caseSetEnumeration(setEnumeration);
				if (result == null) result = caseCollection(setEnumeration);
				if (result == null) result = caseDataExpression(setEnumeration);
				if (result == null) result = caseConstraintElement(setEnumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.LIST_ENUMERATION: {
				ListEnumeration listEnumeration = (ListEnumeration)theEObject;
				T result = caseListEnumeration(listEnumeration);
				if (result == null) result = caseCollection(listEnumeration);
				if (result == null) result = caseDataExpression(listEnumeration);
				if (result == null) result = caseConstraintElement(listEnumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.BAG_ENUMERATION: {
				BagEnumeration bagEnumeration = (BagEnumeration)theEObject;
				T result = caseBagEnumeration(bagEnumeration);
				if (result == null) result = caseCollection(bagEnumeration);
				if (result == null) result = caseDataExpression(bagEnumeration);
				if (result == null) result = caseConstraintElement(bagEnumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.BAG_ENUM_ELEMENT: {
				BagEnumElement bagEnumElement = (BagEnumElement)theEObject;
				T result = caseBagEnumElement(bagEnumElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.FUNCTION_APPLICATION: {
				FunctionApplication functionApplication = (FunctionApplication)theEObject;
				T result = caseFunctionApplication(functionApplication);
				if (result == null) result = caseDataExpression(functionApplication);
				if (result == null) result = caseConstraintElement(functionApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.MAP_ACCESS: {
				MapAccess mapAccess = (MapAccess)theEObject;
				T result = caseMapAccess(mapAccess);
				if (result == null) result = caseDataExpression(mapAccess);
				if (result == null) result = caseConstraintElement(mapAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.UNARY_EXPRESSION: {
				UnaryExpression unaryExpression = (UnaryExpression)theEObject;
				T result = caseUnaryExpression(unaryExpression);
				if (result == null) result = caseDataExpression(unaryExpression);
				if (result == null) result = caseConstraintElement(unaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.QUANTIFICATION: {
				Quantification quantification = (Quantification)theEObject;
				T result = caseQuantification(quantification);
				if (result == null) result = caseDataExpression(quantification);
				if (result == null) result = caseConstraintElement(quantification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.ID_DECL: {
				IdDecl idDecl = (IdDecl)theEObject;
				T result = caseIdDecl(idDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.BINARY_EXPRESSION: {
				BinaryExpression binaryExpression = (BinaryExpression)theEObject;
				T result = caseBinaryExpression(binaryExpression);
				if (result == null) result = caseDataExpression(binaryExpression);
				if (result == null) result = caseConstraintElement(binaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.LAMBDA: {
				Lambda lambda = (Lambda)theEObject;
				T result = caseLambda(lambda);
				if (result == null) result = caseDataExpression(lambda);
				if (result == null) result = caseConstraintElement(lambda);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.WHERE_CLAUSE: {
				WhereClause whereClause = (WhereClause)theEObject;
				T result = caseWhereClause(whereClause);
				if (result == null) result = caseDataExpression(whereClause);
				if (result == null) result = caseConstraintElement(whereClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.PROCESS: {
				textualmcrl2.Process process = (textualmcrl2.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = caseNameable(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.PROCESS_DECL: {
				ProcessDecl processDecl = (ProcessDecl)theEObject;
				T result = caseProcessDecl(processDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.CONSTRAINT_ELEMENT: {
				ConstraintElement constraintElement = (ConstraintElement)theEObject;
				T result = caseConstraintElement(constraintElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Textualmcrl2Package.CONSTRAINT_VAR: {
				ConstraintVar constraintVar = (ConstraintVar)theEObject;
				T result = caseConstraintVar(constraintVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecification(Specification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSort(Sort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Sort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Sort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionSort(ExpressionSort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Sort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Sort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureSort(StructureSort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortExpr(SortExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBool(Bool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePos(Pos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNat(Nat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInt(Int object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReal(Real object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseList(List object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSet(Set object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBag(Bag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortRef(SortRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Higher Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Higher Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHigherOrder(HigherOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructor(Constructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Projection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Projection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjection(Projection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOp(Op object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eqn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eqn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqn(Eqn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquation(Equation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtom(Atom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessExpr(ProcessExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicAction(AtomicAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deadlock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deadlock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeadlock(Deadlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tau</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tau</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTau(Tau object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Summation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Summation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSummation(Summation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllow(Allow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHide(Hide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rename</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rename</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRename(Rename object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Renaming</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Renaming</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenaming(Renaming object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunication(Communication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiAction(MultiAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeAction(CompositeAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronization(Synchronization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedAction(TimedAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequence(Sequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplication(Implication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Initialisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Initialisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedInitialisation(BoundedInitialisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallelism</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallelism</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelism(Parallelism object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Merge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Merge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeftMerge(LeftMerge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoice(Choice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameable(Nameable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataExpression(DataExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber(textualmcrl2.Number object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteral(BooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollection(Collection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetEnumeration(SetEnumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListEnumeration(ListEnumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bag Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bag Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBagEnumeration(BagEnumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bag Enum Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bag Enum Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBagEnumElement(BagEnumElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionApplication(FunctionApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapAccess(MapAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpression(UnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantification(Quantification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Id Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Id Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdDecl(IdDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExpression(BinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lambda</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lambda</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLambda(Lambda object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Where Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Where Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhereClause(WhereClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(textualmcrl2.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessDecl(ProcessDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintElement(ConstraintElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintVar(ConstraintVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Textualmcrl2Switch
