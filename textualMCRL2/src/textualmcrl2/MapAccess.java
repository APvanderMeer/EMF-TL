/**
 */
package textualmcrl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.MapAccess#getBase <em>Base</em>}</li>
 *   <li>{@link textualmcrl2.MapAccess#getKey <em>Key</em>}</li>
 *   <li>{@link textualmcrl2.MapAccess#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getMapAccess()
 * @model
 * @generated
 */
public interface MapAccess extends DataExpression {
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
	 * @see textualmcrl2.Textualmcrl2Package#getMapAccess_Base()
	 * @model containment="true"
	 * @generated
	 */
	DataExpression getBase();

	/**
	 * Sets the value of the '{@link textualmcrl2.MapAccess#getBase <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' containment reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(DataExpression value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(DataExpression)
	 * @see textualmcrl2.Textualmcrl2Package#getMapAccess_Key()
	 * @model containment="true"
	 * @generated
	 */
	DataExpression getKey();

	/**
	 * Sets the value of the '{@link textualmcrl2.MapAccess#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(DataExpression value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(DataExpression)
	 * @see textualmcrl2.Textualmcrl2Package#getMapAccess_Value()
	 * @model containment="true"
	 * @generated
	 */
	DataExpression getValue();

	/**
	 * Sets the value of the '{@link textualmcrl2.MapAccess#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DataExpression value);

} // MapAccess
