package arraysBidimensionales;

public class ejerc3Matriz {


		public static void main(String[] args) {
			
			int matriz[][]= new int [10][10];
			
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
			
		}

	

}
