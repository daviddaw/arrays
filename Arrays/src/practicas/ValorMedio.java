
package practicas;

public class ValorMedio {

	public static void main(String[] args) {
		double media = 0.0;
		int array[] = {12,34,56,4,3,2,1,8,9,10};
		for (int i=0; i < array.length; i++) {
			 media = media + array[i];
			}
		media = media / array.length;
		System.out.println(media);
	}
    public static int[] visualizar(int [] array){
   	 
   	 for (int i = 0; i < array.length; i++) {
   			System.out.print(array[i]+" ");
   			}
   		System.out.println("");
			return array;
    }
}
