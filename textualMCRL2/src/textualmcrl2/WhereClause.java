/**
 */
package textualmcrl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Where Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.WhereClause#getBase <em>Base</em>}</li>
 *   <li>{@link textualmcrl2.WhereClause#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getWhereClause()
 * @model
 * @generated
 */
public interface WhereClause extends DataExpression {
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
	 * @see textualmcrl2.Textualmcrl2Package#getWhereClause_Base()
	 * @model containment="true"
	 * @generated
	 */
	DataExpression getBase();

	/**
	 * Sets the value of the '{@link textualmcrl2.WhereClause#getBase <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' containment reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(DataExpression value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link textualmcrl2.DataExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see textualmcrl2.Textualmcrl2Package#getWhereClause_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataExpression> getValues();

} // WhereClause
