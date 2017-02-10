package Matriz1;

public class Ejercicio3 {

	public static void main(String[] args) {
//		sumar filas y sumar columnas de la tabla.
		
		int[][] tabla=new int [10][10];
		
		for(int i=0;i<tabla.length;i++){
			for(int j=0;j<tabla[i].length;j++){
				tabla[i][j]=(int)(Math.random()*9+1);
				System.out.print(tabla[i][j]+" ");
			}
			System.out.println("");
		}
		
		int suma=0;
		for(int i=0;i<tabla.length;i++){
			for(int j=0;j<tabla[i].length;j++){
				suma+=tabla[j][i];
				System.out.print(suma+" ");
				if (j==tabla.length-1){
					tabla[j][i]=suma;
					
				}
				else
					suma+=tabla[j][i];
				
			}
			System.out.println("");	
		}

	}

}
