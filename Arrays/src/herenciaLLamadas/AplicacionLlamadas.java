package herenciaLLamadas;

public class AplicacionLlamadas {
	//Porque aqui no va?
	public static void main(String[] args) {
		Centralita miCentralita= new Centralita();
		Llamadas primeraLlamada =new LlamadasLocales(91, 91, 30);
	    Llamadas segundaLlamada =new LlamadasProvinciales(90, 92,1, 1);
	    Llamadas terceraLlamada =new LlamadasLocales(91, 91, 20);
	    Llamadas  cuartaLlamada =new LlamadasProvinciales(91, 93, 3, 3);
	    
		miCentralita.informeLLamadas();
		

	}

}
