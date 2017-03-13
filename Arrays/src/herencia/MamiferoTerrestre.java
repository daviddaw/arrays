package herencia;

import Simples.LeerTeclado;




public class MamiferoTerrestre extends Mamifero{
	private int numeroPatas;

	public MamiferoTerrestre() {
		super();
		System.out.println("Escribe el numero de patas");
		int numeroPatas = LeerTeclado.readInteger();
	}
	
	
	public MamiferoTerrestre(String nombreComun, String nombreEspecifico,
			double peso, double tama�o, int numeroCrias, int mesesEmbarazo,
			int numeroPatas) {
		super(nombreComun, nombreEspecifico, peso, tama�o, numeroCrias,
				mesesEmbarazo);
		this.numeroPatas = numeroPatas;
	}


	public int getNumeroPatas() {
		return numeroPatas;
	}
	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}


	@Override
	public String toString() {
		return super.toString()+ "numeroPatas=" + numeroPatas + "]";
	}

	

}
