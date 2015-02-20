


/**
 * MayorN.java
 * Programa que pide serie de números enteros
 * por teclado e indique cuál es el mayor
 * ajp - 2014.10.14
 */

import java.util.Scanner;

public class MayorN {
	public static void main(String argumentos[]) {

		
		// Declaración de variables
		Scanner teclado = new Scanner(System.in);
		int dato;				//para la entrada
		String tecla;
		int elMayor = Integer.MIN_VALUE;

		do {
			// Pide los datos por teclado
			System.out.print("Escribe un número: ");
			dato = teclado.nextInt();

			if (dato > elMayor) {
				elMayor = dato;
			}

			// Pregunta si se quiere seguir
			System.out.print("¿Quieres seguir...? ");
			tecla = new Scanner(System.in).nextLine();
		}
		while (tecla.equals("S") || tecla.equals("s"));

		System.out.println("El Mayor es: " + elMayor);
	}

} // class
