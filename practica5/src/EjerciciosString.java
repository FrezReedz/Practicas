/** 
 * Práctica 5: Cadenas de texto.
 *  Ejercicios2014.ajp
 *  Demostraciones de ejemplos y ejercicos sobre tratamiento manipulación de texto
 *  @source: EjerciciosString.java 
 *  @author: ajp
 */


import java.util.Arrays;


class EjerciciosString {

	public static void main(String args[])  {
		
		String vector[] = {
			"Ahora", "es", "el ", "momento", "de", "actuar"
		};
		
		//burbujaString(vector);		//ordenado es: Ahora, actuar, de, el , es, momento
		//System.out.format("%s\n", Arrays.toString(vector));
		
		//directaString(vector);
		//System.out.format("%s\n", Arrays.toString(vector));
		
		//System.out.println("Introducción " + invertirTexto1("Introducción"));
	
		//System.out.println(mayusSubCadena("<mayus>Estamos</mayus> viviendo en un <mayus>submarino "
		//		+ "amarillo</mayus>. No tenemos <mayus>nada</mayus> qué hacer."));
		
		//System.out.format("%s", eliminaEtiquetasRegex("<mayus>Estamos</mayus> viviendo en un <mayus>submarino "
		//		+ "amarillo</mayus>. No tenemos <mayus>nada</mayus> qué hacer."));
	
	
		System.out.format("%s\n", encripta("prueba", "aaaa"));
		
	}

	
	/**
	 * @param s
	 * @return
	 */
	public static String invertirTexto1(String s) {
		
		StringBuilder texto = new StringBuilder();
		
		for (int i = s.length()-1; i >= 0; i--) {
			
			//añade empezando por el final
			texto.append(s.charAt(i));
		}
			
		return texto.toString();
	}
	
	
	
	/**
	 * @param s
	 * @return
	 */
	public static String invertirTexto2(String s) {
			
		StringBuilder texto = new StringBuilder(s);
		
		
		for (int i=0, j = s.length()-1; i < s.length() / 2; i++, j--) {
			
			//intercambia caracteres de la posición i a j y viceversa
			char aux = texto.charAt(i); 
			texto.setCharAt(i, texto.charAt(j));
			texto.setCharAt(j, aux);
		}
			
		return texto.toString();		
	}
	
	
	
	/**
	 * Ordena un vector de String por el método de la burbuja
	 * @param v - el vector a ordenar
	 */
	public static void burbujaString(String[] v) {
		
		for (int i = 0; i < v.length; i++) {
			
			for (int j = i + 1; j < v.length; j++) {
				
				if (v[j].compareTo(v[i]) < 0) {
				   String aux = v[i];
				   v[i] = v[j];
				   v[j] = aux;
				}
			}	
		}
		
	}

	
	
	/**
	 * Ordena un vector de String por el método de selección directa
	 * @param v - el vector a ordenar
	 */
	public static void directaString(String[] v) {
		
		for (int i = 0; i < v.length; i++) {
			
			int posMenor = i;
			for (int j = i + 1; j < v.length; j++) {
				
				if (v[j].compareTo(v[i]) < 0) 
					posMenor = j;
				
				String aux = v[i];
				v[i] = v[posMenor];
				v[posMenor] = aux;
			}	
		}
		
	}
	
	
	
	/**
	 * Pone en mayúsucula el texto entre etiquetas <mayus> </mayus>. 
	 * Deja el texto limpio si etiquetas ulizando una expresión regular.
	 * @param texto - a procesar.
	 * @return - el texto procesado y limpio.
	 */
	public static String mayusSubCadena(String texto) {
		
		StringBuilder aux = new StringBuilder();
		
		// Trocea el texto dejando las subcadenas que deben ir en mayúscula en las posiciones, [1], [3], [5], ...
		String[] trozos = texto.split("<mayus>|</mayus>");
		
		for (int i=0; i < trozos.length; i++) {
			
			if (i % 2 != 0) {
				aux.append(trozos[i].toUpperCase());
			}
			else {
				aux.append(trozos[i]);
			}
		}
		
		return aux.toString();
	}
	
	
	
    /**
     * Elimina etiquetas HTML del texto utilizando una expresión regular.
     * @param texto
     * @return - el texto limpio.
     */
    public static String eliminaEtiquetasRegex(String texto) {
    	
    	//return Pattern.compile("<.+?>").matcher(texto).replaceAll("");
    	return texto.replaceAll("<.+?>", "");
    	
    }

    
    /**
     * Encripta un texto según una clave utilizando XOR binario.
     * El algoritmo es simétrico, con un texto encriptado con la misma clave se devuelve en claro. 
     * @param texto - en claro.
     * @param clave - de encriptación.
     * @return - el texto encriptado.
     */
    /**

     * @return
     */
    public static String encripta(String texto, String clave) {
    	
    	StringBuilder aux = new StringBuilder();
    	
    	for (int i=0; i < texto.length(); i++)
    		
    		aux.append((char)(texto.charAt(i) ^ clave.charAt(i % clave.length())));
    	
    	return aux.toString();
    	
    }
    
} //class

