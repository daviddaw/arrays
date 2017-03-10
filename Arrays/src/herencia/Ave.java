package herencia;

public class Ave extends Animal{
private int numeroHuevos;
private boolean volar;

public Ave() {
	super();
}



public Ave(String nombreComun, String nombreEspecifico, double peso,
		double tamaño, int numeroHuevos, boolean volar) {
	super(nombreComun, nombreEspecifico, peso, tamaño);
	this.numeroHuevos = numeroHuevos;
	this.volar = volar;
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
	return super.toString()+"Ave [numeroHuevos=" + numeroHuevos + ", volar=" + volar + "]";
}



}
