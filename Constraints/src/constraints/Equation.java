/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package constraints;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link constraints.Equation#getLeft <em>Left</em>}</li>
 *   <li>{@link constraints.Equation#getRight <em>Right</em>}</li>
 *   <li>{@link constraints.Equation#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see constraints.ConstraintsPackage#getEquation()
 * @model
 * @generated
 */
public interface Equation extends Position {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Node)
	 * @see constraints.ConstraintsPackage#getEquation_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Node getLeft();

	/**
	 * Sets the value of the '{@link constraints.Equation#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Node value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Node)
	 * @see constraints.ConstraintsPackage#getEquation_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Node getRight();

	/**
	 * Sets the value of the '{@link constraints.Equation#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Node value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link constraints.ComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see constraints.ComparisonOperator
	 * @see #setOperation(ComparisonOperator)
	 * @see constraints.ConstraintsPackage#getEquation_Operation()
	 * @model required="true"
	 * @generated
	 */
	ComparisonOperator getOperation();

	/**
	 * Sets the value of the '{@link constraints.Equation#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see constraints.ComparisonOperator
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ComparisonOperator value);

} // Equation
