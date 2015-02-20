

public class FrecuenciaN {



	public static void main(String[] args) {
	
		int num = 5;
		
		int vector[] = {3,2,1,3,8,5,5};
		
		int veces;
		
		//veces = frecuenciaNum(vector, num);
		
		veces = frecuenciaNumForE(vector, num);
		
			
		//System.out.println("El número " + num 
		//					+ " se repite " 
		//					+ veces + " veces");
		
		String pos = buscarPosicionesNum(vector, num);
		System.out.println("El número " + num 
				+ " está en las " 
				+ " posiciones: " + pos);
	}

	static int frecuenciaNum(int[] v, int n) {
	
		int cont = 0;
		for (int i=0; i < v.length; i++) {
			
			if (v[i] == n) {
				cont++;
			}
				
		}
		
		return cont ;
	}

	
	static int frecuenciaNumForE(int[] v, int n) {
		
		int cont = 0;
		for (int elem : v) {
			
			if (elem == n) {
				cont++;
			}		
		}
		
		return cont ;
	}
	
	
	/**
	 * @param v
	 * @param n
	 * @return
	 */
	static String buscarPosicionesNum(int[] v, int n) {
		
		String posiciones = "";
		
		for (int i=0; i < v.length; i++) {
			
			if (v[i] == n) {
				posiciones += i + " - ";
			}	
		}
		
		return posiciones;
	}
	
	
}
