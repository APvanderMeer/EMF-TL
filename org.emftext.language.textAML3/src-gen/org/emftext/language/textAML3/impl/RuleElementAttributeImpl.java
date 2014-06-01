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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.emftext.language.textAML3.RuleElementAttribute;
import org.emftext.language.textAML3.TextAML3Package;
import org.emftext.language.textAML3.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Element Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.textAML3.impl.RuleElementAttributeImpl#getMyattribute <em>Myattribute</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.impl.RuleElementAttributeImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleElementAttributeImpl extends EObjectImpl implements RuleElementAttribute {
	/**
	 * The cached value of the '{@link #getMyattribute() <em>Myattribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyattribute()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature myattribute;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleElementAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextAML3Package.Literals.RULE_ELEMENT_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getMyattribute() {
		if (myattribute != null && myattribute.eIsProxy()) {
			InternalEObject oldMyattribute = (InternalEObject)myattribute;
			myattribute = (EStructuralFeature)eResolveProxy(oldMyattribute);
			if (myattribute != oldMyattribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TextAML3Package.RULE_ELEMENT_ATTRIBUTE__MYATTRIBUTE, oldMyattribute, myattribute));
			}
		}
		return myattribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetMyattribute() {
		return myattribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyattribute(EStructuralFeature newMyattribute) {
		EStructuralFeature oldMyattribute = myattribute;
		myattribute = newMyattribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextAML3Package.RULE_ELEMENT_ATTRIBUTE__MYATTRIBUTE, oldMyattribute, myattribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(Variable newVariable, NotificationChain msgs) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextAML3Package.RULE_ELEMENT_ATTRIBUTE__VARIABLE, oldVariable, newVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextAML3Package.RULE_ELEMENT_ATTRIBUTE__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextAML3Package.RULE_ELEMENT_ATTRIBUTE__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextAML3Package.RULE_ELEMENT_ATTRIBUTE__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextAML3Package.RULE_ELEMENT_ATTRIBUTE__VARIABLE:
				return basicSetVariable(null, msgs);
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
			case TextAML3Package.RULE_ELEMENT_ATTRIBUTE__MYATTRIBUTE:
				if (resolve) return getMyattribute();
				return basicGetMyattribute();
			case TextAML3Package.RULE_ELEMENT_ATTRIBUTE__VARIABLE:
				return getVariable();
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
			case TextAML3Package.RULE_ELEMENT_ATTRIBUTE__MYATTRIBUTE:
				setMyattribute((EStructuralFeature)newValue);
				return;
			case TextAML3Package.RULE_ELEMENT_ATTRIBUTE__VARIABLE:
				setVariable((Variable)newValue);
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
			case TextAML3Package.RULE_ELEMENT_ATTRIBUTE__MYATTRIBUTE:
				setMyattribute((EStructuralFeature)null);
				return;
			case TextAML3Package.RULE_ELEMENT_ATTRIBUTE__VARIABLE:
				setVariable((Variable)null);
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
			case TextAML3Package.RULE_ELEMENT_ATTRIBUTE__MYATTRIBUTE:
				return myattribute != null;
			case TextAML3Package.RULE_ELEMENT_ATTRIBUTE__VARIABLE:
				return variable != null;
		}
		return super.eIsSet(featureID);
	}

} //RuleElementAttributeImpl
