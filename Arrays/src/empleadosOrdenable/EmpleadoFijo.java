package empleadosOrdenable;



public class EmpleadoFijo extends Empleados 
{
    private int salarioMes;
   
    public EmpleadoFijo (String nombreEmpleado, String dni, int telefono, int salarioMes)
    {
       super (nombreEmpleado, dni,  telefono);
       this.salarioMes=salarioMes;
    }

    
    public int consultarSalario()
    {   
        return salarioMes;
    }


    @Override
	public boolean esMenor(Ordenable o) {
		if (this.consultarSalario()<((EmpleadoFijo)o).consultarSalario())
			return true;
		else
			return false;
		
	}


	@Override
	public boolean esMayor(Ordenable o) {
		if (o==null)
			return true;
		else if (!(o instanceof EmpleadoFijo))
		return true;
		else 
			return (this.consultarSalario()>((EmpleadoFijo)o).consultarSalario());
		
		
	}
    
   
}