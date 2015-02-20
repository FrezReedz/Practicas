

public class VectoresIguales {

	public static void main(String[] args) {
		
		int vector1[] = {3,2,1,3,8,5,5};
		int vector2[] = {3,2,1,3,8,5,5,6,7};
		
		System.out.println(vectoresIntIguales(vector1, vector2));

	}

	static boolean vectoresIntIguales(int[] v1, int[] v2) {

		for (int i=0; i < v1.length && i < v2.length; i++) {

			if (v1[i] != v2[i]) {	
				return false;
			}
		}
		
		return true;
	}

} // class
