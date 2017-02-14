package arraysObjetos.ejercicio1;

public class Principal {

	public static void main(String[] args) {
		Alumno[] arrayAlumnos = new Alumno[3];
		rellenarAlumnos(arrayAlumnos);
		visualizar(arrayAlumnos);
		ordenar(arrayAlumnos);
		// visualizar el array ordenado por nombre
		visualizar(arrayAlumnos);
	}

	public static void rellenarAlumnos(Alumno[] arrAlumnos) {
		for (int i = 0; i < arrAlumnos.length; i++) {
			// arrAlumnos[i]=new Alumnos("alumno"+(i+1),Math.random()*10+0 );
			arrAlumnos[i] = new Alumno(LeerTeclado.readString(),
					LeerTeclado.readDouble());

		}

	}

	public static void visualizar(Alumno[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i].toString());
		}

	}

	static void ordenar(Alumno[] array) {
		Alumno aux;
		for (int i = 0; i < array.length-1; i++) {
			
			System.out.println("lo que vale  i " +i);
			for (int j = i + 1; j < array.length; j++) {
				System.out.println("lo que vale  j " +j);
				/*
				 * para comparar String se usan el método compareTo() que
				 * devuelve 0 si son iguales, -1 si es menor o 1 si es mayor
				 */
				System.out.println(array[i].getNombre().compareTo(array[j].getNombre()));
				if (array[i].getNombre().compareTo(array[j].getNombre()) > 0) {
					
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}

			}

			
			
			
			
		}
	}

}
