package dasof.procesadoficheros.handlers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;

import dasof.procesadoficheros.interfaces.IProcesar;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;

public class ProcesarHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IExtensionRegistry registro = Platform.getExtensionRegistry();
		IConfigurationElement[] extensiones = 
				registro.getConfigurationElementsFor("dasof.procesarficheros.procesarsource");
		
		List<IConfigurationElement> extensionesViables = new ArrayList<>();
		for(IConfigurationElement e : extensiones) {
			if(e.getName().equals("procesador")) {
				extensionesViables.add(e);
			}
		}
		
		IConfigurationElement[] result = mostrarDialogo(extensionesViables);
		if(result != null) {
			for(IConfigurationElement e: result) {
				procesar(e);
			}
		}
		
		
		return null;
	}
	
	public IConfigurationElement[] mostrarDialogo(List<IConfigurationElement> extensiones) {
		Shell shell = new Shell();
		ElementListSelectionDialog dialog =
			    new ElementListSelectionDialog(shell, new LabelProvider());
		dialog.setElements(extensiones.toArray());
		dialog.setTitle("Escoge procesador de ficheros:");
		// user pressed cancel
		if (dialog.open() != Window.OK) {
			return null;
		}
		
		Object[] result = dialog.getResult();
		IConfigurationElement[] trueResult = new IConfigurationElement[result.length];
		for(int i = 0; i < result.length; i++) {
			trueResult[i] = (IConfigurationElement) result[i];
		}
		return trueResult;
	}
	
	public void procesar(IConfigurationElement e) {
		try{
			IProcesar procesador = (IProcesar) e.createExecutableExtension("class");
			boolean direct = e.getAttribute("directlocation").equals("true");
			String extension = (String) e.getAttribute("extensions");
			String[] extensions = extension.split(" ");
			
			File root = ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile();
			List<File> ficheros = obtenerFicheros(root, direct, extensions);
			
			for(File file: ficheros) {
				procesador.procesar(file);
			}
			
		}
		catch(CoreException exception) {
			exception.printStackTrace();
		}
	}
	
	public List<File> obtenerFicheros(File directory, boolean direct, String[] extensions) {
		List<File> ficheros = new ArrayList<>();
		for(File file: directory.listFiles()) {
			if(!direct && file.isDirectory()) {
				List<File> ficherosAux = obtenerFicheros(file, direct, extensions);
				ficheros.addAll(ficherosAux);
			} else {
				for(String extension: extensions) {
					if(file.getName().endsWith("." + extension)) {
						ficheros.add(file);
						break;
					}
				}
			}
		}
		return ficheros;
	}
}
