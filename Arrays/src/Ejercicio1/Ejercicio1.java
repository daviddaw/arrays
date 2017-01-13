package Ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		int[] array1 = new int [10];
		
		//crear
		for (int i = 0; i < array1.length; i++) {
			array1[i]=i*2;
		}
		/*
		//visualizar
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]+ " ");
		}*/
		//Es mejor con metodos
		visualizarArray(array1);
		
		
		

      

	}

	private static void visualizarArray(int[] array1) {
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]+ " ");
		}
		
	}

}
