package matrices;
/*
 * 2.	Crear una tabla de 5x5 y nombre diagonal que contenga 1 en los elementos de la diagonal y 0 en el resto 
 * y luego mostrarla por pantalla.
 */
public class Matriz02 {

	public static void main(String[] args) {
		int diagonal[][]=new int [5][5];
		
		
		for (int i = 0; i < diagonal.length; i++) {
			for (int j = 0; j < diagonal.length; j++) {
				if (i==j) {
					diagonal[i][j]=1;
				}
				else {
					diagonal[i][j]=0;
				}
			}
		}
		
		for (int i = 0; i < diagonal.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < diagonal.length; j++) {
				System.out.print(diagonal[i][j]+" ");
				
			}
		}

		
		
		
	}
	

}
