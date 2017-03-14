package herenciaAnimal;

import Simples.LeerTeclado;

public class Animal {
	//1)	Animal, que contiene los siguientes atributos: Nombre com�n, nombre espec�fico, peso y tama�o.
	private String nombreComun;
	private String nombreEspecifico;
	private double peso;
	private double tama�o;
	public Animal() {
		System.out.println("Escribe nombre com�n");
		nombreComun=LeerTeclado.readString();
		System.out.println("Escribe nombre especifico");
		nombreEspecifico=LeerTeclado.readString();
		System.out.println("Escribe peso");
		peso=LeerTeclado.readDouble();
		System.out.println("Escribe tama�o");
		tama�o=LeerTeclado.readDouble();
	}
	public Animal(String nombreComun, String nombreEspecifico, double peso,
			double tama�o) {
		
		this.nombreComun = nombreComun;
		this.nombreEspecifico = nombreEspecifico;
		this.peso = peso;
		this.tama�o = tama�o;
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
	public double getTama�o() {
		return tama�o;
	}
	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}
	@Override
	public String toString() {
		return "Animal [nombreComun=" + nombreComun + ", nombreEspecifico="
				+ nombreEspecifico + ", peso=" + peso + ", tama�o=" + tama�o
				+ "]";
	}
	
	
}
