package different_Pattern_assignments_29_08_2023;

public class Kirti {

	public static void main(String[] args) {
		
		//inverted Pyramid
		int row =4;
		for (int i=4 ; i>=1; i--) {
			
			for (int k=1; k<=i; k++) {
				
				System.out.print( " * ");
				
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
	
		//inverted Pyramid with numbers
	 for(int i = row; i>=1; i--) {
			 
			 for (int k=1; k<=i; k++) {
				 
				 System.out.print(k + " ");
			 } 
			 System.out.println();
		 }
	}

}
