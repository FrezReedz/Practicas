

/**
 * AcumulaN.java
 * Programa que pide N números enteros
 * por teclado y los acumula y muestra resultado
 * ajp - 2014.10.20
 */

import java.util.Scanner;

public class AcumulaN {

	public static void main(String[] args) {

		// Declaración de variables
		Scanner teclado = new Scanner(System.in);
		int acumulador = 0;
		int numDatos;
		int i; 
		
		// Pide los datos por teclado
		System.out.print("Escribe número de dato: ");
		numDatos = teclado.nextInt();
		
		System.out.print("Escribe " + numDatos + " números: ");
		
		
		for (i = 0; i < numDatos; i++) {
			acumulador += teclado.nextInt();
			
			if (i != (numDatos - 1)) 
				System.out.print("Otro: ");
	
		}

		System.out.println("El valor acumulado es: " + acumulador);
		System.out.println("La media: " +  (double) acumulador /  i);

		
		
	}

	
	
	
	
	
	
	
	
}
