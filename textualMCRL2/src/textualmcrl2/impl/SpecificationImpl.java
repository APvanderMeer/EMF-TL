/**
 */
package textualmcrl2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import textualmcrl2.Atom;
import textualmcrl2.Eqn;
import textualmcrl2.Op;
import textualmcrl2.ProcessDecl;
import textualmcrl2.ProcessExpr;
import textualmcrl2.Sort;
import textualmcrl2.Specification;
import textualmcrl2.Textualmcrl2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link textualmcrl2.impl.SpecificationImpl#getAtoms <em>Atoms</em>}</li>
 *   <li>{@link textualmcrl2.impl.SpecificationImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link textualmcrl2.impl.SpecificationImpl#getSorts <em>Sorts</em>}</li>
 *   <li>{@link textualmcrl2.impl.SpecificationImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link textualmcrl2.impl.SpecificationImpl#getEquations <em>Equations</em>}</li>
 *   <li>{@link textualmcrl2.impl.SpecificationImpl#getInit <em>Init</em>}</li>
 *   <li>{@link textualmcrl2.impl.SpecificationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecificationImpl extends EObjectImpl implements Specification {
	/**
	 * The cached value of the '{@link #getAtoms() <em>Atoms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtoms()
	 * @generated
	 * @ordered
	 */
	protected EList<Atom> atoms;

	/**
	 * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessDecl> processes;

	/**
	 * The cached value of the '{@link #getSorts() <em>Sorts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Sort> sorts;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Op> operations;

	/**
	 * The cached value of the '{@link #getEquations() <em>Equations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquations()
	 * @generated
	 * @ordered
	 */
	protected EList<Eqn> equations;

	/**
	 * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected ProcessExpr init;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "\'test\'";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Textualmcrl2Package.Literals.SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Atom> getAtoms() {
		if (atoms == null) {
			atoms = new EObjectContainmentEList<Atom>(Atom.class, this, Textualmcrl2Package.SPECIFICATION__ATOMS);
		}
		return atoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessDecl> getProcesses() {
		if (processes == null) {
			processes = new EObjectContainmentEList<ProcessDecl>(ProcessDecl.class, this, Textualmcrl2Package.SPECIFICATION__PROCESSES);
		}
		return processes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sort> getSorts() {
		if (sorts == null) {
			sorts = new EObjectContainmentEList<Sort>(Sort.class, this, Textualmcrl2Package.SPECIFICATION__SORTS);
		}
		return sorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Op> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<Op>(Op.class, this, Textualmcrl2Package.SPECIFICATION__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Eqn> getEquations() {
		if (equations == null) {
			equations = new EObjectContainmentEList<Eqn>(Eqn.class, this, Textualmcrl2Package.SPECIFICATION__EQUATIONS);
		}
		return equations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessExpr getInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInit(ProcessExpr newInit, NotificationChain msgs) {
		ProcessExpr oldInit = init;
		init = newInit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Textualmcrl2Package.SPECIFICATION__INIT, oldInit, newInit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(ProcessExpr newInit) {
		if (newInit != init) {
			NotificationChain msgs = null;
			if (init != null)
				msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Textualmcrl2Package.SPECIFICATION__INIT, null, msgs);
			if (newInit != null)
				msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Textualmcrl2Package.SPECIFICATION__INIT, null, msgs);
			msgs = basicSetInit(newInit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Textualmcrl2Package.SPECIFICATION__INIT, newInit, newInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Textualmcrl2Package.SPECIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Textualmcrl2Package.SPECIFICATION__ATOMS:
				return ((InternalEList<?>)getAtoms()).basicRemove(otherEnd, msgs);
			case Textualmcrl2Package.SPECIFICATION__PROCESSES:
				return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
			case Textualmcrl2Package.SPECIFICATION__SORTS:
				return ((InternalEList<?>)getSorts()).basicRemove(otherEnd, msgs);
			case Textualmcrl2Package.SPECIFICATION__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case Textualmcrl2Package.SPECIFICATION__EQUATIONS:
				return ((InternalEList<?>)getEquations()).basicRemove(otherEnd, msgs);
			case Textualmcrl2Package.SPECIFICATION__INIT:
				return basicSetInit(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Textualmcrl2Package.SPECIFICATION__ATOMS:
				return getAtoms();
			case Textualmcrl2Package.SPECIFICATION__PROCESSES:
				return getProcesses();
			case Textualmcrl2Package.SPECIFICATION__SORTS:
				return getSorts();
			case Textualmcrl2Package.SPECIFICATION__OPERATIONS:
				return getOperations();
			case Textualmcrl2Package.SPECIFICATION__EQUATIONS:
				return getEquations();
			case Textualmcrl2Package.SPECIFICATION__INIT:
				return getInit();
			case Textualmcrl2Package.SPECIFICATION__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Textualmcrl2Package.SPECIFICATION__ATOMS:
				getAtoms().clear();
				getAtoms().addAll((Collection<? extends Atom>)newValue);
				return;
			case Textualmcrl2Package.SPECIFICATION__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends ProcessDecl>)newValue);
				return;
			case Textualmcrl2Package.SPECIFICATION__SORTS:
				getSorts().clear();
				getSorts().addAll((Collection<? extends Sort>)newValue);
				return;
			case Textualmcrl2Package.SPECIFICATION__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Op>)newValue);
				return;
			case Textualmcrl2Package.SPECIFICATION__EQUATIONS:
				getEquations().clear();
				getEquations().addAll((Collection<? extends Eqn>)newValue);
				return;
			case Textualmcrl2Package.SPECIFICATION__INIT:
				setInit((ProcessExpr)newValue);
				return;
			case Textualmcrl2Package.SPECIFICATION__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Textualmcrl2Package.SPECIFICATION__ATOMS:
				getAtoms().clear();
				return;
			case Textualmcrl2Package.SPECIFICATION__PROCESSES:
				getProcesses().clear();
				return;
			case Textualmcrl2Package.SPECIFICATION__SORTS:
				getSorts().clear();
				return;
			case Textualmcrl2Package.SPECIFICATION__OPERATIONS:
				getOperations().clear();
				return;
			case Textualmcrl2Package.SPECIFICATION__EQUATIONS:
				getEquations().clear();
				return;
			case Textualmcrl2Package.SPECIFICATION__INIT:
				setInit((ProcessExpr)null);
				return;
			case Textualmcrl2Package.SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Textualmcrl2Package.SPECIFICATION__ATOMS:
				return atoms != null && !atoms.isEmpty();
			case Textualmcrl2Package.SPECIFICATION__PROCESSES:
				return processes != null && !processes.isEmpty();
			case Textualmcrl2Package.SPECIFICATION__SORTS:
				return sorts != null && !sorts.isEmpty();
			case Textualmcrl2Package.SPECIFICATION__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case Textualmcrl2Package.SPECIFICATION__EQUATIONS:
				return equations != null && !equations.isEmpty();
			case Textualmcrl2Package.SPECIFICATION__INIT:
				return init != null;
			case Textualmcrl2Package.SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SpecificationImpl
