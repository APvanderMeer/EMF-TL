/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftext.language.textAML3.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.emftext.language.textAML3.TextAML3Package;
import org.emftext.language.textAML3.TypeAttribute;
import org.emftext.language.textAML3.TypeRelationReferenceElement;
import org.emftext.language.textAML3.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Relation Reference Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.textAML3.impl.TypeRelationReferenceElementImpl#getTypeattribute <em>Typeattribute</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.impl.TypeRelationReferenceElementImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeRelationReferenceElementImpl extends EObjectImpl implements TypeRelationReferenceElement {
	/**
	 * The cached value of the '{@link #getTypeattribute() <em>Typeattribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeattribute()
	 * @generated
	 * @ordered
	 */
	protected TypeAttribute typeattribute;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Variable value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeRelationReferenceElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextAML3Package.Literals.TYPE_RELATION_REFERENCE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAttribute getTypeattribute() {
		if (typeattribute != null && typeattribute.eIsProxy()) {
			InternalEObject oldTypeattribute = (InternalEObject)typeattribute;
			typeattribute = (TypeAttribute)eResolveProxy(oldTypeattribute);
			if (typeattribute != oldTypeattribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TextAML3Package.TYPE_RELATION_REFERENCE_ELEMENT__TYPEATTRIBUTE, oldTypeattribute, typeattribute));
			}
		}
		return typeattribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAttribute basicGetTypeattribute() {
		return typeattribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeattribute(TypeAttribute newTypeattribute) {
		TypeAttribute oldTypeattribute = typeattribute;
		typeattribute = newTypeattribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextAML3Package.TYPE_RELATION_REFERENCE_ELEMENT__TYPEATTRIBUTE, oldTypeattribute, typeattribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Variable newValue, NotificationChain msgs) {
		Variable oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextAML3Package.TYPE_RELATION_REFERENCE_ELEMENT__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Variable newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextAML3Package.TYPE_RELATION_REFERENCE_ELEMENT__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextAML3Package.TYPE_RELATION_REFERENCE_ELEMENT__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextAML3Package.TYPE_RELATION_REFERENCE_ELEMENT__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextAML3Package.TYPE_RELATION_REFERENCE_ELEMENT__VALUE:
				return basicSetValue(null, msgs);
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
			case TextAML3Package.TYPE_RELATION_REFERENCE_ELEMENT__TYPEATTRIBUTE:
				if (resolve) return getTypeattribute();
				return basicGetTypeattribute();
			case TextAML3Package.TYPE_RELATION_REFERENCE_ELEMENT__VALUE:
				return getValue();
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
			case TextAML3Package.TYPE_RELATION_REFERENCE_ELEMENT__TYPEATTRIBUTE:
				setTypeattribute((TypeAttribute)newValue);
				return;
			case TextAML3Package.TYPE_RELATION_REFERENCE_ELEMENT__VALUE:
				setValue((Variable)newValue);
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
			case TextAML3Package.TYPE_RELATION_REFERENCE_ELEMENT__TYPEATTRIBUTE:
				setTypeattribute((TypeAttribute)null);
				return;
			case TextAML3Package.TYPE_RELATION_REFERENCE_ELEMENT__VALUE:
				setValue((Variable)null);
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
			case TextAML3Package.TYPE_RELATION_REFERENCE_ELEMENT__TYPEATTRIBUTE:
				return typeattribute != null;
			case TextAML3Package.TYPE_RELATION_REFERENCE_ELEMENT__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeRelationReferenceElementImpl
