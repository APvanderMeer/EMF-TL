/**
 */
package textualmcrl2.tests;

import junit.textui.TestRunner;

import textualmcrl2.Deadlock;
import textualmcrl2.Textualmcrl2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Deadlock</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeadlockTest extends ProcessExprTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeadlockTest.class);
	}

	/**
	 * Constructs a new Deadlock test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeadlockTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Deadlock test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Deadlock getFixture() {
		return (Deadlock)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Textualmcrl2Factory.eINSTANCE.createDeadlock());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DeadlockTest
