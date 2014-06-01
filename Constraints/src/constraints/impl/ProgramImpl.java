/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package constraints.impl;

import constraints.Constraint;
import constraints.ConstraintsPackage;
import constraints.Operator;
import constraints.Program;
import constraints.Type;
import constraints.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link constraints.impl.ProgramImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link constraints.impl.ProgramImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link constraints.impl.ProgramImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link constraints.impl.ProgramImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link constraints.impl.ProgramImpl#getOperators <em>Operators</em>}</li>
 *   <li>{@link constraints.impl.ProgramImpl#getTypeAttribute <em>Type Attribute</em>}</li>
 *   <li>{@link constraints.impl.ProgramImpl#getObjectElements <em>Object Elements</em>}</li>
 *   <li>{@link constraints.impl.ProgramImpl#getErrorconstraints <em>Errorconstraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramImpl extends EObjectImpl implements Program {
	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected Variable root;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * The cached value of the '{@link #getOperators() <em>Operators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperators()
	 * @generated
	 * @ordered
	 */
	protected EList<Operator> operators;

	/**
	 * The cached value of the '{@link #getTypeAttribute() <em>Type Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> typeAttribute;

	/**
	 * The cached value of the '{@link #getObjectElements() <em>Object Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> objectElements;

	/**
	 * The cached value of the '{@link #getErrorconstraints() <em>Errorconstraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorconstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> errorconstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, ConstraintsPackage.PROGRAM__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, ConstraintsPackage.PROGRAM__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getRoot() {
		if (root != null && root.eIsProxy()) {
			InternalEObject oldRoot = (InternalEObject)root;
			root = (Variable)eResolveProxy(oldRoot);
			if (root != oldRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintsPackage.PROGRAM__ROOT, oldRoot, root));
			}
		}
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(Variable newRoot) {
		Variable oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.PROGRAM__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<Type>(Type.class, this, ConstraintsPackage.PROGRAM__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operator> getOperators() {
		if (operators == null) {
			operators = new EObjectContainmentEList<Operator>(Operator.class, this, ConstraintsPackage.PROGRAM__OPERATORS);
		}
		return operators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getTypeAttribute() {
		if (typeAttribute == null) {
			typeAttribute = new EDataTypeUniqueEList<Integer>(Integer.class, this, ConstraintsPackage.PROGRAM__TYPE_ATTRIBUTE);
		}
		return typeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getObjectElements() {
		if (objectElements == null) {
			objectElements = new EDataTypeUniqueEList<String>(String.class, this, ConstraintsPackage.PROGRAM__OBJECT_ELEMENTS);
		}
		return objectElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getErrorconstraints() {
		if (errorconstraints == null) {
			errorconstraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, ConstraintsPackage.PROGRAM__ERRORCONSTRAINTS);
		}
		return errorconstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConstraintsPackage.PROGRAM__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case ConstraintsPackage.PROGRAM__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case ConstraintsPackage.PROGRAM__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case ConstraintsPackage.PROGRAM__OPERATORS:
				return ((InternalEList<?>)getOperators()).basicRemove(otherEnd, msgs);
			case ConstraintsPackage.PROGRAM__ERRORCONSTRAINTS:
				return ((InternalEList<?>)getErrorconstraints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstraintsPackage.PROGRAM__CONSTRAINTS:
				return getConstraints();
			case ConstraintsPackage.PROGRAM__VARIABLES:
				return getVariables();
			case ConstraintsPackage.PROGRAM__ROOT:
				if (resolve) return getRoot();
				return basicGetRoot();
			case ConstraintsPackage.PROGRAM__TYPES:
				return getTypes();
			case ConstraintsPackage.PROGRAM__OPERATORS:
				return getOperators();
			case ConstraintsPackage.PROGRAM__TYPE_ATTRIBUTE:
				return getTypeAttribute();
			case ConstraintsPackage.PROGRAM__OBJECT_ELEMENTS:
				return getObjectElements();
			case ConstraintsPackage.PROGRAM__ERRORCONSTRAINTS:
				return getErrorconstraints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConstraintsPackage.PROGRAM__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case ConstraintsPackage.PROGRAM__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case ConstraintsPackage.PROGRAM__ROOT:
				setRoot((Variable)newValue);
				return;
			case ConstraintsPackage.PROGRAM__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case ConstraintsPackage.PROGRAM__OPERATORS:
				getOperators().clear();
				getOperators().addAll((Collection<? extends Operator>)newValue);
				return;
			case ConstraintsPackage.PROGRAM__TYPE_ATTRIBUTE:
				getTypeAttribute().clear();
				getTypeAttribute().addAll((Collection<? extends Integer>)newValue);
				return;
			case ConstraintsPackage.PROGRAM__OBJECT_ELEMENTS:
				getObjectElements().clear();
				getObjectElements().addAll((Collection<? extends String>)newValue);
				return;
			case ConstraintsPackage.PROGRAM__ERRORCONSTRAINTS:
				getErrorconstraints().clear();
				getErrorconstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConstraintsPackage.PROGRAM__CONSTRAINTS:
				getConstraints().clear();
				return;
			case ConstraintsPackage.PROGRAM__VARIABLES:
				getVariables().clear();
				return;
			case ConstraintsPackage.PROGRAM__ROOT:
				setRoot((Variable)null);
				return;
			case ConstraintsPackage.PROGRAM__TYPES:
				getTypes().clear();
				return;
			case ConstraintsPackage.PROGRAM__OPERATORS:
				getOperators().clear();
				return;
			case ConstraintsPackage.PROGRAM__TYPE_ATTRIBUTE:
				getTypeAttribute().clear();
				return;
			case ConstraintsPackage.PROGRAM__OBJECT_ELEMENTS:
				getObjectElements().clear();
				return;
			case ConstraintsPackage.PROGRAM__ERRORCONSTRAINTS:
				getErrorconstraints().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConstraintsPackage.PROGRAM__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case ConstraintsPackage.PROGRAM__VARIABLES:
				return variables != null && !variables.isEmpty();
			case ConstraintsPackage.PROGRAM__ROOT:
				return root != null;
			case ConstraintsPackage.PROGRAM__TYPES:
				return types != null && !types.isEmpty();
			case ConstraintsPackage.PROGRAM__OPERATORS:
				return operators != null && !operators.isEmpty();
			case ConstraintsPackage.PROGRAM__TYPE_ATTRIBUTE:
				return typeAttribute != null && !typeAttribute.isEmpty();
			case ConstraintsPackage.PROGRAM__OBJECT_ELEMENTS:
				return objectElements != null && !objectElements.isEmpty();
			case ConstraintsPackage.PROGRAM__ERRORCONSTRAINTS:
				return errorconstraints != null && !errorconstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (typeAttribute: ");
		result.append(typeAttribute);
		result.append(", objectElements: ");
		result.append(objectElements);
		result.append(')');
		return result.toString();
	}

} //ProgramImpl
