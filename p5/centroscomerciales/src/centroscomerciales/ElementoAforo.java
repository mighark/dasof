/**
 */
package centroscomerciales;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elemento Aforo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link centroscomerciales.ElementoAforo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link centroscomerciales.ElementoAforo#getAforo <em>Aforo</em>}</li>
 * </ul>
 *
 * @see centroscomerciales.CentroscomercialesPackage#getElementoAforo()
 * @model abstract="true"
 * @generated
 */
public interface ElementoAforo extends Elemento {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see centroscomerciales.CentroscomercialesPackage#getElementoAforo_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link centroscomerciales.ElementoAforo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Aforo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aforo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aforo</em>' attribute.
	 * @see #setAforo(int)
	 * @see centroscomerciales.CentroscomercialesPackage#getElementoAforo_Aforo()
	 * @model required="true"
	 * @generated
	 */
	int getAforo();

	/**
	 * Sets the value of the '{@link centroscomerciales.ElementoAforo#getAforo <em>Aforo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aforo</em>' attribute.
	 * @see #getAforo()
	 * @generated
	 */
	void setAforo(int value);

} // ElementoAforo
