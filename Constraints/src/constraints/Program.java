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
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link constraints.Program#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link constraints.Program#getVariables <em>Variables</em>}</li>
 *   <li>{@link constraints.Program#getRoot <em>Root</em>}</li>
 *   <li>{@link constraints.Program#getTypes <em>Types</em>}</li>
 *   <li>{@link constraints.Program#getOperators <em>Operators</em>}</li>
 *   <li>{@link constraints.Program#getTypeAttribute <em>Type Attribute</em>}</li>
 *   <li>{@link constraints.Program#getObjectElements <em>Object Elements</em>}</li>
 *   <li>{@link constraints.Program#getErrorconstraints <em>Errorconstraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see constraints.ConstraintsPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link constraints.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see constraints.ConstraintsPackage#getProgram_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link constraints.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see constraints.ConstraintsPackage#getProgram_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see #setRoot(Variable)
	 * @see constraints.ConstraintsPackage#getProgram_Root()
	 * @model required="true"
	 * @generated
	 */
	Variable getRoot();

	/**
	 * Sets the value of the '{@link constraints.Program#getRoot <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Variable value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link constraints.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see constraints.ConstraintsPackage#getProgram_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>Operators</b></em>' containment reference list.
	 * The list contents are of type {@link constraints.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operators</em>' containment reference list.
	 * @see constraints.ConstraintsPackage#getProgram_Operators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operator> getOperators();

	/**
	 * Returns the value of the '<em><b>Type Attribute</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Attribute</em>' attribute list.
	 * @see constraints.ConstraintsPackage#getProgram_TypeAttribute()
	 * @model
	 * @generated
	 */
	EList<Integer> getTypeAttribute();

	/**
	 * Returns the value of the '<em><b>Object Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Elements</em>' attribute list.
	 * @see constraints.ConstraintsPackage#getProgram_ObjectElements()
	 * @model default=""
	 * @generated
	 */
	EList<String> getObjectElements();

	/**
	 * Returns the value of the '<em><b>Errorconstraints</b></em>' containment reference list.
	 * The list contents are of type {@link constraints.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Errorconstraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errorconstraints</em>' containment reference list.
	 * @see constraints.ConstraintsPackage#getProgram_Errorconstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getErrorconstraints();

} // Program
