/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftext.language.textAML3.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.emftext.language.textAML3.ModelElement;
import org.emftext.language.textAML3.ModelElementConnection;
import org.emftext.language.textAML3.TextAML3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.textAML3.impl.ModelElementImpl#getTargetclass <em>Targetclass</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.impl.ModelElementImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.impl.ModelElementImpl#getRelation <em>Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelElementImpl extends EObjectImpl implements ModelElement {
	/**
	 * The cached value of the '{@link #getTargetclass() <em>Targetclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetclass()
	 * @generated
	 * @ordered
	 */
	protected EClass targetclass;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<EStructuralFeature> attributes;

	/**
	 * The default value of the '{@link #getRelation() <em>Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected static final ModelElementConnection RELATION_EDEFAULT = ModelElementConnection.IN;

	/**
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected ModelElementConnection relation = RELATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextAML3Package.Literals.MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetclass() {
		if (targetclass != null && targetclass.eIsProxy()) {
			InternalEObject oldTargetclass = (InternalEObject)targetclass;
			targetclass = (EClass)eResolveProxy(oldTargetclass);
			if (targetclass != oldTargetclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TextAML3Package.MODEL_ELEMENT__TARGETCLASS, oldTargetclass, targetclass));
			}
		}
		return targetclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetTargetclass() {
		return targetclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetclass(EClass newTargetclass) {
		EClass oldTargetclass = targetclass;
		targetclass = newTargetclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextAML3Package.MODEL_ELEMENT__TARGETCLASS, oldTargetclass, targetclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EStructuralFeature> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectResolvingEList<EStructuralFeature>(EStructuralFeature.class, this, TextAML3Package.MODEL_ELEMENT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElementConnection getRelation() {
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelation(ModelElementConnection newRelation) {
		ModelElementConnection oldRelation = relation;
		relation = newRelation == null ? RELATION_EDEFAULT : newRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextAML3Package.MODEL_ELEMENT__RELATION, oldRelation, relation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TextAML3Package.MODEL_ELEMENT__TARGETCLASS:
				if (resolve) return getTargetclass();
				return basicGetTargetclass();
			case TextAML3Package.MODEL_ELEMENT__ATTRIBUTES:
				return getAttributes();
			case TextAML3Package.MODEL_ELEMENT__RELATION:
				return getRelation();
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
			case TextAML3Package.MODEL_ELEMENT__TARGETCLASS:
				setTargetclass((EClass)newValue);
				return;
			case TextAML3Package.MODEL_ELEMENT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends EStructuralFeature>)newValue);
				return;
			case TextAML3Package.MODEL_ELEMENT__RELATION:
				setRelation((ModelElementConnection)newValue);
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
			case TextAML3Package.MODEL_ELEMENT__TARGETCLASS:
				setTargetclass((EClass)null);
				return;
			case TextAML3Package.MODEL_ELEMENT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case TextAML3Package.MODEL_ELEMENT__RELATION:
				setRelation(RELATION_EDEFAULT);
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
			case TextAML3Package.MODEL_ELEMENT__TARGETCLASS:
				return targetclass != null;
			case TextAML3Package.MODEL_ELEMENT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case TextAML3Package.MODEL_ELEMENT__RELATION:
				return relation != RELATION_EDEFAULT;
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
		result.append(" (relation: ");
		result.append(relation);
		result.append(')');
		return result.toString();
	}

} //ModelElementImpl
