/**
 */
package textualmcrl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Projection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.Projection#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getProjection()
 * @model
 * @generated
 */
public interface Projection extends Nameable {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(SortExpr)
	 * @see textualmcrl2.Textualmcrl2Package#getProjection_Domain()
	 * @model containment="true"
	 * @generated
	 */
	SortExpr getDomain();

	/**
	 * Sets the value of the '{@link textualmcrl2.Projection#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(SortExpr value);

} // Projection
