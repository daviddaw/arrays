package herenciaVehiculos;

public class Vehiculos {
	/*
	   2)	Para los camiones los atributos son: l�mite de carga (entero), carga (entero), conductor (String). Si la carga excede del l�mite, se tomar� como carga dicho l�mite.
	 * */
	private String marca;
	private String matricula;
	private int numeroRuedas;
	private int autonom�a;
	
	
	
	public Vehiculos(String marca, String matricula, int numeroRuedas,
			int autonom�a) {
		this.marca = marca;
		this.matricula = matricula;
		this.numeroRuedas = numeroRuedas;
		this.autonom�a = autonom�a;
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

	public int getAutonom�a() {
		return autonom�a;
	}

	public void setAutonom�a(int autonom�a) {
		this.autonom�a = autonom�a;
	}

}
