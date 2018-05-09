package matrices2812;

public class filasColumnas {

	public static void main(String[] args) {
		int Posicion[][] = new int [2][3];

		Posicion[0][0] = 100;
		Posicion[0][1] = 200;
		Posicion[0][2] = 300;

		Posicion[1][0] = 400;
		Posicion[1][1] = 500;
		Posicion[1][2] = 600;

		for (int filas = 0; filas < Posicion.length; filas++) {

		   for (int columnas = 0; columnas < Posicion[filas].length; columnas++) {

		       System.out.print(Posicion[filas][columnas] + " ");

		   }

		   System.out.println();
		}
	}

}
