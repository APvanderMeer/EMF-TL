/**
 */
package textualmcrl2.tests;

import junit.textui.TestRunner;

import textualmcrl2.Textualmcrl2Factory;
import textualmcrl2.WhereClause;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Where Clause</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WhereClauseTest extends DataExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WhereClauseTest.class);
	}

	/**
	 * Constructs a new Where Clause test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhereClauseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Where Clause test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WhereClause getFixture() {
		return (WhereClause)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Textualmcrl2Factory.eINSTANCE.createWhereClause());
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

} //WhereClauseTest
