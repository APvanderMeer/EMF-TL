/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package constraints.impl;

import constraints.Constraint;
import constraints.ConstraintsPackage;
import constraints.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link constraints.impl.ConstraintImpl#getName <em>Name</em>}</li>
 *   <li>{@link constraints.impl.ConstraintImpl#getLocalconstraints <em>Localconstraints</em>}</li>
 *   <li>{@link constraints.impl.ConstraintImpl#getLocalvariables <em>Localvariables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConstraintImpl extends EObjectImpl implements Constraint {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocalconstraints() <em>Localconstraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalconstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> localconstraints;

	/**
	 * The cached value of the '{@link #getLocalvariables() <em>Localvariables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalvariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> localvariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.CONSTRAINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getLocalconstraints() {
		if (localconstraints == null) {
			localconstraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, ConstraintsPackage.CONSTRAINT__LOCALCONSTRAINTS);
		}
		return localconstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getLocalvariables() {
		if (localvariables == null) {
			localvariables = new EObjectContainmentEList<Variable>(Variable.class, this, ConstraintsPackage.CONSTRAINT__LOCALVARIABLES);
		}
		return localvariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConstraintsPackage.CONSTRAINT__LOCALCONSTRAINTS:
				return ((InternalEList<?>)getLocalconstraints()).basicRemove(otherEnd, msgs);
			case ConstraintsPackage.CONSTRAINT__LOCALVARIABLES:
				return ((InternalEList<?>)getLocalvariables()).basicRemove(otherEnd, msgs);
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
			case ConstraintsPackage.CONSTRAINT__NAME:
				return getName();
			case ConstraintsPackage.CONSTRAINT__LOCALCONSTRAINTS:
				return getLocalconstraints();
			case ConstraintsPackage.CONSTRAINT__LOCALVARIABLES:
				return getLocalvariables();
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
			case ConstraintsPackage.CONSTRAINT__NAME:
				setName((String)newValue);
				return;
			case ConstraintsPackage.CONSTRAINT__LOCALCONSTRAINTS:
				getLocalconstraints().clear();
				getLocalconstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case ConstraintsPackage.CONSTRAINT__LOCALVARIABLES:
				getLocalvariables().clear();
				getLocalvariables().addAll((Collection<? extends Variable>)newValue);
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
			case ConstraintsPackage.CONSTRAINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConstraintsPackage.CONSTRAINT__LOCALCONSTRAINTS:
				getLocalconstraints().clear();
				return;
			case ConstraintsPackage.CONSTRAINT__LOCALVARIABLES:
				getLocalvariables().clear();
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
			case ConstraintsPackage.CONSTRAINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConstraintsPackage.CONSTRAINT__LOCALCONSTRAINTS:
				return localconstraints != null && !localconstraints.isEmpty();
			case ConstraintsPackage.CONSTRAINT__LOCALVARIABLES:
				return localvariables != null && !localvariables.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConstraintImpl
