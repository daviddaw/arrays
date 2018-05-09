package arraysSencillos;


public class Array06 {

	public static void main(String[] args) {

		int aux;
		int[]original=new int[5];
		for(int i=0; i<original.length; i++){
			original[i]=(int)(Math.random()*50+1);
			System.out.print(original[i]+" ");
		}
		aux=original[4];
		
		System.out.println(" ");
		System.out.println("cambio:");

		for(int i=original.length-1; i>0; i--)
			original[i]=original[i-1];
		
		original[0]=aux;

		for(int i=0; i<original.length; i++)
			System.out.print(original[i]+" ");
			

	}
}