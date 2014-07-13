/**
 */
package textualmcrl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.Communication#getCommunications <em>Communications</em>}</li>
 *   <li>{@link textualmcrl2.Communication#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getCommunication()
 * @model
 * @generated
 */
public interface Communication extends ProcessExpr {
	/**
	 * Returns the value of the '<em><b>Communications</b></em>' containment reference list.
	 * The list contents are of type {@link textualmcrl2.MultiAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communications</em>' containment reference list.
	 * @see textualmcrl2.Textualmcrl2Package#getCommunication_Communications()
	 * @model containment="true"
	 * @generated
	 */
	EList<MultiAction> getCommunications();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(ProcessExpr)
	 * @see textualmcrl2.Textualmcrl2Package#getCommunication_Action()
	 * @model containment="true"
	 * @generated
	 */
	ProcessExpr getAction();

	/**
	 * Sets the value of the '{@link textualmcrl2.Communication#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ProcessExpr value);

} // Communication
