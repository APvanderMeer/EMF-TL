/**
 */
package textualmcrl2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import textualmcrl2.Atom;
import textualmcrl2.MultiAction;
import textualmcrl2.Textualmcrl2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link textualmcrl2.impl.MultiActionImpl#getActionnames <em>Actionnames</em>}</li>
 *   <li>{@link textualmcrl2.impl.MultiActionImpl#getResultname <em>Resultname</em>}</li>
 *   <li>{@link textualmcrl2.impl.MultiActionImpl#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiActionImpl extends ConstraintElementImpl implements MultiAction {
	/**
	 * The cached value of the '{@link #getActionnames() <em>Actionnames</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionnames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> actionnames;

	/**
	 * The default value of the '{@link #getResultname() <em>Resultname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultname()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultname() <em>Resultname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultname()
	 * @generated
	 * @ordered
	 */
	protected String resultname = RESULTNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Atom> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Textualmcrl2Package.Literals.MULTI_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getActionnames() {
		if (actionnames == null) {
			actionnames = new EDataTypeUniqueEList<String>(String.class, this, Textualmcrl2Package.MULTI_ACTION__ACTIONNAMES);
		}
		return actionnames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultname() {
		return resultname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultname(String newResultname) {
		String oldResultname = resultname;
		resultname = newResultname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Textualmcrl2Package.MULTI_ACTION__RESULTNAME, oldResultname, resultname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Atom> getLinks() {
		if (links == null) {
			links = new EObjectResolvingEList<Atom>(Atom.class, this, Textualmcrl2Package.MULTI_ACTION__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Textualmcrl2Package.MULTI_ACTION__ACTIONNAMES:
				return getActionnames();
			case Textualmcrl2Package.MULTI_ACTION__RESULTNAME:
				return getResultname();
			case Textualmcrl2Package.MULTI_ACTION__LINKS:
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
			case Textualmcrl2Package.MULTI_ACTION__ACTIONNAMES:
				getActionnames().clear();
				getActionnames().addAll((Collection<? extends String>)newValue);
				return;
			case Textualmcrl2Package.MULTI_ACTION__RESULTNAME:
				setResultname((String)newValue);
				return;
			case Textualmcrl2Package.MULTI_ACTION__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Atom>)newValue);
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
			case Textualmcrl2Package.MULTI_ACTION__ACTIONNAMES:
				getActionnames().clear();
				return;
			case Textualmcrl2Package.MULTI_ACTION__RESULTNAME:
				setResultname(RESULTNAME_EDEFAULT);
				return;
			case Textualmcrl2Package.MULTI_ACTION__LINKS:
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
			case Textualmcrl2Package.MULTI_ACTION__ACTIONNAMES:
				return actionnames != null && !actionnames.isEmpty();
			case Textualmcrl2Package.MULTI_ACTION__RESULTNAME:
				return RESULTNAME_EDEFAULT == null ? resultname != null : !RESULTNAME_EDEFAULT.equals(resultname);
			case Textualmcrl2Package.MULTI_ACTION__LINKS:
				return links != null && !links.isEmpty();
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
		result.append(" (actionnames: ");
		result.append(actionnames);
		result.append(", resultname: ");
		result.append(resultname);
		result.append(')');
		return result.toString();
	}

} //MultiActionImpl
