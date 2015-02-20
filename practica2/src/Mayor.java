

import java.util.Scanner;

public class Mayor {

	public static void main(String[] args) {

		// Declaración de variables
		Scanner teclado = new Scanner(System.in);
		int dato = 0;		//para la entrada
		String letra = "s";

		int elMayor = Integer.MIN_VALUE;	

		while (letra.equals("s") || letra.equals("S")) {
			System.out.print("Escribe un número: ");
			dato = teclado.nextInt();						//paso 1
			
			if (dato > elMayor) { 							//paso 2		
				elMayor = dato;
			}
			
			System.out.print("¿Quieres continuar...?");
			letra = new Scanner(System.in).nextLine();		//paso 3
		} 
		
		
		System.out.println("El Mayor es: " + elMayor);


	}

}
