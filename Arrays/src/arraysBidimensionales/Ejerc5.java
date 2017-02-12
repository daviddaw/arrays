package arraysBidimensionales;

public class Ejerc5 {

	public static void main(String[] args) {
		int[][]array1=new int [3][2];
		rellenarAleatorio(array1);
		visualizarMatriz(array1);
		operacionesFila(array1);
		System.out.println();
		operacionesColumna(array1);
		System.out.println();
		operacionesTotales(array1);




	}

	public static void rellenarAleatorio(int [][]array){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j]=(int)(Math.random()*9+1);
			}
		}
	}


	public static void visualizarMatriz(int [][]matriz){

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(" "+matriz[i][j]+" ");

			}
			System.out.println(" ");
		}

	}

	//fila
	public static void operacionesFila(int [][]matriz){
		double media=0,suma=0;
		System.out.println(" ");
		for (int i = 0; i < matriz.length; i++) {
			suma =0;
			for (int j = 0; j < matriz[i].length; j++) {
				suma=suma+matriz[i][j];

			}
			media=suma/matriz[0].length;
			System.out.println(" La nota media de cada alumno  es "+media);
		}

	}
	//columna
	public static void operacionesColumna(int [][]matriz){
		double media=0,suma=0;
		for (int j = 0; j < matriz[j].length; j++) {
			suma =0;
			for (int i = 0; i < matriz.length; i++) {
				suma=suma+matriz[i][j];
			}
			media=suma/matriz[0].length;
			System.out.println(" La nota media de cada asignatura  es "+media);
		}
	}

	public static void operacionesTotales(int [][]matriz){
		int max=Integer.MIN_VALUE;
		double media=0,suma=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				suma=suma+matriz[i][j];
				if (matriz[i][j]>max) 
				{
					max= matriz[i][j];
				}
			}

		}
		System.out.println(" La nota maxima es "+max );
		media=suma/(matriz[0].length*matriz.length);
		System.out.println(" La nota media de todos los alumnos con todas las asignaturas es  "+media);
	}
}
