/**
 */
package textualmcrl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.MultiAction#getActionnames <em>Actionnames</em>}</li>
 *   <li>{@link textualmcrl2.MultiAction#getResultname <em>Resultname</em>}</li>
 *   <li>{@link textualmcrl2.MultiAction#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getMultiAction()
 * @model
 * @generated
 */
public interface MultiAction extends ConstraintElement {
	/**
	 * Returns the value of the '<em><b>Actionnames</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actionnames</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actionnames</em>' attribute list.
	 * @see textualmcrl2.Textualmcrl2Package#getMultiAction_Actionnames()
	 * @model
	 * @generated
	 */
	EList<String> getActionnames();

	/**
	 * Returns the value of the '<em><b>Resultname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resultname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resultname</em>' attribute.
	 * @see #setResultname(String)
	 * @see textualmcrl2.Textualmcrl2Package#getMultiAction_Resultname()
	 * @model
	 * @generated
	 */
	String getResultname();

	/**
	 * Sets the value of the '{@link textualmcrl2.MultiAction#getResultname <em>Resultname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resultname</em>' attribute.
	 * @see #getResultname()
	 * @generated
	 */
	void setResultname(String value);

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
	 * @see textualmcrl2.Textualmcrl2Package#getMultiAction_Links()
	 * @model
	 * @generated
	 */
	EList<Atom> getLinks();

} // MultiAction
