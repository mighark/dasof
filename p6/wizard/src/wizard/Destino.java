/**
 */
package wizard;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Destino</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizard.Destino#getCasilla <em>Casilla</em>}</li>
 *   <li>{@link wizard.Destino#getDestino <em>Destino</em>}</li>
 *   <li>{@link wizard.Destino#getBoton <em>Boton</em>}</li>
 * </ul>
 *
 * @see wizard.WizardPackage#getDestino()
 * @model
 * @generated
 */
public interface Destino extends EObject {
	/**
	 * Returns the value of the '<em><b>Casilla</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Casilla</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Casilla</em>' reference.
	 * @see #setCasilla(CasillaVerif)
	 * @see wizard.WizardPackage#getDestino_Casilla()
	 * @model
	 * @generated
	 */
	CasillaVerif getCasilla();

	/**
	 * Sets the value of the '{@link wizard.Destino#getCasilla <em>Casilla</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Casilla</em>' reference.
	 * @see #getCasilla()
	 * @generated
	 */
	void setCasilla(CasillaVerif value);

	/**
	 * Returns the value of the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destino</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' reference.
	 * @see #setDestino(Pagina)
	 * @see wizard.WizardPackage#getDestino_Destino()
	 * @model required="true"
	 * @generated
	 */
	Pagina getDestino();

	/**
	 * Sets the value of the '{@link wizard.Destino#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(Pagina value);

	/**
	 * Returns the value of the '<em><b>Boton</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link wizard.BotonNavegar#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boton</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boton</em>' container reference.
	 * @see #setBoton(BotonNavegar)
	 * @see wizard.WizardPackage#getDestino_Boton()
	 * @see wizard.BotonNavegar#getDestino
	 * @model opposite="destino" required="true" transient="false"
	 * @generated
	 */
	BotonNavegar getBoton();

	/**
	 * Sets the value of the '{@link wizard.Destino#getBoton <em>Boton</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boton</em>' container reference.
	 * @see #getBoton()
	 * @generated
	 */
	void setBoton(BotonNavegar value);

} // Destino
