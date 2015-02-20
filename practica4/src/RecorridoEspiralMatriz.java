

/**
 * @author ajp
 *
 */
public class RecorridoEspiralMatriz {

	//Distribución para recorrido básico por filas
	static int[][] matriz = {
		{ 1,  2,  3,  4},
		{ 5,  6,  7,  8},
		{ 9, 10, 11, 12},
		{13, 14, 15, 16}
	};

	//Distribuciones para recorrido espiral
	static int[][] matrizE2 = {
		{ 1, 4},
		{ 2, 3},
		
	};
	
	static int[][] matrizE3 = {
		{1, 8, 7},
		{2, 9, 6},
		{3, 4, 5},
	};
	
	static int[][] matrizE4 = {
		{1, 12, 11, 10},
		{2, 13, 16,  9},
		{3, 14, 15,  8},
		{4,  5,  6,  7}
	};
	
	static int[][] matrizE5 = {
		{1, 16, 15, 14, 13},
		{2, 17, 24, 23, 12},
		{3, 18, 25, 22, 11},
		{4, 19, 20, 21, 10},
		{5,  6,  7,  8,  9}
	};
	

	
	
	public static void main(String[] args) {
		System.out.println(recorrer());
		//System.out.println(recorrerE(matrizE4));
		//System.out.println(recorrerEspiralBasico3b(matrizE3));
		System.out.println(recorrerEspiralBasico4b(matrizE4));
	}

	
	
	public static String recorrer() {
		String secuencia = "";

		for (int fila = 0; fila < matriz.length; fila++) {

			for (int col = 0; col < matriz[fila].length; col++) {

				secuencia += matriz[fila][col] + ", ";
			}
		}
		return secuencia;
	}

	
	
	
	public static String recorrerE(int[][] m) {

		String secuencia = "";
		

		for (int i = m.length, j=1; i > 0; i--, j++) {

			for (int fila=m.length-i, col=m.length-i; fila < i; fila++) {
				
				secuencia += m[fila][col] + ", ";
			}

			for (int fila=m.length-j, col=m.length-i+1; col < i; col++) {
				
				secuencia += m[fila][col] + ", ";
			}

			for (int fila = i-2, col = m.length-j; fila >= m.length-i; fila--) {
				
				secuencia += m[fila][col] + ", ";
			}

			for (int fila=m.length-i, col=m.length-j-1; col > m.length-i; col--) {
				
				secuencia += m[fila][col] + ", ";
			}

		}
		
		return secuencia;

	}

/*	     [0] [1] [2]

	[0]	  1   8   7
	[1]	  2       6
	[2]	  3   4   5	

	Hay que darse cuenta que la primera vuelta completa obtendría: 1, 2, 3, 4, 5, 6, 7, 8. 
	El 9 se obtendría ya con la segunda vuelta. 
	
	Objetivo básico: Obtener 1, 2, 3, 4, 5, 6, 7, 8  -la primera vuelta- sin intentar resolver nada más.	
	¿Es posible con un solo bucle?
	
		Objetivo parcial1: Obtener 1, 2, 3 con un bucle for
		Objetivo parcial2: Obtener 4, 5 con un bucle for y añadir
		Objetivo parcial3: Obtener 6, 7 con un bucle for y añadir
		Objetivo parcial4: Obtener 8 con un bucle for

	Experiencia: Se recomienda hacer referencia a los índices con nombres de variables significativos: fila y col, no i, j

*/	
	public static String recorrerEspiralBasico3a(int[][] m) {

		String secuencia = "";
		
		int limite = m.length; 

			//[0][0] a [2][0]
			for (int fila=0; fila < limite; fila++) {		// Objetivo parcial1: Obtener 1, 2, 3
				
				secuencia += m[fila][0] + ", ";				// col = 0
			}

			//[2][1] a [2][2]
			for (int col=1; col < limite; col++) {			// Objetivo parcial2: Obtener 4, 5
				
				secuencia += m[2][col] + ", ";				// fila = limite-1, osea 2
			}

			
			//[1][2] a [0][2]
			for (int fila = 1; fila >= 0; fila--) {			// Objetivo parcial3: Obtener 6, 7
				
				secuencia += m[fila][2] + ", ";				// col = limite-1, osea 2
			}

			//[0][1] a [0][1]
			for (int col=1; col > 0; col--) {				//Objetivo parcial4: Obtener 8 
				
				secuencia += m[0][col] + ", ";				// fila = 0
			}

		
		return secuencia;

	}
	
	
	public static String recorrerEspiralBasico3b(int[][] m) {

		String secuencia = "";
		
		int limite = m.length; 

			//[0][0] a [2][0]
			for (int fila=0, col=0; fila < limite; fila++) {		// Objetivo parcial1: Obtener 1, 2, 3
				
				secuencia += m[fila][col] + ", ";					// col = 0
			}

			//[2][1] a [2][2]
			for (int fila=2, col=1; col < limite; col++) {			// Objetivo parcial2: Obtener 4, 5
				
				secuencia += m[fila][col] + ", ";					// fila = limite-1
			}

			
			//[1][2] a [0][2]
			for (int fila = 1, col=2; fila >= 0; fila--) {			// Objetivo parcial3: Obtener 6, 7
				
				secuencia += m[fila][col] + ", ";					// col = limite-1
			}

			//[0][1] a [0][1]
			for (int fila=0, col=1; col > 0; col--) {				//Objetivo parcial4: Obtener 8 
				
				secuencia += m[fila][col] + ", ";					// fila = 0
			}

		
		return secuencia;

	}
	
	
	/*
	     [0] [1] [2] [3]

	[0]	  1  12  11  10
	[1]	  2           9
	[2]	  3       	  8
	[3]   4   5   6   7
	
	Hay que darse cuenta que la primera vuelta completa obtendría: 1, 2, 3, 4, 5, 6, 7, 8. 
	El 9 se obtendría ya con la segunda vuelta. 
	
	Objetivo básico: Obtener 1, 2, 3, 4, 5, 6, 7, 8  -la primera vuelta- sin intentar resolver nada más.	
	¿Es posible con un solo bucle?
	
		Objetivo parcial1: Obtener 1, 2, 3 con un bucle for
		Objetivo parcial2: Obtener 4, 5 con un bucle for y añadir
		Objetivo parcial3: Obtener 6, 7 con un bucle for y añadir
		Objetivo parcial4: Obtener 8 con un bucle for

	Experiencia: Se recomienda hacer referencia a los índices con nombres de variables significativos: fila y col, no i, j

*/
	
	public static String recorrerEspiralBasico4b(int[][] m) {

		String secuencia = "";
		
		int limite = m.length; 

			//[0][0] a [2][0]
			for (int fila=0, col=0; fila < limite; fila++) {		// Objetivo parcial1: Obtener 1, 2, 3, 4
				
				secuencia += m[fila][col] + ", ";					// col = 0
			}

			//[2][1] a [2][2]
			for (int fila=2, col=1; col < limite; col++) {			// Objetivo parcial2: Obtener 5, 6, 7
				
				secuencia += m[fila][col] + ", ";					// fila = limite-1
			}

			
			//[1][2] a [0][2]
			for (int fila = 1, col=2; fila >= 0; fila--) {			// Objetivo parcial3: Obtener 8, 9, 10
				
				secuencia += m[fila][col] + ", ";					// col = limite-1
			}

			//[0][1] a [0][1]
			for (int fila=0, col=1; col > 0; col--) {				//Objetivo parcial4: Obtener 11, 12 
				
				secuencia += m[fila][col] + ", ";					// fila = 0
			}

		
		return secuencia;

	}
}
