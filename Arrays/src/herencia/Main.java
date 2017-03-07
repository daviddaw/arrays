package herencia;

import Simples.LeerTeclado;

public class Main {

	

	public static void main(String[] args) {
		System.out.println("Escribe nombre común");
		String nombreComun=LeerTeclado.readString();
		System.out.println("Escribe nombre especifico");
		String nombreEspecifico=LeerTeclado.readString();
		System.out.println("Escribe peso");
		double peso=LeerTeclado.readDouble();
		System.out.println("Escribe tamaño");
		double tamaño=LeerTeclado.readDouble();
	
	Animal rana = new Animal(nombreComun,nombreEspecifico,peso,tamaño);
	Mamifero ballena = new Mamifero(nombreComun,nombreEspecifico,peso,tamaño);
	}

}
