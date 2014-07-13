/**
 */
package textualmcrl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lambda</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.Lambda#getExpression <em>Expression</em>}</li>
 *   <li>{@link textualmcrl2.Lambda#getVariable <em>Variable</em>}</li>
 *   <li>{@link textualmcrl2.Lambda#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getLambda()
 * @model
 * @generated
 */
public interface Lambda extends DataExpression {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(DataExpression)
	 * @see textualmcrl2.Textualmcrl2Package#getLambda_Expression()
	 * @model containment="true"
	 * @generated
	 */
	DataExpression getExpression();

	/**
	 * Sets the value of the '{@link textualmcrl2.Lambda#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(DataExpression value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(IdDecl)
	 * @see textualmcrl2.Textualmcrl2Package#getLambda_Variable()
	 * @model containment="true"
	 * @generated
	 */
	IdDecl getVariable();

	/**
	 * Sets the value of the '{@link textualmcrl2.Lambda#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(IdDecl value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link textualmcrl2.Sort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see textualmcrl2.Textualmcrl2Package#getLambda_Links()
	 * @model
	 * @generated
	 */
	EList<Sort> getLinks();

} // Lambda
