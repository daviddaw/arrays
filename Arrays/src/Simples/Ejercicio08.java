package Simples;



public class Ejercicio08 {

	public static void main(String[] args) {


		int dias[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo","Junio", "Julio", "Agosto", "Septiembre", "Octubre","Noviembre", "Diciembre" };

		
		int diaInicio, diaFinal, mesInicio, mesFinal;
		
		do {
			do {
				System.out.println("Introduce el dia de inicio");
				diaInicio = LeerTeclado.readInteger();
				System.out.println("Introduce el mes de inicio");
				mesInicio = LeerTeclado.readInteger();
			} while (!comprobarDias(diaInicio, mesInicio));
			do {
				System.out.println("Introduce el dia de final");
				diaFinal = LeerTeclado.readInteger();
				System.out.println("Introduce el mes de final");
				mesFinal = LeerTeclado.readInteger();
			} while (!comprobarDias(diaFinal, mesFinal));
		} while (!comprobarDatos(diaInicio, diaFinal, mesInicio, mesFinal));

		mesInicio -= 1;
		mesFinal -= 1;

		int j = diaInicio;

		for (int i = mesInicio; i <= mesFinal; i++) {
			if (i == mesFinal) {
				while (j <= diaFinal) {
					System.out.println(j + " de " + meses[i]);
					j++;
				}
				j = 1;
			} else if (i < mesFinal) {
				while (j <= dias[i]) {
					System.out.println(j + " de " + meses[i]);
					j++;
				}
				j = 1;
			}
		}
	}

	

	public static boolean comprobarDatos(int diaI, int diaF, int mesI, int mesF) {
		if (mesI == mesF) {
			if (diaI < diaF) {
				return true;
			} else
				return false;
		} else if (mesI < mesF) {
			return true;
		} else
			return false;
	}


	public static boolean comprobarDias(int dia, int mes) {
		if (mes == 2) {
			if (dia <= 28 && dia > 0) {
				return true;
			} else
				return false;
		} else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8	|| mes == 10 || mes == 12) {
			if (dia <= 31 && dia > 0) {
				return true;
			} else
				return false;
		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if (dia <= 30 && dia > 0) {
				return true;
			} else
				return false;
		} else
			return false;
	}


}
