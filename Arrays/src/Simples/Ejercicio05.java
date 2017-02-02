package Simples;



public class Ejercicio05 {

	public static void main(String[] args) {
		int[] array = new int[6];
		System.out.println("inicializo el array");
		inicializarArray(array);
		
		System.out.println("");
		
		System.out.println("visualizo el array");
		verArrays(array);
		
		System.out.println("");
		
		System.out.println("introduce la cifra a buscar");
		int n=LeerTeclado.readInteger();
		
		System.out.println("");
		buscarN(array, n);
	}
	
	public static void inicializarArray(int [] array){
		for (int i = 0; i < array.length; i++) {
			System.out.println("Escribe un numero");
			array[i]=LeerTeclado.readInteger();
		}	
	}
	
	
	public static void verArrays(int [] array){
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		
	}
	
	public static void buscarN(int [] array,int cifra) {
		boolean encontrado=false;
		int cont=0;
		
		for (int i = 0; i < array.length; i++) {
			if (cifra==array[i]) {
				cont++;
				encontrado=true;
			}
		}
		if (encontrado) //esto equivale a verdadero
			System.out.println(cifra+" esta "+cont+" vez/veces en el array.");
		else
			System.out.println(cifra+" no esta contenida en el array.");
		
	}
}
