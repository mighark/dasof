/**
 */
package centroscomerciales.impl;

import centroscomerciales.Aparcamiento;
import centroscomerciales.Ascensor;
import centroscomerciales.Aseo;
import centroscomerciales.CentroComercial;
import centroscomerciales.CentroscomercialesFactory;
import centroscomerciales.CentroscomercialesPackage;
import centroscomerciales.Direccion;
import centroscomerciales.Elemento;
import centroscomerciales.ElementoAforo;
import centroscomerciales.ElementoCambioPlanta;
import centroscomerciales.Escalera;
import centroscomerciales.EspacioAbierto;
import centroscomerciales.Objeto;
import centroscomerciales.Planta;
import centroscomerciales.Puerta;
import centroscomerciales.Restaurante;
import centroscomerciales.Salida;
import centroscomerciales.Tienda;
import centroscomerciales.TipoAseo;
import centroscomerciales.ZonaAparcamiento;

import centroscomerciales.util.CentroscomercialesValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CentroscomercialesPackageImpl extends EPackageImpl implements CentroscomercialesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass centroComercialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plantaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objetoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementoAforoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tiendaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restauranteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementoCambioPlantaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass escaleraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ascensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aseoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass espacioAbiertoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aparcamientoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zonaAparcamientoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass puertaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salidaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoAseoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum direccionEEnum = null;

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
	 * @see centroscomerciales.CentroscomercialesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CentroscomercialesPackageImpl() {
		super(eNS_URI, CentroscomercialesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CentroscomercialesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CentroscomercialesPackage init() {
		if (isInited) return (CentroscomercialesPackage)EPackage.Registry.INSTANCE.getEPackage(CentroscomercialesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCentroscomercialesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CentroscomercialesPackageImpl theCentroscomercialesPackage = registeredCentroscomercialesPackage instanceof CentroscomercialesPackageImpl ? (CentroscomercialesPackageImpl)registeredCentroscomercialesPackage : new CentroscomercialesPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCentroscomercialesPackage.createPackageContents();

		// Initialize created meta-data
		theCentroscomercialesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCentroscomercialesPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CentroscomercialesValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCentroscomercialesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CentroscomercialesPackage.eNS_URI, theCentroscomercialesPackage);
		return theCentroscomercialesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCentroComercial() {
		return centroComercialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCentroComercial_Aforo() {
		return (EAttribute)centroComercialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCentroComercial_Plantas() {
		return (EReference)centroComercialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanta() {
		return plantaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanta_Numero() {
		return (EAttribute)plantaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanta_Elementos() {
		return (EReference)plantaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanta_Puertas() {
		return (EReference)plantaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanta_Salidas() {
		return (EReference)plantaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjeto() {
		return objetoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjeto_Norte() {
		return (EReference)objetoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjeto_Sur() {
		return (EReference)objetoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjeto_Este() {
		return (EReference)objetoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjeto_Oeste() {
		return (EReference)objetoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElemento() {
		return elementoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElemento_Identifier() {
		return (EAttribute)elementoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElemento_Planta() {
		return (EReference)elementoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementoAforo() {
		return elementoAforoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementoAforo_Nombre() {
		return (EAttribute)elementoAforoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementoAforo_Aforo() {
		return (EAttribute)elementoAforoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTienda() {
		return tiendaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestaurante() {
		return restauranteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementoCambioPlanta() {
		return elementoCambioPlantaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementoCambioPlanta_Destino() {
		return (EReference)elementoCambioPlantaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEscalera() {
		return escaleraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAscensor() {
		return ascensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAseo() {
		return aseoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAseo_Tipo() {
		return (EAttribute)aseoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEspacioAbierto() {
		return espacioAbiertoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAparcamiento() {
		return aparcamientoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAparcamiento_Zonas() {
		return (EReference)aparcamientoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZonaAparcamiento() {
		return zonaAparcamientoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZonaAparcamiento_Plazas() {
		return (EAttribute)zonaAparcamientoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZonaAparcamiento_Precio() {
		return (EAttribute)zonaAparcamientoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZonaAparcamiento_UsoReservado() {
		return (EAttribute)zonaAparcamientoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPuerta() {
		return puertaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPuerta_Planta() {
		return (EReference)puertaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSalida() {
		return salidaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSalida_Planta() {
		return (EReference)salidaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoAseo() {
		return tipoAseoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDireccion() {
		return direccionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CentroscomercialesFactory getCentroscomercialesFactory() {
		return (CentroscomercialesFactory)getEFactoryInstance();
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
		centroComercialEClass = createEClass(CENTRO_COMERCIAL);
		createEAttribute(centroComercialEClass, CENTRO_COMERCIAL__AFORO);
		createEReference(centroComercialEClass, CENTRO_COMERCIAL__PLANTAS);

		plantaEClass = createEClass(PLANTA);
		createEAttribute(plantaEClass, PLANTA__NUMERO);
		createEReference(plantaEClass, PLANTA__ELEMENTOS);
		createEReference(plantaEClass, PLANTA__PUERTAS);
		createEReference(plantaEClass, PLANTA__SALIDAS);

		objetoEClass = createEClass(OBJETO);
		createEReference(objetoEClass, OBJETO__NORTE);
		createEReference(objetoEClass, OBJETO__SUR);
		createEReference(objetoEClass, OBJETO__ESTE);
		createEReference(objetoEClass, OBJETO__OESTE);

		elementoEClass = createEClass(ELEMENTO);
		createEAttribute(elementoEClass, ELEMENTO__IDENTIFIER);
		createEReference(elementoEClass, ELEMENTO__PLANTA);

		elementoAforoEClass = createEClass(ELEMENTO_AFORO);
		createEAttribute(elementoAforoEClass, ELEMENTO_AFORO__NOMBRE);
		createEAttribute(elementoAforoEClass, ELEMENTO_AFORO__AFORO);

		tiendaEClass = createEClass(TIENDA);

		restauranteEClass = createEClass(RESTAURANTE);

		elementoCambioPlantaEClass = createEClass(ELEMENTO_CAMBIO_PLANTA);
		createEReference(elementoCambioPlantaEClass, ELEMENTO_CAMBIO_PLANTA__DESTINO);

		escaleraEClass = createEClass(ESCALERA);

		ascensorEClass = createEClass(ASCENSOR);

		aseoEClass = createEClass(ASEO);
		createEAttribute(aseoEClass, ASEO__TIPO);

		espacioAbiertoEClass = createEClass(ESPACIO_ABIERTO);

		aparcamientoEClass = createEClass(APARCAMIENTO);
		createEReference(aparcamientoEClass, APARCAMIENTO__ZONAS);

		zonaAparcamientoEClass = createEClass(ZONA_APARCAMIENTO);
		createEAttribute(zonaAparcamientoEClass, ZONA_APARCAMIENTO__PLAZAS);
		createEAttribute(zonaAparcamientoEClass, ZONA_APARCAMIENTO__PRECIO);
		createEAttribute(zonaAparcamientoEClass, ZONA_APARCAMIENTO__USO_RESERVADO);

		puertaEClass = createEClass(PUERTA);
		createEReference(puertaEClass, PUERTA__PLANTA);

		salidaEClass = createEClass(SALIDA);
		createEReference(salidaEClass, SALIDA__PLANTA);

		// Create enums
		tipoAseoEEnum = createEEnum(TIPO_ASEO);
		direccionEEnum = createEEnum(DIRECCION);
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
		elementoEClass.getESuperTypes().add(this.getObjeto());
		elementoAforoEClass.getESuperTypes().add(this.getElemento());
		tiendaEClass.getESuperTypes().add(this.getElementoAforo());
		restauranteEClass.getESuperTypes().add(this.getElementoAforo());
		elementoCambioPlantaEClass.getESuperTypes().add(this.getElemento());
		escaleraEClass.getESuperTypes().add(this.getElementoCambioPlanta());
		ascensorEClass.getESuperTypes().add(this.getElementoCambioPlanta());
		aseoEClass.getESuperTypes().add(this.getElemento());
		espacioAbiertoEClass.getESuperTypes().add(this.getElemento());
		aparcamientoEClass.getESuperTypes().add(this.getElemento());
		puertaEClass.getESuperTypes().add(this.getObjeto());
		salidaEClass.getESuperTypes().add(this.getObjeto());

		// Initialize classes, features, and operations; add parameters
		initEClass(centroComercialEClass, CentroComercial.class, "CentroComercial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCentroComercial_Aforo(), ecorePackage.getEInt(), "aforo", null, 1, 1, CentroComercial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCentroComercial_Plantas(), this.getPlanta(), null, "plantas", null, 1, -1, CentroComercial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plantaEClass, Planta.class, "Planta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlanta_Numero(), ecorePackage.getEInt(), "numero", null, 1, 1, Planta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlanta_Elementos(), this.getElemento(), this.getElemento_Planta(), "elementos", null, 1, -1, Planta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlanta_Puertas(), this.getPuerta(), this.getPuerta_Planta(), "puertas", null, 0, -1, Planta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlanta_Salidas(), this.getSalida(), this.getSalida_Planta(), "salidas", null, 1, -1, Planta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objetoEClass, Objeto.class, "Objeto", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjeto_Norte(), this.getObjeto(), this.getObjeto_Sur(), "norte", null, 0, 1, Objeto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjeto_Sur(), this.getObjeto(), this.getObjeto_Norte(), "sur", null, 0, 1, Objeto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjeto_Este(), this.getObjeto(), this.getObjeto_Oeste(), "este", null, 0, 1, Objeto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjeto_Oeste(), this.getObjeto(), this.getObjeto_Este(), "oeste", null, 0, 1, Objeto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementoEClass, Elemento.class, "Elemento", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElemento_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, Elemento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElemento_Planta(), this.getPlanta(), this.getPlanta_Elementos(), "planta", null, 1, 1, Elemento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementoAforoEClass, ElementoAforo.class, "ElementoAforo", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementoAforo_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, ElementoAforo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementoAforo_Aforo(), ecorePackage.getEInt(), "aforo", null, 1, 1, ElementoAforo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tiendaEClass, Tienda.class, "Tienda", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(restauranteEClass, Restaurante.class, "Restaurante", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementoCambioPlantaEClass, ElementoCambioPlanta.class, "ElementoCambioPlanta", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementoCambioPlanta_Destino(), this.getElemento(), null, "destino", null, 1, -1, ElementoCambioPlanta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(escaleraEClass, Escalera.class, "Escalera", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ascensorEClass, Ascensor.class, "Ascensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aseoEClass, Aseo.class, "Aseo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAseo_Tipo(), this.getTipoAseo(), "tipo", null, 1, 1, Aseo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(espacioAbiertoEClass, EspacioAbierto.class, "EspacioAbierto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aparcamientoEClass, Aparcamiento.class, "Aparcamiento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAparcamiento_Zonas(), this.getZonaAparcamiento(), null, "zonas", null, 1, -1, Aparcamiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zonaAparcamientoEClass, ZonaAparcamiento.class, "ZonaAparcamiento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZonaAparcamiento_Plazas(), ecorePackage.getEInt(), "plazas", null, 1, 1, ZonaAparcamiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZonaAparcamiento_Precio(), ecorePackage.getEFloat(), "precio", null, 1, 1, ZonaAparcamiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZonaAparcamiento_UsoReservado(), ecorePackage.getEBoolean(), "usoReservado", null, 1, 1, ZonaAparcamiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(puertaEClass, Puerta.class, "Puerta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPuerta_Planta(), this.getPlanta(), this.getPlanta_Puertas(), "planta", null, 1, 1, Puerta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(salidaEClass, Salida.class, "Salida", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSalida_Planta(), this.getPlanta(), this.getPlanta_Salidas(), "planta", null, 1, 1, Salida.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tipoAseoEEnum, TipoAseo.class, "TipoAseo");
		addEEnumLiteral(tipoAseoEEnum, TipoAseo.MASCULINO);
		addEEnumLiteral(tipoAseoEEnum, TipoAseo.MIXTO);
		addEEnumLiteral(tipoAseoEEnum, TipoAseo.FEMENINO);

		initEEnum(direccionEEnum, Direccion.class, "Direccion");
		addEEnumLiteral(direccionEEnum, Direccion.NORTE);
		addEEnumLiteral(direccionEEnum, Direccion.SUR);
		addEEnumLiteral(direccionEEnum, Direccion.ESTE);
		addEEnumLiteral(direccionEEnum, Direccion.OESTE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
		addAnnotation
		  (centroComercialEClass,
		   source,
		   new String[] {
			   "constraints", "IAforoCentro IAseosIguales IPlantasNumeros IHayTienda IAparcamientosPlanta IHayPuerta IEscalerasPorPlanta"
		   });
		addAnnotation
		  (plantaEClass,
		   source,
		   new String[] {
			   "constraints", "IHayEspacioAbierto IAparcamientosOTiendas"
		   });
		addAnnotation
		  (elementoCambioPlantaEClass,
		   source,
		   new String[] {
			   "constraints", "escaleras"
		   });
		addAnnotation
		  (ascensorEClass,
		   source,
		   new String[] {
			   "constraints", "Iascensores"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (centroComercialEClass,
		   source,
		   new String[] {
			   "IAforoCentro", "aforo <= plantas->collect(elementos->select(e| e.oclIsKindOf(ElementoAforo))->collect(e | e.oclAsType(ElementoAforo).aforo)->sum())->sum()",
			   "IAseosIguales", "plantas->collect(elementos->select(e| e.oclIsKindOf(Aseo))->select(e| e.oclAsType(Aseo).tipo = TipoAseo::masculino)->size())->sum()\n\t\t= plantas->collect(elementos->select(e| e.oclIsKindOf(Aseo))->select(e| e.oclAsType(Aseo).tipo = TipoAseo::femenino)->size())->sum()",
			   "IPlantasNumeros", "plantas->isUnique(numero) and plantas->forAll((numero >= 0) and numero < plantas->size())",
			   "IHayTienda", "plantas->exists(elementos->select(e| e.oclIsKindOf(Tienda))->notEmpty())",
			   "IAparcamientosPlanta", "plantas->select(elementos->exists(e| e.oclIsKindOf(Aparcamiento)))->forAll(numero = 0) or plantas->select(elementos->exists(e| e.oclIsKindOf(Aparcamiento)))->forAll(numero = plantas->size() - 1)",
			   "IHayPuerta", "plantas->exists(v| v.puertas->notEmpty())",
			   "IEscalerasPorPlanta", "(plantas->size() = 1) or (plantas->forAll(p | p.elementos->exists(oclIsKindOf(ElementoCambioPlanta))))"
		   });
		addAnnotation
		  (plantaEClass,
		   source,
		   new String[] {
			   "IHayEspacioAbierto", "elementos->exists(oclIsKindOf(EspacioAbierto))",
			   "IAparcamientosOTiendas", "not(elementos->exists(oclIsKindOf(ElementoAforo)) and elementos->exists(oclIsKindOf(Aparcamiento)))"
		   });
		addAnnotation
		  (elementoCambioPlantaEClass,
		   source,
		   new String[] {
			   "escaleras", "destino->forAll(d | (self.planta.numero = d.planta.numero + 1) or (self.planta.numero = d.planta.numero - 1))"
		   });
		addAnnotation
		  (ascensorEClass,
		   source,
		   new String[] {
			   "Iascensores", "destino->forAll(oclIsKindOf(Ascensor))"
		   });
	}

} //CentroscomercialesPackageImpl
