/**
 */
package centroscomerciales.impl;

import centroscomerciales.Ascensor;
import centroscomerciales.CentroscomercialesPackage;
import centroscomerciales.Elemento;
import centroscomerciales.Escalera;
import centroscomerciales.EspacioAbierto;
import centroscomerciales.Objeto;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Escalera</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EscaleraImpl extends ElementoCambioPlantaImpl implements Escalera {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EscaleraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CentroscomercialesPackage.Literals.ESCALERA;
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
		for(Elemento e: getDestino()) {
			accesibles.add(e);
		}
		return accesibles;
	}
	
	private boolean checkAccesible(Objeto o) {
		return o != null && (o instanceof Escalera ||
				o instanceof EspacioAbierto);
	}

} //EscaleraImpl
