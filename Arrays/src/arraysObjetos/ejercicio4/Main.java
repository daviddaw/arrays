package arraysObjetos.ejercicio4;

import arraysObjetos.ejercicio1.LeerTeclado;



public class Main {

	public static void main(String[] args) {
		//CREAR  ARRAY CARTAS
		Carta baraja[] = new Carta[40];
		Carta palo[] = new Carta[4];
		Carta nombre[] = new Carta[40];
		Carta valor[] = new Carta[40];
		//Rellenar cartas
rellenar(baraja);
System.out.println("Saca una carta");
visualizar(baraja);
	}

	private static void rellenar(Carta[] baraja) {
		for (int i = 0; i < baraja.length; i++) {
			baraja[i]=new Carta("y","y",2);
		}
		
	}

	private static void visualizar(Carta[] baraja) {
		for (int i = 0; i < baraja.length; i++) {
			System.out.println(baraja[i].toString());
		}
		
	}
	

}
