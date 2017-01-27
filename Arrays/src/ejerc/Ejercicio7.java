package ejerc;


public class Ejercicio7 {

	public static void main(String[] args) {
		
		int [] array1=new int [30]; 

		System.out.println("Creamos el array aleatorio");
		arrayAleatorio(array1);
		
		System.out.println("");
		
		System.out.println("Visualizamos el array aleatorio");
		visualizarArrays(array1);
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Desplazamos las componentes del array");
		desplazarPosicion(array1);
		visualizarArrays(array1);
		
	}

	public static void arrayAleatorio(int [] a){
		for ( int i=0; i<a.length; i++){
			a[i]=(int)(Math.random() * 50 +1) ;
		}
		
	}
			
	
	public static void visualizarArrays(int [] a){
		for ( int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
			}
	}
	
	
	
	public static void desplazarPosicion (int [] a){
		
		int aux=a[a.length-1], aux2=a[0], aux3;
		
		for (int i = 0; i < a.length-1; i++) {
			aux3=a[i+1];
			a[i+1]=aux2;
			aux2=aux3;
		}
		
		a[0]=aux;
	}
	
}
