package paqueteTest;
import static org.junit.Assert.*;
import pruebas_JUNIT.Factorial;

import org.junit.Test;

public class Test_Factorial2 {
	 Factorial n;
	 
		@Test
		public void testNumeroNegativoExcepcion() {
			n=new Factorial(-3);
			try {
				assertTrue(n.calculo()==-1);
				fail();
				
			} catch (Exception e) {				
				e.printStackTrace();
				/*e.getMessage();*/
			}
			
			
		}
		
		@Test
		public void testFueraRango() {
			n=new Factorial(20);
			try {
				assertTrue(n.calculo()==-2);
				fail();
			} catch (Exception e) {
				//e.printStackTrace();
				e.getMessage();
			}
			
			
		}
		/*
		@Test
		public void testFueraRango1() {
			n=new Factorial(1);
			assertTrue(n.calculo()==1);
			
		}
		@Test
		public void testFueraRango0() {
			n=new Factorial(0);
			assertTrue(n.calculo()==1);
			
		}
		
		@Test
		public void testFuncionamientoNormal() {
			n=new Factorial(3);
			assertTrue(n.calculo()==6);
			
		}

*/

}
