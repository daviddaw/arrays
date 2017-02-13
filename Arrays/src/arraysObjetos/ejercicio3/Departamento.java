package arraysObjetos.ejercicio3;

import java.util.Arrays;


public class Departamento {
	private int codigoDpto;
	private String nombreDpto;
	private int	numeroEmpleados;
	private Empleado[] arrayEmpleados;
	




	public Departamento(int codigoDpto, String nombreDpto, int numeroEmpleados
			) {
		
		this.codigoDpto = codigoDpto;
		this.nombreDpto = nombreDpto;
		this.numeroEmpleados = numeroEmpleados;
		this.arrayEmpleados = new Empleado[numeroEmpleados];
	}

	


	public int getCodigoDpto() {
		return codigoDpto;
	}
	
	
	
	public void setCodigoDpto(int codigoDpto) {
		this.codigoDpto = codigoDpto;
	}
	public String getNombreDpto() {
		return nombreDpto;
	}
	public void setNombreDpto(String nombreDpto) {
		this.nombreDpto = nombreDpto;
	}
	public int getNumeroEmpleados() {
		return numeroEmpleados;
	}
	public void setNumeroEmpleados(int numeroEmpleados) {
		this.numeroEmpleados = numeroEmpleados;
	}
	public Empleado[] getArrayEmpleados() {
		return arrayEmpleados;
	}
	public void setArrayEmpleados(Empleado[] arrayEmpleados) {
		this.arrayEmpleados = arrayEmpleados;
	}
	@Override
	public String toString() {
		return "Departamento [codigoDpto=" + codigoDpto + ", nombreDpto="
				+ nombreDpto + ", numeroEmpleados=" + numeroEmpleados
				+ ", arrayEmpleados=" + Arrays.toString(arrayEmpleados) + "]";
	}


}
