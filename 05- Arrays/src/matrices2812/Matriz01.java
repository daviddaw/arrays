package matrices2812;
/**
 * 1.	Crear una tabla suma de 5x5 cargando la tabla de tal forma que cada elemento contenga la suma
 * 		 de número de fila más número de columna y luego mostrar la tabla por pantalla.
 * @author David Palanco
 *
 */
public class Matriz01 {

	public static void main(String[] args) {
		//Como creo una tabla de 5*5?
		int[][] tabla; //Reservamos memoria [filas][columnas]
		tabla=new int[5][5]; //La declaramos diciendo que tiene 5 filas y 5 columnas
		
		/*podria ser metodo*/
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				tabla[i][j]=i+j;
			}
		}
		/*fin*/
		/*inicio*/
		for (int i = 0; i < tabla.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < tabla.length; j++) {
				System.out.print(tabla[i][j]+
						" ");
			}
		}
		/*fin*/
		

	}

}
