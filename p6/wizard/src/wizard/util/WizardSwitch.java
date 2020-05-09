/**
 */
package wizard.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import wizard.*;

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
 * @see wizard.WizardPackage
 * @generated
 */
public class WizardSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WizardPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardSwitch() {
		if (modelPackage == null) {
			modelPackage = WizardPackage.eINSTANCE;
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
			case WizardPackage.WIZARD: {
				Wizard wizard = (Wizard)theEObject;
				T result = caseWizard(wizard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WizardPackage.PAGINA: {
				Pagina pagina = (Pagina)theEObject;
				T result = casePagina(pagina);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WizardPackage.CAMPO: {
				Campo campo = (Campo)theEObject;
				T result = caseCampo(campo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WizardPackage.CAMPO_TEXTO: {
				CampoTexto campoTexto = (CampoTexto)theEObject;
				T result = caseCampoTexto(campoTexto);
				if (result == null) result = caseCampo(campoTexto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WizardPackage.CASILLA_VERIF: {
				CasillaVerif casillaVerif = (CasillaVerif)theEObject;
				T result = caseCasillaVerif(casillaVerif);
				if (result == null) result = caseCampo(casillaVerif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WizardPackage.BOTON: {
				Boton boton = (Boton)theEObject;
				T result = caseBoton(boton);
				if (result == null) result = caseCampo(boton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WizardPackage.BOTON_NAVEGAR: {
				BotonNavegar botonNavegar = (BotonNavegar)theEObject;
				T result = caseBotonNavegar(botonNavegar);
				if (result == null) result = caseBoton(botonNavegar);
				if (result == null) result = caseCampo(botonNavegar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WizardPackage.BOTON_MENSAJE: {
				BotonMensaje botonMensaje = (BotonMensaje)theEObject;
				T result = caseBotonMensaje(botonMensaje);
				if (result == null) result = caseBoton(botonMensaje);
				if (result == null) result = caseCampo(botonMensaje);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WizardPackage.BOTON_CERRAR: {
				BotonCerrar botonCerrar = (BotonCerrar)theEObject;
				T result = caseBotonCerrar(botonCerrar);
				if (result == null) result = caseBoton(botonCerrar);
				if (result == null) result = caseCampo(botonCerrar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WizardPackage.DESTINO: {
				Destino destino = (Destino)theEObject;
				T result = caseDestino(destino);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wizard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wizard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWizard(Wizard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pagina</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pagina</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePagina(Pagina object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Campo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Campo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCampo(Campo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Campo Texto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Campo Texto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCampoTexto(CampoTexto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Casilla Verif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Casilla Verif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCasillaVerif(CasillaVerif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boton</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boton</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoton(Boton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boton Navegar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boton Navegar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBotonNavegar(BotonNavegar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boton Mensaje</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boton Mensaje</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBotonMensaje(BotonMensaje object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boton Cerrar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boton Cerrar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBotonCerrar(BotonCerrar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destino</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destino</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestino(Destino object) {
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

} //WizardSwitch
