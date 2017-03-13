package herencia;

import Simples.LeerTeclado;

/**
 * @author alumno
 *
 */
public class Mamifero  extends Animal{
	private int numeroCrias;
	private int mesesEmbarazo;

	public Mamifero() {
		super();
		System.out.println("numero de crias");
		int numeroCrias=LeerTeclado.readInteger();
		System.out.println("Meses de embarazo");
		int mesesEmbarazo=LeerTeclado.readInteger();
	
	}
	
	
	
	
	public Mamifero(String nombreComun, String nombreEspecifico, double peso,
			double tamaño, int numeroCrias, int mesesEmbarazo) {
		super(nombreComun, nombreEspecifico, peso, tamaño);
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
