package array_Ex;

public class Array_001 {

	public static void main(String[] args) {
		// By allocating Memory
		int[] marks = new int[6];
		// int marks []= new int [5];

		// To assign Values
		marks[0] = 50;
		marks[1] = 60;
		marks[2] = 45;
		marks[3] = 95;
		marks[4] = 55;
		marks[5]= 99;
		
		// To print any value
		//System.out.println(marks[3]);
		
		// To print All Values 
		for (int i =0 ; i<6 ; i++) {
			System.out.println(marks[i]);
		}
		System.out.println("---------------------------------------");
       // for each loop 
		for(int x:marks) {
			System.out.println(x);
			
		}
		System.out.println("-----------------");
		
		// Array without memory allocation-1D Array
		int [] a = {2,4,6,4,5,6,7,9,20,67,38,90,50,11111,111,45};
		System.out.println(a[2]);
		System.out.println("Length of Array is- " + a.length);
		System.out.println("-----------------");
		for (int i=0 ; i<16; i++) {
			System.out.println(a[i]);
		}
	}
	
	

}
