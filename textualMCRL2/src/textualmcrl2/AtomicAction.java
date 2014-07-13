/**
 */
package textualmcrl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.AtomicAction#getAtomname <em>Atomname</em>}</li>
 *   <li>{@link textualmcrl2.AtomicAction#getLinks <em>Links</em>}</li>
 *   <li>{@link textualmcrl2.AtomicAction#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getAtomicAction()
 * @model
 * @generated
 */
public interface AtomicAction extends ProcessExpr {
	/**
	 * Returns the value of the '<em><b>Atomname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atomname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atomname</em>' attribute.
	 * @see #setAtomname(String)
	 * @see textualmcrl2.Textualmcrl2Package#getAtomicAction_Atomname()
	 * @model
	 * @generated
	 */
	String getAtomname();

	/**
	 * Sets the value of the '{@link textualmcrl2.AtomicAction#getAtomname <em>Atomname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atomname</em>' attribute.
	 * @see #getAtomname()
	 * @generated
	 */
	void setAtomname(String value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link textualmcrl2.Nameable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see textualmcrl2.Textualmcrl2Package#getAtomicAction_Links()
	 * @model
	 * @generated
	 */
	EList<Nameable> getLinks();

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link textualmcrl2.DataExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see textualmcrl2.Textualmcrl2Package#getAtomicAction_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataExpression> getArguments();

} // AtomicAction
