package fer_Matriz;
public class Ejercicio5 {

	
	public static void main(String[] args) {
		
//		Nota maxima,minima y media de los alumnos y la media de las asignaturas.
		
		int [][] array1=new int [30] [5];
		
		rellenarMatriz(array1);
		visualizarMatriz(array1);
		operacionesFila(array1);
		System.out.println();
		operacionesColumna(array1);

	}

	public static void rellenarMatriz(int [][] a){
		for ( int i=0; i<a.length; i++){
			for (int j = 0; j < a[0].length; j++) {
				a[i][j]=(int)(Math.random() * 9 +1);
			}
		}
		
	}
	
	public static void visualizarMatriz(int [][] a){
		for ( int i=0; i<a.length; i++){
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(" "+a[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}
		
	public static void operacionesFila(int [][] a){
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
			System.out.println("Alumno "+(i+1)+" Maximo:"+max+" Minimo:"+min+" Media:"+media);
		}
		
		
		
	}
	
	public static void operacionesColumna(int [][] a){
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
