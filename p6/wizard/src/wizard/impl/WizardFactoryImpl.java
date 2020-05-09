/**
 */
package wizard.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import wizard.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WizardFactoryImpl extends EFactoryImpl implements WizardFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WizardFactory init() {
		try {
			WizardFactory theWizardFactory = (WizardFactory)EPackage.Registry.INSTANCE.getEFactory(WizardPackage.eNS_URI);
			if (theWizardFactory != null) {
				return theWizardFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WizardFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardFactoryImpl() {
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
			case WizardPackage.WIZARD: return createWizard();
			case WizardPackage.PAGINA: return createPagina();
			case WizardPackage.CAMPO: return createCampo();
			case WizardPackage.CAMPO_TEXTO: return createCampoTexto();
			case WizardPackage.CASILLA_VERIF: return createCasillaVerif();
			case WizardPackage.BOTON_NAVEGAR: return createBotonNavegar();
			case WizardPackage.BOTON_MENSAJE: return createBotonMensaje();
			case WizardPackage.BOTON_CERRAR: return createBotonCerrar();
			case WizardPackage.DESTINO: return createDestino();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wizard createWizard() {
		WizardImpl wizard = new WizardImpl();
		return wizard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pagina createPagina() {
		PaginaImpl pagina = new PaginaImpl();
		return pagina;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Campo createCampo() {
		CampoImpl campo = new CampoImpl();
		return campo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CampoTexto createCampoTexto() {
		CampoTextoImpl campoTexto = new CampoTextoImpl();
		return campoTexto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasillaVerif createCasillaVerif() {
		CasillaVerifImpl casillaVerif = new CasillaVerifImpl();
		return casillaVerif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BotonNavegar createBotonNavegar() {
		BotonNavegarImpl botonNavegar = new BotonNavegarImpl();
		return botonNavegar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BotonMensaje createBotonMensaje() {
		BotonMensajeImpl botonMensaje = new BotonMensajeImpl();
		return botonMensaje;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BotonCerrar createBotonCerrar() {
		BotonCerrarImpl botonCerrar = new BotonCerrarImpl();
		return botonCerrar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Destino createDestino() {
		DestinoImpl destino = new DestinoImpl();
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardPackage getWizardPackage() {
		return (WizardPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WizardPackage getPackage() {
		return WizardPackage.eINSTANCE;
	}

} //WizardFactoryImpl
