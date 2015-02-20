/** 
 * Práctica 5: Cadenas de texto.
 *  Ejercicios2014.ajp
 *  Ejemplos de expresiones regulares y procesado en Java
 *  @source: PruebasRegex.java 
 *  @author: ajp
 */

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class PruebasRegex { 

	static public void main(String[] args) {

		//String cadena = "012abc";      //Ejemplo
		//String patron = "\\d";         //Ejemplo

		//String cadena = "JavaWorld";      
		//String patron = "(a[Ww])";    
		
		//String cadena = "pepe@gmail.com";      
		//String patron = "([^@])+";    

		//String cadena = "01 a2a 223";      
		//String patron = "\\d+"; 

		//String cadena = "bab";      
		//String patron = "[b?]"; 
		
		//String cadena = "9-+prue.ba+@correo.dos.com";      
		//String patron = "[\\w-\\.\\+]+@[\\w]+\\.[\\w]+"; 
		//String patron = "[\\w-\\+]+(\\.[\\w-\\+]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
		String cadena = "Estamos viviendo en un <mayus>submarino "
				+ "amarillo</mayus>. No tenemos<mayus>nada</mayus> "
				+ "qué hacer." ;      
		//String patron = "<mayus>|</mayus>";
		String patron = "<.*?>";

		
		
		Pattern expresion = Pattern.compile(patron);
		Matcher validador = expresion.matcher(cadena);

		System.out.print("Cadena:\t\t");
		for (char c : cadena.toCharArray()) {
			System.out.print(c + "  ");
		}
		System.out.println();
		System.out.print("Posiciones:\t");
		for (int x = 0; x < cadena.length(); x++) {
			if (x < 10) {
				System.out.print(x + "  ");
			} 
			else {
				System.out.print(x + " ");
			}
		}
		System.out.println();
		System.out.println("Expresi�n: " + validador.pattern());
		System.out.println();
		System.out.println("Coincidencias: ");
		System.out.println(validador.matches());
		while (validador.find()) {
			System.out.println("[" + validador.start() + "," + validador.end() + "]: " + validador.group());
		}
	}
}