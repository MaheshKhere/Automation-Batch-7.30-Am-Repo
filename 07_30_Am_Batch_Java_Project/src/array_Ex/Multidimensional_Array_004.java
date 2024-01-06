package array_Ex;

public class Multidimensional_Array_004 {

	public static void main(String[] args) {
		// 3 7 9
		// 4 5 7
		// 1 3 4

		int[][] cd = { { 3, 7, 9 }, { 4, 5, 7 }, { 1, 3, 4 } };
		
		System.out.println("length"+ cd.length);
		// Nested loop
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				//System.out.print("cd[" + i + "][" + j + "] = " + cd[i][j] + " ");
				System.out.print("cd [" + i + "][" + j + "]= " +  cd [i][j]+ " ");
			}
			System.out.println();
		}

	}

}
