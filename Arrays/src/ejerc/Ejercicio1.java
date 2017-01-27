package ejerc;

public class Ejercicio1 {

	public static void main(String[] args) {
		// 1.	Programa que declare 2 arrays  de 10 números y llame a métodos que hagan lo siguiente:
//		Cargar ambos arrays desde teclado.
//		Sumarlos obteniendo otro array de 10 números de forma que cada componente
//		sea la suma de las componentes de los dos primeros.
//		Visualizar el array resultante.
//		El main debe declarar dos arrays y llamar a estos métodos.
		
		
		int array1[]=new int[10];
		int array2[]=new int[10];
		int array3[]=new int[10];
		
		
		iniciarArray(array1);
		iniciarArray(array2);
		array3=sumaArrays(array1, array2);
		visualizarArray(array3);
		
		
		


	}
	
	public static void iniciarArray(int array[]){
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce la posicion "+i+" del array");
			array[i]=LeerTeclado.readInteger();
		}
		
	}
	
	
	public static int[] sumaArrays(int array1[],int array2[]){
		int array3[]=new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			array3[i]=array1[i]+array2[i];
		}
		return array3;
		
	}
	
	public static void visualizarArray(int array[]){
		
		System.out.println("Valores del array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
	}
	
	

}
