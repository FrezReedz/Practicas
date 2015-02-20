
/*

 * MayorMenorAJP.java

 * Programa que lee una serie de números enteros positivos
 * por teclado y una vez terminada la entrada se mostrarán
 * por pantalla el mayor y el menor de todos ellos 
 * ajp - 2013.10.31
 */
import java.util.Scanner;

public class MayorMenorAJP
{

	public static void main(String args[]) {

		int valorEntrada;
		int mayor = 0;
		int menor = Integer.MAX_VALUE;
		int numValoresValidos = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Teclea números entre 1 y " + Integer.MAX_VALUE);
		System.out.println("-Cero para terminar-");

		do {
			valorEntrada = teclado.nextInt();
			if (valorEntrada >= 0) {
				if (valorEntrada > mayor) {
					mayor = valorEntrada;
				}
				if (valorEntrada < menor && valorEntrada > 0) {
					menor = valorEntrada;
				}
				if (valorEntrada == 0) {
					if (numValoresValidos >= 2) {
					System.out.print("Teclea T para terminar ");
						if (!(new Scanner(System.in).nextLine().toUpperCase().equals("T"))){ 
							valorEntrada = 1;
						}
					}
					else {
						System.out.print("Hacen falta dos números por lo menos");
						valorEntrada = 1;
					}
				}
				else {
					numValoresValidos++;
				}
			}

			else {

				System.out.println("ERROR: Teclea números entre 1 y " + Integer.MAX_VALUE);
				System.out.println("-Cero para terminar-");
				valorEntrada = 1;

			}

		} while (valorEntrada > 0);
		
		System.out.println("Mayor: " + mayor);
		System.out.println("Menor: " + menor);
		teclado.close();
	}

	
	
	
	
	
	
	
	
} //class