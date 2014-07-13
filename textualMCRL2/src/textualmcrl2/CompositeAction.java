/**
 */
package textualmcrl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.CompositeAction#getLeft <em>Left</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getCompositeAction()
 * @model abstract="true"
 * @generated
 */
public interface CompositeAction extends ProcessExpr {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(ProcessExpr)
	 * @see textualmcrl2.Textualmcrl2Package#getCompositeAction_Left()
	 * @model containment="true"
	 * @generated
	 */
	ProcessExpr getLeft();

	/**
	 * Sets the value of the '{@link textualmcrl2.CompositeAction#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(ProcessExpr value);

} // CompositeAction
