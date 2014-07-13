/**
 */
package textualmcrl2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.Op#getOps <em>Ops</em>}</li>
 *   <li>{@link textualmcrl2.Op#isCons <em>Cons</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getOp()
 * @model
 * @generated
 */
public interface Op extends EObject {
	/**
	 * Returns the value of the '<em><b>Ops</b></em>' containment reference list.
	 * The list contents are of type {@link textualmcrl2.IdDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ops</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ops</em>' containment reference list.
	 * @see textualmcrl2.Textualmcrl2Package#getOp_Ops()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IdDecl> getOps();

	/**
	 * Returns the value of the '<em><b>Cons</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cons</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cons</em>' attribute.
	 * @see #setCons(boolean)
	 * @see textualmcrl2.Textualmcrl2Package#getOp_Cons()
	 * @model default="true"
	 * @generated
	 */
	boolean isCons();

	/**
	 * Sets the value of the '{@link textualmcrl2.Op#isCons <em>Cons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cons</em>' attribute.
	 * @see #isCons()
	 * @generated
	 */
	void setCons(boolean value);

} // Op
