package arraysClases.ejercicio6Completo;

import arrays.LeerTeclado;


public class BlackJack {

	public static void main(String[] args) {
		double puntJug;
		String respuesta;
			
		do {
			Carta.inicializarMatriz();	
			//inicializamos la matriz de cartas obtenidas a false porque empieza el juego
						
			puntJug=juegaJugador();

			if (puntJug<=17)			
				juegaOrdenador(puntJug);
			
			do{
				System.out.println();
				System.out.println("¿Deseas jugar de nuevo(s/n)?");
				respuesta=LeerTeclado.readString();
				System.out.println();
			}
			while (!respuesta.equalsIgnoreCase("s")&&!respuesta.equalsIgnoreCase("n"));

		}
		while (respuesta.equalsIgnoreCase("s"));

		System.out.println("Fin del programa, adiós...");
	}
	
	public static double juegaJugador(){ 
		//método que hace que juegue el jugador y devuelve la puntuación obtenida
		double puntJug=0; 
		String continuar="";
		System.out.println("Comienza el juego, sacando una carta al azar...");

		do { 
			//bucle que va generando cartas mientras que el jugador quiera o no se pase de 17
			Carta carta=new Carta ();
			System.out.println();
			System.out.println(carta.toString());
			
			puntJug+=carta.getValor(); //sumamos el valor de la carta a la puntuación del jugador
			System.out.println("Llevas acumulados "+puntJug);
			System.out.println();
			if (puntJug>17)
				System.out.println("¡¡Lo siento, te has pasado!!");
			else 
				if (puntJug==17){
					System.out.println("¡¡Has hecho la puntuación máxima!!");
					System.out.println();
				}			
				else 
				{
					do{
						System.out.println("¿Deseas otra carta(s/n)?");
						continuar=LeerTeclado.readString();
					}
					while (!continuar.equalsIgnoreCase("s")&&!continuar.equalsIgnoreCase("n"));

			}
		}
		while (puntJug<17 && continuar.equalsIgnoreCase("s"));
		
		return puntJug;

	}

	public static void juegaOrdenador (double puntosJugador){
		//método que genera cartas por el ordenador hasta que gana a la puntuación del jugador o se pasa
		double puntosAcumulados=0;
		Carta carta;
		System.out.println();
		System.out.println("Ahora juega el ordenador");	
		System.out.println();
		do{
			carta=new Carta();
			System.out.println(carta.toString());
			puntosAcumulados+=carta.getValor();
			System.out.println("El ordenador lleva acumulado: "+puntosAcumulados);
			System.out.println();
		}
		
		while (puntosAcumulados<17 && puntosAcumulados<puntosJugador);
		
		if (puntosAcumulados>17){
			System.out.println("El ordenador se ha pasado");
			System.out.println("¡¡Enhorabuena, has ganado!!");
		}
			
		else if (puntosAcumulados>=puntosJugador)
			System.out.println("¡¡Lo siento!! Gana el ordenador con "+puntosAcumulados+" puntos");
	}

}


