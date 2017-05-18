package excepciones3;

public class Principal {

	public static void main(String[] args)  {
		EcuacionSegundoGrado e1= new EcuacionSegundoGrado(1, 12, 8);
		EcuacionSegundoGrado e2= new EcuacionSegundoGrado(13, 12, 8);
		try {
			e1.solucion();
			e2.solucion();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
