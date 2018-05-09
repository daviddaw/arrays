package matrices2812;
/**
 * 4.	Cargar una matriz de 5x3, trasponerla y mostrar el resultado (la carga se puede hacer por teclado o de forma aleatoria)
 * @author David Palanco
 *
 */
public class Matriz04 {

	public static void main(String[] args) {
		int[][] tabla=new int [5][3];
		// [tabla.length]    [tabla[x].length]
		
	    
		for (int filas = 0; filas < tabla.length; filas++) {
			for (int columnas = 0; columnas < tabla[filas].length; columnas++) {
			tabla[filas][columnas]=(int)((Math.random()*9));
				
			}
		}

		System.out.println(" 5 x 3");
		for (int filas = 0; filas < tabla.length; filas++) {
			System.out.println(" ");
			for (int columnas = 0; columnas < tabla[filas].length; columnas++) {
				System.out.print(tabla[filas][columnas]+" ");
			}
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" 3 x 5");
		for (int filas = 0; filas < tabla[filas].length; filas++) {
			System.out.println(" ");
			for (int columnas = 0; columnas < tabla.length; columnas++) {
				System.out.print(tabla[columnas][filas]+" ");
			}
		}
		
		

	}

}
