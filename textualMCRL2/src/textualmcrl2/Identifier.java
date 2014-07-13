/**
 */
package textualmcrl2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.Identifier#getVarname <em>Varname</em>}</li>
 *   <li>{@link textualmcrl2.Identifier#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getIdentifier()
 * @model
 * @generated
 */
public interface Identifier extends DataExpression {
	/**
	 * Returns the value of the '<em><b>Varname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Varname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varname</em>' attribute.
	 * @see #setVarname(String)
	 * @see textualmcrl2.Textualmcrl2Package#getIdentifier_Varname()
	 * @model
	 * @generated
	 */
	String getVarname();

	/**
	 * Sets the value of the '{@link textualmcrl2.Identifier#getVarname <em>Varname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Varname</em>' attribute.
	 * @see #getVarname()
	 * @generated
	 */
	void setVarname(String value);

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
	 * @see textualmcrl2.Textualmcrl2Package#getIdentifier_Links()
	 * @model
	 * @generated
	 */
	EList<EObject> getLinks();

} // Identifier
