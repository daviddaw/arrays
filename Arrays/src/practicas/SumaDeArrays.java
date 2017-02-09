package practicas;

import Simples.LeerTeclado;

public class SumaDeArrays {

	public static void main(String[] args) {
	//Declaracion
	int[]array1=new int[5];
	int[]array2=new int[5];
	int[]suma=new int[array1.length];
	//Relleno de posiciones por teclado
	System.out.println("introduce");
	for (int i = 0; i < array1.length; i++) {
		array1[i]=LeerTeclado.readInteger();
	}
	//Relleno de posiciones aleatorio
	for (int i = 0; i < array2.length; i++) {
		array2[i]=(int)(Math.random()*10+1);
	}
	
    //Suma
	
	for (int i = 0; i < suma.length; i++) {
		suma[i]=array1[i]+array2[i];
	}
	visualizar(array1);
	visualizar(array2);
	visualizar(suma);
	//visualizar mejor es crear el metodo visualizar
	/*
	for (int i = 0; i < suma.length; i++) {
		System.out.print(array1[i]+" ");
	}
	System.out.println("");
	
	for (int i = 0; i < suma.length; i++) {
		System.out.print(array2[i]+" ");
	}
	System.out.println("");
	
	for (int i = 0; i < suma.length; i++) {
		System.out.print(suma[i]+" ");
		}
	*/
	}
	//visualizar array con un metodo
     public static int[] visualizar(int [] array){
    	 
    	 for (int i = 0; i < array.length; i++) {
    			System.out.print(array[i]+" ");
    			}
    		System.out.println("");
			return array;
     }
	
	}


