package matrices;
/**
 * 5.	Cargar una tabla de 30x5 en memoria con las notas de 30 alumnos en 5 asignaturas.
 *  Calcular y mostrar: nota máxima, nota media, media por alumno y media por asignatura. 
 * @author David Palanco
 *
 */
public class Matriz05 {

	public static void main(String[] args) {
		int tabla[][]=new int [30][5];
		
		
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j]=(int) (Math.random()*10+1);
			}
		}
		
		for (int i = 0; i < tabla.length; i++) {
			System.out.println(" ");
			System.out.print("alumno "+(i+1)+"    ");
			if (i<9) {
				System.out.print(" ");
			}
			for (int j = 0; j < tabla[i].length; j++) {
				
				if (tabla[i][j]<10) {
					
					System.out.print(" ");	
				}
				
				System.out.print(tabla[i][j]+"   ");
			}
			
		}
		filasAlumnos(tabla);
		columnasAsinaturas(tabla);
	}

	public static void filasAlumnos(int [][] a){
		int max, min; 
		double media=0, suma;
		
		for ( int i=0; i<a.length; i++){
			suma=0;
			max=Integer.MIN_VALUE;
			min=Integer.MAX_VALUE;
			for (int j = 0; j < a[0].length; j++) {
				suma+=a[i][j];
				
				if (a[i][j]>max)
					max=a[i][j];
					
				
				if (a[i][j]<min)
					min=a[i][j];
					
			}
			media=suma/5;
			System.out.println();
			System.out.println("Alumno "+(i+1)+" Max:"+max+" Min:"+min+" Media:"+media);
		}
		
		
		
	}
	
	public static void columnasAsinaturas(int [][] a){
		double suma, media=0;
		
		for (int j = 0; j < a[0].length; j++) {
			suma=0;
			for ( int i=0; i<a.length; i++){
				suma+=a[i][j];
									
			}
			media=suma/30;
			System.out.println("Asignatura "+(j+1)+" Media:"+media);
		}
}
}
