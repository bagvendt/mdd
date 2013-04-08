/**
 */
package IntentDSL.util;

import IntentDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see IntentDSL.IntentDSLPackage
 * @generated
 */
public class IntentDSLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntentDSLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentDSLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IntentDSLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentDSLSwitch<Adapter> modelSwitch =
		new IntentDSLSwitch<Adapter>() {
			@Override
			public Adapter caseIntentModel(IntentModel object) {
				return createIntentModelAdapter();
			}
			@Override
			public Adapter caseIntent(Intent object) {
				return createIntentAdapter();
			}
			@Override
			public Adapter caseExtraData(ExtraData object) {
				return createExtraDataAdapter();
			}
			@Override
			public Adapter caseImplicitIntent(ImplicitIntent object) {
				return createImplicitIntentAdapter();
			}
			@Override
			public Adapter caseBroadCastIntent(BroadCastIntent object) {
				return createBroadCastIntentAdapter();
			}
			@Override
			public Adapter caseExplicitIntent(ExplicitIntent object) {
				return createExplicitIntentAdapter();
			}
			@Override
			public Adapter caseServiceIntent(ServiceIntent object) {
				return createServiceIntentAdapter();
			}
			@Override
			public Adapter caseNamedInstance(NamedInstance object) {
				return createNamedInstanceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link IntentDSL.IntentModel <em>Intent Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IntentDSL.IntentModel
	 * @generated
	 */
	public Adapter createIntentModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IntentDSL.Intent <em>Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IntentDSL.Intent
	 * @generated
	 */
	public Adapter createIntentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IntentDSL.ExtraData <em>Extra Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IntentDSL.ExtraData
	 * @generated
	 */
	public Adapter createExtraDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IntentDSL.ImplicitIntent <em>Implicit Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IntentDSL.ImplicitIntent
	 * @generated
	 */
	public Adapter createImplicitIntentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IntentDSL.BroadCastIntent <em>Broad Cast Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IntentDSL.BroadCastIntent
	 * @generated
	 */
	public Adapter createBroadCastIntentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IntentDSL.ExplicitIntent <em>Explicit Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IntentDSL.ExplicitIntent
	 * @generated
	 */
	public Adapter createExplicitIntentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IntentDSL.ServiceIntent <em>Service Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IntentDSL.ServiceIntent
	 * @generated
	 */
	public Adapter createServiceIntentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IntentDSL.NamedInstance <em>Named Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IntentDSL.NamedInstance
	 * @generated
	 */
	public Adapter createNamedInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IntentDSLAdapterFactory
