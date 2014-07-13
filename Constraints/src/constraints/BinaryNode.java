/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package constraints;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link constraints.BinaryNode#getLeft <em>Left</em>}</li>
 *   <li>{@link constraints.BinaryNode#getRight <em>Right</em>}</li>
 *   <li>{@link constraints.BinaryNode#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see constraints.ConstraintsPackage#getBinaryNode()
 * @model
 * @generated
 */
public interface BinaryNode extends Node {
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
	 * @see constraints.ConstraintsPackage#getBinaryNode_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Node getLeft();

	/**
	 * Sets the value of the '{@link constraints.BinaryNode#getLeft <em>Left</em>}' containment reference.
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
	 * @see constraints.ConstraintsPackage#getBinaryNode_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Node getRight();

	/**
	 * Sets the value of the '{@link constraints.BinaryNode#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Node value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The default value is <code>"Addition"</code>.
	 * The literals are from the enumeration {@link constraints.BinOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see constraints.BinOp
	 * @see #setOperation(BinOp)
	 * @see constraints.ConstraintsPackage#getBinaryNode_Operation()
	 * @model default="Addition" required="true"
	 * @generated
	 */
	BinOp getOperation();

	/**
	 * Sets the value of the '{@link constraints.BinaryNode#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see constraints.BinOp
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(BinOp value);

} // BinaryNode
