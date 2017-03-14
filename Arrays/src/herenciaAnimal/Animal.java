package herenciaAnimal;

import Simples.LeerTeclado;

public class Animal {
	//1)	Animal, que contiene los siguientes atributos: Nombre común, nombre específico, peso y tamaño.
	private String nombreComun;
	private String nombreEspecifico;
	private double peso;
	private double tamaño;
	public Animal() {
		System.out.println("Escribe nombre común");
		nombreComun=LeerTeclado.readString();
		System.out.println("Escribe nombre especifico");
		nombreEspecifico=LeerTeclado.readString();
		System.out.println("Escribe peso");
		peso=LeerTeclado.readDouble();
		System.out.println("Escribe tamaño");
		tamaño=LeerTeclado.readDouble();
	}
	public Animal(String nombreComun, String nombreEspecifico, double peso,
			double tamaño) {
		
		this.nombreComun = nombreComun;
		this.nombreEspecifico = nombreEspecifico;
		this.peso = peso;
		this.tamaño = tamaño;
	}

	public String getNombreComun() {
		return nombreComun;
	}
	
	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}
	public String getNombreEspecifico() {
		return nombreEspecifico;
	}
	public void setNombreEspecifico(String nombreEspecifico) {
		this.nombreEspecifico = nombreEspecifico;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getTamaño() {
		return tamaño;
	}
	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}
	@Override
	public String toString() {
		return "Animal [nombreComun=" + nombreComun + ", nombreEspecifico="
				+ nombreEspecifico + ", peso=" + peso + ", tamaño=" + tamaño
				+ "]";
	}
	
	
}
