package herenciaViviendas;

public class Chalet  extends Vivienda{
private int metrosJardin;
private boolean piscina;
public Chalet() {
	super();

}
public Chalet(int metrosJardin, boolean piscina) {
	super();
	this.metrosJardin = metrosJardin;
	this.piscina = piscina;
}
public Chalet(int numeroHabitaciones, int metrosCuadrados, String calle,
		int numero, int metrosJardin, boolean piscina) {
	super(numeroHabitaciones, metrosCuadrados, calle, numero);
	this.metrosJardin = metrosJardin;
	this.piscina = piscina;
}
public int getMetrosJardin() {
	return metrosJardin;
}
public void setMetrosJardin(int metrosJardin) {
	this.metrosJardin = metrosJardin;
}
public boolean isPiscina() {
	return piscina;
}
public void setPiscina(boolean piscina) {
	this.piscina = piscina;
}





}
