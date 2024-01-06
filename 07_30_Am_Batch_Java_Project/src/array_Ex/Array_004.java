package array_Ex;

public class Array_004 {

	public static void main(String[] args) {
		// Declaration of 1-D-Array
			int [] age = new int [4];
			// Assign value
			age[0]= 1;
			age[1]= 5;
			age[2]= 7;
			age[3]= 8;

		
			
			// for loop
			for (int i =0 ; i <4;i++) {
				System.out.println(age[i]);
			}
			System.out.println("----------------------------------");
			// for each 
			for(int h : age) {
				System.out.println(h);
			}
	}

}
