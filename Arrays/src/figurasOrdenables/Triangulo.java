package figurasOrdenables;

public class Triangulo extends Figuras
{
	public Triangulo(double b, double h)
	{	super(b,h);
	}
	
	public double area()
	{	
		return ((base*altura)/2);
	}
}
