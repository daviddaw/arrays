package arraysObjetos.ejercicio4;

public class Carta {
	private String palo;
	private String nombre;
	private double valor;
	
	public Carta(String palo, String nombre, double valor) {
		this.palo = palo;
		this.nombre = nombre;
		this.valor = valor;
	}
public Carta(String palo) {
		
	}
	public Carta() {
		
	}
	
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Carta [palo=" + palo + ", nombre=" + nombre + ", valor="
				+ valor + "]";
	}

	
}