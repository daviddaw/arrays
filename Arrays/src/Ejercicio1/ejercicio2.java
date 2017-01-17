package Ejercicio1;

public class ejercicio2 {

	public static void main(String[] args) {
		int[] array1 = new int [3];
		Ejercicio1.crearArray(array1);
		visualizarArray(array1);

	}
	public static void visualizarArray (int[] array){
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]<17) {
				System.out.print(array[i]+" ");
			}
			array[i]=array[i]+array[i];
			System.out.println(array[i]);
			

			
		}
		System.out.println(" ");
	}
	

}

