package herenciaAnimal;





public class Main {

	

	public static void main(String[] args) {
		

		
		System.out.println("Introduce una rana");
		Animal rana = new Animal();

		System.out.println("Inroduce un ballena");
		Mamifero ballena = new Mamifero();

		System.out.println("Introduce un perro");
		Mamifero perro = new MamiferoTerrestre();

		/*((MamiferoTerrestre)perro).setNumeroPatas(6);*/ //casting de hijo a padre y pedir numero pattaws

		System.out.println("Introduce una avestruz");
		Ave avestruz = new Ave();


		System.out.println("Introduce una paloma");
		Ave paloma = new Ave();

		visualizar(rana,ballena,perro,avestruz,paloma);
		
		ModificarPesoRana(rana);
		
		cambiarPesoBallena(ballena);
		
		ModificarNumeroHuevosPaloma(paloma);
		
		IncrementarTamañoPerro(perro);
		
		mesesEmabarazoBallena(ballena);
      
		/*se puede cambiar meses de embarazo de la rana???*/
		//No se pude cambiar por que la clase animal no tiene el atributo meese embarazo
		
		visualizar(rana,ballena,perro,avestruz,paloma);
		
	}





	private static void visualizar(Animal rana, Mamifero ballena, Mamifero perro, Ave avestruz, Ave paloma) {
		System.out.println(rana.toString());
		System.out.println(ballena.toString());
		System.out.println(perro.toString());
		System.out.println(avestruz.toString());
		System.out.println(paloma.toString());
	}





	private static void ModificarPesoRana(Animal rana) {
		double peso;
		System.out.println("Escribe el nuevo peso de la rana");
		peso=LeerTeclado.readDouble();
		rana.setPeso(peso);
		
	}
	

	private static void cambiarPesoBallena(Mamifero ballena) {
		
		System.out.println("Escribe el nuevo peso de la ballena");
		double peso=LeerTeclado.readDouble();
		ballena.setPeso(peso);
	}
	
	private static void ModificarNumeroHuevosPaloma(Ave paloma) {
		System.out.println("modifica el numero de huevos paloma");
		int numeroHuevos=LeerTeclado.readInteger();
		paloma.setNumeroHuevos(numeroHuevos);
		
	}


	private static void mesesEmabarazoBallena(Mamifero m) {
		System.out.println("Introduce los meses de embarazo");
		int mesesEmbarazo=LeerTeclado.readInteger();
		m.setMesesEmbarazo(mesesEmbarazo);
		
	}

	private static void IncrementarTamañoPerro(Mamifero m) {
		System.out.println("Introduce el nuevo tamaño del perro");
		int tamaño=LeerTeclado.readInteger();
		m.setTamaño(tamaño);
		
	}







	




}
