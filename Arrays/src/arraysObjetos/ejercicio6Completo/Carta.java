package arraysClases.ejercicio6Completo;


public class Carta {
	private String palo;
	private String nombre;
	private double valor;

	private static String[] palos={"Corazones", "Picas", "Rombos","Treboles"};
	private static String [] nombres={"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez","J","Q","K"};
	private static  double [] valorCarta={1,2,3,4,5,6,7,8,9,10,0.5,0.5,0.5};
	private static boolean [][] matrizCartas=new boolean [4][13]; 
	/*Matriz de 4 palos y 13 figuras.Guarda las cartas que ya han salido en el juego para no repetirlas;
	se inicializará a false y cada vez que salga una carta nueva se pone a true esa posición*/
	
	public static void verMatriz(){
		for (int i = 0; i < matrizCartas.length; i++) {
			for (int j = 0; j < matrizCartas[i].length; j++) {
				System.out.print(matrizCartas[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void inicializarMatriz(){
		for (int i = 0; i < matrizCartas.length; i++) {
			for (int j = 0; j < matrizCartas[i].length; j++) {
				matrizCartas[i][j]=false;
			}
	}
	}
	public Carta(){
		int pal, num;
		do{ 
			/*generamos valores aleatorios para los palos y las figuras mientras que esa posición de la matriz
			   sea false lo que indica que la carta aún no ha salido */
			
			pal=(int)(Math.random() * 4);
			//genera un nº aleatoria entre 0 y 4 para el palo
			num=(int)(Math.random() * 13);
			//idem para la figura			
		}
		while (matrizCartas[pal][num]==true);
		
		//creamos la carta poniendo en el palo el valor del array palos según la posición de pal, ídem el nombre y el valor  
		palo=palos[pal];
		nombre=nombres[num];
		valor=valorCarta[num];
		//marcamos a true la posición de la matriz ya que la carta ya ha salido
		matrizCartas[pal][num]=true;
	}
	
	public String getPalo() {
		return palo;
	}

	public String getNombre() {
		return nombre;
	}

	public double getValor() {
		return valor;
	}

	public String toString() {
		return "La carta obtenida es " + nombre + " de " +  palo+ " y su  valor es "+ valor;
	}

	

}
