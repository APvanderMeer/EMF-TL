/**
 */
package textualmcrl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.FunctionApplication#getBase <em>Base</em>}</li>
 *   <li>{@link textualmcrl2.FunctionApplication#getArguments <em>Arguments</em>}</li>
 *   <li>{@link textualmcrl2.FunctionApplication#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getFunctionApplication()
 * @model
 * @generated
 */
public interface FunctionApplication extends DataExpression {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' containment reference.
	 * @see #setBase(DataExpression)
	 * @see textualmcrl2.Textualmcrl2Package#getFunctionApplication_Base()
	 * @model containment="true"
	 * @generated
	 */
	DataExpression getBase();

	/**
	 * Sets the value of the '{@link textualmcrl2.FunctionApplication#getBase <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' containment reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(DataExpression value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link textualmcrl2.DataExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see textualmcrl2.Textualmcrl2Package#getFunctionApplication_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataExpression> getArguments();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link textualmcrl2.Nameable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see textualmcrl2.Textualmcrl2Package#getFunctionApplication_Links()
	 * @model
	 * @generated
	 */
	EList<Nameable> getLinks();

} // FunctionApplication
