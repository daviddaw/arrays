package herencia;

import Simples.LeerTeclado;

public class Main {

	

	public static void main(String[] args) {
		System.out.println("Escribe nombre com�n");
		String nombreComun=LeerTeclado.readString();
		System.out.println("Escribe nombre especifico");
		String nombreEspecifico=LeerTeclado.readString();
		System.out.println("Escribe peso");
		double peso=LeerTeclado.readDouble();
		System.out.println("Escribe tama�o");
		double tama�o=LeerTeclado.readDouble();
	
	Animal rana = new Animal(nombreComun,nombreEspecifico,peso,tama�o);
	Mamifero ballena = new Mamifero(nombreComun,nombreEspecifico,peso,tama�o);
	}

}
