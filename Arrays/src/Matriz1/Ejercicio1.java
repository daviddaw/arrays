package Matriz1;

public class Ejercicio1 {

	public static void main(String[] args) {
//		suma de fila más la columna.
		
		int suma[][]=new int[5][5];
		
		for(int i=0;i<suma.length;i++){
			for(int j=0;j<suma[i].length;j++){
				suma[i][j]=i+j;
				System.out.print(suma[i][j]);
				if (j==suma[j].length-1){
					System.out.println("");
				}
				
			}
		}
	}

}
