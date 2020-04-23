/**
 */
package centroscomerciales;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Puerta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link centroscomerciales.Puerta#getPlanta <em>Planta</em>}</li>
 * </ul>
 *
 * @see centroscomerciales.CentroscomercialesPackage#getPuerta()
 * @model
 * @generated
 */
public interface Puerta extends Objeto {

	/**
	 * Returns the value of the '<em><b>Planta</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link centroscomerciales.Planta#getPuertas <em>Puertas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planta</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planta</em>' container reference.
	 * @see #setPlanta(Planta)
	 * @see centroscomerciales.CentroscomercialesPackage#getPuerta_Planta()
	 * @see centroscomerciales.Planta#getPuertas
	 * @model opposite="puertas" required="true" transient="false"
	 * @generated
	 */
	Planta getPlanta();

	/**
	 * Sets the value of the '{@link centroscomerciales.Puerta#getPlanta <em>Planta</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planta</em>' container reference.
	 * @see #getPlanta()
	 * @generated
	 */
	void setPlanta(Planta value);
} // Puerta
