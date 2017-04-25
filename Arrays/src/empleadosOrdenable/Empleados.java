package empleadosOrdenable;

public abstract class Empleados implements Ordenable

{
    protected String nombreEmpleado;
    protected String dni;
  
    protected int telefono;
    
    public Empleados (String nombreEmpleado, String dni,int telefono)
    {
        this.nombreEmpleado=nombreEmpleado;
        this.dni=dni;
       
        this.telefono=telefono;
    }
    
    public Empleados()
    {
    }
    
    public void setNombre (String nombreEmpleado)
    {this.nombreEmpleado=nombreEmpleado;
    }
    
     public void setDni(String dni)
    {this.dni=dni;
    }
    
    
    
     public void setTelefono (int telefono)
    {this.telefono=telefono;
    }
    
    public String getNombre ()
    { return nombreEmpleado;
    }
    
    public String getDni()
    { return dni;
    }
    
  
    
    public int getTelefono()
    { return telefono;
    }
    
    public abstract int consultarSalario();
   
    //solo tiene sentido si ambas hijas comparten el mismo método
    
   /* @Override
	public boolean esMenor(Ordenable o) {
		if (this.consultarSalario()<((EmpleadosFijos)o).consultarSalario())
			return true;
		else
			return false;
		
	}


	@Override
	public boolean esMayor(Ordenable o) {
		if (o==null)
			return true;
		else if (!(o instanceof EmpleadosFijos))
		return true;
		else 
			return (this.consultarSalario()>((EmpleadosFijos)o).consultarSalario());
		
		
	}*/
    
}

