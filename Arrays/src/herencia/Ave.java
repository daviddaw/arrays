package herencia;

public class Ave extends Animal{
private int numeroHuevos;
private boolean volar;

public Ave() {
	super();
}

public Ave(int numeroHuevos, boolean volar) {
	super();
	this.numeroHuevos = numeroHuevos;
	this.volar = volar;
}

public Ave(String nombreComun, String nombreEspecifico, double peso,
		double tamaño) {
	super(nombreComun, nombreEspecifico, peso, tamaño);
	// TODO Auto-generated constructor stub
}

public int getNumeroHuevos() {
	return numeroHuevos;
}

public void setNumeroHuevos(int numeroHuevos) {
	this.numeroHuevos = numeroHuevos;
}

public boolean isVolar() {
	return volar;
}

public void setVolar(boolean volar) {
	this.volar = volar;
}

@Override
public String toString() {
	return "Ave [numeroHuevos=" + numeroHuevos + ", volar=" + volar + "]";
}



}
