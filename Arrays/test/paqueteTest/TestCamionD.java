package paqueteTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import paqueteCodigos.Camion;

public class TestCamionD {
	
	Camion camion1,camion2;

	@Before
	public void setUp() throws Exception {
		//camion2 = new Camion(matricula, limiteCarga, carga)
		camion1 = new Camion("1234567", 12,20 );	
		camion2 = new Camion("1234567", 12,6 );
		
	}

	@Test
	public void testCargaMaxima() {
		int carga = 11, decarga = 4;
		camion2.cargar(carga);
		camion2.descargar(decarga);
		assertTrue(camion1.getCarga()==12);
		assertTrue(camion1.getCarga() == camion1.getLimiteCarga());
		System.out.println(camion1.getLimiteCarga());
		camion1.descargar(camion1.getLimiteCarga());
		assertTrue(camion1.getCarga()==0);
		
	
	
		//camion1.cargar(1);
		//assertTrue(camion1.getCarga()==13);
		//camion1.descargar(2);
		//assertTrue(camion1.getCarga()=11);
		
		//assertTrue(c2.getCarga() == c2.getLimiteCarga());
	
		//camion1.cargar(3);	
	}
	
	
/*	@Test
	public void test() {
		fail("Not yet implemented");
	}*/

}
