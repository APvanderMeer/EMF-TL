/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftext.language.textAML3.impl;

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

import org.emftext.language.textAML3.RuleElementAttribute;
import org.emftext.language.textAML3.RuleElementExpression;
import org.emftext.language.textAML3.TextAML3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Element Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.textAML3.impl.RuleElementExpressionImpl#getBaseclass <em>Baseclass</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.impl.RuleElementExpressionImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleElementExpressionImpl extends EObjectImpl implements RuleElementExpression {
	/**
	 * The cached value of the '{@link #getBaseclass() <em>Baseclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseclass()
	 * @generated
	 * @ordered
	 */
	protected EClass baseclass;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleElementAttribute> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleElementExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextAML3Package.Literals.RULE_ELEMENT_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseclass() {
		if (baseclass != null && baseclass.eIsProxy()) {
			InternalEObject oldBaseclass = (InternalEObject)baseclass;
			baseclass = (EClass)eResolveProxy(oldBaseclass);
			if (baseclass != oldBaseclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TextAML3Package.RULE_ELEMENT_EXPRESSION__BASECLASS, oldBaseclass, baseclass));
			}
		}
		return baseclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetBaseclass() {
		return baseclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseclass(EClass newBaseclass) {
		EClass oldBaseclass = baseclass;
		baseclass = newBaseclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextAML3Package.RULE_ELEMENT_EXPRESSION__BASECLASS, oldBaseclass, baseclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleElementAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<RuleElementAttribute>(RuleElementAttribute.class, this, TextAML3Package.RULE_ELEMENT_EXPRESSION__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextAML3Package.RULE_ELEMENT_EXPRESSION__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
			case TextAML3Package.RULE_ELEMENT_EXPRESSION__BASECLASS:
				if (resolve) return getBaseclass();
				return basicGetBaseclass();
			case TextAML3Package.RULE_ELEMENT_EXPRESSION__ATTRIBUTES:
				return getAttributes();
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
			case TextAML3Package.RULE_ELEMENT_EXPRESSION__BASECLASS:
				setBaseclass((EClass)newValue);
				return;
			case TextAML3Package.RULE_ELEMENT_EXPRESSION__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends RuleElementAttribute>)newValue);
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
			case TextAML3Package.RULE_ELEMENT_EXPRESSION__BASECLASS:
				setBaseclass((EClass)null);
				return;
			case TextAML3Package.RULE_ELEMENT_EXPRESSION__ATTRIBUTES:
				getAttributes().clear();
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
			case TextAML3Package.RULE_ELEMENT_EXPRESSION__BASECLASS:
				return baseclass != null;
			case TextAML3Package.RULE_ELEMENT_EXPRESSION__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RuleElementExpressionImpl
