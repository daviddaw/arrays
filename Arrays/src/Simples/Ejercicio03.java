package Simples;

public class Ejercicio03 {

	public static void main(String[] args) {
		int  arrayNotas [] = {0,0,0,0,0,0,0,0,0,0,0};
		int nota;
		System.out.println("introduce una nota");
		nota=LeerTeclado.readInteger();
		while (nota>=0 && nota<=10) 
		{
			arrayNotas[nota]=arrayNotas[nota]+1;
			System.out.println("Introduce una nota: ");
			nota=LeerTeclado.readInteger();
			
		}
	 	visualizarArray(arrayNotas);
	 	

	}
	public static void visualizarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("La nota "+i+" se repite "+array[i]+" veces.");
		}
		System.out.println();
	}

}
/*
 * pedir numero validando entre 0 y 10
 * si esta entre cero y  10
 * meteras el numero en la posicion
 * su metes 5 numeros 6
 * al preguntarlo t e saldra
 * */