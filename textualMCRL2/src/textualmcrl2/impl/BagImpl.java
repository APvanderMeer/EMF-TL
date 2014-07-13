/**
 */
package textualmcrl2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import textualmcrl2.Bag;
import textualmcrl2.SortExpr;
import textualmcrl2.Textualmcrl2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link textualmcrl2.impl.BagImpl#getElementSort <em>Element Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BagImpl extends SortExprImpl implements Bag {
	/**
	 * The cached value of the '{@link #getElementSort() <em>Element Sort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementSort()
	 * @generated
	 * @ordered
	 */
	protected SortExpr elementSort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Textualmcrl2Package.Literals.BAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortExpr getElementSort() {
		return elementSort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementSort(SortExpr newElementSort, NotificationChain msgs) {
		SortExpr oldElementSort = elementSort;
		elementSort = newElementSort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Textualmcrl2Package.BAG__ELEMENT_SORT, oldElementSort, newElementSort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementSort(SortExpr newElementSort) {
		if (newElementSort != elementSort) {
			NotificationChain msgs = null;
			if (elementSort != null)
				msgs = ((InternalEObject)elementSort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Textualmcrl2Package.BAG__ELEMENT_SORT, null, msgs);
			if (newElementSort != null)
				msgs = ((InternalEObject)newElementSort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Textualmcrl2Package.BAG__ELEMENT_SORT, null, msgs);
			msgs = basicSetElementSort(newElementSort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Textualmcrl2Package.BAG__ELEMENT_SORT, newElementSort, newElementSort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Textualmcrl2Package.BAG__ELEMENT_SORT:
				return basicSetElementSort(null, msgs);
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
			case Textualmcrl2Package.BAG__ELEMENT_SORT:
				return getElementSort();
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
			case Textualmcrl2Package.BAG__ELEMENT_SORT:
				setElementSort((SortExpr)newValue);
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
			case Textualmcrl2Package.BAG__ELEMENT_SORT:
				setElementSort((SortExpr)null);
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
			case Textualmcrl2Package.BAG__ELEMENT_SORT:
				return elementSort != null;
		}
		return super.eIsSet(featureID);
	}

} //BagImpl
