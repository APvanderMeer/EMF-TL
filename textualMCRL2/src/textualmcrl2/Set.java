/**
 */
package textualmcrl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.Set#getElementSort <em>Element Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getSet()
 * @model
 * @generated
 */
public interface Set extends SortExpr {
	/**
	 * Returns the value of the '<em><b>Element Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Sort</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Sort</em>' containment reference.
	 * @see #setElementSort(SortExpr)
	 * @see textualmcrl2.Textualmcrl2Package#getSet_ElementSort()
	 * @model containment="true"
	 * @generated
	 */
	SortExpr getElementSort();

	/**
	 * Sets the value of the '{@link textualmcrl2.Set#getElementSort <em>Element Sort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Sort</em>' containment reference.
	 * @see #getElementSort()
	 * @generated
	 */
	void setElementSort(SortExpr value);

} // Set
