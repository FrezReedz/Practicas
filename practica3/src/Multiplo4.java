
	

import java.util.Scanner;
public class Multiplo4 	{

	public static void main(String argumentos[]) {
		// Declaración de variables
		final int TOPE = 16; 
		Scanner teclado = new Scanner(System.in);

		//System.out.println(muestraMultiplos2(TOPE)); // limite = TOPE;
		System.out.println(muestraMultiplos2(-33)); // limite = 34;

		teclado.close();
	}

	public static String muestraMultiplos2(int limite) {

		// Declaración de variables

		int mult  ;							// Almacena el múltiplo calculado
		int cont  ;							// Contador utilizado en el cálculo
		String aux;

		// Inicializa las variables
		mult = 0 ;
		cont = 0 ;

		aux = "\t Múltiplos de 2\n";
		while (mult < limite)					// Bucle de cálculo y visualización
		{
			mult = cont * 2;
			aux += "\t" +    '#' + (cont+1) + '\t' + mult;
			++cont;
		}

		return aux;
	}

} //class