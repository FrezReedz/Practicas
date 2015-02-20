
import java.util.*;

/**
 * OrdenaTres.java
 * Programa que pide tres datos de tipo entero por teclado, 
 * los guarda y los muestra ordenados por pantalla sin estructura repetitiva.
 * Adicionalmente, si se introducen ya ordenados muestra el
 * mensaje "Los datos ya estaban ordenados"
 * autor: ag
 * Fecha: 2013/10/16 
 */

public class OrdenaTres {	
	public static void main(String argumentos[]) {	
		
		// La siguiente línea establece un canal de entrada por teclado.
		// Necesita importar el paquete java.util
		Scanner teclado = new Scanner(System.in);

		// Declaración de variables
		int dato1, dato2, dato3;		//para la entrada
		int temp;						//para el intercambio
		int yaOrdenados = 1;
		
		// Pide los datos por teclado
		System.out.print("Escribe el primer número: ");
		dato1 = teclado.nextInt();

		System.out.print("Escribe el segundo número: ");
		dato2 = teclado.nextInt();

		System.out.print("Escribe el tercer número: ");
		dato3 = teclado.nextInt();

		if (dato3 < dato2) {
			temp = dato3;
			dato3 = dato2;
			dato2 = temp;
			yaOrdenados = 0;
		}

		if (dato2 < dato1) {
			temp = dato2;
			dato2 = dato1;
			dato1 = temp;
			yaOrdenados = 0;
		}

		if (dato3 < dato2) {
			temp = dato3;
			dato3 = dato2;
			dato2 = temp;
			yaOrdenados = 0;
		}
		
		// Muestra las variables por pantalla
		
	
		if (yaOrdenados == 1) {
			System.out.println("Los datos ya estaban ordenados");
		}
		
		System.out.println(dato1);
		System.out.println(dato2);
		System.out.println(dato3);
		
		
	}
}
