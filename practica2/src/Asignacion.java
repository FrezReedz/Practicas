
/**
 * Asignacion.java
 * Programa que muestra la diferencia entre la asignación 
 * de primitivos y la asignación de referencias (objetos).
 * Auxiliarmente se utiliza la clase simple Entero.
 * ajp - 2014.10.14
 */

public class Asignacion {
	
	public static void main(String argumentos[]) {	
		int dato1;								//variable tipo primitivo
		dato1 = 3;
		
		int dato2 = dato1;						//copia variable tipo primitivo, se duplica el valor
		
		dato1 += 2;                             //los cambios en dato1 no afectan a dato2, son independientes
		
		System.out.println("Primitivos...");
		System.out.println("valor dato1: " + dato1);
		System.out.println("valor dato2: " + dato2 + "\n\tlos cambios en dato1 no afectan a dato2, son independientes\n");
		
		
		Integer dato3;							//variable tipo envoltorio
		dato3 = 3;
		
		Integer dato4 = dato3;					//copia variable tipo envoltorio, se duplica el valor
		
		dato3 += 2;                             //los cambios en dato3 no afectan a dato4, son independientes
		
		System.out.println("Envoltorios...");
		System.out.println("valor dato3: " + dato3);
		System.out.println("valor dato4: " + dato4 + "\n\tlos cambios en dato3 no afectan a dato4, son independientes\n");
		
		
		
		
		Entero ref1;
		ref1 = new Entero();					//crea variable tipo referencia (objeto)
		ref1.dato = 3;							//asigna valor al dato del objeto
		
		Entero ref2;
		ref2 = ref1;						  	//copia variable tipo referencia, no se duplica el dato (copia superficial)
												//ref2 no se crea nuevo, sólo es un alias de ref1
		
		ref1.dato += 2;							//los cambios en ref1 afectan a ref2, comparten dato
		
		System.out.println("Objetos...");
		System.out.println("ref1: " + ref1);
		System.out.println("ref2: " + ref2);
		
		System.out.println("valor ref1: " + ref1.dato);	
		System.out.println("valor ref2: " + ref2.dato);
		System.out.println("\tLos cambios en el valor de ref1 afectan a ref2, comparten el dato\n");
		
		
		Entero ref3 = new Entero();				//crea variable tipo referencia (objeto)
		ref3.dato = ref1.dato;					//copia dato, se duplica el dato (copia profunda)
		ref1.dato += 2;							//los cambios en ref1 no afectan a ref2
		
		System.out.println("Objetos...");
		System.out.println("ref1: " + ref1);
		System.out.println("ref3: " + ref3);
		
		System.out.println("valor obj1: " + ref1.dato);
		System.out.println("valor ref3: " + ref3.dato);
		System.out.println("\tLos cambios en el valor de ref1 no afectan a ref3, son clones independientes\n");
	} 

} //class



/**
 * Clase simple que envuelve un entero primitivo
 */
class Entero {
	
	int dato;
	
} //class





