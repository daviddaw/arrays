package fer_Matriz;

public class Ejercicio4 {

	public static void main(String[] args) {
//		transponer una matriz de 5x3.
		
		int [][] matriz=new int [5][3];
		
		
		
		carga(matriz);
		visualizarMatriz(matriz);
		System.out.println("");
		trasponer(matriz);
	}

	
	
	public static void carga(int matriz [][]){
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				matriz[i][j]=(int)(Math.random()*9+1);
				
			}
			
		}
	}
	
	
	public static void visualizarMatriz(int [][] a){
		for ( int i=0; i<a.length; i++){
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}
	
	public static void trasponer(int m[][]){
			
		for ( int i=0; i<m[0].length; i++){
			for (int j = 0; j < m.length; j++) {
			
				System.out.print(m[j][i]+" ");
			}
			System.out.println(" ");
		}
	
		
		
	}
	
	
}
