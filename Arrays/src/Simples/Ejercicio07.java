package Simples;

public class Ejercicio07 {



	public static void main(String[] args) {
		
		int [] array1=new int [30]; 

		System.out.println("Creamos el array aleatorio");
		arrayAleatorio(array1);
		
		System.out.println("");
		
		System.out.println("array aleatorio");
		verArrays(array1);
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Desplazamos las posiciones del array");
		desplazarPosicion(array1);
		verArrays(array1);
		
	}

	public static void arrayAleatorio(int [] array){
		for ( int i=0; i<array.length; i++){
			array[i]=(int)(Math.random() * 50 +1) ;
		}
		
	}
			
	
	public static void verArrays(int [] a){
		for ( int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
			}
	}
	
	
	
	public static void desplazarPosicion (int [] a){
		
		int aux=a[a.length-1], aux2=a[0], aux3;
		
		for (int i = 0; i < a.length-1; i++) {
			aux3=a[i+1];
			a[i+1]=aux2;
			aux2=aux3;
		}
		
		a[0]=aux;
	}

}
