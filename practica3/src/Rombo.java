
/**
 * Rombo.java
 * Programa que muestra en pantalla un rombo de asteriscos
 * ajp - 2014.10.23
 */	

public class Rombo 	{

	public static void main(String argumentos[]) {
		final int NUM_LINEAS = 8; 			// Constante
		if (NUM_LINEAS >= 3)
			muestraRombo(NUM_LINEAS);
		else
			System.out.println("ERROR, el numero de lineas mínimo es 3");
	}

	static void muestraRombo(int filas) {

		// Declaración de variables 
		int longitud;
		int contFilas = filas / 2;
		int increm = 0;
		String linea = "";

		if (filas % 2 == 0)
			filas--; 

		longitud = filas;


		for (increm = 0, contFilas = filas / 2 - 1, linea = ""; contFilas >= 0; increm++, contFilas--, linea = "")					// Bucle visualización
		{
			linea = bloqueBlancos(longitud / 2 - increm);
			linea += bloqueAsteriscos(1 + 2 * increm);	
			System.out.println(linea);
		}

		for (increm = 0, contFilas = filas / 2, linea = ""; contFilas >= 0; increm++, contFilas--, linea = "")					// Bucle visualización
		{
			linea = bloqueBlancos(increm);
			linea += bloqueAsteriscos(longitud - 2 * increm);	
			System.out.println(linea);
		}

	}

	private static String bloqueBlancos(int num) {
		String aux = "";
		for (int i = 0; i < num; i++) {
			aux += " ";
		}
		return aux;
	}

	static String bloqueAsteriscos(int num) {
		String aux = "";
		for (int i = 0; i < num; i++) {
			aux += "*";
		}
		return aux;
	}


} //class









