/**
 */
package textualmcrl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.Quantification#getExpression <em>Expression</em>}</li>
 *   <li>{@link textualmcrl2.Quantification#getVariable <em>Variable</em>}</li>
 *   <li>{@link textualmcrl2.Quantification#isForall <em>Forall</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getQuantification()
 * @model
 * @generated
 */
public interface Quantification extends DataExpression {
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
	 * @see textualmcrl2.Textualmcrl2Package#getQuantification_Expression()
	 * @model containment="true"
	 * @generated
	 */
	DataExpression getExpression();

	/**
	 * Sets the value of the '{@link textualmcrl2.Quantification#getExpression <em>Expression</em>}' containment reference.
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
	 * @see textualmcrl2.Textualmcrl2Package#getQuantification_Variable()
	 * @model containment="true"
	 * @generated
	 */
	IdDecl getVariable();

	/**
	 * Sets the value of the '{@link textualmcrl2.Quantification#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(IdDecl value);

	/**
	 * Returns the value of the '<em><b>Forall</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forall</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forall</em>' attribute.
	 * @see #setForall(boolean)
	 * @see textualmcrl2.Textualmcrl2Package#getQuantification_Forall()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isForall();

	/**
	 * Sets the value of the '{@link textualmcrl2.Quantification#isForall <em>Forall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forall</em>' attribute.
	 * @see #isForall()
	 * @generated
	 */
	void setForall(boolean value);

} // Quantification
