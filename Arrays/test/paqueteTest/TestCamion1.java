package paqueteTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import paqueteCodigo.Camion;
import paqueteCodigo.Empresa;

public class TestCamion1 {
Camion camion1,camion2;
Empresa empresa;
int carg=1;


	@Before
	public void setUp()  {
		empresa= new Empresa("repsol", 3);
		camion1= new Camion("12a4356", 10, 8);
		
	}

	@Test
	public void comprobar() {
		assertTrue(empresa.insertarCamion(camion1)==true);
	
	}
	@Test
	public void comprobarCarga() {
		assertTrue(empresa.insertarCamion(camion1)==true);
		//assertTrue(camion1.cargar(1)==9);
		

	}
	
	
	@Test
	public void cargaFinalTest() {
		//assertTrue(empresa.insertarCamion(camion1)==true);
		//assertTrue(camion1.cargar(1)==9);
		
		
	}
	
	
	
	

}
