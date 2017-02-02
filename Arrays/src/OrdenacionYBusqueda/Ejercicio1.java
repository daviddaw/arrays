package OrdenacionYBusqueda;

import Simples.LeerTeclado;

public class Ejercicio1 {

	public static void main(String[] args) {
		final int LONGITUD=30;
		int [] array=new int[LONGITUD];
		int aux;
		System.out.println("introduce las componentes");

		for ( int i=0; i<array.length; i++){
			array[i]=(int)(Math.random() * 100 +1) ;
		}

		//Imprime array desordenado
		System.out.println("El array desordenado es: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]);
			
		}
		//ordena el array
		for (int i=0; i<array.length-1;i++)
			for (int j=i+1;j<array.length;j++)
				if(array[i]>array[j])
				{
					aux=array[i];
					array[i]=array[j];
					array[j]=aux;
				}
		System.out.println("");
		//Imprime el array ordenado
		System.out.println("El array ordenado es ");
		for (int i = 0; i < array.length; i++) 
		{//syso ("componente"+i);
			
			System.out.print(array[i]);
		}

	}


}