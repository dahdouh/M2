/**
 */
package tp.metaprogramming.memo.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import tp.metaprogramming.memo.Automobile;
import tp.metaprogramming.memo.AutomobileType;
import tp.metaprogramming.memo.MemoClass;
import tp.metaprogramming.memo.MemoFactory;
import tp.metaprogramming.memo.MemoPackage;
import tp.metaprogramming.memo.NamedElement;
import tp.metaprogramming.memo.Person;
import tp.metaprogramming.memo.World;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MemoPackageImpl extends EPackageImpl implements MemoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass automobileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass worldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum automobileTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType newDataType1EDataType = null;

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
	 * @see tp.metaprogramming.memo.MemoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MemoPackageImpl() {
		super(eNS_URI, MemoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MemoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MemoPackage init() {
		if (isInited)
			return (MemoPackage) EPackage.Registry.INSTANCE.getEPackage(MemoPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMemoPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MemoPackageImpl theMemoPackage = registeredMemoPackage instanceof MemoPackageImpl
				? (MemoPackageImpl) registeredMemoPackage
				: new MemoPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMemoPackage.createPackageContents();

		// Initialize created meta-data
		theMemoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMemoPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MemoPackage.eNS_URI, theMemoPackage);
		return theMemoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoClass() {
		return memoClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoClass_Instances() {
		return (EAttribute) memoClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutomobile() {
		return automobileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomobile_Type() {
		return (EAttribute) automobileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Age() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Automobile() {
		return (EReference) personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerson__Birthday() {
		return personEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorld() {
		return worldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorld_Automobile() {
		return (EReference) worldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorld_Person() {
		return (EReference) worldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAutomobileType() {
		return automobileTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNewDataType1() {
		return newDataType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoFactory getMemoFactory() {
		return (MemoFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		automobileEClass = createEClass(AUTOMOBILE);
		createEAttribute(automobileEClass, AUTOMOBILE__TYPE);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__AGE);
		createEReference(personEClass, PERSON__AUTOMOBILE);
		createEOperation(personEClass, PERSON___BIRTHDAY);

		worldEClass = createEClass(WORLD);
		createEReference(worldEClass, WORLD__AUTOMOBILE);
		createEReference(worldEClass, WORLD__PERSON);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		memoClassEClass = createEClass(MEMO_CLASS);
		createEAttribute(memoClassEClass, MEMO_CLASS__INSTANCES);

		// Create enums
		automobileTypeEEnum = createEEnum(AUTOMOBILE_TYPE);

		// Create data types
		newDataType1EDataType = createEDataType(NEW_DATA_TYPE1);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		automobileEClass.getESuperTypes().add(this.getNamedElement());
		personEClass.getESuperTypes().add(this.getNamedElement());
		worldEClass.getESuperTypes().add(this.getMemoClass());
		namedElementEClass.getESuperTypes().add(this.getMemoClass());

		// Initialize classes, features, and operations; add parameters
		initEClass(automobileEClass, Automobile.class, "Automobile", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutomobile_Type(), this.getAutomobileType(), "type", null, 0, 1, Automobile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Age(), ecorePackage.getEInt(), "age", null, 0, 1, Person.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Automobile(), this.getAutomobile(), null, "automobile", null, 0, -1, Person.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPerson__Birthday(), null, "birthday", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(worldEClass, World.class, "World", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorld_Automobile(), this.getAutomobile(), null, "automobile", null, 0, -1, World.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorld_Person(), this.getPerson(), null, "person", null, 0, -1, World.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoClassEClass, MemoClass.class, "MemoClass", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemoClass_Instances(), ecorePackage.getEJavaObject(), "instances", null, 0, -1,
				MemoClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(automobileTypeEEnum, AutomobileType.class, "AutomobileType");
		addEEnumLiteral(automobileTypeEEnum, AutomobileType.BMW);
		addEEnumLiteral(automobileTypeEEnum, AutomobileType.MERCEDES);
		addEEnumLiteral(automobileTypeEEnum, AutomobileType.AUDI);
		addEEnumLiteral(automobileTypeEEnum, AutomobileType.CITROEN);
		addEEnumLiteral(automobileTypeEEnum, AutomobileType.RENAULT);

		// Initialize data types
		initEDataType(newDataType1EDataType, Object.class, "NewDataType1", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MemoPackageImpl
