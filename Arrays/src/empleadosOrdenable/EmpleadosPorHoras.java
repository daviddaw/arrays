package empleadosOrdenable;

public class EmpleadosPorHoras extends Empleados
{
    private int numHoras;
    private int salarioHora;

    public EmpleadosPorHoras(String nombreEmpleado, String dni, int telefono, int numHoras, int salarioHora)
    {
       super (nombreEmpleado, dni,  telefono);
       this.numHoras=numHoras;
       this.salarioHora=salarioHora;
    }

   public int consultarSalario()
    {  return  numHoras*salarioHora;
    }
   
   

@Override
public boolean esMenor(Ordenable o) {
	return this.numHoras<((EmpleadosPorHoras)o).numHoras;
}

@Override
public boolean esMayor(Ordenable o) {
	// TODO Auto-generated method stub
	return false;
}
   
   
}
