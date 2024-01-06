package array_Ex;

public class Multidimensional_Array_003 {

	public static void main(String[] args) {
		
		
		// Matrix 2 x 3	
	    /*	 3  5  6
	     * 	 4  8  2
	     */
	
		// declare without memory allocation
		int [][] ab = { { 3, 5, 6 }, {4, 8, 2}};
		System.out.println(ab[1][2]);
		
		
		
		// Used Nested loop to get loop
		
		for (int x=0 ; x<2; x++) {
			for (int j=0; j<3; j++) {
				//System.out.print(ab[x][j]+ " ");
				
				// Display value with index like ab[0] [0]=3
				System.out.print("ab["+ x +"]["+ j +"]= " + ab[x][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
