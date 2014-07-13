/**
 */
package textualmcrl2.impl;

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

import textualmcrl2.IdDecl;
import textualmcrl2.Op;
import textualmcrl2.Textualmcrl2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link textualmcrl2.impl.OpImpl#getOps <em>Ops</em>}</li>
 *   <li>{@link textualmcrl2.impl.OpImpl#isCons <em>Cons</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpImpl extends EObjectImpl implements Op {
	/**
	 * The cached value of the '{@link #getOps() <em>Ops</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOps()
	 * @generated
	 * @ordered
	 */
	protected EList<IdDecl> ops;

	/**
	 * The default value of the '{@link #isCons() <em>Cons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCons()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCons() <em>Cons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCons()
	 * @generated
	 * @ordered
	 */
	protected boolean cons = CONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Textualmcrl2Package.Literals.OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdDecl> getOps() {
		if (ops == null) {
			ops = new EObjectContainmentEList<IdDecl>(IdDecl.class, this, Textualmcrl2Package.OP__OPS);
		}
		return ops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCons() {
		return cons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCons(boolean newCons) {
		boolean oldCons = cons;
		cons = newCons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Textualmcrl2Package.OP__CONS, oldCons, cons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Textualmcrl2Package.OP__OPS:
				return ((InternalEList<?>)getOps()).basicRemove(otherEnd, msgs);
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
			case Textualmcrl2Package.OP__OPS:
				return getOps();
			case Textualmcrl2Package.OP__CONS:
				return isCons();
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
			case Textualmcrl2Package.OP__OPS:
				getOps().clear();
				getOps().addAll((Collection<? extends IdDecl>)newValue);
				return;
			case Textualmcrl2Package.OP__CONS:
				setCons((Boolean)newValue);
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
			case Textualmcrl2Package.OP__OPS:
				getOps().clear();
				return;
			case Textualmcrl2Package.OP__CONS:
				setCons(CONS_EDEFAULT);
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
			case Textualmcrl2Package.OP__OPS:
				return ops != null && !ops.isEmpty();
			case Textualmcrl2Package.OP__CONS:
				return cons != CONS_EDEFAULT;
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
		result.append(" (cons: ");
		result.append(cons);
		result.append(')');
		return result.toString();
	}

} //OpImpl
