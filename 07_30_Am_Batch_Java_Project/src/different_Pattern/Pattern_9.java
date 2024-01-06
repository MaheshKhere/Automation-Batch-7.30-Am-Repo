package different_Pattern;

public class Pattern_9 {

	public static void main(String[] args) {
//	        *   -3 space +1star
//	      * *   -2 Spaces +2star
//	    * * *   -1 spaces +3star
//	  * * * *   -0spaces+4 star
		int row=4;
		for(int i =1;i<=row;i++) {
			// To Print Space
			for(int j=1; j<=row-i;j++) {
				System.out.print(" ");
			}
			// To Print *
			for(int x=1;x<=i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
	}

}
