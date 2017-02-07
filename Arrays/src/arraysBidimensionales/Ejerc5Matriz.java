package arraysBidimensionales;

public class Ejerc5Matriz {

	public static void main(String[] args) {
		int matriz[][]= new int [30][5];
		int Alumnos;
		int Notas;

		for (int i=0; i<matriz.length;i++ ){
			for(int j=0;j<matriz[i].length;j++){
			matriz[i][j]=(int)(Math.random() * 9 +1) ;
			//matriz[i][j]=i+j; ESto solo sumaria posiciones
				
				
			}
			
		}
		
		


		//solo imprime
		int max,cont=0,media=0;
		
		max=Integer.MIN_VALUE;
		
		for (int i=0; i<matriz.length;i++ )
		{
		System.out.println();
			for(int j=0;j<matriz[i].length;j++){
				System.out.print(matriz[i][j]+" ");
					if (matriz[i][j]>max) 
					{
						max= matriz[i][j];
					}
					matriz[i][j]=;
					
		}
		}
				System.out.println(" \nLa nota maxima es "+max+ " y la media es "+cont);
		
	
		
	}
	}


