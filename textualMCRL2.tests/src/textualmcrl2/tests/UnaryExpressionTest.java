/**
 */
package textualmcrl2.tests;

import junit.textui.TestRunner;

import textualmcrl2.Textualmcrl2Factory;
import textualmcrl2.UnaryExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnaryExpressionTest extends DataExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnaryExpressionTest.class);
	}

	/**
	 * Constructs a new Unary Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unary Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UnaryExpression getFixture() {
		return (UnaryExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Textualmcrl2Factory.eINSTANCE.createUnaryExpression());
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

} //UnaryExpressionTest
