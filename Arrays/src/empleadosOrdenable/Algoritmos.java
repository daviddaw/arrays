package empleadosOrdenable;

public class Algoritmos  implements Ordenable{

	public static void  ordenar(Ordenable[] array) {
		Ordenable aux = array [0];
		for (int i=0; i<array.length-1;i++)
			for (int j=i+1;j<array.length;j++)
				if(array[i].esMayor(array[j]))
				{
					aux=array[i];
					array[i]=array[j];
					array[j]=aux;
				}
	
		System.out.println("");
		//Imprime el array ordenado
		System.out.println("El array ordenado es ");
		for (int i = 0; i < array.length; i++) 
		{//syso ("componente"+i);
			
			System.out.print(array[i]);
		}
		
	}
	
	
	public static Ordenable  maximo(Ordenable[] array) {
		
		
		return null;
	}
	
	
	public static Ordenable  minimo (Ordenable[] array) {
		return null;
	}
	
	@Override
	public boolean esMenor(Ordenable o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esMayor(Ordenable o) {
		// TODO Auto-generated method stub
		return false;
	}

}
