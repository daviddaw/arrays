package herencia;




public class MamiferoTerrestre extends Mamifero{
	private int numeroPatas;

	public MamiferoTerrestre() {
		super();
	}
	
	
	public MamiferoTerrestre(String nombreComun, String nombreEspecifico,
			double peso, double tamaño, int numeroCrias, int mesesEmbarazo,
			int numeroPatas) {
		super(nombreComun, nombreEspecifico, peso, tamaño, numeroCrias,
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
