/**
 */
package wizard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Campo Texto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizard.CampoTexto#isOpcional <em>Opcional</em>}</li>
 *   <li>{@link wizard.CampoTexto#getPagina <em>Pagina</em>}</li>
 * </ul>
 *
 * @see wizard.WizardPackage#getCampoTexto()
 * @model
 * @generated
 */
public interface CampoTexto extends Campo {
	/**
	 * Returns the value of the '<em><b>Opcional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opcional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opcional</em>' attribute.
	 * @see #setOpcional(boolean)
	 * @see wizard.WizardPackage#getCampoTexto_Opcional()
	 * @model required="true"
	 * @generated
	 */
	boolean isOpcional();

	/**
	 * Sets the value of the '{@link wizard.CampoTexto#isOpcional <em>Opcional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opcional</em>' attribute.
	 * @see #isOpcional()
	 * @generated
	 */
	void setOpcional(boolean value);

	/**
	 * Returns the value of the '<em><b>Pagina</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link wizard.Pagina#getCamposTexto <em>Campos Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pagina</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagina</em>' container reference.
	 * @see #setPagina(Pagina)
	 * @see wizard.WizardPackage#getCampoTexto_Pagina()
	 * @see wizard.Pagina#getCamposTexto
	 * @model opposite="camposTexto" required="true" transient="false"
	 * @generated
	 */
	Pagina getPagina();

	/**
	 * Sets the value of the '{@link wizard.CampoTexto#getPagina <em>Pagina</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pagina</em>' container reference.
	 * @see #getPagina()
	 * @generated
	 */
	void setPagina(Pagina value);

} // CampoTexto
