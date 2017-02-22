package arraysClases.ejercicio2;

public class Alumno {

	private String nombre;
	private double nota;
	
	public Alumno (String nombre, double nota){
		this.nombre=nombre;
		this.nota=nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String toString() {
		return "Nombre=" + nombre + ", Nota=" + nota;
	}
	
	
	
}
