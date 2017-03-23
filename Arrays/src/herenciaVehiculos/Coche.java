package herenciaVehiculos;

public class  Coche extends Vehiculos{
	private String color;
	private int numeroPasajeros;
	private boolean descapotable;
	/*ruedas=4*/
	public Coche(String marca, String matricula, int numeroRuedas,
			int autonomía, String color, int numeroPasajeros,
			boolean descapotable) {
		super(marca, matricula, numeroRuedas=4, autonomía);
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
	 * 1)	Para los coches almacena los sigui: color, número de pasajeros y si es o no descapotable.
	   2)	Para los camiones los atributos son: límite de carga (entero), carga (entero), conductor (String). Si la carga excede del límite, se tomará como carga dicho límite.
	 * */
	
	
	
}
