

public class JV_RosetaNoEx {

	// En este array  los 0 indican celdas con c√©lula muerta y los 1 vivas
	static byte[][] mundo = { 
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
		{ 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
		{ 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0 }, //
		{ 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, //
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 
		{ 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0 }, // 
		{ 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0 }, //
		{ 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0 }, // Given:
		{ 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 1x Planeador
		{ 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 1x Flip-Flop
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }  // 1x Still Life
	};

	final static int TAMA—O = 12;
	final static int CICLOS = 120;

	public static void main(String[] args)
	{
		int gen = 0; 		//Generaciones

		do {
			System.out.println("\nGeneraci√≥n: " + gen);
			mostrarMundo();
			mundo = actualizarMundo();
			gen++;
		}
		while (gen <= CICLOS);
	}

	static void mostrarMundo() {

		for (int i = 0; i < TAMA—O; i++) {
			for (int j = 0; j < TAMA—O; j++) {

				System.out.print((mundo[i][j] == 1) ? "|o" : "| ");
			}
			System.out.println("|");
		}
	}

	static byte[][] actualizarMundo()  {     					
		
		byte[][] nuevoEstado = new byte[TAMA—O][TAMA—O];
		
		for (int i = 0; i < TAMA—O; i++) {
			
			for (int j = 0; j <= 11; j++) {
				
				int vecinas = 0;					//c√©lulas adyacentes

				// las celdas situadas fuera del mundo, con √≠ndices fuera de rango, hay que controlarlas
				
				if (i-1 >= 0)	
					vecinas += mundo[i-1][j];		//celda N			NO | N | NE
													//					-----------
				if (i-1 >= 0 && j+1 < TAMA—O)		// 					 O |   | E
					vecinas += mundo[i-1][j+1];		//celda NE			----------- 
													//					SO | S | SE
				if (j+1 < TAMA—O)
					vecinas += mundo[i][j+1];		//celda E			 
				
				if (i+1 < TAMA—O && j+1 < TAMA—O)
					vecinas += mundo[i+1][j+1];		//celda SE          
				
				if (i+1 < TAMA—O)
					vecinas += mundo[i+1][j]; 		//celda S           
				
				if (i+1 < TAMA—O && j-1 >= 0)
					vecinas += mundo[i+1][j-1]; 	//celda SO 
				
				if (j-1 >= 0)
					vecinas += mundo[i][j-1];		//celda O           			                                     	
				
				if (i-1 >= 0 && j-1 >= 0)
					vecinas += mundo[i-1][j-1]; 	//celda NO
			
				
				
				
				if (vecinas < 2) 
					nuevoEstado[i][j] = 0; 				// subpoblaci√≥n, muere

				if (vecinas > 3) 
					nuevoEstado[i][j] = 0; 				// sobrepoblaci√≥n, muere

				if (vecinas == 3) 
					nuevoEstado[i][j] = 1; 				// pasa a estar viva o se mantiene

				if (vecinas == 2 && mundo[i][j] == 1) 						
					nuevoEstado[i][j] = 1; 				// se mantiene viva
			}
		}
		return nuevoEstado;
	}
}

