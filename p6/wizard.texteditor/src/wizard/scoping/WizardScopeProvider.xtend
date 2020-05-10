/*
 * generated by Xtext 2.15.0
 */
package wizard.scoping

import java.util.ArrayList
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.EcoreUtil2
import wizard.Destino
import wizard.WizardPackage
import wizard.Wizard


/**
 * This class contains custom scoping description.
 * 
 * See https:www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class WizardScopeProvider extends AbstractWizardScopeProvider {
	override getScope(EObject context, EReference reference) {
		if(context instanceof Destino) {
			var wizard = EcoreUtil2.getRootContainer(context) as Wizard
			var paginaBoton = (context as Destino).boton.pagina
			var result = new ArrayList()

			if(reference == WizardPackage.Literals.DESTINO__DESTINO) {
			//si estamos decidiendo la pagina
				for(page: wizard.paginas)
					if(page != paginaBoton)
						result.add(page)
			} else if(reference == WizardPackage.Literals.DESTINO__CASILLA) {
			//si estamos decidiendo la casilla de verificacion
				for(casilla: paginaBoton.casillasVerif)
					result.add(casilla)
			} else {
			//en otro caso (no deberia entrar pero por si)
				return super.getScope(context,reference);
			}
			return Scopes.scopeFor(result)
		} else {
			return super.getScope(context,reference);
		}
	}
}
