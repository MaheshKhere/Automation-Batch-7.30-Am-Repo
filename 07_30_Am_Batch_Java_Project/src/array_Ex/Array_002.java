package array_Ex;

public class Array_002 {

	
	public static void main(String[] args) {
		int [] age = new int [4];
		age[0]= 20;
		age[1]= 50;
		age[2]= 30;
		age[3]= 30;
		//System.out.println(age[2]);
		 
		// To determine length of array
		System.out.println(age.length);
		
		for ( int x= 0; x<age.length; x++) {
			System.out.println(age [x]);
		}
		
		System.out.println("-------------------------");
		for(int e :age) {
			System.out.println(e);
		}
	}

}
