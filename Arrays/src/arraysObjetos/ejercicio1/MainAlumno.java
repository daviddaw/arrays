package arraysObjetos.ejercicio1;

public class MainAlumno {
public static void main(String[] args) {
	Alumno [] arrayAlumnos=new Alumno[30];
	rellenarAlumnos(arrayAlumnos);
	visualizar(arrayAlumnos);
	
}




static void rellenarAlumnos(Alumno[] array){
	for (int i = 0; i < array.length; i++) {
		if (i<9) {
			array[i]=new Alumno("Alumno"+0+(i+1),55);
			System.out.println();
			
		}
		else {
			array[i]=new Alumno("Alumno"+(i+1),67);
			//dos for
		}
		
	}
}
	
public static void visualizar(Alumno[] x) {
	for (int i = 0; i < x.length; i++) {
		System.out.println(x[i].toString());
	}

}
	

static void aprobadoSuspenso(Alumno[] array){

for (int i = 0; i < array.length; i++) {
	
}	


}

}