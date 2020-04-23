/**
 */
package centroscomerciales;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aseo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link centroscomerciales.Aseo#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @see centroscomerciales.CentroscomercialesPackage#getAseo()
 * @model
 * @generated
 */
public interface Aseo extends Elemento {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link centroscomerciales.TipoAseo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see centroscomerciales.TipoAseo
	 * @see #setTipo(TipoAseo)
	 * @see centroscomerciales.CentroscomercialesPackage#getAseo_Tipo()
	 * @model required="true"
	 * @generated
	 */
	TipoAseo getTipo();

	/**
	 * Sets the value of the '{@link centroscomerciales.Aseo#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see centroscomerciales.TipoAseo
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoAseo value);

} // Aseo
