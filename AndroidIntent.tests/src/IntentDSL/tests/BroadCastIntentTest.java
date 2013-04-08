/**
 */
package IntentDSL.tests;

import IntentDSL.BroadCastIntent;
import IntentDSL.IntentDSLFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Broad Cast Intent</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BroadCastIntentTest extends IntentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BroadCastIntentTest.class);
	}

	/**
	 * Constructs a new Broad Cast Intent test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BroadCastIntentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Broad Cast Intent test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BroadCastIntent getFixture() {
		return (BroadCastIntent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IntentDSLFactory.eINSTANCE.createBroadCastIntent());
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

} //BroadCastIntentTest
