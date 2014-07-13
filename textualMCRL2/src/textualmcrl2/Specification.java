/**
 */
package textualmcrl2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualmcrl2.Specification#getAtoms <em>Atoms</em>}</li>
 *   <li>{@link textualmcrl2.Specification#getProcesses <em>Processes</em>}</li>
 *   <li>{@link textualmcrl2.Specification#getSorts <em>Sorts</em>}</li>
 *   <li>{@link textualmcrl2.Specification#getOperations <em>Operations</em>}</li>
 *   <li>{@link textualmcrl2.Specification#getEquations <em>Equations</em>}</li>
 *   <li>{@link textualmcrl2.Specification#getInit <em>Init</em>}</li>
 *   <li>{@link textualmcrl2.Specification#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualmcrl2.Textualmcrl2Package#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends EObject {
	/**
	 * Returns the value of the '<em><b>Atoms</b></em>' containment reference list.
	 * The list contents are of type {@link textualmcrl2.Atom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atoms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atoms</em>' containment reference list.
	 * @see textualmcrl2.Textualmcrl2Package#getSpecification_Atoms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Atom> getAtoms();

	/**
	 * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
	 * The list contents are of type {@link textualmcrl2.ProcessDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processes</em>' containment reference list.
	 * @see textualmcrl2.Textualmcrl2Package#getSpecification_Processes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessDecl> getProcesses();

	/**
	 * Returns the value of the '<em><b>Sorts</b></em>' containment reference list.
	 * The list contents are of type {@link textualmcrl2.Sort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorts</em>' containment reference list.
	 * @see textualmcrl2.Textualmcrl2Package#getSpecification_Sorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sort> getSorts();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link textualmcrl2.Op}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see textualmcrl2.Textualmcrl2Package#getSpecification_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Op> getOperations();

	/**
	 * Returns the value of the '<em><b>Equations</b></em>' containment reference list.
	 * The list contents are of type {@link textualmcrl2.Eqn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equations</em>' containment reference list.
	 * @see textualmcrl2.Textualmcrl2Package#getSpecification_Equations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Eqn> getEquations();

	/**
	 * Returns the value of the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' containment reference.
	 * @see #setInit(ProcessExpr)
	 * @see textualmcrl2.Textualmcrl2Package#getSpecification_Init()
	 * @model containment="true"
	 * @generated
	 */
	ProcessExpr getInit();

	/**
	 * Sets the value of the '{@link textualmcrl2.Specification#getInit <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' containment reference.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(ProcessExpr value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"\'test\'"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see textualmcrl2.Textualmcrl2Package#getSpecification_Name()
	 * @model default="\'test\'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link textualmcrl2.Specification#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Specification
