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
		System.out.println("numero de crias");
		int numeroCrias=LeerTeclado.readInteger();
		System.out.println("Meses de embarazo");
		int mesesEmbarazo=LeerTeclado.readInteger();
		System.out.println("Escribe el numero de patas");
		int numeroPatas = LeerTeclado.readInteger();
		
		String resp;
		
		resp =LeerTeclado.readString();
		int numeroHuevos=0;
		System.out.println("Pone huevos?");
		if (resp.equalsIgnoreCase("si")){
			System.out.println("Escribe el numero de huevos");
			 numeroHuevos=LeerTeclado.readInteger();
		}
		
		System.out.println("Puede volar?");
		resp =LeerTeclado.readString();
		boolean volar;
		if (resp.equalsIgnoreCase("si")){
		 volar=true;}
		else {
		 volar=false;
		}
		
	Animal rana = new Animal(nombreComun,nombreEspecifico,peso,tamaño);
	Mamifero ballena = new Mamifero(nombreComun,nombreEspecifico,peso,tamaño,numeroCrias,mesesEmbarazo);
	Mamifero perro = new MamiferoTerrestre(nombreComun, nombreEspecifico, peso, tamaño, numeroCrias, mesesEmbarazo, numeroPatas);

	Ave avestruz = new Ave(nombreComun, nombreEspecifico, peso, tamaño, numeroHuevos, volar);
	+
	Ave paloma = new Ave(nombreComun, nombreEspecifico, peso, tamaño, numeroHuevos, volar);
	
	
	visualizarObjetos(rana,ballena,perro,avestruz,paloma);
	
	
	}

	private static void visualizarObjetos(Animal rana, Mamifero ballena,
			Mamifero perro, Ave avestruz, Ave paloma) {
		System.out.println(rana.toString());
		System.out.println(ballena.toString());
		System.out.println(perro.toString());
		System.out.println(avestruz.toString());
		System.out.println(paloma.toString());
	}



}
