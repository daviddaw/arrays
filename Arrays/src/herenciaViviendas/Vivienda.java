package herenciaViviendas;

public class Vivienda {
	private int numeroHabitaciones; 
	private int metrosCuadrados;
	private String calle;
	private int numero;
	
	
	public Vivienda() {
		super();	
	}
	
	
	
	public Vivienda(int numeroHabitaciones, int metrosCuadrados, String calle,
			int numero) {
		super();
		this.numeroHabitaciones = numeroHabitaciones;
		this.metrosCuadrados = metrosCuadrados;
		this.calle = calle;
		this.numero = numero;
	}



	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}



	public void setNumeroHabitaciones(int numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}



	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}



	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}



	public String getCalle() {
		return calle;
	}



	public void setCalle(String calle) {
		this.calle = calle;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	@Override
	public String toString() {
		return "Vivienda [numeroHabitaciones=" + numeroHabitaciones
				+ ", metrosCuadrados=" + metrosCuadrados + ", calle=" + calle
				+ ", numero=" + numero + "]";
	} 
	
	
}
