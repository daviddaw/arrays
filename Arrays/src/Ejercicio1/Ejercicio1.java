package Ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		int[] array1 = new int [10];
		int[] array2 = new int [10];
		
		crearArray(array1);
		crearArray(array2);
		visualizarArray(array1);
		visualizarArray(array2);
		visualizarArray(restarArray(array1, array2));
	}
	
	
	public static void crearArray (int[] array)	{
	
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println("Nuevo Array");
			System.out.println("Faltan por introducir "+(10-i)+" numeros");
			array[i]=LeerTeclado.readInteger();
		}
		
	}

	public static int [] restarArray(int[] array1, int[] array2)
	/*no olvidar poner corchetes "public static int []" */
	{
		int[] resta=new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			resta[i]=array1[i]-array2[i];			
		}

		return resta;
		
	}
	
	public static void visualizarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
	}

}
