package herencia;

public class MamiferoTerrestre extends Mamifero{
	private int numeroPatas;

	
	public MamiferoTerrestre() {
		super();
	
	}
	public MamiferoTerrestre(int numeroCrias, int numeroEmpleados) {
		super(numeroCrias, numeroEmpleados);
		// TODO Auto-generated constructor stub
	}

	public MamiferoTerrestre(String nombreComun, String nombreEspecifico,
			double peso, double tama�o) {
		super(nombreComun, nombreEspecifico, peso, tama�o);
		// TODO Auto-generated constructor stub
	}
	public int getNumeroPatas() {
		return numeroPatas;
	}
	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}
	@Override
	public String toString() {
		return "MamiferoTerrestre [numeroPatas=" + numeroPatas + "]";
	}
	

}
