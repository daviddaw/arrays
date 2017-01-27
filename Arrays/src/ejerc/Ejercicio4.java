package ejerc;
public class Ejercicio4 {


		public static void main(String[] args) {
			
			int [] contadorbilletes = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
			
			double [] billetesYmonedas = {500,200,100,50,20,10,5,2,1,0.50,0.20,0.10,0.05,0.02,0.01};
			
			System.out.println("Introduzca cantidad: ");
			double cantidad = LeerTeclado.readDouble();
			
			billetesMonedas(cantidad, contadorbilletes, billetesYmonedas);
		
			
	}

		
		
	

	public static void billetesMonedas (double cantidad, int[]a, double[]b)
	{
		double resto=0;
		for (int i = 0; i < a.length; i++) 
		{
			a[i]= (int) (cantidad/b[i]);
			resto= (cantidad%b[i]);
			
			cantidad=resto;
		}
	
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("El numero de billetes/monedas "+b[i]+" es "+a[i]);
		}
	}
	
		
}