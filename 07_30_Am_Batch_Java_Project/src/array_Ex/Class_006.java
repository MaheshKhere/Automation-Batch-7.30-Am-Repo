package array_Ex;

import java.util.Scanner;

public class Class_006 {
	

	public static void main(String[] args) {
		// Take array from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size = sc.nextInt();
		
		// declare Array with memory allocation
		int [] xy = new int [size];
		
		System.out.println("Enter Array Values");
		
		// for input value
		for(int x = 0; x < size ; x++) {
			 xy[x]= sc.nextInt();
		}
		System.out.println("---------------------");
		
		// for output values
//		for(int z=0 ; z < size; z++) {
//			System.out.println(xy[z]);
//		}
     for (int c : xy) {
    	 System.out.println(c);
     }
	}

}
