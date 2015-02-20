
/**
 * Cuadrado.java
 * Programa que muestra en pantalla un cuadrado variable de asteriscos
 * ajp - 2014.10.23
 */	
public class Cuadrado 	{

	public static void main(String argumentos[]) {

		final int NUM_LINEAS = 4; 			// Constante

		// Declaración de variables 

		int longitud = NUM_LINEAS;
		int contFilas = NUM_LINEAS;
		int increm = 0;
		String linea = "";

		//muestra primera línea de asteriscos	
		for (int i = 0; i < NUM_LINEAS; i++) {
			linea += "* ";
		}
		System.out.println(linea);


		// muestra filas con blancos 
		for (contFilas = 2; contFilas < NUM_LINEAS; contFilas++)	
		{
			//muestra línea asteriscos con huecos
			linea = "*";
			for (int i = 3; i < longitud * 2; i++) {
				linea += " ";
			}
			linea += "*";
			System.out.println(linea);
		}

		//muestra última línea de asteriscos	
		linea = "";
		for (int i = 0; i < NUM_LINEAS; i++) {
			linea += "* ";
		}
		System.out.println(linea);

	}

} //class









