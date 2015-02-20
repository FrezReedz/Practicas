

/**
 * @author ajp
 *
 */
public class RecorridosMatriz {

	static int[][] matriz = {
		{ 1,  2,  3,  4},
		{ 5,  6,  7,  8},
		{ 9, 10, 11, 12},
		{13, 14, 15, 16}
	};

	static int[][] matrizA = {
		{ 1,  2,  3,  4},
		{ 5,  6,  7,  8},
		{ 9, 10, 11, 12},
		{13, 14, 15, 16}
	};

	static int[][] matrizB = {
		{ 1,  2,  3,  4},
		{ 5,  6,  7,  8},
		{ 9, 10, 11, 12},
		{13, 14, 15, 16}
	};

	static int[][] matrizC = {
		{ 1,  2,  3,  4},
		{ 5,  6,  7,  8},
		{ 9, 10, 11, 12},
		{13, 14, 15, 16}
	};

	static int[][] matrizD4 = {
		{1, 12, 11, 10},
		{2, 13, 16,  9},
		{3, 14, 15,  8},
		{4,  5,  6,  7}
	};
	
	static int[][] matrizD5 = {
		{1, 16, 15, 14, 13},
		{2, 17, 24, 23, 12},
		{3, 18, 25, 22, 11},
		{4, 19, 20, 21, 10},
		{5,  6,  7,  8,  9}
	};
	
	static int[][] matrizD2 = {
		{ 1, 4},
		{ 2, 3},
		
	};
	public static void main(String[] args) {
		System.out.println(recorrer());
		System.out.println(recorrerD(matrizD4));
	}

	private static String recorrer() {
		String secuencia = "";

		for (int fila = 0; fila < matriz.length; fila++) {

			for (int col = 0; col < matriz[fila].length; col++) {

				secuencia += matriz[fila][col] + ", ";
			}
		}
		return secuencia;
	}

	private static String recorrerD(int[][] m) {

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

}
