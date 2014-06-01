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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.textAML3.Condition;
import org.emftext.language.textAML3.ContainmentVariable;
import org.emftext.language.textAML3.RuleElementExpression;
import org.emftext.language.textAML3.TextAML3Package;
import org.emftext.language.textAML3.TypeRule;
import org.emftext.language.textAML3.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.textAML3.impl.TypeRuleImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.impl.TypeRuleImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.impl.TypeRuleImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.impl.TypeRuleImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.impl.TypeRuleImpl#getContainments <em>Containments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeRuleImpl extends EObjectImpl implements TypeRule {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected RuleElementExpression source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected RuleElementExpression target;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditions;

	/**
	 * The cached value of the '{@link #getContainments() <em>Containments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainments()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainmentVariable> containments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextAML3Package.Literals.TYPE_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleElementExpression getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(RuleElementExpression newSource, NotificationChain msgs) {
		RuleElementExpression oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextAML3Package.TYPE_RULE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(RuleElementExpression newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextAML3Package.TYPE_RULE__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextAML3Package.TYPE_RULE__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextAML3Package.TYPE_RULE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleElementExpression getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(RuleElementExpression newTarget, NotificationChain msgs) {
		RuleElementExpression oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextAML3Package.TYPE_RULE__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(RuleElementExpression newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextAML3Package.TYPE_RULE__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextAML3Package.TYPE_RULE__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextAML3Package.TYPE_RULE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, TextAML3Package.TYPE_RULE__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Condition>(Condition.class, this, TextAML3Package.TYPE_RULE__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainmentVariable> getContainments() {
		if (containments == null) {
			containments = new EObjectContainmentEList<ContainmentVariable>(ContainmentVariable.class, this, TextAML3Package.TYPE_RULE__CONTAINMENTS);
		}
		return containments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextAML3Package.TYPE_RULE__SOURCE:
				return basicSetSource(null, msgs);
			case TextAML3Package.TYPE_RULE__TARGET:
				return basicSetTarget(null, msgs);
			case TextAML3Package.TYPE_RULE__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case TextAML3Package.TYPE_RULE__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
			case TextAML3Package.TYPE_RULE__CONTAINMENTS:
				return ((InternalEList<?>)getContainments()).basicRemove(otherEnd, msgs);
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
			case TextAML3Package.TYPE_RULE__SOURCE:
				return getSource();
			case TextAML3Package.TYPE_RULE__TARGET:
				return getTarget();
			case TextAML3Package.TYPE_RULE__VARIABLES:
				return getVariables();
			case TextAML3Package.TYPE_RULE__CONDITIONS:
				return getConditions();
			case TextAML3Package.TYPE_RULE__CONTAINMENTS:
				return getContainments();
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
			case TextAML3Package.TYPE_RULE__SOURCE:
				setSource((RuleElementExpression)newValue);
				return;
			case TextAML3Package.TYPE_RULE__TARGET:
				setTarget((RuleElementExpression)newValue);
				return;
			case TextAML3Package.TYPE_RULE__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case TextAML3Package.TYPE_RULE__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends Condition>)newValue);
				return;
			case TextAML3Package.TYPE_RULE__CONTAINMENTS:
				getContainments().clear();
				getContainments().addAll((Collection<? extends ContainmentVariable>)newValue);
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
			case TextAML3Package.TYPE_RULE__SOURCE:
				setSource((RuleElementExpression)null);
				return;
			case TextAML3Package.TYPE_RULE__TARGET:
				setTarget((RuleElementExpression)null);
				return;
			case TextAML3Package.TYPE_RULE__VARIABLES:
				getVariables().clear();
				return;
			case TextAML3Package.TYPE_RULE__CONDITIONS:
				getConditions().clear();
				return;
			case TextAML3Package.TYPE_RULE__CONTAINMENTS:
				getContainments().clear();
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
			case TextAML3Package.TYPE_RULE__SOURCE:
				return source != null;
			case TextAML3Package.TYPE_RULE__TARGET:
				return target != null;
			case TextAML3Package.TYPE_RULE__VARIABLES:
				return variables != null && !variables.isEmpty();
			case TextAML3Package.TYPE_RULE__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
			case TextAML3Package.TYPE_RULE__CONTAINMENTS:
				return containments != null && !containments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeRuleImpl
