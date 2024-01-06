package different_Pattern;

public class Invertd_Half_Pyramid_RotateBy_180 {

	public static void main(String[] args) {
		int row=4;
		//outer Loop 
		for(int i=1; i<=row; i++) {
		for(int j=1; j<=row-i;j++) {
			// To Print Space
			System.out.print(" ");
		}
		// To Print Star
		for(int x=1; x<=i;x++) {
			System.out.print("*");
		}
		
		System.out.println();
	
		}

	}

}
