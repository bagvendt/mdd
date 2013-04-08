/**
 */
package IntentDSL.tests;

import IntentDSL.IntentDSLFactory;
import IntentDSL.ServiceIntent;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service Intent</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceIntentTest extends IntentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServiceIntentTest.class);
	}

	/**
	 * Constructs a new Service Intent test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceIntentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Service Intent test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ServiceIntent getFixture() {
		return (ServiceIntent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IntentDSLFactory.eINSTANCE.createServiceIntent());
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

} //ServiceIntentTest
