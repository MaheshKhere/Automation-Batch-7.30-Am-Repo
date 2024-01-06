package array_Ex;

public class Class_001 {
	
public static void main(String[] args) {
	// declare memory 
	// 3 7 
	// 5 9
	
	int [][] ab= new int [2][2];
	
	ab[0][0]= 3;
	ab[0][1]= 7;
	ab[1][0]= 5;
	ab[1][1]= 9;
	//System.out.println(ab[1][1]);
	
	// Nested loop 
	for (int v=0;v<2; v++) {
		for(int y =0; y<2; y++) {
			System.out.print(ab[v][y]+ " ");
		}
		System.out.println();
	}
}
}
