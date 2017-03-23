package herenciaViviendas;

public class TestViviendas {

	public static void main(String[] args) {
		
		//crear 1 vivienda 2 chalests un palacio
		
		Vivienda casa = new Vivienda(4,455,"perro",34);
		Chalet casona = new Chalet(12,45550,"toro",55,99999,true);
		Chalet caseron = new Chalet(12,45550,"girafa",55,99999,false);
		Palacio palace = new Palacio(10,300000000,"millonario",99,true);//observar el numero de habitaciones para que aqui no lo pida
		Vivienda[] arrayViviendas = {casa,casona,caseron,palace};
		listarViviendas(arrayViviendas);
		contarViviendas(arrayViviendas);
	
	}

	private static void listarViviendas(Vivienda[] arrayViviendas) {
		for  (int i=0; i<arrayViviendas.length; i++)
			  System.out.println(arrayViviendas[i]);
		
	}

	private static void contarViviendas(Vivienda[] arrayViviendas) {
		int cont=0;
		for  (int i=0; i<arrayViviendas.length; i++){
			if (arrayViviendas[i].getClass().getName().equalsIgnoreCase(Chalet.class.getName())){
		// el nombre de la clase  del arrayViviendas  es igual al         nombre de la clase chalet
				cont++;
			}
			}
			  System.out.println("El numero de chalets es "+cont);
	}


	
	
	
}
