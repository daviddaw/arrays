package arraysSencillos;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double dinero; 
		double billetes[]={500, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};
		double cantidadb[]= new double [14];
		
		dinero=in.nextDouble();
		
		for(int i=0; i<billetes.length; i++){
			while(dinero>=billetes[i]){
			dinero=dinero-billetes[i];
			cantidadb[i]+=1;
			}
			in.close();
		}
		
		for(int i=0; i<cantidadb.length; i++)
			System.out.println(cantidadb[i]+" billetes de "+billetes[i]);
		
	}

}
