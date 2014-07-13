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
 * A representation of the model object '<em><b>Fold Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link constraints.FoldConstraint#getContainers <em>Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @see constraints.ConstraintsPackage#getFoldConstraint()
 * @model
 * @generated
 */
public interface FoldConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
	 * The list contents are of type {@link constraints.Generator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' containment reference list.
	 * @see constraints.ConstraintsPackage#getFoldConstraint_Containers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Generator> getContainers();

} // FoldConstraint
