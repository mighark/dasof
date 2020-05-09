/**
 */
package wizard.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import wizard.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see wizard.WizardPackage
 * @generated
 */
public class WizardAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WizardPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WizardPackage.eINSTANCE;
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
	protected WizardSwitch<Adapter> modelSwitch =
		new WizardSwitch<Adapter>() {
			@Override
			public Adapter caseWizard(Wizard object) {
				return createWizardAdapter();
			}
			@Override
			public Adapter casePagina(Pagina object) {
				return createPaginaAdapter();
			}
			@Override
			public Adapter caseCampo(Campo object) {
				return createCampoAdapter();
			}
			@Override
			public Adapter caseCampoTexto(CampoTexto object) {
				return createCampoTextoAdapter();
			}
			@Override
			public Adapter caseCasillaVerif(CasillaVerif object) {
				return createCasillaVerifAdapter();
			}
			@Override
			public Adapter caseBoton(Boton object) {
				return createBotonAdapter();
			}
			@Override
			public Adapter caseBotonNavegar(BotonNavegar object) {
				return createBotonNavegarAdapter();
			}
			@Override
			public Adapter caseBotonMensaje(BotonMensaje object) {
				return createBotonMensajeAdapter();
			}
			@Override
			public Adapter caseBotonCerrar(BotonCerrar object) {
				return createBotonCerrarAdapter();
			}
			@Override
			public Adapter caseDestino(Destino object) {
				return createDestinoAdapter();
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
	 * Creates a new adapter for an object of class '{@link wizard.Wizard <em>Wizard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wizard.Wizard
	 * @generated
	 */
	public Adapter createWizardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wizard.Pagina <em>Pagina</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wizard.Pagina
	 * @generated
	 */
	public Adapter createPaginaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wizard.Campo <em>Campo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wizard.Campo
	 * @generated
	 */
	public Adapter createCampoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wizard.CampoTexto <em>Campo Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wizard.CampoTexto
	 * @generated
	 */
	public Adapter createCampoTextoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wizard.CasillaVerif <em>Casilla Verif</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wizard.CasillaVerif
	 * @generated
	 */
	public Adapter createCasillaVerifAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wizard.Boton <em>Boton</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wizard.Boton
	 * @generated
	 */
	public Adapter createBotonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wizard.BotonNavegar <em>Boton Navegar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wizard.BotonNavegar
	 * @generated
	 */
	public Adapter createBotonNavegarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wizard.BotonMensaje <em>Boton Mensaje</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wizard.BotonMensaje
	 * @generated
	 */
	public Adapter createBotonMensajeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wizard.BotonCerrar <em>Boton Cerrar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wizard.BotonCerrar
	 * @generated
	 */
	public Adapter createBotonCerrarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wizard.Destino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wizard.Destino
	 * @generated
	 */
	public Adapter createDestinoAdapter() {
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

} //WizardAdapterFactory
