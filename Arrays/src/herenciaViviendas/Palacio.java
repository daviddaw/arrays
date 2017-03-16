package herenciaViviendas;

public class Palacio extends Vivienda{
	private boolean chofer;

	
	
	public Palacio() {
		super();
		
	}

	public Palacio(int numeroHabitaciones, int metrosCuadrados, String calle,
			int numero, boolean chofer) {
		super(numeroHabitaciones, metrosCuadrados, calle, numero);
		this.chofer = chofer;
	}

	public boolean isChofer() {
		return chofer;
	}

	public void setChofer(boolean chofer) {
		this.chofer = chofer;
	}

	
	




	
	



	
}
