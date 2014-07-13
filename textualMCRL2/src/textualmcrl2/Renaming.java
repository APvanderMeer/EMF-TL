/**
 */
package textualmcrl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Renaming</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.Renaming#getOldname <em>Oldname</em>}</li>
 *   <li>{@link textualmcrl2.Renaming#getNewname <em>Newname</em>}</li>
 *   <li>{@link textualmcrl2.Renaming#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getRenaming()
 * @model
 * @generated
 */
public interface Renaming extends ConstraintElement {
	/**
	 * Returns the value of the '<em><b>Oldname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oldname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oldname</em>' attribute.
	 * @see #setOldname(String)
	 * @see textualmcrl2.Textualmcrl2Package#getRenaming_Oldname()
	 * @model
	 * @generated
	 */
	String getOldname();

	/**
	 * Sets the value of the '{@link textualmcrl2.Renaming#getOldname <em>Oldname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oldname</em>' attribute.
	 * @see #getOldname()
	 * @generated
	 */
	void setOldname(String value);

	/**
	 * Returns the value of the '<em><b>Newname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Newname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Newname</em>' attribute.
	 * @see #setNewname(String)
	 * @see textualmcrl2.Textualmcrl2Package#getRenaming_Newname()
	 * @model
	 * @generated
	 */
	String getNewname();

	/**
	 * Sets the value of the '{@link textualmcrl2.Renaming#getNewname <em>Newname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Newname</em>' attribute.
	 * @see #getNewname()
	 * @generated
	 */
	void setNewname(String value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link textualmcrl2.Atom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see textualmcrl2.Textualmcrl2Package#getRenaming_Links()
	 * @model
	 * @generated
	 */
	EList<Atom> getLinks();

} // Renaming
