package dasof.fuentedeconsejos;

import java.util.ArrayList;
import java.util.List;

import dasof.tipoftheday.interfaces.ITipSource;

public class EclipseTips implements ITipSource {
	private static int max = 25;

	@Override
	public List<String> getTips() {
		List<String> consejos = new ArrayList<>();
		for(int i = 0; i < max; i++) {
			consejos.add("Consejo adicional " + i);
		}
		return consejos;
	}

}
