package herenciaLLamadas;

public class LlamadasProvinciales extends Llamadas {
	
	private int franja;
	

public LlamadasProvinciales(int numeroOrigen, int numeroDestino, int duracion,
		int franja) {
	super(numeroOrigen, numeroDestino, duracion);
		this.franja = franja;	
}



@Override
public double getCoste() {
   double coste=0;
	switch (franja) {
	case 1:
		coste=0.20;
		break;
	case 2:
		coste=0.25;		
		break;
	case 3:
		coste=0.30;
		break;
	default:System.out.println("La franja no es valida");	
	
	}
	return coste;
}

}
