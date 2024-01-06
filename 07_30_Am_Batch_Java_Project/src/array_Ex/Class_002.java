package array_Ex;

public class Class_002 {
public static void main(String[] args) {
	// declare without memory
	// 6 7 9
	// 4 5 2
	
	int [][] cd = {{ 6, 7, 9  }, {4, 5, 2}};
	//System.out.println(cd[0][2]);
	
	// Nested loop
	// cd [0] [0]=6
	for(int y=0; y<2; y++) {
		for(int z=0; z<3; z++) {
			//System.out.print(cd[y][z] + " ");
			// cd [0] [0]=6
			System.out.print(" cd [" + y + "] ["+z +"]= " + cd[y][z]+ "");
			
		}
		System.out.println();
	}
}
}
