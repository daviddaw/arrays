package ejerc;

public class Ejercicio2 {

	public static void main(String[] args) {
		// 2.	Hacer un programa que trabaje con un array de 10 elementos y llame a métodos que hagan lo siguiente:
//		Cargar el array desde teclado con enteros
//			Visualizar las posiciones de los elementos con contenido menor de 17
//			Calcular la suma de los elementos del array (el resultado se visualizará en el programa principal).
//			Visualizar el total de  ceros, positivos y negativos que hay en las posiciones pares del array
//			Hallar el elemento mayor del array y cuántas veces se repite.

		int array1[]=new int[10];
		
		iniciarArray(array1);
		verMenores(array1);
		System.out.println("la suma de las posiciones del array es: "+sumaArray(array1));
		verEnteros(array1);
		max(array1);
		
	}
	
	public static void iniciarArray(int array[]){
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce la posicion "+i+" del array");
			array[i]=LeerTeclado.readInteger();
		}		
	}
	public static void verMenores(int array[]){
		
		System.out.println("Valores del array menores de 17: ");
		for (int i = 0; i < array.length; i++) {
			if(array[i]<17){
			System.out.print(array[i]+" ");
			}
		}
		System.out.println();		
	}
	
	public static int sumaArray(int array1[]){
		int suma=0;
		for (int i = 0; i < array1.length; i++) {
			suma+=array1[i];
		}
		return suma;
		
	}
	
	public static void verEnteros(int array[]){
		int contCero=0;
		int contPos=0;
		int contNeg=0;
		for (int i = 0; i < array.length; i+=2) {
			if(array[i]<0)
				contNeg++;
			else if(array[i]==0)
				contCero++;
			else
				contPos++;
		}
		
		System.out.println("En las posiciones pares del array hay "+contNeg+" numeros negativos,  "+contCero+" ceros y "+contPos+" numeros positivos.");
	}
	
	public static void max(int[]array){
		int maximo=Integer.MIN_VALUE;
		int cont=1;
		for (int i = 0; i < array.length; i++) {
			if (array[i]>maximo){
				maximo=array[i];
				cont=1;
		}else if(array[i]==maximo)
				cont++;
		}
		System.out.println("El maximo es: "+maximo+" y se repite "+cont+" veces");
	}
	

}
