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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import textualmcrl2.DataExpression;
import textualmcrl2.FunctionApplication;
import textualmcrl2.Nameable;
import textualmcrl2.Textualmcrl2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link textualmcrl2.impl.FunctionApplicationImpl#getBase <em>Base</em>}</li>
 *   <li>{@link textualmcrl2.impl.FunctionApplicationImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link textualmcrl2.impl.FunctionApplicationImpl#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionApplicationImpl extends DataExpressionImpl implements FunctionApplication {
	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected DataExpression base;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<DataExpression> arguments;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Nameable> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Textualmcrl2Package.Literals.FUNCTION_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataExpression getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(DataExpression newBase, NotificationChain msgs) {
		DataExpression oldBase = base;
		base = newBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Textualmcrl2Package.FUNCTION_APPLICATION__BASE, oldBase, newBase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(DataExpression newBase) {
		if (newBase != base) {
			NotificationChain msgs = null;
			if (base != null)
				msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Textualmcrl2Package.FUNCTION_APPLICATION__BASE, null, msgs);
			if (newBase != null)
				msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Textualmcrl2Package.FUNCTION_APPLICATION__BASE, null, msgs);
			msgs = basicSetBase(newBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Textualmcrl2Package.FUNCTION_APPLICATION__BASE, newBase, newBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataExpression> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<DataExpression>(DataExpression.class, this, Textualmcrl2Package.FUNCTION_APPLICATION__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Nameable> getLinks() {
		if (links == null) {
			links = new EObjectResolvingEList<Nameable>(Nameable.class, this, Textualmcrl2Package.FUNCTION_APPLICATION__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Textualmcrl2Package.FUNCTION_APPLICATION__BASE:
				return basicSetBase(null, msgs);
			case Textualmcrl2Package.FUNCTION_APPLICATION__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
			case Textualmcrl2Package.FUNCTION_APPLICATION__BASE:
				return getBase();
			case Textualmcrl2Package.FUNCTION_APPLICATION__ARGUMENTS:
				return getArguments();
			case Textualmcrl2Package.FUNCTION_APPLICATION__LINKS:
				return getLinks();
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
			case Textualmcrl2Package.FUNCTION_APPLICATION__BASE:
				setBase((DataExpression)newValue);
				return;
			case Textualmcrl2Package.FUNCTION_APPLICATION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends DataExpression>)newValue);
				return;
			case Textualmcrl2Package.FUNCTION_APPLICATION__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Nameable>)newValue);
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
			case Textualmcrl2Package.FUNCTION_APPLICATION__BASE:
				setBase((DataExpression)null);
				return;
			case Textualmcrl2Package.FUNCTION_APPLICATION__ARGUMENTS:
				getArguments().clear();
				return;
			case Textualmcrl2Package.FUNCTION_APPLICATION__LINKS:
				getLinks().clear();
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
			case Textualmcrl2Package.FUNCTION_APPLICATION__BASE:
				return base != null;
			case Textualmcrl2Package.FUNCTION_APPLICATION__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case Textualmcrl2Package.FUNCTION_APPLICATION__LINKS:
				return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionApplicationImpl
