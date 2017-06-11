package excepciones;

import ejercicios_Strings_LeerTeclado.LeerTeclado;

public class Suma {

	static void sumaPositivos()throws Exception {
		int suma=0;
		int numero=0;
		System.out.println("Introduce un numero por teclado");
		
		
		do {
			numero = LeerTeclado.readInteger();
			/*if (numero<0){
			Exception e=new Exception("Numero negativo");
			throw e;
		}*/
	
			suma=suma+numero;
		} while (numero != 0);
		System.out.println("fin Suma");
		
	};
}
