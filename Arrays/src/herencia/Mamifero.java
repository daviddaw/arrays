package herencia;

/**
 * @author alumno
 *
 */
public class Mamifero  extends Animal{
	private int numeroCrias;
	private int mesesEmbarazo;
	
	
	public Mamifero() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Mamifero(int numeroCrias, int numeroEmpleados) {
		super();
		this.numeroCrias = numeroCrias;
		this.mesesEmbarazo = numeroEmpleados;
	}
	


	public Mamifero(String nombreComun, String nombreEspecifico, double peso,
			double tamaño) {
		super(nombreComun, nombreEspecifico, peso, tamaño);
		// TODO Auto-generated constructor stub
	}

	public int getNumeroCrias() {
		return numeroCrias;
	}
	public void setNumeroCrias(int numeroCrias) {
		this.numeroCrias = numeroCrias;
	}
	public int getNumeroEmpleados() {
		return mesesEmbarazo;
	}
	public void setNumeroEmpleados(int numeroEmpleados) {
		this.mesesEmbarazo = numeroEmpleados;
	}
	@Override
	public String toString() {
		return "Mamifero [numeroCrias=" + numeroCrias + ", numeroEmpleados="
				+ mesesEmbarazo + "]";
	}
	
}
