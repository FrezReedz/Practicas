


import java.util.Arrays;
import java.util.Scanner;

public class VectorAmpliado {

	static int[] datos = {2, 3, 1, 27, 20, 0}; 
	
	public static void main(String argumentos[]) {
		
		
		
		//datos = new int[60];
		
		//System.out.println(Arrays.toString(datos));
		
		 
		
		 redimensionar2();
		//datos = Arrays.copyOf(datos, datos.length * 2);
		
		//redimensionar(datos); //a = datos
	
		System.out.println(Arrays.toString(datos));
		
	}
	
	private static void redimensionar2() {
		int[] b = new int[datos.length * 2];
		System.arraycopy(datos, 0, b, 0, datos.length-1);
		datos = b;	
	}

	static void pruebaReferencia(int[] a) {
		
		for(int i = 0; i < a.length; i++)
			a[i] = 0;	
	}

	
	
	static void redimensionar() {
				
		int[] b = new int[datos.length * 2];
		
		for(int i = 0; i < datos.length; i++) {
			b[i] = datos[i];
		}
		
		datos = b;
		
	}

} //class
