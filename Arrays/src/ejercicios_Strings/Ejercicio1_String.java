package ejercicios_Strings;



public class Ejercicio1_String {

	public static void main(String[] args) {
		int numero;
		String palabra;
		// 1.	Dada una cadena introducida por teclado, 
		System.out.println("Escribe una palabra");
		palabra=LeerTeclado.readString();
		//obtener su longitud,
		System.out.println(palabra.length());
		//el carácter que ocupa  el centro de la  cadena 
		
		System.out.println(palabra.charAt(palabra.length()/2));
		// visualizar la mitad derecha y la mitad izquierda de la misma.
        System.out.println(palabra.substring(0, palabra.length()/2)+" "+(palabra.substring(3,palabra.length())));
		
	}

}
