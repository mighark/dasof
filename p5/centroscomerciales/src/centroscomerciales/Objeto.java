/**
 */
package centroscomerciales;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objeto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link centroscomerciales.Objeto#getNorte <em>Norte</em>}</li>
 *   <li>{@link centroscomerciales.Objeto#getSur <em>Sur</em>}</li>
 *   <li>{@link centroscomerciales.Objeto#getEste <em>Este</em>}</li>
 *   <li>{@link centroscomerciales.Objeto#getOeste <em>Oeste</em>}</li>
 * </ul>
 *
 * @see centroscomerciales.CentroscomercialesPackage#getObjeto()
 * @model abstract="true"
 * @generated
 */
public interface Objeto extends EObject {

	/**
	 * Returns the value of the '<em><b>Norte</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link centroscomerciales.Objeto#getSur <em>Sur</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Norte</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Norte</em>' reference.
	 * @see #setNorte(Objeto)
	 * @see centroscomerciales.CentroscomercialesPackage#getObjeto_Norte()
	 * @see centroscomerciales.Objeto#getSur
	 * @model opposite="sur"
	 * @generated
	 */
	Objeto getNorte();

	/**
	 * Sets the value of the '{@link centroscomerciales.Objeto#getNorte <em>Norte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Norte</em>' reference.
	 * @see #getNorte()
	 * @generated
	 */
	void setNorte(Objeto value);

	/**
	 * Returns the value of the '<em><b>Sur</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link centroscomerciales.Objeto#getNorte <em>Norte</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sur</em>' reference.
	 * @see #setSur(Objeto)
	 * @see centroscomerciales.CentroscomercialesPackage#getObjeto_Sur()
	 * @see centroscomerciales.Objeto#getNorte
	 * @model opposite="norte"
	 * @generated
	 */
	Objeto getSur();

	/**
	 * Sets the value of the '{@link centroscomerciales.Objeto#getSur <em>Sur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sur</em>' reference.
	 * @see #getSur()
	 * @generated
	 */
	void setSur(Objeto value);

	/**
	 * Returns the value of the '<em><b>Este</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link centroscomerciales.Objeto#getOeste <em>Oeste</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Este</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Este</em>' reference.
	 * @see #setEste(Objeto)
	 * @see centroscomerciales.CentroscomercialesPackage#getObjeto_Este()
	 * @see centroscomerciales.Objeto#getOeste
	 * @model opposite="oeste"
	 * @generated
	 */
	Objeto getEste();

	/**
	 * Sets the value of the '{@link centroscomerciales.Objeto#getEste <em>Este</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Este</em>' reference.
	 * @see #getEste()
	 * @generated
	 */
	void setEste(Objeto value);

	/**
	 * Returns the value of the '<em><b>Oeste</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link centroscomerciales.Objeto#getEste <em>Este</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oeste</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oeste</em>' reference.
	 * @see #setOeste(Objeto)
	 * @see centroscomerciales.CentroscomercialesPackage#getObjeto_Oeste()
	 * @see centroscomerciales.Objeto#getEste
	 * @model opposite="este"
	 * @generated
	 */
	Objeto getOeste();

	/**
	 * Sets the value of the '{@link centroscomerciales.Objeto#getOeste <em>Oeste</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oeste</em>' reference.
	 * @see #getOeste()
	 * @generated
	 */
	void setOeste(Objeto value);

} // Objeto
