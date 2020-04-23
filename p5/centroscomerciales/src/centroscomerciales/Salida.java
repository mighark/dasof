/**
 */
package centroscomerciales;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Salida</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link centroscomerciales.Salida#getPlanta <em>Planta</em>}</li>
 * </ul>
 *
 * @see centroscomerciales.CentroscomercialesPackage#getSalida()
 * @model
 * @generated
 */
public interface Salida extends Objeto {

	/**
	 * Returns the value of the '<em><b>Planta</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link centroscomerciales.Planta#getSalidas <em>Salidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planta</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planta</em>' container reference.
	 * @see #setPlanta(Planta)
	 * @see centroscomerciales.CentroscomercialesPackage#getSalida_Planta()
	 * @see centroscomerciales.Planta#getSalidas
	 * @model opposite="salidas" required="true" transient="false"
	 * @generated
	 */
	Planta getPlanta();

	/**
	 * Sets the value of the '{@link centroscomerciales.Salida#getPlanta <em>Planta</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planta</em>' container reference.
	 * @see #getPlanta()
	 * @generated
	 */
	void setPlanta(Planta value);
} // Salida
