package actividad2;

import java.io.IOException;
import java.io.InputStream;

public class Actividad2 {

	public static void main(String[] args) throws IOException {

		Process p = new ProcessBuilder("CMD", "/C", "DIR").start();

		try {

			InputStream is = p.getInputStream();

			int c;
			while ((c = is.read()) != -1)
				System.out.println((char) c);
			is.close();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
