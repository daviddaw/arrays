package matrices2812;
/**
 * 5.	Cargar una tabla de 30x5 en memoria con las notas de 30 alumnos en 5 asignaturas.
	Calcular y mostrar: nota máxima, nota media, media por alumno y media por asignatura. 
 * @author David Palanco
 *
 */
public class Matriz05 {
	
	

	public static void main(String[] args) {
		int[][] tabla=new int [30][5 ];
		int maxima,minima, acumuladoAlumno,mediaAsignatura;
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j]=(int)(Math.random()*9);
				
			}
		}
		
		System.out.println("    ");
		System.out.println(" 	    Sistemas   Programacion    Marcas       Bases      Entornos");
		for (int i = 0; i < tabla.length; i++) {//inicia      en 0 generando nueve huecos
			System.out.println(" ");
			  System.out.print("Alumno "+i+" ");
			for (int j = 0; j < tabla[i].length; j++) {
				
				System.out.print("      "+tabla[i][j]+"      ");
				
			}
			
			
			
		}
		maxima = Integer.MIN_VALUE;
		acumuladoAlumno=0;
		minima = Integer.MAX_VALUE;
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				//Nota Maxima

				if (tabla[i][j]>maxima) {
					maxima=tabla[i][j];
				}
				if (tabla[i][j]<minima) {
					minima=tabla[i][j];
				}
				
				System.out.println();acumuladoAlumno=acumuladoAlumno+tabla[0][j];
				System.out.println(acumuladoAlumno);
				

			}
			
		}
		System.out.println(" ");
		System.out.println(maxima+" maxima");
		System.out.println(minima+" minima");
		System.out.println(acumuladoAlumno/30+" acumuladoAlumno");
		visualizarMatrices(tabla);
		
		
	}
	
	public static void visualizarMatrices(int[][] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j]+" ");
			}
		}
	}


}
