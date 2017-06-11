package herenciaLLamadas;

public class Centralita {
	 Llamadas[] arrayLlamadas;

	public Centralita() {
		  arrayLlamadas=new Llamadas[5];
	
	/*	  
	arrayLlamadas[0]= LlamadasLocales.primeraLlamada;
	*/
	}
	
	
	
	
	
	
	public  void informeLLamadas() {
	
		for (int i = 0; i < arrayLlamadas.length; i++) {
		
			System.out.println(arrayLlamadas[i]);
		}
		
		
		
		
		
	}
	
	
}
