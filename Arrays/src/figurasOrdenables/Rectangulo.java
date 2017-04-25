package figurasOrdenables;
import empleadosOrdenable.Ordenable;


public class Rectangulo extends Figuras implements Ordenable
{
	public Rectangulo(double b, double h)
	{
		super (b,h);
	}

	
	public double  area()
	{
		return base*altura;
	}


	public boolean esMenor(Ordenable o) {
		if (this.area()<((Rectangulo)o).area())
			return true;
		else
			return false;
		
	}
	

	
	
	
	public boolean esMayor(Ordenable o) {
		if (o==null)
			return true;
		else if (!(o instanceof Rectangulo))
		return true;
		else 
			return (this.area()>((Rectangulo)o).area());
		
		
	}
	
}


