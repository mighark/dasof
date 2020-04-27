/**
 */
package centroscomerciales.impl;

import centroscomerciales.CentroscomercialesPackage;
import centroscomerciales.Elemento;
import centroscomerciales.EspacioAbierto;
import centroscomerciales.Objeto;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Espacio Abierto</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EspacioAbiertoImpl extends ElementoImpl implements EspacioAbierto {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EspacioAbiertoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CentroscomercialesPackage.Literals.ESPACIO_ABIERTO;
	}
	
	@Override
	public List<Elemento> accesibles() {
		List<Elemento> accesibles = new ArrayList<>();
		if(checkAccesible(getNorte())) {
			accesibles.add((Elemento) getNorte()) ;
		}
		if(checkAccesible(getSur())) {
			accesibles.add((Elemento) getSur()) ;
		}
		if(checkAccesible(getEste())) {
			accesibles.add((Elemento) getEste()) ;
		}
		if(checkAccesible(getOeste())) {
			accesibles.add((Elemento) getOeste()) ;
		}
		return accesibles;
	}
	
	private boolean checkAccesible(Objeto o) {
		return o != null && o instanceof Elemento;
	}

} //EspacioAbiertoImpl
