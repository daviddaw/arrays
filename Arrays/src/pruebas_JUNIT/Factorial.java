package pruebas_JUNIT;




import ejercicios_Strings_LeerTeclado.LeerTeclado;

public class Factorial {
	
		int num;	
		public Factorial(int num) {
			this.num = num;
		}
		public int calculo () throws Exception {
			int fact; 
			int i;
			
				if (num<0){
				//System.out.println("El número no puede ser negativoo");
				fact= -1;
				throw new Exception ("Excepcion:El número no puede ser negativo");
				
			
			}	
			
			
			
			else if (num>15){
				//	System.out.println("El número excede del rango");
				fact= -2;
				throw new Exception ("Excepcion:El número excede del rango");
				
					
				}
				else {
					fact=1;i=1;
					while (i<=num){//ejemplo num=2; si pusieramos while (i<num) entraria con el 1
						          //pero en la segunda vuelta al ser i=2 y num=2(2 no es menor que 2)
								 //no seria menor que 2 y tendria que salir del bucle
						fact*=i;
						i++;
					}
				}
			return fact;
		}

		public static void main(String[] args) {
			System.out.println("Introduce un número para calcular el factorial");
			Factorial f=new Factorial(LeerTeclado.readInteger());
			try{
				System.out.println("factorial= "+f.calculo());
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
				
			}

		}

	}
