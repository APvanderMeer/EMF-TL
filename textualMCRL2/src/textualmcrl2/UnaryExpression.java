/**
 */
package textualmcrl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.UnaryExpression#getRight <em>Right</em>}</li>
 *   <li>{@link textualmcrl2.UnaryExpression#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getUnaryExpression()
 * @model
 * @generated
 */
public interface UnaryExpression extends DataExpression {
	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(DataExpression)
	 * @see textualmcrl2.Textualmcrl2Package#getUnaryExpression_Right()
	 * @model containment="true"
	 * @generated
	 */
	DataExpression getRight();

	/**
	 * Sets the value of the '{@link textualmcrl2.UnaryExpression#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(DataExpression value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link textualmcrl2.UnaryOps}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see textualmcrl2.UnaryOps
	 * @see #setOperation(UnaryOps)
	 * @see textualmcrl2.Textualmcrl2Package#getUnaryExpression_Operation()
	 * @model
	 * @generated
	 */
	UnaryOps getOperation();

	/**
	 * Sets the value of the '{@link textualmcrl2.UnaryExpression#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see textualmcrl2.UnaryOps
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(UnaryOps value);

} // UnaryExpression
