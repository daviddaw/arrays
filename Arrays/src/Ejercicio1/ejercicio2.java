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
		int contPositivos=0,contNegativos=0,contceros=0;
		
		for (int i = 0; i < array1.length; i++) {
			if (array1[i]<0) {
				//El numero es negativo
				contNegativos++;
			} else {
				if (array1[i]>0) {
					//El n�mero es positivo
					contPositivos++;
				} else {

					//El n�mero es cero
					contceros++;
				}

			}
			
		}
		System.out.println(" positivos "+contPositivos+" negativos "+contNegativos+" ceros "+contceros);
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

