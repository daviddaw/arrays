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
	
	}
	
	
	
	
	public Mamifero(String nombreComun, String nombreEspecifico, double peso,
			double tama�o, int numeroCrias, int mesesEmbarazo) {
		super(nombreComun, nombreEspecifico, peso, tama�o);
		this.numeroCrias = numeroCrias;
		this.mesesEmbarazo = mesesEmbarazo;
	}


	public int getMesesEmbarazo() {
		return mesesEmbarazo;
	}




	public void setMesesEmbarazo(int mesesEmbarazo) {
		this.mesesEmbarazo = mesesEmbarazo;
	}




	public int getNumeroCrias() {
		return numeroCrias;
	}
	public void setNumeroCrias(int numeroCrias) {
		this.numeroCrias = numeroCrias;
	}




	@Override
	public String toString() {
		return super.toString()+ "Mamifero [numeroCrias=" + numeroCrias + ", mesesEmbarazo="
				+ mesesEmbarazo + "]";
	}




	
}
