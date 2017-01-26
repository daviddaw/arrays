package ejercicios;

public class Ejemplo01 {

	public static void main(String[] args) {
		int [] ar1=new int[5];
		int [] ar2;
		ar2=new int[5];
		int [] ar3={2,5,7,3,1};
		
		//rellenamos el array con datos (números pares)
		for (int i=0; i<ar1.length; i++){
			ar1[i]=i*2;
		}
		//podemos visualizar el array así:
		
		/*for (int i=0; i<ar1.length; i++){
			System.out.print(ar1[i]+" ");
		}
		System.out.println();*/
		
		//o mejor definir un método verArray
		
		verArray(ar1);
		
		inicArray(ar2);
		
		verArray(ar2);
		
		verArray(sumar(ar1, ar2));

	}
	
	public static void inicArray (int[] array){
		
		for (int i = 0; i < array.length; i++) {
			array[i]=i;
		}
	}
	
	public static void verArray( int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] sumar (int[] array1, int[] array2){
		int[] suma=new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			suma[i]=array1[i]+array2[i];			
		}
		return suma;
	}
	
	
	
	

}
