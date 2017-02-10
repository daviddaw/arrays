package arraysBidimensionales;

public class Ejerc5 {

	public static void main(String[] args) {
		int matriz[][]= new int [30][5];


		for (int i=0; i<matriz.length;i++ ){
			for(int j=0;j<matriz[i].length;j++){
				matriz[i][j]=(int)(Math.random() * 9 +1) ;
				//matriz[i][j]=i+j; ESto solo sumaria posiciones


			}

		}




		//solo imprime
		int max;
		double media=0,suma=0;
		max=Integer.MIN_VALUE;

		for (int i=0; i<matriz.length;i++ )
		{
			System.out.println();
			suma=0;
			for(int j=0;j<matriz[i].length;j++){
				System.out.print(matriz[i][j]+" ");

				suma=suma+matriz[i][j];
				if (matriz[i][j]>max) 
				{
					max= matriz[i][j];
				}
				
			}


			media=suma/matriz[0].length;
			System.out.println(" La nota media de cada alumno  es "+media);
		}
		System.out.println("La nota maxima es "+max );






	}
}


