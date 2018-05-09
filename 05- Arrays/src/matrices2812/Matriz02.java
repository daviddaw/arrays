package matrices2812;
/**
 * 2.	Crear una tabla de 5x5 y nombre diagonal que contenga 1 en los elementos de la diagonal 
 * y 0 en el resto y luego mostrarla por pantalla.
 * @author David Palanco
 *
 */
public class Matriz02 {

	public static void main(String[] args) {
		//Creo tabla de 5Fx5C en un paso
		int[][] tabla =new int[5][5];
		
		/*rellenar con 1 diagonal y con ceros el resto*/
		for (int i = 0; i < tabla.length; i++) {//filas
			for (int j = 0; j < tabla.length; j++) {//columnas
				if (i==j) {
					tabla[i][j]=1;
				} else {
					tabla[i][j]=0;
				}			
			}
		}
		/*fin*/
		
		/*inicio visualizar*/
		for (int i = 0; i < tabla.length; i++) {
			System.out.println(" "); 
			for (int j = 0; j < tabla.length; j++) {
				System.out.print(tabla[i][j]+" ");
			}
		}

	}

}
