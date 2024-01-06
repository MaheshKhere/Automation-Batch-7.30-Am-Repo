package array_Ex;

public class Multidimensional_Array_001 {

	public static void main(String[] args) {
		
		// Matrix-  3 x 3 ( row-3 & column-3)
		/*  10  20  30
		 *  40  50  60
		 *  70  80  90
		 */
		// Memory Allocation
		int [][] table = new int[3][3];
		 
		table [0][0]= 10;
		table [0][1]= 20;
		table [0][2]= 30;
		
		table [1][0]= 40;
		table [1][1]= 50;
		table [1][2]= 60;
		
		table [2][0]= 70;
		table [2][1]= 80;
		table [2][2]= 90;
		
	    // To Print one value in an array.
		System.out.println(table[1][0]);
		
		// To get all values from Array using Nested Loop
         // row increment
		for (int i =0; i<3 ;i++) {
			// column increment
			for(int n =0 ; n<3; n++) {
				System.out.print(table[i][n]+" ");	
			}
			System.out.println();
		}
	}

}
