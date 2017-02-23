package arraysObjetos.ejercicio3;

import java.util.ArrayDeque;

import arraysObjetos.ejercicio1.LeerTeclado;
import departamentosEmpleado.Departamento;

public class Main {
/*
	codigoDpto, entero (entre 0 y 3)
	Añadir a estas clases los métodos que consideréis teniendo en cuenta lo que se pide en el main.
	Crear un main que declare un array de tamaño 4 cuyas componentes sean de tipo Departamento.
	El main debe presentar un menú para:
	Dar de alta varios departamentos (el array de empleados de cada uno se inicializará a null).
	Asignar un empleado a un departamento: introducir el código de departamento (entre 0 y 3), dar  de alta al empleado y almacenarlo en el arrayEmpleados
 del departamento correspondiente. El empleado se guardará  en la posición del array que indique el códigoEmp 
 (al introducir los datos del empleado se validará que el código de empleado no exceda del numeroEmpleados del departamento correspondiente).
  Si el empleado ya existiera en el array se sacaría el mensaje correspondiente.
  
	Visualizar un departamento: introducir un código de departamento y visualizar sus datos, incluidos los datos de sus empleados.
	Buscar un empleado en un departamento: introducir un código de departamento, un código de empleado y visualizar los datos de este.
	Buscar un empleado en un departamento por nombre: introducir un código de departamento, un nombre de empleado y visualizar los datos de este.
	Incrementar el sueldo de un empleado: introducir un código de departamento, un código de empleado e incrementar su sueldo en un 10%.
	Borrar un empleado: introducir un código de departamento, un código de empleado y borrar este. 
	Visualizar el empleado de mayor sueldo de cada departamento.
	Visualizar el empleado de mayor sueldo de la empresa.
*/
	
	public static void main(String[] args) {
		 Departamento arrayDepartamento[]= new Departamento[4];
		 
		 altaDepartamentos();//empleados null
		 //intro codigo dep`(0,3),alta empleado,almacenarlo en arraydepartamento,empleado se guarda en la posicion del array que indique el codigoemp
		//validar que el codigo no exceda del numero de empleados del departamento, si el empleado ya existe mensaje
		 asignarEmpleadoDpto();
		 visualizarDepartamento();
		 buscarEmpleadoNombre();//por nombre
		 buscarEmpleadoCodigo();
		 incrementarSueldoEmpleado();
		 borrarEmpleado();
		 empleadoMayorSueldoDpto();
		 empleadoMayorsueldoEmpresa();	
		
	}
	
	public static void altaDepartamentos() {
		/*
		
		private Empleado[] arrayEmpleados;*/
		System.out.println("Alta de departamento");
		//String resp;
		int codigoDpto, numeroEmpleados;
		String nombreDpto;
		Departamento dptoAux;//objeto, falta el new //comprobar si existe
		
		codigoDpto=introCodDepartamento();
		
	}
	
	
	
	
	
	


	public Departamento buscarDptoCod(int codigoDpto){
		return arrayDepartamento[codigoDpto];
	}
	
public static int introCodDepartamento() {
	int num;
	System.out.println("introduce el departamento");
	num=LeerTeclado.readInteger();
		return num;
	}

private static void empleadoMayorsueldoEmpresa() {
		// TODO Auto-generated method stub
		
	}

private static void empleadoMayorSueldoDpto() {
		// TODO Auto-generated method stub
		
	}

private static void incrementarSueldoEmpleado() {
	// TODO Auto-generated method stub
	
}

private static void borrarEmpleado() {
		// TODO Auto-generated method stub
		
	}

private static void buscarEmpleadoCodigo() {
		// TODO Auto-generated method stub
		
	}

private static void visualizarDepartamento() {
		// TODO Auto-generated method stub
		
	}

private static void buscarEmpleadoNombre() {
		// TODO Auto-generated method stub
		
	}

private static void asignarEmpleadoDpto() {
		// TODO Auto-generated method stub
		
	}


	

 
 
}
