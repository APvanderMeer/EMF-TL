/**
 */
package textualmcrl2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eqn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.Eqn#getVariables <em>Variables</em>}</li>
 *   <li>{@link textualmcrl2.Eqn#getEquations <em>Equations</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getEqn()
 * @model
 * @generated
 */
public interface Eqn extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link textualmcrl2.IdDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see textualmcrl2.Textualmcrl2Package#getEqn_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<IdDecl> getVariables();

	/**
	 * Returns the value of the '<em><b>Equations</b></em>' containment reference list.
	 * The list contents are of type {@link textualmcrl2.Equation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equations</em>' containment reference list.
	 * @see textualmcrl2.Textualmcrl2Package#getEqn_Equations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Equation> getEquations();

} // Eqn
