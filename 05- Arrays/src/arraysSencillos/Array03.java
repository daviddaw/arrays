package arraysSencillos;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int[] notas;
		notas = new int[11];// Del cero al diez van once numeros
		int nota;		
		do {
			
			System.out.println("Teclee las notas para salir mete un numero menor que 0 o mayor que 10)");
			nota = in.nextInt();
			
			for (int i = 0; i < notas.length; i++) {//recorre todo el array
				if (nota == i) {//si la nota es igual a la posicion en la que se guarda esa nota
					notas[i]++;//entonces aumentamos en uno el valor de esa celda
				}	
			}
		}
		while (nota <= 10 && nota >= 0); 
		
		
		for (int j = 0; j < notas.length ; j++) {
			System.out.println("La nota "+j+" se repite "+notas[j]+" veces.");
		}
		
		
		in.close();
	}

}
