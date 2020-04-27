import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import centroscomerciales.CentroComercial;
import centroscomerciales.Elemento;
import centroscomerciales.Objeto;
import centroscomerciales.Planta;
import centroscomerciales.Puerta;

public class Executioner extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Obtener el fichero seleccionado
		IFile file= null;
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if(selection instanceof IStructuredSelection) {
			Object first = ((IStructuredSelection) selection).getFirstElement();
			file = (IFile) Platform.getAdapterManager().getAdapter(first, IFile.class);
			if(file == null)
				if(first instanceof IAdaptable)
					file= (IFile)((IAdaptable) first).getAdapter(IFile.class);
		}
		
		try{
			// Cargar el fichero seleccionado en un objeto Resource
			ResourceSet rs = new ResourceSetImpl();
			Resource resource = rs.createResource(URI.createURI(file.getRawLocationURI().toString()));
			resource.load(null);
			
			// Obtener el objeto raíz del modelo. Sustituye CentroComercialpor la clase raíz detu meta-modelo.
			CentroComercial modelo = (CentroComercial)(resource.getContents().get(0));
			String resultado = buscarRuta(modelo, "p4");
			// Incluir el código que se pide implementar en el apartado 3
			MessageDialog.openInformation(HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell(),
					resultado,
					resultado);
		} catch(Exception e) {
				
		}
		return Status.OK;
	}
	
	private String buscarRuta(CentroComercial centro, String destino) {
		EList<Planta> plantas = centro.getPlantas();
		Elemento objetivo = null;
		List<Puerta> puertas = new ArrayList<>();
		
		//buscar elemento con id destino y puertas
		for(Planta planta: plantas) {
			if(objetivo == null) {
				EList<Elemento> elementos = planta.getElementos();
				for(Elemento e: elementos) {
					if(e.getIdentifier().equals(destino)) {
						objetivo = e;
						break;
					}
				}
			}
			
			EList<Puerta> puertasPlanta = planta.getPuertas();
			puertas.addAll(puertasPlanta);
		}
		
		if(objetivo == null) {
			return "No se ha encontrado el elemento destino";
		}
		
		List<Elemento> iniciales = new ArrayList<>();
		//encontramos los elementos adyancentes a puertas
		for(Puerta puerta: puertas) {
			hallarIniciales(iniciales, puerta);
		}
		
		//hallar la ruta a partir de los elementos iniciales
		List<Elemento> ruta = obtenerRuta(objetivo, iniciales);
		if(ruta == null) {
			return "No se ha podido encontrar una ruta";
		}
		
		//escribir ruta en string
		String resultado = "Ruta encontrada: ";
		for(Elemento e: ruta) {
			resultado = resultado.concat(e.getIdentifier() + " -> ");
		}
		//cortamos la ultima " -> "
		return resultado.substring(0, resultado.length() - 4);
	}
	
	private void hallarIniciales(List<Elemento> encontrados, Objeto o) {
		List<Elemento> os = o.accesibles();
		for(Elemento e: os) {
			if(!encontrados.contains(e)) {
				encontrados.add((Elemento) e);
			}
		}
	}
	
	//clase auxiliar para almacenar elementos y la ruta hasta ellos
	private class ElementoRuta {
		public Elemento elemento;
		public List<Elemento> ruta;
		
		public ElementoRuta(Elemento e, List<Elemento> ruta) {
			this.elemento = e;
			this.ruta = ruta;
		}
	}
	
	private List<Elemento> obtenerRuta(Elemento objetivo, List<Elemento> encontrados) {
		List<ElementoRuta> eltos = new ArrayList<>();
		for(Elemento e: encontrados) {
			eltos.add(new ElementoRuta(e, new ArrayList<>()));
		}
		return busquedaRuta(objetivo, encontrados, eltos);
	}
	
	//hace busqueda en anchura para encontrar la ruta
	private List<Elemento> busquedaRuta(Elemento objetivo, List<Elemento> encontrados, List<ElementoRuta> porAnalizar) {
		if(porAnalizar.size() == 0) {
			//no se ha encontrado ruta
			return null;
		}
		ElementoRuta e = porAnalizar.remove(0);
		if(e.elemento == objetivo) {
			//se ha llegado al elemento, obtener ruta y devolver
			e.ruta.add(e.elemento);
			return e.ruta;
		}
		//halla nodos a explorar que parten del nodo actual
		encontrarElementos(e, encontrados, porAnalizar);
		//continua con el siguiente elemento a explorar
		return busquedaRuta(objetivo, encontrados, porAnalizar);
	}
	
	private void encontrarElementos(ElementoRuta o, List<Elemento> encontrados, List<ElementoRuta> porAnalizar) {
		List<Elemento> os = o.elemento.accesibles();
		for(Objeto e: os) {
			//si el nodo no se ha encontrado, habra que explorarlo
			if(!encontrados.contains(e)) {
				encontrados.add((Elemento) e);
				List<Elemento> ruta = new ArrayList<>(o.ruta);
				ruta.add(o.elemento);
				porAnalizar.add(new ElementoRuta((Elemento) e, ruta));
			}
		}
	}
	
	
}
