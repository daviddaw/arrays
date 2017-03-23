package herenciaVehiculos;

import ejercicios_Strings.LeerTeclado;

public class Main {
    Vehiculo[] arrayVehiculos;
	public static void main(String[] args) {
		Vehiculo moto  = new Vehiculo("vespino", "3498-plp", 2, 100);
		Coche  deportivo = new Coche("ferrari", "8909-jvl", 50, 300, "amarillo", 3, true);
		Camion camion2 = new Camion("Pegaso", "2343-PM", 8, 5000, 45678, 567, "Pedro");
		Camion camion1 = new Camion("Renault", "1111-PPP", 6, 567777, 3500, 3000, "Antonio");
		
	    System.out.println(moto.toString());
	    System.out.println(deportivo.toString());
	    System.out.println(camion1.toString());
	    System.out.println(camion2.toString());
	    
		System.out.println("De que color quieres pintar el coche");
		String nuevoColor=LeerTeclado.readString();
	    deportivo.pintarCoche(nuevoColor);
	    
	    System.out.println("Cuantos kgs quieres cargar el camion 1");
	    int carga=LeerTeclado.readInteger();
		camion1.cargar(carga);
		
	    System.out.println("Cuantos kgs quieres descargar el camion");
	    int descarga=LeerTeclado.readInteger();
	    
	    System.out.println("Cargamos 50kg al camion 2");
	    carga=50;
		camion2.cargar(carga);
		
		System.out.println();
		
		System.out.println("Descargamos 40kg del camion 2");
		descarga=40;
		camion2.descargar(descarga);
		
		System.out.println();
		
		System.out.println();
		
		System.out.println("Cambiamos el coductor 1 por David");
		String conductor="David";
		camion1.cambiarConductor(conductor);
	    
		camion1.descargar(descarga);
	    System.out.println(moto.toString());
	    System.out.println(deportivo.toString());
	    System.out.println(camion1.toString());
	    System.out.println(camion2.toString());
	}

}
