package array_Ex;

import java.util.Scanner;

public class Array_005 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Array Size");
		
		 int size = sc.nextInt();
		 
		 double [] age = new double [size];
		 System.out.println("Enter Array values");
		 
		 // for input
		 for (int i =0 ; i<size; i++) {
			 age [i] =sc.nextDouble();
		 }
		 System.out.println("----------------");
		 
		 // for output
		 for(int x=0; x<size; x++) {
			 System.out.println(age[x]);
		 }
	}
}
