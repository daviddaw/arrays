package herenciaViviendas;

public class TestViviendas {

	public static void main(String[] args) {
		
		//crear 1 vivienda 2 chalests un palacio
		
		Vivienda casa = new Vivienda(4,455,"perro",34);
		
		Chalet casona = new Chalet(12,45550,"toro",55,99999,true);
		Chalet caseron = new Chalet(12,45550,"girafa",55,99999,false);
		Palacio palace = new Palacio(10,300000000,"millonario",99,true);//observar el numero de habitaciones para que aqui no lo pida
		
		crearViviendas(casa,casona,caseron,palace);
		

	}

	private static void crearViviendas(Vivienda casa, Chalet casona, Chalet caseron, Palacio palace) {
		
		
	}

}
