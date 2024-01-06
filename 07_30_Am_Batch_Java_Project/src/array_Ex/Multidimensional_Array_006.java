package array_Ex;

public class Multidimensional_Array_006 {

	public static void main(String[] args) {

		
		// 3 6 2
		// 4 6 0
		// 2 0 4
		
		// declare without memory allocation
		int [] [] ab = { {3, 6, 2 }, {4, 6, 0},{2, 0, 4}};
		
		int [] [] xy = {{3,6,2},{ 4, 6, 0} };
		
		// Nested Loop
		
		// ab [0] [0] = 3

		for(int x= 0; x<3; x++) {
			for(int j=0; j<3 ; j++) {
				//System.out.print(ab[x][j]+ " ");
				System.out.print(" ab [" + x + "] [" + j +"]= "   + ab[x][j] );
			}
			System.out.println();
		}
		
	}

}
