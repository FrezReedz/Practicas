

import java.util.Scanner;

public class AcumulaOcho {

	public static void main(String[] args) {

		// Declaración de variables
		Scanner teclado = new Scanner(System.in);
		String textoEntrada;
		int acumulador = 0;

		// Pide los datos por teclado
		System.out.print("Escribe 8 números separados por espacio: ");
		textoEntrada = teclado.nextLine();
		for (int i = 1; i <= 8; i++) {
			acumulador += new Scanner(textoEntrada).nextInt();
		}

		System.out.println("El valor acumulado es: " + acumulador);

	}

}
