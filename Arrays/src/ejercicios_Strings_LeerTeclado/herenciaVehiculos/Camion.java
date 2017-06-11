package herenciaVehiculos ;

public class Camion extends Vehiculo{
	private int limiteDeCArga;
	private int carga;
	private String conductor;
	
	public Camion(String marca, String matricula, int numeroRuedas,
			int autonomía, int limiteDeCArga, int carga, String conductor) {
		super(marca, matricula, numeroRuedas, autonomía);
		this.limiteDeCArga = limiteDeCArga;
		this.carga = carga;
		if (this.carga>limiteDeCArga) {
			this.carga=limiteDeCArga;
		}
		
		this.conductor = conductor;
	}

	public int getLimiteDeCArga() {
		return limiteDeCArga;
	}

	public void setLimiteDeCArga(int limiteDeCArga) {
		this.limiteDeCArga = limiteDeCArga;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public String getConductor() {
		return conductor;
	}

	public void setConductor(String conductor) {
		this.conductor = conductor;
	}
	
	public void cambiarConductor(String conductor){
		this.conductor=conductor;
	}
    
	public void cargar(int sumaCarga)
	{	
		sumaCarga=this.carga+sumaCarga;
		if (sumaCarga>limiteDeCArga) {
			this.carga=limiteDeCArga;
		}
			
		
	}
		
		
		public void descargar(int restaCarga){
			//this.carga=this.carga-restaCarga;
			if (restaCarga>carga) {
			this.carga=0;	
		}
			}
		
	
	
	
	@Override
	public String toString() {
		return super.toString()+"Camion [limiteDeCArga=" + limiteDeCArga + ", carga=" + carga
				+ ", conductor=" + conductor + "]";
	}
	
}
