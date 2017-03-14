package herenciaAnimal;

import Simples.LeerTeclado;

public class Ave extends Animal{
private int numeroHuevos;
private boolean volar;

public Ave() {
	super();
	numeroHuevos=0;
	System.out.println("Pone huevos?");
	String resp = LeerTeclado.readString();
	if (resp.equalsIgnoreCase("si")) {
		System.out.println("Escribe el numero de huevos");
		numeroHuevos = LeerTeclado.readInteger();
	}
		System.out.println("Puede volar?");
		resp = LeerTeclado.readString();
		
		if (resp.compareToIgnoreCase("si")==0) {
			volar = true;
		} else {
			volar = false;
		}
	
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
