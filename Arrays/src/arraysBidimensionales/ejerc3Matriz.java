package arraysBidimensionales;

public class ejerc3Matriz {


		public static void main(String[] args) {
			
			int matriz[][]= new int [2][2];
			int sumFilas;
			int sumColumnas;
			
			for (int i=0; i<matriz.length;i++ ){
				for(int j=0;j<matriz[i].length;j++){
				matriz[i][j]=(int)(Math.random() * 9 +1) ;
				//matriz[i][j]=i+j; ESto solo sumaria posiciones
					
					
				}
				
			}
			
			for (int i=0; i<matriz.length;i++ ){
				System.out.println();//fijarse
				for(int j=0;j<matriz[i].length;j++){
					System.out.print(matriz[i][j]+" ");
				}
			}
			System.out.println("");
			//Suma columnas  
			System.out.println("");
			for (int i = 0; i < matriz[0].length; i++) {  
				 sumColumnas=0;  
				 for (int j = 0; j < matriz.length; j++) {  
				      sumColumnas=sumColumnas+matriz[j][i];  
			          }  
			          System.out.println("La suma de los valores de la columna "+(i+1)+" es: "+sumColumnas);  
				      }  
				      System.out.println("");
				     
		    //Suma filas  
		    for (int i = 0; i < matriz.length; i++) {  
				 sumFilas=0;  
				 for (int j = 0; j < matriz[i].length; j++) {  
				      sumFilas=sumFilas+matriz[i][j];  
				      }  
				      System.out.println("La suma de los valores de la fila "+(i+1)+" es:    "+sumFilas);  
				      }  
				      System.out.println("");	     
			
		}

	

}
