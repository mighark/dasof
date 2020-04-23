/**
 */
package centroscomerciales;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elemento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link centroscomerciales.Elemento#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link centroscomerciales.Elemento#getPlanta <em>Planta</em>}</li>
 * </ul>
 *
 * @see centroscomerciales.CentroscomercialesPackage#getElemento()
 * @model abstract="true"
 * @generated
 */
public interface Elemento extends Objeto {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see centroscomerciales.CentroscomercialesPackage#getElemento_Identifier()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link centroscomerciales.Elemento#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Planta</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link centroscomerciales.Planta#getElementos <em>Elementos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planta</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planta</em>' container reference.
	 * @see #setPlanta(Planta)
	 * @see centroscomerciales.CentroscomercialesPackage#getElemento_Planta()
	 * @see centroscomerciales.Planta#getElementos
	 * @model opposite="elementos" required="true" transient="false"
	 * @generated
	 */
	Planta getPlanta();

	/**
	 * Sets the value of the '{@link centroscomerciales.Elemento#getPlanta <em>Planta</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planta</em>' container reference.
	 * @see #getPlanta()
	 * @generated
	 */
	void setPlanta(Planta value);

} // Elemento
