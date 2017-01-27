package ejerc;
public class Ejercicio3 {

	
	public static void main(String[] args) {
		
		int  arrayNotas [] = {0,0,0,0,0,0,0,0,0,0,0};
		
		introducirContarNotas(arrayNotas);
		
		mostrarArray(arrayNotas);
	
	
		
	}

	public static void mostrarArray (int [] a)
	{
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("El valor del array en la posición "+i+" es "+a[i]);
		}
		
	}
	
	
	public static void introducirContarNotas (int [] a){
		
		System.out.println("Introduce nota: ");
		int nota=LeerTeclado.readInteger();
		
		while (nota>=0 && nota<=10)
		
		{
			a[nota]=a[nota]+1;
		
	
		System.out.println("Introduce nota: ");
		nota=LeerTeclado.readInteger();
		}
		
		 
	}
	
}
