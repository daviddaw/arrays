package Ejercicio8;

import Ejercicio1.LeerTeclado;

public class Eje8 {

	
	public static void main(String[] args) {
	
		int [] array1=new int [6];
		
		System.out.println("inicializo el array");
		inicializarArray(array1);
		
		System.out.println("");
		
		System.out.println("visualizo el array");
		visualizarArrays(array1);
		
		System.out.println("");
		
		System.out.println("introduce la cifra a buscar");
		int n=LeerTeclado.readInteger();
		
		System.out.println("");
		
		//contenido
		cifraContenida(array1, n);
	}

	
	
	public static void inicializarArray(int [] a){
		for ( int i=0; i<a.length; i++){
			System.out.println("Introduce el valor del array en la componente "+i);
			a[i]=LeerTeclado.readInteger();
		
		}
		
	}
			
	
	public static void visualizarArrays(int [] a){
		for ( int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
			}
	}
	
	public static void cifraContenida (int [] a, int cifra){
		boolean contenido=false;
		int cont=0;
		
		for (int i = 0; i < a.length; i++) {
			if (cifra==a[i]) {
				cont++;
				contenido=true;
			}
		}
		if (contenido) 
			System.out.println(cifra+" esta contenida "+cont+" vez/veces en el array.");
		else
			System.out.println(cifra+" no esta contenida en el array.");
	}
	
}
