package arraysSencillos;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		

		
		int[] array1 = new int[4]; //Declaro un array con  10 celdas
		
		pedirNumArray(array1);//Este metodo va pidiendo los numeros del array
		
		validadorMenores17(array1);
		
		System.out.println("\n"+"La suma es: "+sumadorPosiciones(array1));
		
		contadorCPN(array1);
		mayorElemento(array1);
		
	} 
	
	public static void pedirNumArray (int[] array) {
		Scanner in = new Scanner(System.in);
		int n;
		for (int i = 0; i < array.length; i++) { //Va de la celda cero hasta la ultima celda del array
			System.out.println("Introduce el valor de la celda "+i+" del array.");//nos dice en que celda estamos
			 n=in.nextInt();//guardamos en n la variable
			array [i] = n;//guardamos el valor de n en la posicion del array que estamos esta vuelta
		}
		in.close();
	}

	public static void validadorMenores17 (int[] array) {//le pasamos como parametro el arrray
		System.out.println("Estos son los numero menores de 17 ");
		for (int i = 0; i < array.length; i++) {// Va desde la celda cero hasta la ultima
			if (array[i] < 17) {  //comprueba en cada vuelta si el numero que contiene es menor que 17
				System.out.print(array[i]+" ");//En caso afirmatvo lo imprimo
			}
		}

	}

	public static int sumadorPosiciones(int[] array) {//recibe el array
		int suma = 0;
		for (int i = 0; i < array.length; i++) {//recorre el array
			suma =suma +array[i];//suma el resultado  de cada posicion
		}
		return suma;//y la enviamos  de vuelta
	}

	public static void contadorCPN (int[] array) {//Recibe el array
		int neg=0, pos=0,cero=0; //Creamos las variables para contar lo que se repite
		for (int i = 0; i < array.length; i = i+2) {//recorre las posiciones pares desde el 2
			if (array[i] == 0) {
				cero++;
			}
			else if (array[i] > 0) {
				pos++;
			}
			else {
				neg++;
				
			}
		}
		System.out.println("Hay "+cero+ " ceros,"+pos+ " positivos, "+neg+ " negativos");
	
	}

	public static void mayorElemento (int[] array) {//recibe el array
		int cMayor = 0, mayor = Integer.MIN_VALUE;//El numero que metamos siempre sera mas alto por tanto siempre sera el mayor
		for (int i = 0; i < array.length; i++) {//Recorremso el array
			if (array[i] > mayor) {//Si el valor de la posicion es mayor que el numero mayor
				mayor = array[i]; //entonces mayor cogera el valor de esa posicion
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == mayor) {
				cMayor++;
			}
		}
		System.out.println("\n"+"El mayor numero es "+mayor+"  se repite "+cMayor+" veces");
	}
	
}
