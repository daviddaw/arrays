package Ejercicio1;

public class ejercicio2 {

	public static void main(String[] args) {
		int[] array1 = new int [3];
		Ejercicio1.crearArray(array1);
		visualizarArray(array1);
		sumarPosiciones(array1);
		contadorPositivosNegativosCeros(array1);

	}
	public static void contadorPositivosNegativosCeros(int[] array1) {
		int acumulador=0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i]<0) {
				System.out.println("El numero es negativo");

			} else {
				if (array1[i]>0) {
					System.out.println("El número es positivo");
				} else {

					System.out.println("El número es cero");
				}

			}
			
		}
		
	}
	
	
	public static void sumarPosiciones (int[] array){
		int acumulador=0;
		for (int i = 0; i < array.length; i++) {
			acumulador=acumulador+array[i];
			
		}
		System.out.println(" ");
		System.out.println("la suma de todas las posiciones del array es "+ acumulador);
	}
	
	public static void visualizarArray (int[] array){
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]<17) {
				System.out.print(array[i]+" ");
			}
						
		}
		System.out.println(" ");
	}
	
	

	
	
	
}

