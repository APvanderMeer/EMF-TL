/**
 */
package textualmcrl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Left Merge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.LeftMerge#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getLeftMerge()
 * @model
 * @generated
 */
public interface LeftMerge extends CompositeAction {
	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(ProcessExpr)
	 * @see textualmcrl2.Textualmcrl2Package#getLeftMerge_Right()
	 * @model containment="true"
	 * @generated
	 */
	ProcessExpr getRight();

	/**
	 * Sets the value of the '{@link textualmcrl2.LeftMerge#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(ProcessExpr value);

} // LeftMerge
