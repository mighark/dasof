package dasof.tipoftheday.handlers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.osgi.framework.Bundle;

import dasof.tipoftheday.interfaces.ITipSource;

import org.eclipse.jface.dialogs.MessageDialog;

public class TipOfTheDayHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		String consejo = getTip();
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(
				window.getShell(),
				"Tipoftheday",
				consejo);
		return null;
	}
	
	private String getTip() {
		List<String> consejos = new ArrayList<String>();
		Bundle bundle = Platform.getBundle("dasof.tipoftheday");
		URL fileURL = bundle.getEntry("data/consejos.txt");
		
		try{
			InputStream is = fileURL.openStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(is));
			String consejo;
			while((consejo = in.readLine()) != null) consejos.add(consejo);
			in.close();
			is.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		IExtensionRegistry registro = Platform.getExtensionRegistry();
		IConfigurationElement[] extensiones = 
				registro.getConfigurationElementsFor("dasof.tipoftheday.tipsource");
		
		for(IConfigurationElement e : extensiones) {
			if(e.getName().equals("TipSource")) {
				try{
					ITipSource fuenteConsejos = (ITipSource) e.createExecutableExtension("class");
					//String nombreFuente = (String) e.getAttribute("name");
					for(String consejo : fuenteConsejos.getTips()) consejos.add(consejo);
				}
				catch(CoreException exception) {
					exception.printStackTrace();
				}
			}
		}
		
		Random rand = new Random();
		return consejos.get(rand.nextInt(consejos.size()));
	}
}
