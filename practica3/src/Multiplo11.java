

import java.util.Scanner;

public class Multiplo11 	{
	public static void main(String argumentos[]) {

		//llamada al método
		muestraMultiplos1();

	}

	//Declaración del método
	/**
	 * Muestra los múltiplos de 2 por debajo de un tope fijo.
	 */
	static void muestraMultiplos1() {

		//Implementación del cuerpo del método

		// Declaración de variables
		final int TOPE = 16; 				// Constante, el máximo valor del múltiplo
		int mult;							// Almacena el múltiplo calculado
		int cont;							// Contador utilizado en el cálculo

		// Inicializa las variables
		mult = 0;
		cont = 0;

		System.out.println("\t Múltiplos de 2\n");
		while (mult < TOPE)					// Bucle de cálculo y visualización 
		{
			mult = cont * 2;
			System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
			++cont;
		}
	}

} //class


