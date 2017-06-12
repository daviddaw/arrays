package paqueteTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import paqueteCodigo.Camion;
import paqueteCodigo.Empresa;

public class TestEmpresa1 {
	Camion camion1,camion2,camion3,camion4;
	Empresa empresa;

	@Before
	public void setUp()  {
		empresa = new Empresa("Repsol", 3);
		camion1= new Camion("12a4351", 10, 8);
		camion2= new Camion("12a4352", 10, 8);
		camion3= new Camion("12a4353", 10, 8);
		camion4= new Camion("12a4354", 10, 8);
	}


	
	
	@Test
 	public void testBuscarCamiones() { 
	assertTrue(empresa.insertarCamion(camion1)==true);
	assertTrue(empresa.insertarCamion(camion2)==true);
	assertTrue(empresa.insertarCamion(camion3)==true);
	assertTrue(empresa.insertarCamion(camion4)==true);
	assertEquals(empresa.buscarCamion("12a4351"),camion1);//discobuscaCancion"nombrecancion'nombre_objeto
	assertEquals(empresa.buscarCamion("12a4352"),camion2);
	assertEquals(empresa.buscarCamion("12a4353"),camion3);
	assertEquals(empresa.buscarCamion("12a4354"),camion4);

}

}
