
/** 
 * PrÃ¡ctica 6: Datos dinÃ¡micos lineales.
 *  Ejercicios2014.ajp
 *  Demostraciones de ejemplos y ejercicios sobre lista y datos dinÃ¡micos.
 *  @source: ListaArray.java 
 *  @author: ajp
 */
public class ListaArray {

	//atributos 
	private Object[] arrayElementos;
	private int numElementos;
	private static final int TAMAÑO_INICIAL = 4;

	//mÃ©todos  
	/** 
	 * Inicializa el array de elementos de la lista  
	 */
	public ListaArray() {
		arrayElementos = new Object[TAMAÑO_INICIAL];
		numElementos = 0;
	}



	/**
	 * @return nÃºmero de elementos actual en la lista
	 */
	public int size() {
		return numElementos;
	}


	/**
	 * AÃ±ade un elemento a la lista
	 * @param elemento - el elemento a aÃ±adir
	 */
	public void add(Object elemento) {
		
		// Delega en el mÃ©todo mÃ¡s especÃ­fico para aÃ±adir al final.
		add(numElementos, elemento);
	}


	/**
	 * Inserta un elemento en la posiciÃ³n especificada por el Ã­ndice.
	 * @param indice - indica la posiciÃ³n de inserciÃ³n en la lista.
	 * @param elemento - elemento a insertar.
	 * @throws IndexOutOfBoundsException
	 */
	public void add(int indice, Object elemento) {

		// El Ã­ndice debe ser vÃ¡lido.
		if (indice > numElementos || indice < 0) {
			throw new IndexOutOfBoundsException("Ã�ndice incorrecto: " + indice);
		}

		// El array interno estÃ¡ casi lleno, se duplica el espacio. 
		if (numElementos + 1 == arrayElementos.length) {
			Object[] arrayAmpliado = new Object[arrayElementos.length * 2];
			System.arraycopy(arrayElementos, 0, arrayAmpliado, 0, numElementos);
			arrayElementos = arrayAmpliado;
		}
		
		// InserciÃ³n, desplaza los elementos a desde indice indicado para hacer hueco.
		if (indice < numElementos) {
			System.arraycopy(arrayElementos, indice, arrayElementos, indice+1, numElementos-indice);
		}
	    
	    arrayElementos[indice] = elemento;
		numElementos++;
	}



	/**
	 * Devuelve el Ã­ndice de la primera ocurrencia para el objeto especificado.
	 * @param elemento - the element you are searching
	 * @return el indice de elemento o -1 si no lo encuentra
	 */
	public int indexOf(Object elemento) {
		if (elemento == null) {
			for (int i = 0; i < arrayElementos.length; i++) {
				if (arrayElementos [i] == null)
					return i;
			}
		} 
		else {
			for (int i = 0; i < arrayElementos .length; i++)
				if (elemento.equals(arrayElementos[i]))
					return i;
		}
		return -1;
	}



	/**
	 * Borra todos los elementos de la lista
	 */
	public void clear() {
		arrayElementos = new Object[TAMAÑO_INICIAL];
		numElementos = 0;
	}



	/**
	 * Comprueba si existe un elemento
	 * @param elemento â€“ el elemento a comprobar
	 * @return true si existe
	 */
	public boolean contains(Object elemento) {
		 
		return indexOf(elemento) != -1;
	}


	/**
	 * @return la posiciÃ³n del elemento indicado por el Ã­ndice
	 */
	public Object get(int indice) {
		if (indice >= numElementos || indice < 0) {
			throw new IndexOutOfBoundsException(
					"Ã�ndice incorrecto: " + indice);
		}
		return arrayElementos[indice];
	}



	/**
	 * Elimina el elemento especificado en el Ã­ndice
	 * @param indice - del elemento a eliminar
	 * @return el elemento eliminado
	 */
	public Object remove(int indice) {
		if (indice>=numElementos || indice<0) {
			throw new IndexOutOfBoundsException("Ã�ndice incorrecto: " + indice);
		}
		
		// Elimina desplazando uno hacia la izquierda, sobre la posiciÃ³n a borrar.
		Object elemento = arrayElementos[indice];
		System.arraycopy(arrayElementos, indice+1, arrayElementos, indice, numElementos-indice+1);
		
		arrayElementos[numElementos - 1] = null;
		numElementos--;
		return elemento;
	}


	
	/**
	 * Elimina el elemento especificado
	 * @param elemento - elemento a eliminar
	 * @return el Ã­ndice del elemento eliminado o -1 si no existe
	 */
	public int remove(Object elemento) {
		
		int indice= indexOf(elemento);
		
		if (indice != -1) {
			remove(indice);
		}
			
		return indice;
	}


} // class