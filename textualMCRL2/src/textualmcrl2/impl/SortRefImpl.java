/**
 */
package textualmcrl2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import textualmcrl2.Sort;
import textualmcrl2.SortRef;
import textualmcrl2.Textualmcrl2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sort Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link textualmcrl2.impl.SortRefImpl#getSortname <em>Sortname</em>}</li>
 *   <li>{@link textualmcrl2.impl.SortRefImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link textualmcrl2.impl.SortRefImpl#getSort <em>Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SortRefImpl extends SortExprImpl implements SortRef {
	/**
	 * The default value of the '{@link #getSortname() <em>Sortname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortname()
	 * @generated
	 * @ordered
	 */
	protected static final String SORTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSortname() <em>Sortname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortname()
	 * @generated
	 * @ordered
	 */
	protected String sortname = SORTNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> links;

	/**
	 * The default value of the '{@link #getSort() <em>Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSort()
	 * @generated
	 * @ordered
	 */
	protected static final String SORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSort() <em>Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSort()
	 * @generated
	 * @ordered
	 */
	protected String sort = SORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Textualmcrl2Package.Literals.SORT_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSortname() {
		return sortname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortname(String newSortname) {
		String oldSortname = sortname;
		sortname = newSortname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Textualmcrl2Package.SORT_REF__SORTNAME, oldSortname, sortname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLinks() {
		if (links == null) {
			links = new EObjectResolvingEList<EObject>(EObject.class, this, Textualmcrl2Package.SORT_REF__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSort() {
		return sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSort(String newSort) {
		String oldSort = sort;
		sort = newSort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Textualmcrl2Package.SORT_REF__SORT, oldSort, sort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Textualmcrl2Package.SORT_REF__SORTNAME:
				return getSortname();
			case Textualmcrl2Package.SORT_REF__LINKS:
				return getLinks();
			case Textualmcrl2Package.SORT_REF__SORT:
				return getSort();
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
			case Textualmcrl2Package.SORT_REF__SORTNAME:
				setSortname((String)newValue);
				return;
			case Textualmcrl2Package.SORT_REF__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends EObject>)newValue);
				return;
			case Textualmcrl2Package.SORT_REF__SORT:
				setSort((String)newValue);
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
			case Textualmcrl2Package.SORT_REF__SORTNAME:
				setSortname(SORTNAME_EDEFAULT);
				return;
			case Textualmcrl2Package.SORT_REF__LINKS:
				getLinks().clear();
				return;
			case Textualmcrl2Package.SORT_REF__SORT:
				setSort(SORT_EDEFAULT);
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
			case Textualmcrl2Package.SORT_REF__SORTNAME:
				return SORTNAME_EDEFAULT == null ? sortname != null : !SORTNAME_EDEFAULT.equals(sortname);
			case Textualmcrl2Package.SORT_REF__LINKS:
				return links != null && !links.isEmpty();
			case Textualmcrl2Package.SORT_REF__SORT:
				return SORT_EDEFAULT == null ? sort != null : !SORT_EDEFAULT.equals(sort);
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
		result.append(" (sortname: ");
		result.append(sortname);
		result.append(", sort: ");
		result.append(sort);
		result.append(')');
		return result.toString();
	}

} //SortRefImpl
