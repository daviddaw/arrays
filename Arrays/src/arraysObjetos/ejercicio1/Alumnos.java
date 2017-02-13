package arraysObjetos.ejercicio1;

public class Alumnos {
private String nombre ;
private double nota ;
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
public Alumnos(String nombre, double nota) {
	this.nombre = nombre;
	this.nota = nota;
}
public Alumnos() {
	
}
@Override
public String toString() {
	return "Alumnos [nombre=" + nombre + ", nota=" + nota + "]";
}


}
