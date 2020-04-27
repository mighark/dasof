/**
 */
package centroscomerciales.impl;

import centroscomerciales.Ascensor;
import centroscomerciales.CentroscomercialesPackage;
import centroscomerciales.Elemento;
import centroscomerciales.EspacioAbierto;
import centroscomerciales.Objeto;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ascensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AscensorImpl extends ElementoCambioPlantaImpl implements Ascensor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AscensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CentroscomercialesPackage.Literals.ASCENSOR;
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
		return o != null && (o instanceof Ascensor ||
				o instanceof EspacioAbierto);
	}

} //AscensorImpl
