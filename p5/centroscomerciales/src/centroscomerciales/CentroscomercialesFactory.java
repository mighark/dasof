/**
 */
package centroscomerciales;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see centroscomerciales.CentroscomercialesPackage
 * @generated
 */
public interface CentroscomercialesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CentroscomercialesFactory eINSTANCE = centroscomerciales.impl.CentroscomercialesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Centro Comercial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Centro Comercial</em>'.
	 * @generated
	 */
	CentroComercial createCentroComercial();

	/**
	 * Returns a new object of class '<em>Planta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Planta</em>'.
	 * @generated
	 */
	Planta createPlanta();

	/**
	 * Returns a new object of class '<em>Tienda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tienda</em>'.
	 * @generated
	 */
	Tienda createTienda();

	/**
	 * Returns a new object of class '<em>Restaurante</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restaurante</em>'.
	 * @generated
	 */
	Restaurante createRestaurante();

	/**
	 * Returns a new object of class '<em>Escalera</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Escalera</em>'.
	 * @generated
	 */
	Escalera createEscalera();

	/**
	 * Returns a new object of class '<em>Ascensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ascensor</em>'.
	 * @generated
	 */
	Ascensor createAscensor();

	/**
	 * Returns a new object of class '<em>Aseo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aseo</em>'.
	 * @generated
	 */
	Aseo createAseo();

	/**
	 * Returns a new object of class '<em>Espacio Abierto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Espacio Abierto</em>'.
	 * @generated
	 */
	EspacioAbierto createEspacioAbierto();

	/**
	 * Returns a new object of class '<em>Aparcamiento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aparcamiento</em>'.
	 * @generated
	 */
	Aparcamiento createAparcamiento();

	/**
	 * Returns a new object of class '<em>Zona Aparcamiento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zona Aparcamiento</em>'.
	 * @generated
	 */
	ZonaAparcamiento createZonaAparcamiento();

	/**
	 * Returns a new object of class '<em>Puerta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Puerta</em>'.
	 * @generated
	 */
	Puerta createPuerta();

	/**
	 * Returns a new object of class '<em>Salida</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Salida</em>'.
	 * @generated
	 */
	Salida createSalida();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CentroscomercialesPackage getCentroscomercialesPackage();

} //CentroscomercialesFactory
