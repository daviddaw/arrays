package ejercicios;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		int [] cambio = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		double [] valoresEuro = {500,200,100,50,20,10,5,2,1,0.50,0.20,0.10,0.05,0.02,0.01};
		
		System.out.println("Introduzca cantidad: ");
		double importe = LeerTeclado.readDouble();
		billetesMonedas(importe, cambio,valoresEuro);
	
		
}

	


public static void billetesMonedas (double importe, int[]cambio, double[]valores)
{
	double resto=0;
	for (int i = 0; i < cambio.length; i++) 
	{
		cambio[i]= (int) (importe/valores[i]);
		resto= (importe%valores[i]);
		
		importe=resto;
	}

	for (int i = 0; i < cambio.length; i++) 
	{
		if (valores[i]>=5) {
			System.out.println(cambio[i]+" billetes de "+valores[i]+" Euros");
		} else {
			System.out.println(+cambio[i]+" monedas de "+valores[i]+" Euros");
		}
		
	}
}



}
