

import java.util.Scanner;

public class Multiplo3 	{
	public static void main(String argumentos[]) {

		//Implementación del cuerpo del método

		// Declaración de variables
		int tope = pideTope(); 				
		int mult;							// Almacena el múltiplo calculado
		int cont;							// Contador utilizado en el cálculo

		// Inicializa las variables
		mult = 0;
		cont = 0;

		System.out.println("\t Múltiplos de 2\n");
		while (mult < tope)					// Bucle de cálculo y visualización 
		{
			mult = cont * 2;
			System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
			++cont;
		}
	}

	/**
	 * Pide el valor del tope
	 * @return el tope
	 */
	static int pideTope() {
		
		System.out.println("Dame el tope...");
		int entrada = new Scanner(System.in).nextInt();
	
		return entrada;
	}

} //class


