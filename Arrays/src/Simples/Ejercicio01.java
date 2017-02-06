package Simples;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Declaracion de dos arrays de 10 numeros en el Main
		int[] array1 = new int [10];
		int[] array2 = new int [10];
		
		//crear arrays desde teclado
		crearArray(array1);
		crearArray(array2);
		
		
		visualizarArray(array1);
		visualizarArray(array2);
		//visualizar Arrays //Multiplicar Arrays
		visualizarArray(productoArray(array1, array2));
	}
	
	
	public static void crearArray (int[] array)	{
	//Cargar arrays desde teclado
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println("Faltan por introducir "+(10-i)+" numeros");
			array[i]=LeerTeclado.readInteger();
		}
		System.out.println("Array");
	}

	public static int [] productoArray(int[] array1, int[] array2)
	//Multiplicar Arrays
	{
		int[] producto=new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			producto[i]=array1[i]*array2[i];			
		}

		return producto;
		
	}
	
	public static void visualizarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
	}

}
