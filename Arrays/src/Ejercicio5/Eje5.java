package Ejercicio5;

import ejercicios.LeerTeclado;

public class Eje5 {

	
	public static void main(String[] args) {
		
		System.out.println("Introduce una longitud para el array 1");
		int n=LeerTeclado.readInteger();
		int [] array1=new int [n];
		System.out.println("Introduce una longitud para el array 2");
		int m=LeerTeclado.readInteger();
		int [] array2=new int [m];
		
		System.out.println("Inicializamos el array1");
		inicializarArray(array1);
		
		System.out.println("");
		
		System.out.println("Inicializamos el array2");
		inicializarArray(array2);
		
		System.out.println("");
		
		System.out.println("Mostramos el array 1");
		visualizarArrays(array1);
		
		System.out.println("");
		
		System.out.println("Mostramos el array 1");
		visualizarArrays(array2);
		
		System.out.println("");
		
		System.out.println("comprobamos si los arrays est�n contenidos");
		arrayContenido(array1, array2);
		

	}

	
	public static void inicializarArray(int [] a){
		for ( int i=0; i<a.length; i++){
			System.out.println("Introduce el valor del array en la componente "+i);
			a[i]=LeerTeclado.readInteger();
		
		}
		
	}
			
	
	public static void visualizarArrays(int [] a){
		System.out.println("");
		for ( int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
			}
	}
	
	public static void arrayContenido(int [] a, int [] b){
		boolean contenido=true;
		if (a.length>b.length) {
			for (int i = 0; i < b.length && contenido; i++) {
				if (a[i]!=b[i]){
					
					contenido=false;
				}
			}
			if (contenido) {
				System.out.println("el array 2 est� contenido en el array 1");
			}
			else {
				System.out.println("el array 2 no est� contenido en el array 1");
			}
		}
		else {
			for (int i = 0; i < a.length && contenido; i++) {
				if (b[i]!=a[i]){
					contenido=false;
				}
			}
		if (contenido) {
			System.out.println("el array 1 est� contenido en el array 2");
		}
		else {
			System.out.println("el array 1 no est� contenido en el array 2");
		}
			
		}
		
		
	}
	
}
