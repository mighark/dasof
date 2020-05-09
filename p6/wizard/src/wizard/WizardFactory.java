/**
 */
package wizard;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see wizard.WizardPackage
 * @generated
 */
public interface WizardFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WizardFactory eINSTANCE = wizard.impl.WizardFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Wizard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wizard</em>'.
	 * @generated
	 */
	Wizard createWizard();

	/**
	 * Returns a new object of class '<em>Pagina</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pagina</em>'.
	 * @generated
	 */
	Pagina createPagina();

	/**
	 * Returns a new object of class '<em>Campo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Campo</em>'.
	 * @generated
	 */
	Campo createCampo();

	/**
	 * Returns a new object of class '<em>Campo Texto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Campo Texto</em>'.
	 * @generated
	 */
	CampoTexto createCampoTexto();

	/**
	 * Returns a new object of class '<em>Casilla Verif</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Casilla Verif</em>'.
	 * @generated
	 */
	CasillaVerif createCasillaVerif();

	/**
	 * Returns a new object of class '<em>Boton Navegar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boton Navegar</em>'.
	 * @generated
	 */
	BotonNavegar createBotonNavegar();

	/**
	 * Returns a new object of class '<em>Boton Mensaje</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boton Mensaje</em>'.
	 * @generated
	 */
	BotonMensaje createBotonMensaje();

	/**
	 * Returns a new object of class '<em>Boton Cerrar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boton Cerrar</em>'.
	 * @generated
	 */
	BotonCerrar createBotonCerrar();

	/**
	 * Returns a new object of class '<em>Destino</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Destino</em>'.
	 * @generated
	 */
	Destino createDestino();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WizardPackage getWizardPackage();

} //WizardFactory
