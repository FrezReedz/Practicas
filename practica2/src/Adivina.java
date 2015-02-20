
import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) throws InterruptedException {
		Scanner teclado = new Scanner(System.in);
		String respuesta;
		int contador = 0;

		System.out.println("Piensa un número entre 1 y 10... ");
		Thread.sleep(5000);
		while (true) {
			System.out.println("*** " 
					+ (int)(1 + Math.random() * 10) 
					+ " ***");

			System.out.println("¿Es el número...? S/N ");
			contador++;
			respuesta = teclado.nextLine();
			if (respuesta.equals("s") || respuesta.equals("S")) {
				break;
			}

		}
		switch (contador) {
		case 1:
			System.out.println("¡Vaya lince, he acertado a la primera! ");
			break;

		case 2:
			System.out.println("No está mal, he necesitado sólo " + contador + " intentos");
			break;
		
		case 3:
			System.out.println("Puede valer, he necesitado sólo " + contador + " intentos");
			break;
			
		default:
			if (contador <= 5)
				System.out.println("He necesitado " + contador + " intentos");
			else
				System.out.println("¡Qué mal...! He necesitado " + contador + " intentos");
		
		}
	}

}
