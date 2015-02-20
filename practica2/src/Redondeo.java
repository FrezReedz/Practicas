	

import java.util.Scanner;


public class Redondeo {

	public static void main(String[] args) {
		
		System.out.println("Teclea dato a redondear y número decimales: ");
		String textoEntrada = new Scanner(System.in).nextLine();
		
		Scanner datos = new Scanner(textoEntrada);
		
		double dato = datos.nextDouble();
		int decimales = datos.nextInt();
		
		double potencia = 1;
		
		for (int i = decimales; i > 0; i--) {
			potencia *= 10;    //potencia = potencia * 10;
		}
		
		System.out.println(Math.rint(dato * potencia) / potencia);

	}

}
