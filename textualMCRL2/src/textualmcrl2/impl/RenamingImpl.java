/**
 */
package textualmcrl2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import textualmcrl2.Atom;
import textualmcrl2.Renaming;
import textualmcrl2.Textualmcrl2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Renaming</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link textualmcrl2.impl.RenamingImpl#getOldname <em>Oldname</em>}</li>
 *   <li>{@link textualmcrl2.impl.RenamingImpl#getNewname <em>Newname</em>}</li>
 *   <li>{@link textualmcrl2.impl.RenamingImpl#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RenamingImpl extends ConstraintElementImpl implements Renaming {
	/**
	 * The default value of the '{@link #getOldname() <em>Oldname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldname()
	 * @generated
	 * @ordered
	 */
	protected static final String OLDNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldname() <em>Oldname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldname()
	 * @generated
	 * @ordered
	 */
	protected String oldname = OLDNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewname() <em>Newname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewname()
	 * @generated
	 * @ordered
	 */
	protected static final String NEWNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewname() <em>Newname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewname()
	 * @generated
	 * @ordered
	 */
	protected String newname = NEWNAME_EDEFAULT;

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
	protected RenamingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Textualmcrl2Package.Literals.RENAMING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOldname() {
		return oldname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldname(String newOldname) {
		String oldOldname = oldname;
		oldname = newOldname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Textualmcrl2Package.RENAMING__OLDNAME, oldOldname, oldname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewname() {
		return newname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewname(String newNewname) {
		String oldNewname = newname;
		newname = newNewname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Textualmcrl2Package.RENAMING__NEWNAME, oldNewname, newname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Atom> getLinks() {
		if (links == null) {
			links = new EObjectResolvingEList<Atom>(Atom.class, this, Textualmcrl2Package.RENAMING__LINKS);
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
			case Textualmcrl2Package.RENAMING__OLDNAME:
				return getOldname();
			case Textualmcrl2Package.RENAMING__NEWNAME:
				return getNewname();
			case Textualmcrl2Package.RENAMING__LINKS:
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
			case Textualmcrl2Package.RENAMING__OLDNAME:
				setOldname((String)newValue);
				return;
			case Textualmcrl2Package.RENAMING__NEWNAME:
				setNewname((String)newValue);
				return;
			case Textualmcrl2Package.RENAMING__LINKS:
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
			case Textualmcrl2Package.RENAMING__OLDNAME:
				setOldname(OLDNAME_EDEFAULT);
				return;
			case Textualmcrl2Package.RENAMING__NEWNAME:
				setNewname(NEWNAME_EDEFAULT);
				return;
			case Textualmcrl2Package.RENAMING__LINKS:
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
			case Textualmcrl2Package.RENAMING__OLDNAME:
				return OLDNAME_EDEFAULT == null ? oldname != null : !OLDNAME_EDEFAULT.equals(oldname);
			case Textualmcrl2Package.RENAMING__NEWNAME:
				return NEWNAME_EDEFAULT == null ? newname != null : !NEWNAME_EDEFAULT.equals(newname);
			case Textualmcrl2Package.RENAMING__LINKS:
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
		result.append(" (oldname: ");
		result.append(oldname);
		result.append(", newname: ");
		result.append(newname);
		result.append(')');
		return result.toString();
	}

} //RenamingImpl
