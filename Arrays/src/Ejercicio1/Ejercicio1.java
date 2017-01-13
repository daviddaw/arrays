package Ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		int[] array1 = new int [10];
		int[] array2 = new int [10];
		
		crearArray(array1);
		crearArray(array2);
	}
	
	
	public static void crearArray (int[] array)	{
	
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println("Nuevo array");
			System.out.println("Faltan por introducir "+(10-i)+" numeros");
			array[i]=LeerTeclado.readInteger();
			
		}
		
	}

	public static void visualizarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+ " ");
		}
		
	}

}
