package arraysObjetos.ejercicio1;

public class main {

	public static void main(String[] args) {
		double nota;
		String nombre;
		
		
            Alumno arrayAlumnos[] =new Alumno[3];
		   arrayAlumnos[0]=new Alumno("Pedro",6);
		   arrayAlumnos[1]=new Alumno("Pepe",8);
		   arrayAlumnos[2]=new Alumno("Juan",4);
		   
		   visualizar(arrayAlumnos);
		   buscar(arrayAlumnos);
		   
	}
	
	public  static void visualizar(Alumno[] array ){
		double nota;
		String nombre;
		for (int i = 0; i < array.length; i++) {
			nombre=array[i].getNombre();
			nota=array[i].getNota();
			System.out.println(""+nombre);
			if (nota>4.9) {
				System.out.println(" aprobado");
			}
			else {
				System.out.println("suspendido");
			}
			
			
		}
		
	}
	public static void buscar (Alumno[] buscarnombre){
		String nombre;
		
		nombre=LeerTeclado.readString();
		for (int i = 0; i < buscarnombre.length; i++) {
			if (buscarnombre[i].getNombre().equalsIgnoreCase(nombre)) {
			System.out.println(buscarnombre[i].getNombre()+" "+buscarnombre[i].getNota());	
			}
			
		}
	}
}
