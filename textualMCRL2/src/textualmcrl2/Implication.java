/**
 */
package textualmcrl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.Implication#getCondition <em>Condition</em>}</li>
 *   <li>{@link textualmcrl2.Implication#getAction <em>Action</em>}</li>
 *   <li>{@link textualmcrl2.Implication#getElseAction <em>Else Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getImplication()
 * @model
 * @generated
 */
public interface Implication extends ProcessExpr {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(DataExpression)
	 * @see textualmcrl2.Textualmcrl2Package#getImplication_Condition()
	 * @model containment="true"
	 * @generated
	 */
	DataExpression getCondition();

	/**
	 * Sets the value of the '{@link textualmcrl2.Implication#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(DataExpression value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(ProcessExpr)
	 * @see textualmcrl2.Textualmcrl2Package#getImplication_Action()
	 * @model containment="true"
	 * @generated
	 */
	ProcessExpr getAction();

	/**
	 * Sets the value of the '{@link textualmcrl2.Implication#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ProcessExpr value);

	/**
	 * Returns the value of the '<em><b>Else Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Action</em>' containment reference.
	 * @see #setElseAction(ProcessExpr)
	 * @see textualmcrl2.Textualmcrl2Package#getImplication_ElseAction()
	 * @model containment="true"
	 * @generated
	 */
	ProcessExpr getElseAction();

	/**
	 * Sets the value of the '{@link textualmcrl2.Implication#getElseAction <em>Else Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Action</em>' containment reference.
	 * @see #getElseAction()
	 * @generated
	 */
	void setElseAction(ProcessExpr value);

} // Implication
