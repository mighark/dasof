package lineasvacias;

import java.io.File;

import dasof.procesadoficheros.interfaces.IProcesar;

public class EliminarLineasVacias implements IProcesar {

	public EliminarLineasVacias() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void procesar(File file) {
		System.out.println("Procesado " + file.getName());
	}

}
