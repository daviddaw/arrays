package ejerc;
public class Ejercicio6 {

	public static void main(String[] args) {
		
		int [] array1=new int [20];
		
		System.out.println("Creamos un array con contenido aleatorio");
		arrayAleatorio(array1);
		
		System.out.println("");
		
		System.out.println("Visualizo el array 1");
		visualizarArrays(array1);
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Numero de pares "+contadorPares(array1));
		System.out.println("");
		System.out.println("Numero de impares "+contadorImpares(array1));
		
		int [] arrayimp=new int [contadorImpares(array1)];
		int [] arratpar=new int [contadorPares(array1)];
		
		
		rellenarPareseImpares(array1, arratpar, arrayimp);
		System.out.println("");
		System.out.println("Array de Impares");
		visualizarArrays(arrayimp);
		System.out.println("");
		System.out.println("Array de Pares");
		visualizarArrays(arratpar);
		
		
	}

	public static void arrayAleatorio(int [] a){
		for ( int i=0; i<a.length; i++){
			a[i]=(int)(Math.random() * 100 +1) ;
		}
		
	}
			
	
	public static void visualizarArrays(int [] a){
		for ( int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
			}
	}
	
	public static int contadorPares (int [] a){
		int cont=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2==0) {
				cont++;
			}
		}
				
		return cont;
	}
	
	public static int contadorImpares (int [] a){
		int cont=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2!=0) {
				cont++;
			}
		}
				
		return cont;
	}
	
	public static void rellenarPareseImpares(int [] a, int [] pares, int [] impares){
		int j=0, k=0;
			for (int i = 0; i < a.length; i++) {
				if (a[i]%2==0) {
						pares[j]=a[i];
						j++;
					}
				else {
					impares[k]=a[i];
					k++;
				}
					
			}
	}
				
	
}
