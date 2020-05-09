/**
 */
package wizard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizard.Boton#getPagina <em>Pagina</em>}</li>
 * </ul>
 *
 * @see wizard.WizardPackage#getBoton()
 * @model abstract="true"
 * @generated
 */
public interface Boton extends Campo {

	/**
	 * Returns the value of the '<em><b>Pagina</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link wizard.Pagina#getBotones <em>Botones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pagina</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagina</em>' container reference.
	 * @see #setPagina(Pagina)
	 * @see wizard.WizardPackage#getBoton_Pagina()
	 * @see wizard.Pagina#getBotones
	 * @model opposite="botones" required="true" transient="false"
	 * @generated
	 */
	Pagina getPagina();

	/**
	 * Sets the value of the '{@link wizard.Boton#getPagina <em>Pagina</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pagina</em>' container reference.
	 * @see #getPagina()
	 * @generated
	 */
	void setPagina(Pagina value);
} // Boton
