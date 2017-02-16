package arraysObjetos.ejercicio1;

public class MainAlumno {
	public static void main(String[] args) {
		Alumno[] arrayAlumnos = new Alumno[30];
		rellenarAlumnos(arrayAlumnos);
		//Menu
		int opcion;
		System.out.println("Introduce una opcion");
		do {
			System.out.println("1 Buscar un alumno");
			System.out.println("2 mostrar Aprobados y suspensos");
			System.out.println("3 Ordenar Alfabeticamente");
			System.out.println("4 Salir");
			opcion=LeerTeclado.readInteger();
		} while ((opcion<1)||(opcion>4));
		
		visualizar(arrayAlumnos);
		buscarNombre(arrayAlumnos);
		ordenarAlfabeticamente(arrayAlumnos);

	}
	static void rellenarAlumnos(Alumno[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i < 9) {
				array[i] = new Alumno("Alumno" + 0 + (i + 1),
						Math.random() * 10 + 0);
			} else {
				array[i] = new Alumno("Alumno" + (i + 1),
						Math.random() * 10 + 0);
				// dos for
			}

		}
	}
	

	private static void ordenarAlfabeticamente(Alumno[] arrayAlumnos) {
		
		
	}

	private static void buscarNombre(Alumno[] buscarNombres) {
		String nombre;
		System.out.println("Escribe el nombre que quieres buscar:");
		nombre=LeerTeclado.readString();
		for (int i = 0; i < buscarNombres.length; i++) {
			if(buscarNombres[i].getNombre().equalsIgnoreCase(nombre)) {
				System.out.println(buscarNombres[i].toString());
			}
			
		}
		
	}


		


	static void visualizar(Alumno[] arrayAlumno) {
		for (int i = 0; i < arrayAlumno.length; i++) {
			System.out.println(arrayAlumno[i].toString());
			if (arrayAlumno[i].getNota() < 5) {
				System.out.println("Suspendido");
			} else {
				System.out.println("aprobado");
			}
			System.out.println();

		}

	}
}