package arraysSencillos;

import java.util.Scanner;

public class Array05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num, cifra, c=0;

		num=in.nextInt();
		cifra=in.nextInt();
		int array[]= new int[6];


		for(int i=0; i<array.length; i++){
			while(num>0){
				array[i]=num%10;
				num=num/10;
				System.out.print(array[i]+" ");
			}
			in.close();
		}
		
		for(int i=0; i<array.length; i++){
			if(array[i]==cifra)
				c+=1;
		}

		if(c!=0)
			System.out.println("\nLa cifra "+cifra+" esta en el numero y se repite "+c+" veces");
		else
			System.out.println("La cifra "+cifra+ " no esta en el numero");

	}




}
