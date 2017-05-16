package excepciones3;

public class EcuacionSegundoGrado {
	private int a;
	private int b;
	private int c;
	
	
	public void resolverEcuacion() throws Exception{
		
		int m,p,dividendo,discriminante;

		double y1,y2,raiz,divisorN,divisorP;
		
		p=(int)Math.pow(b, 2);//potencia
		m=4*a*c;
		discriminante=p-m;
		raiz=Math.sqrt(discriminante);
		divisorP=-b+raiz;
		divisorN=-b-raiz;
		dividendo=2*a;//si es menor que cero no tiene solucion, 
	

		//ALGORITMO
		if (dividendo==0) {
			System.out.println("No se puede dividir entre cero");


		} else {
			System.out.println();
			if (discriminante<0) {//si es menor que cero, no tiene solucion. (5,3,4)
				System.out.println("No tiene solucion, el discriminante es "+discriminante+" no se puede resolver la raiz de un número negativo.");

			} else {
				if (discriminante==0) {//si es cero tiene una solucion. (1,4,4)
					System.out.println("Solo tiene una solucion ");
					y1=(divisorP)/(dividendo);
					System.out.println(y1);
				}
				else {
					if (discriminante>0) {//si es mayor que cero tiene dos soluciones. (2,7,3)
						System.out.println("Tiene dos soluciones");


						y1=(-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);//importante los parentesis en multiplicaciones y divisiones
						System.out.println(+y1); System.out.println(" y ");
						
						

						y2=(divisorN)/(dividendo);
						System.out.println(+y2);

					}
				}





			}


		}
	}
	
	
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public EcuacionSegundoGrado(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
}
