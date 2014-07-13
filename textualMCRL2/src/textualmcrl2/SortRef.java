/**
 */
package textualmcrl2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.SortRef#getSortname <em>Sortname</em>}</li>
 *   <li>{@link textualmcrl2.SortRef#getLinks <em>Links</em>}</li>
 *   <li>{@link textualmcrl2.SortRef#getSort <em>Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getSortRef()
 * @model
 * @generated
 */
public interface SortRef extends SortExpr {
	/**
	 * Returns the value of the '<em><b>Sortname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sortname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortname</em>' attribute.
	 * @see #setSortname(String)
	 * @see textualmcrl2.Textualmcrl2Package#getSortRef_Sortname()
	 * @model
	 * @generated
	 */
	String getSortname();

	/**
	 * Sets the value of the '{@link textualmcrl2.SortRef#getSortname <em>Sortname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sortname</em>' attribute.
	 * @see #getSortname()
	 * @generated
	 */
	void setSortname(String value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see textualmcrl2.Textualmcrl2Package#getSortRef_Links()
	 * @model
	 * @generated
	 */
	EList<EObject> getLinks();

	/**
	 * Returns the value of the '<em><b>Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort</em>' attribute.
	 * @see #setSort(String)
	 * @see textualmcrl2.Textualmcrl2Package#getSortRef_Sort()
	 * @model
	 * @generated
	 */
	String getSort();

	/**
	 * Sets the value of the '{@link textualmcrl2.SortRef#getSort <em>Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort</em>' attribute.
	 * @see #getSort()
	 * @generated
	 */
	void setSort(String value);

} // SortRef
