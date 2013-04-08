/**
 */
package IntentDSL.util;

import IntentDSL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see IntentDSL.IntentDSLPackage
 * @generated
 */
public class IntentDSLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntentDSLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentDSLSwitch() {
		if (modelPackage == null) {
			modelPackage = IntentDSLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IntentDSLPackage.INTENT_MODEL: {
				IntentModel intentModel = (IntentModel)theEObject;
				T result = caseIntentModel(intentModel);
				if (result == null) result = caseNamedInstance(intentModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentDSLPackage.INTENT: {
				Intent intent = (Intent)theEObject;
				T result = caseIntent(intent);
				if (result == null) result = caseNamedInstance(intent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentDSLPackage.EXTRA_DATA: {
				ExtraData extraData = (ExtraData)theEObject;
				T result = caseExtraData(extraData);
				if (result == null) result = caseNamedInstance(extraData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentDSLPackage.IMPLICIT_INTENT: {
				ImplicitIntent implicitIntent = (ImplicitIntent)theEObject;
				T result = caseImplicitIntent(implicitIntent);
				if (result == null) result = caseIntent(implicitIntent);
				if (result == null) result = caseNamedInstance(implicitIntent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentDSLPackage.BROAD_CAST_INTENT: {
				BroadCastIntent broadCastIntent = (BroadCastIntent)theEObject;
				T result = caseBroadCastIntent(broadCastIntent);
				if (result == null) result = caseIntent(broadCastIntent);
				if (result == null) result = caseNamedInstance(broadCastIntent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentDSLPackage.EXPLICIT_INTENT: {
				ExplicitIntent explicitIntent = (ExplicitIntent)theEObject;
				T result = caseExplicitIntent(explicitIntent);
				if (result == null) result = caseIntent(explicitIntent);
				if (result == null) result = caseNamedInstance(explicitIntent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentDSLPackage.SERVICE_INTENT: {
				ServiceIntent serviceIntent = (ServiceIntent)theEObject;
				T result = caseServiceIntent(serviceIntent);
				if (result == null) result = caseIntent(serviceIntent);
				if (result == null) result = caseNamedInstance(serviceIntent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentDSLPackage.NAMED_INSTANCE: {
				NamedInstance namedInstance = (NamedInstance)theEObject;
				T result = caseNamedInstance(namedInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intent Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intent Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentModel(IntentModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntent(Intent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extra Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extra Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtraData(ExtraData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implicit Intent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implicit Intent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplicitIntent(ImplicitIntent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Broad Cast Intent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Broad Cast Intent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBroadCastIntent(BroadCastIntent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explicit Intent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explicit Intent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplicitIntent(ExplicitIntent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Intent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Intent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceIntent(ServiceIntent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedInstance(NamedInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //IntentDSLSwitch
