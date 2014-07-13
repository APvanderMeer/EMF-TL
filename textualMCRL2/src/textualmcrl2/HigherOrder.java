/**
 */
package textualmcrl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Higher Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.HigherOrder#getDomain <em>Domain</em>}</li>
 *   <li>{@link textualmcrl2.HigherOrder#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getHigherOrder()
 * @model
 * @generated
 */
public interface HigherOrder extends SortExpr {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference list.
	 * The list contents are of type {@link textualmcrl2.SortExpr}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference list.
	 * @see textualmcrl2.Textualmcrl2Package#getHigherOrder_Domain()
	 * @model containment="true"
	 * @generated
	 */
	EList<SortExpr> getDomain();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(SortExpr)
	 * @see textualmcrl2.Textualmcrl2Package#getHigherOrder_Result()
	 * @model containment="true"
	 * @generated
	 */
	SortExpr getResult();

	/**
	 * Sets the value of the '{@link textualmcrl2.HigherOrder#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(SortExpr value);

} // HigherOrder
