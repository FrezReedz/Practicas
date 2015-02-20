

import java.util.Scanner;

public class MayorDeDos
{
	static int num1 ;				// variable numérica
	static int num2 ;				// variable numérica

	
	public static void main(String arg[])
	{
	
		leerDatos();	
		obtenerMostrarMayor();

	}



	static void leerDatos() {

		//conecta un escaner con el teclado para la entrada
		Scanner teclado = new Scanner(System.in);

		
		//Un modo sencillo de leer un número
		System.out.println("Escribe un número: ");
		num1 = teclado.nextInt();						//lee y procesa un dato numérico
		num2 = teclado.nextInt();						//procesa como número el contenido del texto de entrada

		teclado.close();								//opcional, se cierra automáticamente por JVM

	}

	
	
	static void obtenerMostrarMayor() {
		//evalúa las tres posibilidades para dos números de la manera más simple
		if (num1 > num2)
			System.out.println("El mayor es: " + num1);

		if (num1 < num2)
			System.out.println("El mayor es: " + num2);

		if (num1 == num2)
			System.out.println("Los dos números son iguales");

		
	}
}