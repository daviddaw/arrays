package herenciaVehiculos;

public class Vehiculos {
	/*
	   2)	Para los camiones los atributos son: límite de carga (entero), carga (entero), conductor (String). Si la carga excede del límite, se tomará como carga dicho límite.
	 * */
	private String marca;
	private String matricula;
	private int numeroRuedas;
	private int autonomía;
	
	
	
	public Vehiculos(String marca, String matricula, int numeroRuedas,
			int autonomía) {
		this.marca = marca;
		this.matricula = matricula;
		this.numeroRuedas = numeroRuedas;
		this.autonomía = autonomía;
	}

	public static void main(String[] args) {
		

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	public int getAutonomía() {
		return autonomía;
	}

	public void setAutonomía(int autonomía) {
		this.autonomía = autonomía;
	}

}
