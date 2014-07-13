/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package constraints;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equation Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link constraints.EquationConstraint#getEquation <em>Equation</em>}</li>
 * </ul>
 * </p>
 *
 * @see constraints.ConstraintsPackage#getEquationConstraint()
 * @model
 * @generated
 */
public interface EquationConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Equation</b></em>' containment reference list.
	 * The list contents are of type {@link constraints.Equation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equation</em>' containment reference list.
	 * @see constraints.ConstraintsPackage#getEquationConstraint_Equation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Equation> getEquation();

} // EquationConstraint
