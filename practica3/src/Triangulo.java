
/**
 * Triangulo.java
 * Programa que muestra en pantalla un triangulo variable de asteriscos
 * ajp - 2014.10.23
 */	
public class Triangulo 	{

	public static void main(String argumentos[]) {
		final int NUM_LINEAS = 5; 			// Constante
		piramide(NUM_LINEAS);
	}

	static void piramide(int filas) {

		// Declaración de variables 
		String linea = "";
				
		// Filas
		for (int i = 0, j = 1; i < filas; i++, j+=2) {			// Bucle visualización
			
			linea = blancos(filas - i) + asteriscos(j);	
			System.out.println(linea);
		}
	
	}

	static String blancos(int num) {
		String aux = "";
		for (int i = 0; i < num; i++) {
			aux += " ";
		}
		return aux;
	}

	static String asteriscos(int num) {
		String aux = "";
		for (int i = 0; i < num; i++) {
			aux += "*";
		}
		return aux;
	}


} //class









