/**
 */
package IntentDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see IntentDSL.IntentDSLPackage
 * @generated
 */
public interface IntentDSLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntentDSLFactory eINSTANCE = IntentDSL.impl.IntentDSLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Intent Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intent Model</em>'.
	 * @generated
	 */
	IntentModel createIntentModel();

	/**
	 * Returns a new object of class '<em>Extra Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extra Data</em>'.
	 * @generated
	 */
	ExtraData createExtraData();

	/**
	 * Returns a new object of class '<em>Implicit Intent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implicit Intent</em>'.
	 * @generated
	 */
	ImplicitIntent createImplicitIntent();

	/**
	 * Returns a new object of class '<em>Broad Cast Intent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Broad Cast Intent</em>'.
	 * @generated
	 */
	BroadCastIntent createBroadCastIntent();

	/**
	 * Returns a new object of class '<em>Explicit Intent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explicit Intent</em>'.
	 * @generated
	 */
	ExplicitIntent createExplicitIntent();

	/**
	 * Returns a new object of class '<em>Service Intent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Intent</em>'.
	 * @generated
	 */
	ServiceIntent createServiceIntent();

	/**
	 * Returns a new object of class '<em>Named Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Instance</em>'.
	 * @generated
	 */
	NamedInstance createNamedInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IntentDSLPackage getIntentDSLPackage();

} //IntentDSLFactory
