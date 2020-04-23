/**
 */
package centroscomerciales;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zona Aparcamiento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link centroscomerciales.ZonaAparcamiento#getPlazas <em>Plazas</em>}</li>
 *   <li>{@link centroscomerciales.ZonaAparcamiento#getPrecio <em>Precio</em>}</li>
 *   <li>{@link centroscomerciales.ZonaAparcamiento#isUsoReservado <em>Uso Reservado</em>}</li>
 * </ul>
 *
 * @see centroscomerciales.CentroscomercialesPackage#getZonaAparcamiento()
 * @model
 * @generated
 */
public interface ZonaAparcamiento extends EObject {
	/**
	 * Returns the value of the '<em><b>Plazas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plazas</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plazas</em>' attribute.
	 * @see #setPlazas(int)
	 * @see centroscomerciales.CentroscomercialesPackage#getZonaAparcamiento_Plazas()
	 * @model required="true"
	 * @generated
	 */
	int getPlazas();

	/**
	 * Sets the value of the '{@link centroscomerciales.ZonaAparcamiento#getPlazas <em>Plazas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plazas</em>' attribute.
	 * @see #getPlazas()
	 * @generated
	 */
	void setPlazas(int value);

	/**
	 * Returns the value of the '<em><b>Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precio</em>' attribute.
	 * @see #setPrecio(float)
	 * @see centroscomerciales.CentroscomercialesPackage#getZonaAparcamiento_Precio()
	 * @model required="true"
	 * @generated
	 */
	float getPrecio();

	/**
	 * Sets the value of the '{@link centroscomerciales.ZonaAparcamiento#getPrecio <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precio</em>' attribute.
	 * @see #getPrecio()
	 * @generated
	 */
	void setPrecio(float value);

	/**
	 * Returns the value of the '<em><b>Uso Reservado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uso Reservado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uso Reservado</em>' attribute.
	 * @see #setUsoReservado(boolean)
	 * @see centroscomerciales.CentroscomercialesPackage#getZonaAparcamiento_UsoReservado()
	 * @model required="true"
	 * @generated
	 */
	boolean isUsoReservado();

	/**
	 * Sets the value of the '{@link centroscomerciales.ZonaAparcamiento#isUsoReservado <em>Uso Reservado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uso Reservado</em>' attribute.
	 * @see #isUsoReservado()
	 * @generated
	 */
	void setUsoReservado(boolean value);

} // ZonaAparcamiento
