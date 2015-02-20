
/**
 * Rombo.java
 * Programa que muestra en pantalla un rombo de asteriscos
 * ajp - 2014.10.23
 */	

public class Rombo2 	{

	public static void main(String argumentos[]) {
		final int NUM_LINEAS = 7; 			// Constante
		dibujaRombo(NUM_LINEAS);
	}

	static void dibujaRombo(int filas) {

		// Declaración de variables 
		int cont = filas / 2 ;							// 
		final int LONGITUD = 9;
		String linea = "";
		
		System.out.println("Muestra rombo...");
		while (cont >= 1)					// Bucle visualización
		{
			for (int i = LONGITUD - cont; i > 1; i--) {
				linea += "*";
			}
			cont--;
			System.out.println(linea);
		}
		
		
		cont = 1;
		linea = "";
		while (cont <= filas / 2)					// Bucle visualización
		{
			for (int i = LONGITUD - cont; i > 1; i--) {
				linea += "*";
			}
			cont++;
			System.out.println(linea);
		}
	}



} //class









