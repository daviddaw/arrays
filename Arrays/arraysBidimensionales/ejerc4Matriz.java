package arraysBidimensionales;

public class ejerc4Matriz {

	public static void main(String[] args) {
		int mi_matriz[][]=new int[5][3];
		int[][] matrizT = new int[mi_matriz[0].length][mi_matriz.length];
		definicionMatrizAleatorio(mi_matriz);
		visualizarMatriz(mi_matriz);
		System.out.println();
		transponerMatriz(mi_matriz, matrizT);
		visualizarMatriz(matrizT);
		
		

	}
	public static void definicionMatrizAleatorio (int[][] array){
		for (int i = 0; i < array.length; i++) {
			//System.out.println("fila");
			for (int j = 0; j < array[i].length; j++) {
				array[i][j]=(int)(Math.random()*9+1);
			}
		}
	}
	public static void visualizarMatriz(int[][] matriz){
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(" "+matriz[i][j]+" ");
			}
		}
	}
	
	public static void transponerMatriz(int [][] matriz,int [][] matrizt){
		for (int i=0; i < matriz.length; i++) {
			  for (int j=0; j < matriz[i].length; j++) {
				  matrizt[j][i]=matriz[i][j];
			  }
			}
		}
	}

