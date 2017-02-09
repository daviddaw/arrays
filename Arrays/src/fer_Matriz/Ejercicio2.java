package fer_Matriz;

public class Ejercicio2 {

	public static void main(String[] args) {
//		tabla que ponga 1 en la diagonal y 0 en el resto.
		
		
		int diagonal[][]=new int[5][5];
		
		for(int i=0;i<diagonal.length;i++){
			
			for(int j=0;j<diagonal[i].length;j++){
				if(i==j){
					diagonal[i][j]=1;
				}
				System.out.print(diagonal[i][j]);
				if (j==diagonal[j].length-1){
					System.out.println("");
				}
								
			}
		}

		
	}

}
