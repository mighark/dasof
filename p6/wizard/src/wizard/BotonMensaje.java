/**
 */
package wizard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boton Mensaje</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizard.BotonMensaje#getMensaje <em>Mensaje</em>}</li>
 * </ul>
 *
 * @see wizard.WizardPackage#getBotonMensaje()
 * @model
 * @generated
 */
public interface BotonMensaje extends Boton {
	/**
	 * Returns the value of the '<em><b>Mensaje</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mensaje</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mensaje</em>' attribute.
	 * @see #setMensaje(String)
	 * @see wizard.WizardPackage#getBotonMensaje_Mensaje()
	 * @model required="true"
	 * @generated
	 */
	String getMensaje();

	/**
	 * Sets the value of the '{@link wizard.BotonMensaje#getMensaje <em>Mensaje</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mensaje</em>' attribute.
	 * @see #getMensaje()
	 * @generated
	 */
	void setMensaje(String value);

} // BotonMensaje
