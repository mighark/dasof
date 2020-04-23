/**
 */
package centroscomerciales;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Centro Comercial</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link centroscomerciales.CentroComercial#getAforo <em>Aforo</em>}</li>
 *   <li>{@link centroscomerciales.CentroComercial#getPlantas <em>Plantas</em>}</li>
 * </ul>
 *
 * @see centroscomerciales.CentroscomercialesPackage#getCentroComercial()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IAforoCentro IAseosIguales IPlantasNumeros IHayTienda IAparcamientosPlanta IHayPuerta IEscalerasPorPlanta'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot IAforoCentro='aforo &lt;= plantas-&gt;collect(elementos-&gt;select(e| e.oclIsKindOf(ElementoAforo))-&gt;collect(e | e.oclAsType(ElementoAforo).aforo)-&gt;sum())-&gt;sum()' IAseosIguales='plantas-&gt;collect(elementos-&gt;select(e| e.oclIsKindOf(Aseo))-&gt;select(e| e.oclAsType(Aseo).tipo = TipoAseo::masculino)-&gt;size())-&gt;sum()\n\t\t= plantas-&gt;collect(elementos-&gt;select(e| e.oclIsKindOf(Aseo))-&gt;select(e| e.oclAsType(Aseo).tipo = TipoAseo::femenino)-&gt;size())-&gt;sum()' IPlantasNumeros='plantas-&gt;isUnique(numero) and plantas-&gt;forAll((numero &gt;= 0) and numero &lt; plantas-&gt;size())' IHayTienda='plantas-&gt;exists(elementos-&gt;select(e| e.oclIsKindOf(Tienda))-&gt;notEmpty())' IAparcamientosPlanta='plantas-&gt;select(elementos-&gt;exists(e| e.oclIsKindOf(Aparcamiento)))-&gt;forAll(numero = 0) or plantas-&gt;select(elementos-&gt;exists(e| e.oclIsKindOf(Aparcamiento)))-&gt;forAll(numero = plantas-&gt;size() - 1)' IHayPuerta='plantas-&gt;exists(v| v.puertas-&gt;notEmpty())' IEscalerasPorPlanta='(plantas-&gt;size() = 1) or (plantas-&gt;forAll(p | p.elementos-&gt;exists(oclIsKindOf(ElementoCambioPlanta))))'"
 * @generated
 */
public interface CentroComercial extends EObject {
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
	 * @see centroscomerciales.CentroscomercialesPackage#getCentroComercial_Aforo()
	 * @model required="true"
	 * @generated
	 */
	int getAforo();

	/**
	 * Sets the value of the '{@link centroscomerciales.CentroComercial#getAforo <em>Aforo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aforo</em>' attribute.
	 * @see #getAforo()
	 * @generated
	 */
	void setAforo(int value);

	/**
	 * Returns the value of the '<em><b>Plantas</b></em>' containment reference list.
	 * The list contents are of type {@link centroscomerciales.Planta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plantas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plantas</em>' containment reference list.
	 * @see centroscomerciales.CentroscomercialesPackage#getCentroComercial_Plantas()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Planta> getPlantas();

} // CentroComercial
