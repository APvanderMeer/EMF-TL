/**
 */
package textualmcrl2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import textualmcrl2.ConstraintElement;
import textualmcrl2.ConstraintVar;
import textualmcrl2.Textualmcrl2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link textualmcrl2.impl.ConstraintElementImpl#getConstraintvar <em>Constraintvar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConstraintElementImpl extends EObjectImpl implements ConstraintElement {
	/**
	 * The cached value of the '{@link #getConstraintvar() <em>Constraintvar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintvar()
	 * @generated
	 * @ordered
	 */
	protected ConstraintVar constraintvar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Textualmcrl2Package.Literals.CONSTRAINT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintVar getConstraintvar() {
		return constraintvar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraintvar(ConstraintVar newConstraintvar, NotificationChain msgs) {
		ConstraintVar oldConstraintvar = constraintvar;
		constraintvar = newConstraintvar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Textualmcrl2Package.CONSTRAINT_ELEMENT__CONSTRAINTVAR, oldConstraintvar, newConstraintvar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintvar(ConstraintVar newConstraintvar) {
		if (newConstraintvar != constraintvar) {
			NotificationChain msgs = null;
			if (constraintvar != null)
				msgs = ((InternalEObject)constraintvar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Textualmcrl2Package.CONSTRAINT_ELEMENT__CONSTRAINTVAR, null, msgs);
			if (newConstraintvar != null)
				msgs = ((InternalEObject)newConstraintvar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Textualmcrl2Package.CONSTRAINT_ELEMENT__CONSTRAINTVAR, null, msgs);
			msgs = basicSetConstraintvar(newConstraintvar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Textualmcrl2Package.CONSTRAINT_ELEMENT__CONSTRAINTVAR, newConstraintvar, newConstraintvar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Textualmcrl2Package.CONSTRAINT_ELEMENT__CONSTRAINTVAR:
				return basicSetConstraintvar(null, msgs);
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
			case Textualmcrl2Package.CONSTRAINT_ELEMENT__CONSTRAINTVAR:
				return getConstraintvar();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Textualmcrl2Package.CONSTRAINT_ELEMENT__CONSTRAINTVAR:
				setConstraintvar((ConstraintVar)newValue);
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
			case Textualmcrl2Package.CONSTRAINT_ELEMENT__CONSTRAINTVAR:
				setConstraintvar((ConstraintVar)null);
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
			case Textualmcrl2Package.CONSTRAINT_ELEMENT__CONSTRAINTVAR:
				return constraintvar != null;
		}
		return super.eIsSet(featureID);
	}

} //ConstraintElementImpl
