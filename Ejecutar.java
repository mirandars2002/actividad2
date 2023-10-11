package actividad2;

import java.io.IOException;

public class Ejecutar {

	public void Ruta(String ruta) throws IOException {

		ProcessBuilder pB = new ProcessBuilder(ruta);

		try {

			pB.start();

		} catch (IOException e) {

			e.printStackTrace();

		}
	}
	

	
	
	
	
}
