/**
 */
package IntentDSL.impl;

import IntentDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntentDSLFactoryImpl extends EFactoryImpl implements IntentDSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntentDSLFactory init() {
		try {
			IntentDSLFactory theIntentDSLFactory = (IntentDSLFactory)EPackage.Registry.INSTANCE.getEFactory("platform:/resource/AndroidIntent/model/Intent.ecore"); 
			if (theIntentDSLFactory != null) {
				return theIntentDSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntentDSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentDSLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IntentDSLPackage.INTENT_MODEL: return createIntentModel();
			case IntentDSLPackage.EXTRA_DATA: return createExtraData();
			case IntentDSLPackage.IMPLICIT_INTENT: return createImplicitIntent();
			case IntentDSLPackage.BROAD_CAST_INTENT: return createBroadCastIntent();
			case IntentDSLPackage.EXPLICIT_INTENT: return createExplicitIntent();
			case IntentDSLPackage.SERVICE_INTENT: return createServiceIntent();
			case IntentDSLPackage.NAMED_INSTANCE: return createNamedInstance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case IntentDSLPackage.SIMPLE_TYPE_ENUM:
				return createSimpleTypeEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case IntentDSLPackage.SIMPLE_TYPE_ENUM:
				return convertSimpleTypeEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentModel createIntentModel() {
		IntentModelImpl intentModel = new IntentModelImpl();
		return intentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtraData createExtraData() {
		ExtraDataImpl extraData = new ExtraDataImpl();
		return extraData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitIntent createImplicitIntent() {
		ImplicitIntentImpl implicitIntent = new ImplicitIntentImpl();
		return implicitIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BroadCastIntent createBroadCastIntent() {
		BroadCastIntentImpl broadCastIntent = new BroadCastIntentImpl();
		return broadCastIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplicitIntent createExplicitIntent() {
		ExplicitIntentImpl explicitIntent = new ExplicitIntentImpl();
		return explicitIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceIntent createServiceIntent() {
		ServiceIntentImpl serviceIntent = new ServiceIntentImpl();
		return serviceIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedInstance createNamedInstance() {
		NamedInstanceImpl namedInstance = new NamedInstanceImpl();
		return namedInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTypeEnum createSimpleTypeEnumFromString(EDataType eDataType, String initialValue) {
		SimpleTypeEnum result = SimpleTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentDSLPackage getIntentDSLPackage() {
		return (IntentDSLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IntentDSLPackage getPackage() {
		return IntentDSLPackage.eINSTANCE;
	}

} //IntentDSLFactoryImpl
