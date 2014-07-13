/**
 */
package textualmcrl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.Allow#getChild <em>Child</em>}</li>
 *   <li>{@link textualmcrl2.Allow#getAtomnames <em>Atomnames</em>}</li>
 *   <li>{@link textualmcrl2.Allow#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getAllow()
 * @model
 * @generated
 */
public interface Allow extends ProcessExpr {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(ProcessExpr)
	 * @see textualmcrl2.Textualmcrl2Package#getAllow_Child()
	 * @model containment="true"
	 * @generated
	 */
	ProcessExpr getChild();

	/**
	 * Sets the value of the '{@link textualmcrl2.Allow#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(ProcessExpr value);

	/**
	 * Returns the value of the '<em><b>Atomnames</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atomnames</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atomnames</em>' attribute list.
	 * @see textualmcrl2.Textualmcrl2Package#getAllow_Atomnames()
	 * @model
	 * @generated
	 */
	EList<String> getAtomnames();

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
	 * @see textualmcrl2.Textualmcrl2Package#getAllow_Links()
	 * @model
	 * @generated
	 */
	EList<Atom> getLinks();

} // Allow
