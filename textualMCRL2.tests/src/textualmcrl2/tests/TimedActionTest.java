/**
 */
package textualmcrl2.tests;

import junit.textui.TestRunner;

import textualmcrl2.Textualmcrl2Factory;
import textualmcrl2.TimedAction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Timed Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimedActionTest extends CompositeActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimedActionTest.class);
	}

	/**
	 * Constructs a new Timed Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Timed Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TimedAction getFixture() {
		return (TimedAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Textualmcrl2Factory.eINSTANCE.createTimedAction());
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

} //TimedActionTest
