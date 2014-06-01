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
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.textAML3.AttributeExpression;
import org.emftext.language.textAML3.ModelElementExpression;
import org.emftext.language.textAML3.TextAML3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.textAML3.impl.ModelElementExpressionImpl#getBaseclass <em>Baseclass</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.impl.ModelElementExpressionImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelElementExpressionImpl extends ExpressionImpl implements ModelElementExpression {
	/**
	 * The cached value of the '{@link #getBaseclass() <em>Baseclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseclass()
	 * @generated
	 * @ordered
	 */
	protected ENamedElement baseclass;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeExpression> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextAML3Package.Literals.MODEL_ELEMENT_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENamedElement getBaseclass() {
		if (baseclass != null && baseclass.eIsProxy()) {
			InternalEObject oldBaseclass = (InternalEObject)baseclass;
			baseclass = (ENamedElement)eResolveProxy(oldBaseclass);
			if (baseclass != oldBaseclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TextAML3Package.MODEL_ELEMENT_EXPRESSION__BASECLASS, oldBaseclass, baseclass));
			}
		}
		return baseclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENamedElement basicGetBaseclass() {
		return baseclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseclass(ENamedElement newBaseclass) {
		ENamedElement oldBaseclass = baseclass;
		baseclass = newBaseclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextAML3Package.MODEL_ELEMENT_EXPRESSION__BASECLASS, oldBaseclass, baseclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeExpression> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeExpression>(AttributeExpression.class, this, TextAML3Package.MODEL_ELEMENT_EXPRESSION__ATTRIBUTES);
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
			case TextAML3Package.MODEL_ELEMENT_EXPRESSION__ATTRIBUTES:
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
			case TextAML3Package.MODEL_ELEMENT_EXPRESSION__BASECLASS:
				if (resolve) return getBaseclass();
				return basicGetBaseclass();
			case TextAML3Package.MODEL_ELEMENT_EXPRESSION__ATTRIBUTES:
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
			case TextAML3Package.MODEL_ELEMENT_EXPRESSION__BASECLASS:
				setBaseclass((ENamedElement)newValue);
				return;
			case TextAML3Package.MODEL_ELEMENT_EXPRESSION__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeExpression>)newValue);
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
			case TextAML3Package.MODEL_ELEMENT_EXPRESSION__BASECLASS:
				setBaseclass((ENamedElement)null);
				return;
			case TextAML3Package.MODEL_ELEMENT_EXPRESSION__ATTRIBUTES:
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
			case TextAML3Package.MODEL_ELEMENT_EXPRESSION__BASECLASS:
				return baseclass != null;
			case TextAML3Package.MODEL_ELEMENT_EXPRESSION__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelElementExpressionImpl
