/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package constraints;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link constraints.Constraint#getName <em>Name</em>}</li>
 *   <li>{@link constraints.Constraint#getLocalconstraints <em>Localconstraints</em>}</li>
 *   <li>{@link constraints.Constraint#getLocalvariables <em>Localvariables</em>}</li>
 * </ul>
 * </p>
 *
 * @see constraints.ConstraintsPackage#getConstraint()
 * @model abstract="true"
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see constraints.ConstraintsPackage#getConstraint_Name()
	 * @model ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link constraints.Constraint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Localconstraints</b></em>' containment reference list.
	 * The list contents are of type {@link constraints.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localconstraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localconstraints</em>' containment reference list.
	 * @see constraints.ConstraintsPackage#getConstraint_Localconstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getLocalconstraints();

	/**
	 * Returns the value of the '<em><b>Localvariables</b></em>' containment reference list.
	 * The list contents are of type {@link constraints.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localvariables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localvariables</em>' containment reference list.
	 * @see constraints.ConstraintsPackage#getConstraint_Localvariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getLocalvariables();

} // Constraint
