

import java.util.Scanner;

public class Multiplo5 	{
	public static void main(String argumentos[]) {

		int tope = 16; 				// el máximo valor del múltiplo

		//llamadas al método
		muestraMultiplos3(tope);			// t = tope;
	}

	
	/**
	 * Método que muestra los multiplos de 2 
	 * hasta un valor tope recibido como parámetro.
	 * @param t, el tope
	 */
	static void muestraMultiplos3(int t) {

		// Declaración de variables
		int mult  ;							// Almacena el múltiplo calculado
		int cont  ;							// Contador utilizado en el cálculo

		// Inicializa las variables
		mult = 0 ;
		cont = 0 ;

		if (t > 0) {

			System.out.println("\t Múltiplos de 2\n");
			while (mult < t)					// Bucle de cálculo y visualización
			{

				//mult = cont * 2;
				mult = multiplo(2, cont);       //devuelve el multiplo que corresponda
				System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
				++cont;
			}
		}

	}

	
	/**
	 * Calcular el múltiplo n dada una base.
	 * @param base
	 * @param n
	 * @return mult, el múltiplo 
	 */
	static int multiplo(int base, int n) {
		
		int mult = base * n;	
		return mult;
	}



}