package Ejercicio2;

import Ejercicio1.LeerTeclado;

public class Eje2 {

	
	public static void main(String[] args) {
		
		int [] array1=new int [10];
		
		System.out.println("Inicializo el array 1");
		inicializarArray(array1);
		
		System.out.println("");
		
		System.out.println("Visualizo el array 1");
		visualizarArrays(array1);
		
		System.out.println("");
		
		System.out.println("Sumamos los valores del array 1");
		System.out.println(sumaArray(array1));
		
		System.out.println("");
		
		System.out.println("Visualizamos las posiciones de los contenidos menores de 17");
		menores17Array(array1);
		
		System.out.println("");
		
		System.out.println("Hallamos el elemento mayor y cuantas veces se repite");
		maxArray(array1);
		
		System.out.println("");
		
		System.out.println("Visualizamos los ceros, positivos y negativos en las posiciones pares");
		cerosArray(array1);
		positivosArray(array1);
		negativosArray(array1);
		
		
		
	}

	
	
	public static void inicializarArray(int [] a){
		for ( int i=0; i<a.length; i++){
			System.out.println("Introduce el valor del array en la componente "+i);
			a[i]=LeerTeclado.readInteger();
		
		}
		
	}
			
	
	public static void visualizarArrays(int [] a){
		for ( int i=0; i<a.length; i++){
			System.out.println("La componente "+i+" es "+a[i]);
			}
	}
	
	public static int sumaArray (int [] a){
		int suma=0;
		for (int i=0; i<a.length; i++){
			 suma+=a[i];
		}
		return suma;
	}
	
	
	public static void cerosArray(int [] a){
		int contador=0;
		for (int i = 0; i < a.length; i+=2) {
			if (a[i]==0) {
				contador++;
			}
		}
		System.out.println("Hay "+contador+" cero/s en las posiciones pares");
				
	}
	
	public static void positivosArray(int [] a){
		int contador=0;
		for (int i = 0; i < a.length; i+=2) {
			if (a[i]>0) {
				contador++;
			}
		}
		System.out.println("Hay "+contador+" positivo/s en las posiciones pares");		
		
	}
	
	public static void negativosArray(int [] a){
		int contador=0;
		for (int i = 0; i < a.length; i+=2) {
			if (a[i]<0) {
				contador++;
			}
		}
		System.out.println("Hay "+contador+" negativo/s en las posiciones pares");
	}
	
	public static void maxArray(int [] a){
		int contador=0;
		int max=-999;
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]>max) {
				max=a[i];
				contador=1;
								
			}
			if (a[i]==max) {
				contador++;
				
			}
			
		}
		System.out.println(max);
		System.out.println("El maximo se repite "+contador+" vez/veces");
		
	}
	
	
	public static void menores17Array(int [] a){
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]<17) {
				System.out.println("Posicion "+i+" valor "+a[i]);
			}
		}
			
	}





}
