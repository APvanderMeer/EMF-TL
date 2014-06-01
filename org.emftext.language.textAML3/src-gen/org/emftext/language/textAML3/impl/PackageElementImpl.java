/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftext.language.textAML3.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.emftext.language.textAML3.PackageElement;
import org.emftext.language.textAML3.TextAML3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.textAML3.impl.PackageElementImpl#getTargetpackage <em>Targetpackage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageElementImpl extends EObjectImpl implements PackageElement {
	/**
	 * The cached value of the '{@link #getTargetpackage() <em>Targetpackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetpackage()
	 * @generated
	 * @ordered
	 */
	protected EPackage targetpackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextAML3Package.Literals.PACKAGE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getTargetpackage() {
		if (targetpackage != null && targetpackage.eIsProxy()) {
			InternalEObject oldTargetpackage = (InternalEObject)targetpackage;
			targetpackage = (EPackage)eResolveProxy(oldTargetpackage);
			if (targetpackage != oldTargetpackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TextAML3Package.PACKAGE_ELEMENT__TARGETPACKAGE, oldTargetpackage, targetpackage));
			}
		}
		return targetpackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetTargetpackage() {
		return targetpackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetpackage(EPackage newTargetpackage) {
		EPackage oldTargetpackage = targetpackage;
		targetpackage = newTargetpackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextAML3Package.PACKAGE_ELEMENT__TARGETPACKAGE, oldTargetpackage, targetpackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TextAML3Package.PACKAGE_ELEMENT__TARGETPACKAGE:
				if (resolve) return getTargetpackage();
				return basicGetTargetpackage();
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
			case TextAML3Package.PACKAGE_ELEMENT__TARGETPACKAGE:
				setTargetpackage((EPackage)newValue);
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
			case TextAML3Package.PACKAGE_ELEMENT__TARGETPACKAGE:
				setTargetpackage((EPackage)null);
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
			case TextAML3Package.PACKAGE_ELEMENT__TARGETPACKAGE:
				return targetpackage != null;
		}
		return super.eIsSet(featureID);
	}

} //PackageElementImpl
