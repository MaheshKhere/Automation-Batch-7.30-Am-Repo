package different_Pattern;

public class Hallow_Rectangle {

	public static void main(String[] args) {
		
		// hallow Rectangle
		
//		* * * * *
//		*       *
//		*       *
//		* * * * *   // row =1 end=4 *
		            // col= 1 end =5
		

		int row =4;
		int col=5;
		
		for(int i =1; i<=row; i++) {
			for(int j=1; j<=col; j++) {
				// we are on (i,j)
				if(i==1 || j==1 || i==4  || j==5) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
		System.out.println();
		}

	}

}
