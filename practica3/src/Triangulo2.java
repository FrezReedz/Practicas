
/**
 * Triangulo2.java
 * Programa que muestra en pantalla un triangulo variable de asteriscos
 * ajp - 2014.10.23
 */	
public class Triangulo2 	{

	public static void main(String argumentos[]) {
		final int NUM_LINEAS = 5; 			// Constante
		System.out.println(generaPiramide(NUM_LINEAS));
		
	}

	static String generaPiramide(int filas) {

		// Declaración de variables 
		String piramide = "";
				
		// Filas
		for (int i = 0, j = 1; i < filas; i++, j+=2) {			// Bucle visualización
			
			piramide += blancos(filas - i) + asteriscos(j) + "\n";	
			
		}
	return piramide;
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









