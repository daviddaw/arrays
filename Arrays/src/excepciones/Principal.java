package excepciones;

public class Principal {

	public static void main(String[] args) {
		try {
			Suma.sumaPositivos();
		} catch (Exception e) {
			System.out.println("Has introducido un "+e.getMessage());
		}
		
		 int arrayEnterosE[]={1,2,3,0,7};
		
		try{
		
			for (int i = 0; i < arrayEnterosE.length; i++) {
			int resultado=0;
			int numero=5;
			 
			resultado=numero/arrayEnterosE[i];
		}
			  System.out.println(arrayEnterosE[7]);
			  
		/*} catch (ArrayIndexOutOfBoundsException be) {
		  System.out.println("Esta posicion no existe en el array");
		} catch (ArithmeticException ae) {
		  System.out.println("No se puede dividir entre cero");*/
		} catch (Exception e) {
			System.out.println("Excepcion generica");
		}
		finally    {
		System.out.println("fin de programa");
		}
		
		
		
		
	
		
		
    
                                                                                                                                                                                                                                                                                                                             
    
    

	}

}
