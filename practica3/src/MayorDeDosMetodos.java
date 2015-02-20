

/**
 * MayorDeDosMetodos.java
 * Programa que lee dos números y escribe el mayor de los dos.
 * Utiliza tres métodos.
 * ajp - 2014.10.27
 */

import java.util.Scanner;

public class MayorDeDosMetodos {
	
	static int num1;				// variable numérica
	static int num2;				// variable numérica
	
	/**
	 * Método principal del programa
	 * @param arg
	 */
	public static void main(String arg[]) {
		
		pideDatos();
		obtenerMostrarMayor();
			
	} //main

	
	/**
	 * Método para la entrada de dos datos numéricos dedes teclado.
	 * Utiliza dos variables globales. 
	 */
	static void pideDatos() {
		
		//conecta un escaner con el teclado para la entrada de datos
		Scanner teclado = new Scanner(System.in);

		//Un modo sencillo de leer números
		System.out.println("Escribe un número: ");
		num1 = teclado.nextInt();					//lee y procesa un dato numérico

		System.out.println("Escribe otro número: ");
		num2 = teclado.nextInt();				
		
		teclado.close();								
	}
	
	
	/**
	 * Método para:
	 * Obtener el mayor de dos números almacenados como variables globales.
	 * Mostrar el mayor de los dos números.
	 */
	static void obtenerMostrarMayor() {
		
		//evalúa las tres posibilidades para dos números de la manera más simple
		if (num1 > num2)
			System.out.println("El mayor es: " + num1);

		if (num1 < num2)
			System.out.println("El mayor es: " + num2);

		if (num1 == num2)
			System.out.println("Los dos números son iguales");	
	}

	
} //class


