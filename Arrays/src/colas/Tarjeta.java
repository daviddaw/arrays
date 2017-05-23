package colas;

public class Tarjeta {
	private String apellido;
	private String nombre;
	
	public Tarjeta(String apellido, String nombre) {
		this.apellido = apellido;
		this.nombre = nombre;
		//tarjetero 1-------------1..* tarjeta
		//tarjeta  1..* ---------------- 1
	}
	
	Tarjeta name = new Tarjeta("Palanco", "David");
	Tarjeta name5 = new Tarjeta("Rayo", "Wilfred");
	Tarjeta name2 = new Tarjeta("Sanz", "Alicia");
	Tarjeta name3 = new Tarjeta("Perez", "Daniel");
	Tarjeta name4 = new Tarjeta("Garzon", "Carlos");

}
