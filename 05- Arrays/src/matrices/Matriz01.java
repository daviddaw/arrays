package matrices;
/*
 * 1.	Crear una tabla suma de 5x5 cargando la tabla de tal forma que cada elemento contenga 
 * la suma de n�mero de fila m�s n�mero de columna y luego mostrar la tabla por pantalla.
 */
public class Matriz01 {

	public static void main(String[] args) {
		// int matriz[5][5];   mal
		int matriz [] []=new int[5][5];//bien
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j]=i+j;
			}
				
		
		}
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]+" ");
				
			}
				
		
		}
	}
	
	
	
}
