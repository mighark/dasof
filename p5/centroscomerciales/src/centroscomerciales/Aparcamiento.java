/**
 */
package centroscomerciales;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aparcamiento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link centroscomerciales.Aparcamiento#getZonas <em>Zonas</em>}</li>
 * </ul>
 *
 * @see centroscomerciales.CentroscomercialesPackage#getAparcamiento()
 * @model
 * @generated
 */
public interface Aparcamiento extends Elemento {
	/**
	 * Returns the value of the '<em><b>Zonas</b></em>' containment reference list.
	 * The list contents are of type {@link centroscomerciales.ZonaAparcamiento}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zonas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zonas</em>' containment reference list.
	 * @see centroscomerciales.CentroscomercialesPackage#getAparcamiento_Zonas()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ZonaAparcamiento> getZonas();

} // Aparcamiento
