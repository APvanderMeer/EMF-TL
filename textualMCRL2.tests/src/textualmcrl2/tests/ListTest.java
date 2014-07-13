/**
 */
package textualmcrl2.tests;

import junit.textui.TestRunner;

import textualmcrl2.List;
import textualmcrl2.Textualmcrl2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ListTest extends SortExprTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ListTest.class);
	}

	/**
	 * Constructs a new List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected List getFixture() {
		return (List)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Textualmcrl2Factory.eINSTANCE.createList());
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

} //ListTest
