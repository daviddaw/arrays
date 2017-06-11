package ejercicios_Strings_LeerTeclado;
/*3.	Dadas por teclado una cadena y una variable car�cter, se pide:
a.	Escribir un m�todo que busque dentro de la cadena la primera ocurrencia del car�cter introducido empezando por el principio, 
indicando la posici�n que ocupa dentro de la cadena en caso de encontrarse en ella, 
o indicando mediante un mensaje que dicho car�cter no se encuentra dentro de la cadena:
	�	Ejemplo: �hola ana belen�    car�cter: a  => se encuentra en la posici�n 3*/  
public class Ejercicio3 {
 
	
	public static void main(String[] args) {
		System.out.println("Introduce una cadena");
		String cadena = LeerTeclado.readString();
		System.out.println("Introduce un caracter");
		char caracter = LeerTeclado.readCharacter();
		System.out.println("El caracter se encuentra en la posicion "
				+ cadena.indexOf(caracter));

		System.out.println("_________________________________________");
 	/*b.	Escribir un m�todo que busque todas las ocurrencias del car�cter en la cadena en caso de encontrarse en ella, 
 	 * o indicando mediante un mensaje que dicho car�cter no se encuentra dentro de la cadena.
		�	Ejemplo: �hola ana belen�    car�cter: a  => se encuentra en la posici�n 3, 5, 7*/
		 
  
		int posicion=cadena.indexOf(caracter);
		System.out.print ("El caracter se encuentra en la posicion ");
		while (posicion!=-1) {
			System.out.print (cadena.indexOf(caracter,posicion));
			System.out.print(" ");
			//se sigue buscando a partir de la posici�n siguiente a la encontrada
			posicion=cadena.indexOf(caracter,posicion+1);
			
		}
		
		
         
	}

}
