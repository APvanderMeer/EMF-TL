/**
 */
package textualmcrl2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.ProcessDecl#getAction <em>Action</em>}</li>
 *   <li>{@link textualmcrl2.ProcessDecl#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getProcessDecl()
 * @model
 * @generated
 */
public interface ProcessDecl extends EObject {
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
	 * @see textualmcrl2.Textualmcrl2Package#getProcessDecl_Action()
	 * @model containment="true"
	 * @generated
	 */
	ProcessExpr getAction();

	/**
	 * Sets the value of the '{@link textualmcrl2.ProcessDecl#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ProcessExpr value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference.
	 * @see #setProcess(textualmcrl2.Process)
	 * @see textualmcrl2.Textualmcrl2Package#getProcessDecl_Process()
	 * @model containment="true"
	 * @generated
	 */
	textualmcrl2.Process getProcess();

	/**
	 * Sets the value of the '{@link textualmcrl2.ProcessDecl#getProcess <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' containment reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(textualmcrl2.Process value);

} // ProcessDecl
