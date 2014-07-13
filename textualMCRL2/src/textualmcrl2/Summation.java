/**
 */
package textualmcrl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Summation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.Summation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link textualmcrl2.Summation#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getSummation()
 * @model
 * @generated
 */
public interface Summation extends ProcessExpr {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link textualmcrl2.IdDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see textualmcrl2.Textualmcrl2Package#getSummation_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<IdDecl> getParameters();

	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(ProcessExpr)
	 * @see textualmcrl2.Textualmcrl2Package#getSummation_Child()
	 * @model containment="true"
	 * @generated
	 */
	ProcessExpr getChild();

	/**
	 * Sets the value of the '{@link textualmcrl2.Summation#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(ProcessExpr value);

} // Summation
