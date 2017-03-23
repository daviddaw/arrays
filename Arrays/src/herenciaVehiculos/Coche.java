package herenciaVehiculos;

public class  Coche extends Vehiculos{
	private String color;
	private int numeroPasajeros;
	private boolean descapotable;
	/*ruedas=4*/
	public Coche(String marca, String matricula, int numeroRuedas,
			int autonom�a, String color, int numeroPasajeros,
			boolean descapotable) {
		super(marca, matricula, numeroRuedas=4, autonom�a);
		this.color = color;
		this.numeroPasajeros = numeroPasajeros;
		this.descapotable = descapotable;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}
	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}
	public boolean isDescapotable() {
		return descapotable;
	}
	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}


	
	
	
	/*
	 * 1)	Para los coches almacena los sigui: color, n�mero de pasajeros y si es o no descapotable.
	   2)	Para los camiones los atributos son: l�mite de carga (entero), carga (entero), conductor (String). Si la carga excede del l�mite, se tomar� como carga dicho l�mite.
	 * */
	
	
	
}
