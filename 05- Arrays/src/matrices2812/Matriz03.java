package matrices2812;
/**
 * 3. Cargar una tabla de 10x10 con enteros entre 1 y 9 de forma aleatoria.
 * 	  Sumar filas y sumar columnas visualizando los  resultados por pantalla.
 * @author David Palanco
 *
 */
public class Matriz03 {

	public static void main(String[] args) {
		int[][] tabla= new int[10][10];
		
		
		/*Rellenar Matriz con Math.random*/
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				tabla[i][j]=(int) (Math.random() * 9) + 1;
				                //(Math.random() * imprime 9 numeros seguidos) + empezando por el 1;
			}
		}
		/*fin */
		/*visualizar*/
		for (int i = 0; i < tabla.length; i++) {
			System.out.print("\n");
			//System.out.println(" ");
			for (int j = 0; j < tabla.length; j++) {
				System.out.print(tabla[i][j]+" ");
				
			}
			
		}
	
		

	}

}
