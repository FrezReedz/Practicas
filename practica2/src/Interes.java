

import java.util.Scanner;

public class Interes
{
	public static void main(String argumentos[])
	{
		// La siguiente línea establece un canal de entrada por teclado.
		// Necesita importar el paquete java.util
		// Existe una alternativa de entrada más compleja con BufferedReader

		Scanner teclado = new Scanner(System.in);

		double cf;				
		double ci;
		double r;
		double n;

		// Pide datos
		System.out.println("Escribe capital inicial...\n");
		ci = teclado.nextDouble();

		System.out.println("Escribe interés anual...\n");
		r = teclado.nextDouble();

		System.out.println("Escribe número años ...\n");
		n = teclado.nextDouble();

		cf = ci * Math.pow((1 + r), n);

		System.out.println("Capital final... " + cf);

	}

}