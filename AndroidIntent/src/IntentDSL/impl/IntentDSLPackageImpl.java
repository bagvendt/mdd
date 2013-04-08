/**
 */
package IntentDSL.impl;

import IntentDSL.BroadCastIntent;
import IntentDSL.ExplicitIntent;
import IntentDSL.ExtraData;
import IntentDSL.ImplicitIntent;
import IntentDSL.Intent;
import IntentDSL.IntentDSLFactory;
import IntentDSL.IntentDSLPackage;
import IntentDSL.IntentModel;
import IntentDSL.NamedInstance;
import IntentDSL.ServiceIntent;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntentDSLPackageImpl extends EPackageImpl implements IntentDSLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extraDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicitIntentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass broadCastIntentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explicitIntentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceIntentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedInstanceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see IntentDSL.IntentDSLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntentDSLPackageImpl() {
		super(eNS_URI, IntentDSLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link IntentDSLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IntentDSLPackage init() {
		if (isInited) return (IntentDSLPackage)EPackage.Registry.INSTANCE.getEPackage(IntentDSLPackage.eNS_URI);

		// Obtain or create and register package
		IntentDSLPackageImpl theIntentDSLPackage = (IntentDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntentDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntentDSLPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theIntentDSLPackage.createPackageContents();

		// Initialize created meta-data
		theIntentDSLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntentDSLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IntentDSLPackage.eNS_URI, theIntentDSLPackage);
		return theIntentDSLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntentModel() {
		return intentModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntentModel_Intents() {
		return (EReference)intentModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntent() {
		return intentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntent_ExtraData() {
		return (EReference)intentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntent_Action() {
		return (EAttribute)intentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntent_DataURI() {
		return (EAttribute)intentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntent_Category() {
		return (EAttribute)intentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntent_ReturnData() {
		return (EReference)intentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtraData() {
		return extraDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtraData_Type() {
		return (EAttribute)extraDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplicitIntent() {
		return implicitIntentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBroadCastIntent() {
		return broadCastIntentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplicitIntent() {
		return explicitIntentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceIntent() {
		return serviceIntentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedInstance() {
		return namedInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedInstance_Name() {
		return (EAttribute)namedInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentDSLFactory getIntentDSLFactory() {
		return (IntentDSLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		intentModelEClass = createEClass(INTENT_MODEL);
		createEReference(intentModelEClass, INTENT_MODEL__INTENTS);

		intentEClass = createEClass(INTENT);
		createEReference(intentEClass, INTENT__EXTRA_DATA);
		createEAttribute(intentEClass, INTENT__ACTION);
		createEAttribute(intentEClass, INTENT__DATA_URI);
		createEAttribute(intentEClass, INTENT__CATEGORY);
		createEReference(intentEClass, INTENT__RETURN_DATA);

		extraDataEClass = createEClass(EXTRA_DATA);
		createEAttribute(extraDataEClass, EXTRA_DATA__TYPE);

		implicitIntentEClass = createEClass(IMPLICIT_INTENT);

		broadCastIntentEClass = createEClass(BROAD_CAST_INTENT);

		explicitIntentEClass = createEClass(EXPLICIT_INTENT);

		serviceIntentEClass = createEClass(SERVICE_INTENT);

		namedInstanceEClass = createEClass(NAMED_INSTANCE);
		createEAttribute(namedInstanceEClass, NAMED_INSTANCE__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		intentModelEClass.getESuperTypes().add(this.getNamedInstance());
		intentEClass.getESuperTypes().add(this.getNamedInstance());
		extraDataEClass.getESuperTypes().add(this.getNamedInstance());
		implicitIntentEClass.getESuperTypes().add(this.getIntent());
		broadCastIntentEClass.getESuperTypes().add(this.getIntent());
		explicitIntentEClass.getESuperTypes().add(this.getIntent());
		serviceIntentEClass.getESuperTypes().add(this.getIntent());

		// Initialize classes and features; add operations and parameters
		initEClass(intentModelEClass, IntentModel.class, "IntentModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntentModel_Intents(), this.getIntent(), null, "intents", null, 0, -1, IntentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intentEClass, Intent.class, "Intent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntent_ExtraData(), this.getExtraData(), null, "extraData", null, 0, -1, Intent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntent_Action(), ecorePackage.getEString(), "action", null, 0, 1, Intent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntent_DataURI(), ecorePackage.getEString(), "dataURI", null, 0, 1, Intent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntent_Category(), ecorePackage.getEString(), "category", null, 0, 1, Intent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntent_ReturnData(), this.getExtraData(), null, "returnData", null, 0, -1, Intent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extraDataEClass, ExtraData.class, "ExtraData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtraData_Type(), ecorePackage.getEString(), "type", null, 0, 1, ExtraData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implicitIntentEClass, ImplicitIntent.class, "ImplicitIntent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(broadCastIntentEClass, BroadCastIntent.class, "BroadCastIntent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(explicitIntentEClass, ExplicitIntent.class, "ExplicitIntent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceIntentEClass, ServiceIntent.class, "ServiceIntent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedInstanceEClass, NamedInstance.class, "NamedInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //IntentDSLPackageImpl
