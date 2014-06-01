/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package constraints;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link constraints.VariableReference#getVar <em>Var</em>}</li>
 * </ul>
 * </p>
 *
 * @see constraints.ConstraintsPackage#getVariableReference()
 * @model
 * @generated
 */
public interface VariableReference extends Node {
	/**
	 * Returns the value of the '<em><b>Var</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link constraints.Variable#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' reference.
	 * @see #setVar(Variable)
	 * @see constraints.ConstraintsPackage#getVariableReference_Var()
	 * @see constraints.Variable#getReferences
	 * @model opposite="references" required="true"
	 * @generated
	 */
	Variable getVar();

	/**
	 * Sets the value of the '{@link constraints.VariableReference#getVar <em>Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' reference.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(Variable value);

} // VariableReference
