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
			switch (opcion) {
			case 1:
				buscarNombre(arrayAlumnos);;;
				break;
			case 2:
				aprobadosuspenso(arrayAlumnos);
				break;
			case 3:
					ordenarAlfabeticamente(arrayAlumnos);
					visualizar(arrayAlumnos);
				break;
			case 4:

				break;

			default:
				break;
			}
		} while ((opcion<1)||(opcion>4));
		
	
		
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
				
			}

		}
		array[00]=new Alumno("Alberto",Math.random() * 10 + 0);
		array[17]=new Alumno("Raul",Math.random() * 10 + 0);
		array[29]=new Alumno("Miguel",Math.random() * 10 + 0);
		
	}
	
	static void aprobadosuspenso(Alumno[] arrayAlumno) {
		int cAprobado=0;
		int cSuspenso=0;
		int media=0;
		for (int i = 0; i < arrayAlumno.length; i++) {
			
			if (arrayAlumno[i].getNota() < 5) {
				System.out.println(arrayAlumno[i].toString()+"Suspendido");
				cSuspenso++;
			} 
			else {
				System.out.println(arrayAlumno[i].toString()+"aprobado");
				cAprobado++;
			}
		}
		System.out.println("Hay "+cAprobado+" aprobados y "+cSuspenso+" suspensos, la media de la clase es "+media+".");
	}
	private static void ordenarAlfabeticamente(Alumno[] array) {
		Alumno aux;
		for (int i = 0; i < array.length-1; i++) {
			
			
			for (int j = i + 1; j < array.length; j++) {
				
				/*
				 * para comparar String se usan el método compareTo() que
				 * devuelve 0 si son iguales, -1 si es menor o 1 si es mayor
				 */
				
				if (array[i].getNombre().compareTo(array[j].getNombre()) > 0) {
					
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}

			}

			
			
			
			
		}
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
	public static void visualizar(Alumno[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i].toString());
		}

	}

		



}