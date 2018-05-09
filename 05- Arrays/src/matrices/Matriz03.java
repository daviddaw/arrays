package matrices;
/**
 * 3.	Cargar una tabla de 10x10 con enteros entre 1 y 9 de forma aleatoria.
 *  Sumar filas y sumar columnas visualizando los  resultados por pantalla.
 * @author David Palanco
 *
 */
public class Matriz03 {

	public static void main(String[] args) {
		int enteros[][]=new int[10][10];
		
		for (int i = 0; i < enteros.length; i++) {
			for (int j = 0; j < enteros.length; j++) {
				enteros[i][j]=(int)(Math.random()*9+1);
			}
		}
		for (int i = 0; i < enteros.length; i++) {
			System.out.println("     ");
			for (int j = 0; j < enteros.length; j++) {
				System.out.print(enteros[i][j]+"     ");
			}
		}

	}

}
