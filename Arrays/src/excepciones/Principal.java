package excepciones;

public class Principal {

	public static void main(String[] args) {
		
		 int arrayEnterosE[]={1,2,3,0,7};
		
			
	
		for (int i = 0; i < arrayEnterosE.length; i++) {
			int resultado=0;
			int numero=5;
			 try{
			resultado=numero/arrayEnterosE[i];
			 }catch (Exception e){
				 System.out.println("No se puede dividir entre cero");
			 }
		
		}
		try {
			System.out.println(arrayEnterosE[7]);
		} catch (Exception e) {
			System.out.println("Esa posicion no existe en el array");
		} 
		finally    {
		System.out.println("fin de programa");
		}
		
		
		
		
	
		
		
    
                                                                                                                                                                                                                                                                                                                             
    
    

	}

}
