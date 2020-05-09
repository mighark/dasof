/**
 */
package wizard.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import wizard.Boton;
import wizard.BotonCerrar;
import wizard.BotonMensaje;
import wizard.BotonNavegar;
import wizard.Campo;
import wizard.CampoTexto;
import wizard.CasillaVerif;
import wizard.Destino;
import wizard.Pagina;
import wizard.Wizard;
import wizard.WizardFactory;
import wizard.WizardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WizardPackageImpl extends EPackageImpl implements WizardPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wizardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paginaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass campoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass campoTextoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass casillaVerifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass botonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass botonNavegarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass botonMensajeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass botonCerrarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destinoEClass = null;

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
	 * @see wizard.WizardPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WizardPackageImpl() {
		super(eNS_URI, WizardFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WizardPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WizardPackage init() {
		if (isInited) return (WizardPackage)EPackage.Registry.INSTANCE.getEPackage(WizardPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWizardPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WizardPackageImpl theWizardPackage = registeredWizardPackage instanceof WizardPackageImpl ? (WizardPackageImpl)registeredWizardPackage : new WizardPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theWizardPackage.createPackageContents();

		// Initialize created meta-data
		theWizardPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWizardPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WizardPackage.eNS_URI, theWizardPackage);
		return theWizardPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWizard() {
		return wizardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWizard_Titulo() {
		return (EAttribute)wizardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWizard_Paginas() {
		return (EReference)wizardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWizard_PagIni() {
		return (EReference)wizardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPagina() {
		return paginaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPagina_CamposTexto() {
		return (EReference)paginaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPagina_CasillasVerif() {
		return (EReference)paginaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPagina_Botones() {
		return (EReference)paginaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPagina_Name() {
		return (EAttribute)paginaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCampo() {
		return campoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampo_Tag() {
		return (EAttribute)campoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCampoTexto() {
		return campoTextoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampoTexto_Opcional() {
		return (EAttribute)campoTextoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCampoTexto_Pagina() {
		return (EReference)campoTextoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCasillaVerif() {
		return casillaVerifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCasillaVerif_PorDef() {
		return (EAttribute)casillaVerifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCasillaVerif_Pagina() {
		return (EReference)casillaVerifEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCasillaVerif_Name() {
		return (EAttribute)casillaVerifEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoton() {
		return botonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoton_Pagina() {
		return (EReference)botonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBotonNavegar() {
		return botonNavegarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBotonNavegar_Destino() {
		return (EReference)botonNavegarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBotonMensaje() {
		return botonMensajeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBotonMensaje_Mensaje() {
		return (EAttribute)botonMensajeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBotonCerrar() {
		return botonCerrarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestino() {
		return destinoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDestino_Casilla() {
		return (EReference)destinoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDestino_Destino() {
		return (EReference)destinoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDestino_Boton() {
		return (EReference)destinoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardFactory getWizardFactory() {
		return (WizardFactory)getEFactoryInstance();
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
		wizardEClass = createEClass(WIZARD);
		createEAttribute(wizardEClass, WIZARD__TITULO);
		createEReference(wizardEClass, WIZARD__PAGINAS);
		createEReference(wizardEClass, WIZARD__PAG_INI);

		paginaEClass = createEClass(PAGINA);
		createEReference(paginaEClass, PAGINA__CAMPOS_TEXTO);
		createEReference(paginaEClass, PAGINA__CASILLAS_VERIF);
		createEReference(paginaEClass, PAGINA__BOTONES);
		createEAttribute(paginaEClass, PAGINA__NAME);

		campoEClass = createEClass(CAMPO);
		createEAttribute(campoEClass, CAMPO__TAG);

		campoTextoEClass = createEClass(CAMPO_TEXTO);
		createEAttribute(campoTextoEClass, CAMPO_TEXTO__OPCIONAL);
		createEReference(campoTextoEClass, CAMPO_TEXTO__PAGINA);

		casillaVerifEClass = createEClass(CASILLA_VERIF);
		createEAttribute(casillaVerifEClass, CASILLA_VERIF__POR_DEF);
		createEReference(casillaVerifEClass, CASILLA_VERIF__PAGINA);
		createEAttribute(casillaVerifEClass, CASILLA_VERIF__NAME);

		botonEClass = createEClass(BOTON);
		createEReference(botonEClass, BOTON__PAGINA);

		botonNavegarEClass = createEClass(BOTON_NAVEGAR);
		createEReference(botonNavegarEClass, BOTON_NAVEGAR__DESTINO);

		botonMensajeEClass = createEClass(BOTON_MENSAJE);
		createEAttribute(botonMensajeEClass, BOTON_MENSAJE__MENSAJE);

		botonCerrarEClass = createEClass(BOTON_CERRAR);

		destinoEClass = createEClass(DESTINO);
		createEReference(destinoEClass, DESTINO__CASILLA);
		createEReference(destinoEClass, DESTINO__DESTINO);
		createEReference(destinoEClass, DESTINO__BOTON);
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
		campoTextoEClass.getESuperTypes().add(this.getCampo());
		casillaVerifEClass.getESuperTypes().add(this.getCampo());
		botonEClass.getESuperTypes().add(this.getCampo());
		botonNavegarEClass.getESuperTypes().add(this.getBoton());
		botonMensajeEClass.getESuperTypes().add(this.getBoton());
		botonCerrarEClass.getESuperTypes().add(this.getBoton());

		// Initialize classes, features, and operations; add parameters
		initEClass(wizardEClass, Wizard.class, "Wizard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWizard_Titulo(), ecorePackage.getEString(), "titulo", null, 1, 1, Wizard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWizard_Paginas(), this.getPagina(), null, "paginas", null, 1, -1, Wizard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWizard_PagIni(), this.getPagina(), null, "pagIni", null, 1, 1, Wizard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paginaEClass, Pagina.class, "Pagina", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPagina_CamposTexto(), this.getCampoTexto(), this.getCampoTexto_Pagina(), "camposTexto", null, 0, -1, Pagina.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPagina_CasillasVerif(), this.getCasillaVerif(), this.getCasillaVerif_Pagina(), "casillasVerif", null, 0, -1, Pagina.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPagina_Botones(), this.getBoton(), this.getBoton_Pagina(), "botones", null, 1, -1, Pagina.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPagina_Name(), ecorePackage.getEString(), "name", null, 1, 1, Pagina.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(campoEClass, Campo.class, "Campo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCampo_Tag(), ecorePackage.getEString(), "tag", null, 1, 1, Campo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(campoTextoEClass, CampoTexto.class, "CampoTexto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCampoTexto_Opcional(), ecorePackage.getEBoolean(), "opcional", null, 1, 1, CampoTexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCampoTexto_Pagina(), this.getPagina(), this.getPagina_CamposTexto(), "pagina", null, 1, 1, CampoTexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(casillaVerifEClass, CasillaVerif.class, "CasillaVerif", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCasillaVerif_PorDef(), ecorePackage.getEBoolean(), "porDef", null, 1, 1, CasillaVerif.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCasillaVerif_Pagina(), this.getPagina(), this.getPagina_CasillasVerif(), "pagina", null, 1, 1, CasillaVerif.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCasillaVerif_Name(), ecorePackage.getEString(), "name", null, 1, 1, CasillaVerif.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(botonEClass, Boton.class, "Boton", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoton_Pagina(), this.getPagina(), this.getPagina_Botones(), "pagina", null, 1, 1, Boton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(botonNavegarEClass, BotonNavegar.class, "BotonNavegar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBotonNavegar_Destino(), this.getDestino(), this.getDestino_Boton(), "destino", null, 1, -1, BotonNavegar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(botonMensajeEClass, BotonMensaje.class, "BotonMensaje", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBotonMensaje_Mensaje(), ecorePackage.getEString(), "mensaje", null, 1, 1, BotonMensaje.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(botonCerrarEClass, BotonCerrar.class, "BotonCerrar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(destinoEClass, Destino.class, "Destino", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDestino_Casilla(), this.getCasillaVerif(), null, "casilla", null, 0, 1, Destino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDestino_Destino(), this.getPagina(), null, "destino", null, 1, 1, Destino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDestino_Boton(), this.getBotonNavegar(), this.getBotonNavegar_Destino(), "boton", null, 1, 1, Destino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //WizardPackageImpl
