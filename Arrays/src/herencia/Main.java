package herencia;

import Simples.LeerTeclado;

public class Main {

	

	public static void main(String[] args) {
		

		
		System.out.println("Introduce una rana");
		Animal rana = new Animal();
		System.out.println(rana.toString());

		System.out.println("Inroduce un ballena");
		Mamifero ballena = new Mamifero();
		System.out.println(ballena.toString());

		System.out.println("Introduce un perro");
		Mamifero perro = new MamiferoTerrestre();
		System.out.println(perro.toString());

		System.out.println("Introduce una avestruz");
		Ave avestruz = new Ave();
		System.out.println(avestruz.toString());

		System.out.println("Introduce una paloma");
		Ave paloma = new Ave();
		System.out.println(paloma.toString());	
	
	}





}
