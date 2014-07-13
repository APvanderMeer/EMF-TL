/**
 */
package textualmcrl2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import textualmcrl2.DataExpression;
import textualmcrl2.Implication;
import textualmcrl2.ProcessExpr;
import textualmcrl2.Textualmcrl2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link textualmcrl2.impl.ImplicationImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link textualmcrl2.impl.ImplicationImpl#getAction <em>Action</em>}</li>
 *   <li>{@link textualmcrl2.impl.ImplicationImpl#getElseAction <em>Else Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplicationImpl extends ProcessExprImpl implements Implication {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected DataExpression condition;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected ProcessExpr action;

	/**
	 * The cached value of the '{@link #getElseAction() <em>Else Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseAction()
	 * @generated
	 * @ordered
	 */
	protected ProcessExpr elseAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Textualmcrl2Package.Literals.IMPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataExpression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(DataExpression newCondition, NotificationChain msgs) {
		DataExpression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Textualmcrl2Package.IMPLICATION__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(DataExpression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Textualmcrl2Package.IMPLICATION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Textualmcrl2Package.IMPLICATION__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Textualmcrl2Package.IMPLICATION__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessExpr getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(ProcessExpr newAction, NotificationChain msgs) {
		ProcessExpr oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Textualmcrl2Package.IMPLICATION__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(ProcessExpr newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Textualmcrl2Package.IMPLICATION__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Textualmcrl2Package.IMPLICATION__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Textualmcrl2Package.IMPLICATION__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessExpr getElseAction() {
		return elseAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseAction(ProcessExpr newElseAction, NotificationChain msgs) {
		ProcessExpr oldElseAction = elseAction;
		elseAction = newElseAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Textualmcrl2Package.IMPLICATION__ELSE_ACTION, oldElseAction, newElseAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseAction(ProcessExpr newElseAction) {
		if (newElseAction != elseAction) {
			NotificationChain msgs = null;
			if (elseAction != null)
				msgs = ((InternalEObject)elseAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Textualmcrl2Package.IMPLICATION__ELSE_ACTION, null, msgs);
			if (newElseAction != null)
				msgs = ((InternalEObject)newElseAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Textualmcrl2Package.IMPLICATION__ELSE_ACTION, null, msgs);
			msgs = basicSetElseAction(newElseAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Textualmcrl2Package.IMPLICATION__ELSE_ACTION, newElseAction, newElseAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Textualmcrl2Package.IMPLICATION__CONDITION:
				return basicSetCondition(null, msgs);
			case Textualmcrl2Package.IMPLICATION__ACTION:
				return basicSetAction(null, msgs);
			case Textualmcrl2Package.IMPLICATION__ELSE_ACTION:
				return basicSetElseAction(null, msgs);
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
			case Textualmcrl2Package.IMPLICATION__CONDITION:
				return getCondition();
			case Textualmcrl2Package.IMPLICATION__ACTION:
				return getAction();
			case Textualmcrl2Package.IMPLICATION__ELSE_ACTION:
				return getElseAction();
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
			case Textualmcrl2Package.IMPLICATION__CONDITION:
				setCondition((DataExpression)newValue);
				return;
			case Textualmcrl2Package.IMPLICATION__ACTION:
				setAction((ProcessExpr)newValue);
				return;
			case Textualmcrl2Package.IMPLICATION__ELSE_ACTION:
				setElseAction((ProcessExpr)newValue);
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
			case Textualmcrl2Package.IMPLICATION__CONDITION:
				setCondition((DataExpression)null);
				return;
			case Textualmcrl2Package.IMPLICATION__ACTION:
				setAction((ProcessExpr)null);
				return;
			case Textualmcrl2Package.IMPLICATION__ELSE_ACTION:
				setElseAction((ProcessExpr)null);
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
			case Textualmcrl2Package.IMPLICATION__CONDITION:
				return condition != null;
			case Textualmcrl2Package.IMPLICATION__ACTION:
				return action != null;
			case Textualmcrl2Package.IMPLICATION__ELSE_ACTION:
				return elseAction != null;
		}
		return super.eIsSet(featureID);
	}

} //ImplicationImpl
