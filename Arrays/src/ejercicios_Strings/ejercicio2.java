package ejercicios_Strings;

public class ejercicio2 {

	public static void main(String[] args) {
		// 2.	Dadas dos cadenas introducidas por teclado, escribir un m�todo que devuelva la cadena resultante 
        //de la concatenaci�n en may�sculas.
		String palabra1, palabra2;
		System.out.println("Esccribe una palabra");
		palabra1=LeerTeclado.readString();
		System.out.println("Escribe otra palabra");
		palabra2=LeerTeclado.readString();
		
		concat(palabra1+palabra2);
		
		
	}

	private static void concat(String palabra) {
		
		System.out.println(palabra.toUpperCase());
	}

}
