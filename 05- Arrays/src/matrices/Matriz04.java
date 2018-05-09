package matrices;
/*
 * 4.	Cargar una matriz de 5x3, trasponerla y mostrar el resultado 
 * (la carga se puede hacer por teclado o de forma aleatoria)*/
public class Matriz04 {

	public static void main(String[] args) {
		int matriz[][]=new int [5][3];
		
		for (int i = 0; i < matriz.length; i++) {//el numero de filas 3
			for (int j = 0; j < matriz[i].length; j++) {//el tamaño de la columna de la fila que idique la i, todas son de 5
				matriz[i][j]=(int) (Math.random()*9+1);
			}
		}
		int j = 0,i = 0;
		for ( i = 0; i < matriz.length; i++) {
			System.out.println(" ");
			
			for ( j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}		
		}
		System.out.println();System.out.println();
		System.out.println("Hay "+matriz.length+" filas y "+j+" columnas");
		System.out.println("Trasponemos la matriz. ");
		
		for ( i = 0; i < matriz[i].length; i++) {
			System.out.println(" ");
			
			for ( j = 0; j < matriz.length; j++) {			
				System.out.print(matriz[j][i]+" ");
			}
			
		}
		System.out.println();
		System.out.println();
		System.out.println("Ahora hay "+matriz[i].length+" filas y "+j+" columnas");
		

	}

}
