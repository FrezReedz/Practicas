/** 
 * Práctica 5: Cadenas de texto.
 *  Ejercicios2014.ajp
 *  Comparativa de rendimiento entre String StringBuilder y StringBuffer 
 *  @source: ComparativaString.java 
 *  @author: ajp
 */

import java.util.Date;

/**
 * @author admin
 *
 */
public class ComparativaString {

	static final int  VECES = 250;
	
	public static void main(String[] args) {
		
		
		//objetosInmutables();
		
		pruebaLentitudStringGrandes();
		
		pruebaLentitudStringBuilderGrandes();
		
		pruebaLentitudStringBufferGrandes();
	
	}
		
		

	/**
	 * 
	 */
	public static void pruebaLentitudStringBuilderGrandes() {
		
		StringBuilder prueba = new StringBuilder();
		
		long marcaTiempo = new Date().getTime();
		
		for (int i = 0; i < VECES*400; i++) {
			
			prueba.append('a'); 
		}
	
		
		System.out.println("Tiempo con StringBuilder: " + (new Date().getTime() - marcaTiempo) + " ms");

	}

	
	/**
	 * 
	 */
	public static void pruebaLentitudStringBufferGrandes() {
		
		StringBuffer prueba = new StringBuffer();
		
		long marcaTiempo = new Date().getTime();
		
		for (int i = 0; i < VECES*200; i++) {
			
			prueba.append('a'); 
		}
	
		
		System.out.println("Tiempo con StringBuffer: " + (new Date().getTime() - marcaTiempo) + " ms");

	}
	
	
	
	/**
	 * 
	 */
	public static void pruebaLentitudStringGrandes() {
	
		long marcaTiempo = new Date().getTime();
		
		String prueba = "";
		for (int i = 0; i < VECES; i++) {
			prueba += 'a'; 
		}
		
		System.out.println("Tiempo con String: " + (new Date().getTime() - marcaTiempo) + " ms");
	}

	
	private static void objetosInmutables() {
		String s1 = new String("Hola");
     	String s2 = "Mundo Java";
     	
     	     	
     	System.out.println(s1);
     	System.out.println(s2);
     	
     	s1 = s1 + "-";
     	s2 = s2.toUpperCase();       			//Pasa a mayúsculas
     	
     	System.out.println(s1);
     	System.out.println(s2);	
     	System.out.println(s1.concat(s2));      //Concatena dos cadenas.
                                  	 			//Equivale a s1 + s2
     	String s3 = s2;

		
	}
	

} // class
