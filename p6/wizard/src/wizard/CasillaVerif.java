/**
 */
package wizard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Casilla Verif</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizard.CasillaVerif#isPorDef <em>Por Def</em>}</li>
 *   <li>{@link wizard.CasillaVerif#getPagina <em>Pagina</em>}</li>
 *   <li>{@link wizard.CasillaVerif#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see wizard.WizardPackage#getCasillaVerif()
 * @model
 * @generated
 */
public interface CasillaVerif extends Campo {
	/**
	 * Returns the value of the '<em><b>Por Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Por Def</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Por Def</em>' attribute.
	 * @see #setPorDef(boolean)
	 * @see wizard.WizardPackage#getCasillaVerif_PorDef()
	 * @model required="true"
	 * @generated
	 */
	boolean isPorDef();

	/**
	 * Sets the value of the '{@link wizard.CasillaVerif#isPorDef <em>Por Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Por Def</em>' attribute.
	 * @see #isPorDef()
	 * @generated
	 */
	void setPorDef(boolean value);

	/**
	 * Returns the value of the '<em><b>Pagina</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link wizard.Pagina#getCasillasVerif <em>Casillas Verif</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pagina</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagina</em>' container reference.
	 * @see #setPagina(Pagina)
	 * @see wizard.WizardPackage#getCasillaVerif_Pagina()
	 * @see wizard.Pagina#getCasillasVerif
	 * @model opposite="casillasVerif" required="true" transient="false"
	 * @generated
	 */
	Pagina getPagina();

	/**
	 * Sets the value of the '{@link wizard.CasillaVerif#getPagina <em>Pagina</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pagina</em>' container reference.
	 * @see #getPagina()
	 * @generated
	 */
	void setPagina(Pagina value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see wizard.WizardPackage#getCasillaVerif_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link wizard.CasillaVerif#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CasillaVerif
