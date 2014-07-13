/**
 */
package textualmcrl2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.ConstraintElement#getConstraintvar <em>Constraintvar</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getConstraintElement()
 * @model abstract="true"
 * @generated
 */
public interface ConstraintElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraintvar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraintvar</em>' containment reference.
	 * @see #setConstraintvar(ConstraintVar)
	 * @see textualmcrl2.Textualmcrl2Package#getConstraintElement_Constraintvar()
	 * @model containment="true"
	 * @generated
	 */
	ConstraintVar getConstraintvar();

	/**
	 * Sets the value of the '{@link textualmcrl2.ConstraintElement#getConstraintvar <em>Constraintvar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraintvar</em>' containment reference.
	 * @see #getConstraintvar()
	 * @generated
	 */
	void setConstraintvar(ConstraintVar value);

} // ConstraintElement
