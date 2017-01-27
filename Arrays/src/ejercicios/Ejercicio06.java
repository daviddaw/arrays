package ejercicios;

public class Ejercicio06 {



	public static void main(String[] args) {
		
		int [] array1=new int [20];
		
		System.out.println(" array con contenido aleatorio");
		arrayAleatorio(array1);
		
		System.out.println("");
		
		System.out.println("Contenido del array");
		verArrays(array1);
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Numero de pares "+arraysPares(array1));
		System.out.println("");
		System.out.println("Numero de impares "+arraysImpares(array1));
		
		int [] arrayimp=new int [arraysImpares(array1)];
		int [] arratpar=new int [arraysPares(array1)];
		
		
		arraysPareseImpares(array1, arratpar, arrayimp);
		System.out.println("");
		System.out.println("Array de Impares");
		verArrays(arrayimp);
		System.out.println("");
		System.out.println("Array de Pares");
		verArrays(arratpar);
		
		
	}

	public static void arrayAleatorio(int [] array){
		for ( int i=0; i<array.length; i++){
			array[i]=(int)(Math.random() * 100 +1) ;
		}
		
	}
			
	
	public static void verArrays(int [] array){
		for ( int i=0; i<array.length; i++){
			System.out.print(array[i]+" ");
			}
	}
	
	public static int arraysPares (int [] array){
		int cont=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2==0) {
				cont++;
			}
		}
				
		return cont;
	}
	
	public static int arraysImpares (int [] array){
		int cont=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2!=0) {
				cont++;
			}
		}
				
		return cont;
	}
	
	public static void arraysPareseImpares(int [] array, int [] pares, int [] impares){
		int j=0, k=0;
			for (int i = 0; i < array.length; i++) {
				if (array[i]%2==0) {
						pares[j]=array[i];
						j++;
					}
				else {
					impares[k]=array[i];
					k++;
				}
					
			}
	}
				
	
}
