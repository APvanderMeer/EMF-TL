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

import textualmcrl2.AtomicAction;
import textualmcrl2.DataExpression;
import textualmcrl2.Nameable;
import textualmcrl2.Textualmcrl2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link textualmcrl2.impl.AtomicActionImpl#getAtomname <em>Atomname</em>}</li>
 *   <li>{@link textualmcrl2.impl.AtomicActionImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link textualmcrl2.impl.AtomicActionImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomicActionImpl extends ProcessExprImpl implements AtomicAction {
	/**
	 * The default value of the '{@link #getAtomname() <em>Atomname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtomname()
	 * @generated
	 * @ordered
	 */
	protected static final String ATOMNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAtomname() <em>Atomname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtomname()
	 * @generated
	 * @ordered
	 */
	protected String atomname = ATOMNAME_EDEFAULT;

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
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<DataExpression> arguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Textualmcrl2Package.Literals.ATOMIC_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAtomname() {
		return atomname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtomname(String newAtomname) {
		String oldAtomname = atomname;
		atomname = newAtomname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Textualmcrl2Package.ATOMIC_ACTION__ATOMNAME, oldAtomname, atomname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Nameable> getLinks() {
		if (links == null) {
			links = new EObjectResolvingEList<Nameable>(Nameable.class, this, Textualmcrl2Package.ATOMIC_ACTION__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataExpression> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<DataExpression>(DataExpression.class, this, Textualmcrl2Package.ATOMIC_ACTION__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Textualmcrl2Package.ATOMIC_ACTION__ARGUMENTS:
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
			case Textualmcrl2Package.ATOMIC_ACTION__ATOMNAME:
				return getAtomname();
			case Textualmcrl2Package.ATOMIC_ACTION__LINKS:
				return getLinks();
			case Textualmcrl2Package.ATOMIC_ACTION__ARGUMENTS:
				return getArguments();
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
			case Textualmcrl2Package.ATOMIC_ACTION__ATOMNAME:
				setAtomname((String)newValue);
				return;
			case Textualmcrl2Package.ATOMIC_ACTION__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Nameable>)newValue);
				return;
			case Textualmcrl2Package.ATOMIC_ACTION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends DataExpression>)newValue);
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
			case Textualmcrl2Package.ATOMIC_ACTION__ATOMNAME:
				setAtomname(ATOMNAME_EDEFAULT);
				return;
			case Textualmcrl2Package.ATOMIC_ACTION__LINKS:
				getLinks().clear();
				return;
			case Textualmcrl2Package.ATOMIC_ACTION__ARGUMENTS:
				getArguments().clear();
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
			case Textualmcrl2Package.ATOMIC_ACTION__ATOMNAME:
				return ATOMNAME_EDEFAULT == null ? atomname != null : !ATOMNAME_EDEFAULT.equals(atomname);
			case Textualmcrl2Package.ATOMIC_ACTION__LINKS:
				return links != null && !links.isEmpty();
			case Textualmcrl2Package.ATOMIC_ACTION__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
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
		result.append(" (atomname: ");
		result.append(atomname);
		result.append(')');
		return result.toString();
	}

} //AtomicActionImpl
