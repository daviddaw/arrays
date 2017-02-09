package arraysBidimensionales;

public class Ejerc5Matriz {

	public static void main(String[] args) {
		

		


		//solo imprime
		int max,cont=0;
		
		max=Integer.MIN_VALUE;
		double media = 0.0;
		
		for (int i=0; i<matriz.length;i++ )
		{

		rellenarMatriz(array1);
		visualizarMatriz(array1);
		operacionesFila(array1);

		System.out.println();

			for(int j=0;j<matriz[i].length;j++){
				System.out.print(matriz[i][j]+" ");
					if (matriz[i][j]>max) 
					{
						max= matriz[i][j];
					}
					media += matriz[i][j];
					 
					 media = media / matriz.length;
		}
		}
				System.out.println(" \nLa nota maxima es "+max+ " y la media es "+media);
		

		operacionesColumna(array1);

	}

public static void rellenarMatriz(int [][]array){

	
}
public static void visualizarMatriz(int [][]array){
	
}
public static void operacionesFila(int [][]array){
	
}
public static void operacionescolumna(int [][]array){
	
}

}
