package Simples;
public class ejercicio02 {

	public static void main(String[] args) {
		int[] array1 = new int [10];
		//cargar array desde teclado con enteros
		Ejercicio01.crearArray(array1);
		visualizarArray(array1);
		sumarPosiciones(array1);
		contadorPositivosNegativosCeros(array1);
		numeroMayor(array1);

	}
	
	public static void numeroMayor(int[] array1) {
		int max,cont=0;
		max=Integer.MIN_VALUE;

		for (int i = 0; i < array1.length; i++) {

			if (array1[i]>max) {
				max= array1[i];
			} 

			cont=cont+1;
		}

		System.out.println(" el valor maximo es "+max +" y se repite "+cont+"veces");
	} 
	 
	 
	public static void contadorPositivosNegativosCeros(int[] array1) {
		int contPositivos=0,contNegativos=0,contceros=0;
		
		for (int i = 0; i < array1.length; i++) {
			if (array1[i]<0) {
				//El numero es negativo
				contNegativos++;
			} else {
				if (array1[i]>0) {
					//El número es positivo
					contPositivos++;
				} else {

					//El número es cero
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
		//Visualizar posiciones con contenido menor a 17
		for (int i = 0; i < array.length; i++) {
			if (array[i]<17) {
				System.out.print(array[i]+" ");
			}
						
		}
		System.out.println(" ");
	}

	}
	

	
	
	


