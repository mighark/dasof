/**
 */
package centroscomerciales.util;

import centroscomerciales.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see centroscomerciales.CentroscomercialesPackage
 * @generated
 */
public class CentroscomercialesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CentroscomercialesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CentroscomercialesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CentroscomercialesPackage.eINSTANCE;
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
	protected CentroscomercialesSwitch<Adapter> modelSwitch =
		new CentroscomercialesSwitch<Adapter>() {
			@Override
			public Adapter caseCentroComercial(CentroComercial object) {
				return createCentroComercialAdapter();
			}
			@Override
			public Adapter casePlanta(Planta object) {
				return createPlantaAdapter();
			}
			@Override
			public Adapter caseObjeto(Objeto object) {
				return createObjetoAdapter();
			}
			@Override
			public Adapter caseElemento(Elemento object) {
				return createElementoAdapter();
			}
			@Override
			public Adapter caseElementoAforo(ElementoAforo object) {
				return createElementoAforoAdapter();
			}
			@Override
			public Adapter caseTienda(Tienda object) {
				return createTiendaAdapter();
			}
			@Override
			public Adapter caseRestaurante(Restaurante object) {
				return createRestauranteAdapter();
			}
			@Override
			public Adapter caseElementoCambioPlanta(ElementoCambioPlanta object) {
				return createElementoCambioPlantaAdapter();
			}
			@Override
			public Adapter caseEscalera(Escalera object) {
				return createEscaleraAdapter();
			}
			@Override
			public Adapter caseAscensor(Ascensor object) {
				return createAscensorAdapter();
			}
			@Override
			public Adapter caseAseo(Aseo object) {
				return createAseoAdapter();
			}
			@Override
			public Adapter caseEspacioAbierto(EspacioAbierto object) {
				return createEspacioAbiertoAdapter();
			}
			@Override
			public Adapter caseAparcamiento(Aparcamiento object) {
				return createAparcamientoAdapter();
			}
			@Override
			public Adapter caseZonaAparcamiento(ZonaAparcamiento object) {
				return createZonaAparcamientoAdapter();
			}
			@Override
			public Adapter casePuerta(Puerta object) {
				return createPuertaAdapter();
			}
			@Override
			public Adapter caseSalida(Salida object) {
				return createSalidaAdapter();
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
	 * Creates a new adapter for an object of class '{@link centroscomerciales.CentroComercial <em>Centro Comercial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see centroscomerciales.CentroComercial
	 * @generated
	 */
	public Adapter createCentroComercialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link centroscomerciales.Planta <em>Planta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see centroscomerciales.Planta
	 * @generated
	 */
	public Adapter createPlantaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link centroscomerciales.Objeto <em>Objeto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see centroscomerciales.Objeto
	 * @generated
	 */
	public Adapter createObjetoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link centroscomerciales.Elemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see centroscomerciales.Elemento
	 * @generated
	 */
	public Adapter createElementoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link centroscomerciales.ElementoAforo <em>Elemento Aforo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see centroscomerciales.ElementoAforo
	 * @generated
	 */
	public Adapter createElementoAforoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link centroscomerciales.Tienda <em>Tienda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see centroscomerciales.Tienda
	 * @generated
	 */
	public Adapter createTiendaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link centroscomerciales.Restaurante <em>Restaurante</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see centroscomerciales.Restaurante
	 * @generated
	 */
	public Adapter createRestauranteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link centroscomerciales.ElementoCambioPlanta <em>Elemento Cambio Planta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see centroscomerciales.ElementoCambioPlanta
	 * @generated
	 */
	public Adapter createElementoCambioPlantaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link centroscomerciales.Escalera <em>Escalera</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see centroscomerciales.Escalera
	 * @generated
	 */
	public Adapter createEscaleraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link centroscomerciales.Ascensor <em>Ascensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see centroscomerciales.Ascensor
	 * @generated
	 */
	public Adapter createAscensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link centroscomerciales.Aseo <em>Aseo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see centroscomerciales.Aseo
	 * @generated
	 */
	public Adapter createAseoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link centroscomerciales.EspacioAbierto <em>Espacio Abierto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see centroscomerciales.EspacioAbierto
	 * @generated
	 */
	public Adapter createEspacioAbiertoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link centroscomerciales.Aparcamiento <em>Aparcamiento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see centroscomerciales.Aparcamiento
	 * @generated
	 */
	public Adapter createAparcamientoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link centroscomerciales.ZonaAparcamiento <em>Zona Aparcamiento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see centroscomerciales.ZonaAparcamiento
	 * @generated
	 */
	public Adapter createZonaAparcamientoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link centroscomerciales.Puerta <em>Puerta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see centroscomerciales.Puerta
	 * @generated
	 */
	public Adapter createPuertaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link centroscomerciales.Salida <em>Salida</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see centroscomerciales.Salida
	 * @generated
	 */
	public Adapter createSalidaAdapter() {
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

} //CentroscomercialesAdapterFactory
