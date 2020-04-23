/**
 */
package centroscomerciales.util;

import centroscomerciales.*;

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
 * @see centroscomerciales.CentroscomercialesPackage
 * @generated
 */
public class CentroscomercialesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CentroscomercialesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CentroscomercialesSwitch() {
		if (modelPackage == null) {
			modelPackage = CentroscomercialesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
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
			case CentroscomercialesPackage.CENTRO_COMERCIAL: {
				CentroComercial centroComercial = (CentroComercial)theEObject;
				T result = caseCentroComercial(centroComercial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CentroscomercialesPackage.PLANTA: {
				Planta planta = (Planta)theEObject;
				T result = casePlanta(planta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CentroscomercialesPackage.OBJETO: {
				Objeto objeto = (Objeto)theEObject;
				T result = caseObjeto(objeto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CentroscomercialesPackage.ELEMENTO: {
				Elemento elemento = (Elemento)theEObject;
				T result = caseElemento(elemento);
				if (result == null) result = caseObjeto(elemento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CentroscomercialesPackage.ELEMENTO_AFORO: {
				ElementoAforo elementoAforo = (ElementoAforo)theEObject;
				T result = caseElementoAforo(elementoAforo);
				if (result == null) result = caseElemento(elementoAforo);
				if (result == null) result = caseObjeto(elementoAforo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CentroscomercialesPackage.TIENDA: {
				Tienda tienda = (Tienda)theEObject;
				T result = caseTienda(tienda);
				if (result == null) result = caseElementoAforo(tienda);
				if (result == null) result = caseElemento(tienda);
				if (result == null) result = caseObjeto(tienda);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CentroscomercialesPackage.RESTAURANTE: {
				Restaurante restaurante = (Restaurante)theEObject;
				T result = caseRestaurante(restaurante);
				if (result == null) result = caseElementoAforo(restaurante);
				if (result == null) result = caseElemento(restaurante);
				if (result == null) result = caseObjeto(restaurante);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CentroscomercialesPackage.ELEMENTO_CAMBIO_PLANTA: {
				ElementoCambioPlanta elementoCambioPlanta = (ElementoCambioPlanta)theEObject;
				T result = caseElementoCambioPlanta(elementoCambioPlanta);
				if (result == null) result = caseElemento(elementoCambioPlanta);
				if (result == null) result = caseObjeto(elementoCambioPlanta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CentroscomercialesPackage.ESCALERA: {
				Escalera escalera = (Escalera)theEObject;
				T result = caseEscalera(escalera);
				if (result == null) result = caseElementoCambioPlanta(escalera);
				if (result == null) result = caseElemento(escalera);
				if (result == null) result = caseObjeto(escalera);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CentroscomercialesPackage.ASCENSOR: {
				Ascensor ascensor = (Ascensor)theEObject;
				T result = caseAscensor(ascensor);
				if (result == null) result = caseElementoCambioPlanta(ascensor);
				if (result == null) result = caseElemento(ascensor);
				if (result == null) result = caseObjeto(ascensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CentroscomercialesPackage.ASEO: {
				Aseo aseo = (Aseo)theEObject;
				T result = caseAseo(aseo);
				if (result == null) result = caseElemento(aseo);
				if (result == null) result = caseObjeto(aseo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CentroscomercialesPackage.ESPACIO_ABIERTO: {
				EspacioAbierto espacioAbierto = (EspacioAbierto)theEObject;
				T result = caseEspacioAbierto(espacioAbierto);
				if (result == null) result = caseElemento(espacioAbierto);
				if (result == null) result = caseObjeto(espacioAbierto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CentroscomercialesPackage.APARCAMIENTO: {
				Aparcamiento aparcamiento = (Aparcamiento)theEObject;
				T result = caseAparcamiento(aparcamiento);
				if (result == null) result = caseElemento(aparcamiento);
				if (result == null) result = caseObjeto(aparcamiento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CentroscomercialesPackage.ZONA_APARCAMIENTO: {
				ZonaAparcamiento zonaAparcamiento = (ZonaAparcamiento)theEObject;
				T result = caseZonaAparcamiento(zonaAparcamiento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CentroscomercialesPackage.PUERTA: {
				Puerta puerta = (Puerta)theEObject;
				T result = casePuerta(puerta);
				if (result == null) result = caseObjeto(puerta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CentroscomercialesPackage.SALIDA: {
				Salida salida = (Salida)theEObject;
				T result = caseSalida(salida);
				if (result == null) result = caseObjeto(salida);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Centro Comercial</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Centro Comercial</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCentroComercial(CentroComercial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanta(Planta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objeto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objeto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjeto(Objeto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elemento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elemento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElemento(Elemento object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elemento Aforo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elemento Aforo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementoAforo(ElementoAforo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tienda</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tienda</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTienda(Tienda object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restaurante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restaurante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestaurante(Restaurante object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elemento Cambio Planta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elemento Cambio Planta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementoCambioPlanta(ElementoCambioPlanta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Escalera</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Escalera</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEscalera(Escalera object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ascensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ascensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAscensor(Ascensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aseo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aseo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAseo(Aseo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Espacio Abierto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Espacio Abierto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEspacioAbierto(EspacioAbierto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aparcamiento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aparcamiento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAparcamiento(Aparcamiento object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zona Aparcamiento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zona Aparcamiento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZonaAparcamiento(ZonaAparcamiento object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Puerta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Puerta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePuerta(Puerta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Salida</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Salida</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSalida(Salida object) {
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

} //CentroscomercialesSwitch
