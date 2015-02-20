

import java.util.Scanner;

public class Multiplo2 	{
	public static void main(String argumentos[]) {

		int tope = 30;
		
		//Llamada al método
		muestraMultiplos2(tope);		// t = tope;
					
	}

	
	/**
	 * Muestra los múltiplos de 2 por debajo de un tope
	 * recibido como parámetro.
	 * @param t el tope
	 */
	static void muestraMultiplos2(int t) {
	
		// Declaración de variables
		int mult;							// Almacena el múltiplo calculado
		int cont;							// Contador utilizado en el cálculo

		// Inicializa las variables
		mult = 0;
		cont = 0;

		System.out.println("\t Múltiplos de 2\n");
		while (mult < t)					// Bucle de cálculo y visualización 
		{
			mult = cont * 2;
			System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
			++cont;
		}
		
	}
}