package array_Ex;

import java.util.Scanner;

public class Array_003 {

	public static void main(String[] args) {
		
		// Take Array from User
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Your Array Size");
		int size = sc.nextInt();
		
		int [] city = new int[size];
		System.out.println("Enter Your Array Values");
		
		// For input value
		for(int x=0; x<size; x++) {
			city [x]= sc.nextInt();
		}
		
		System.out.println("Your Array output values ");
		
		// for output values
		for (int i = 0; i <city.length; i++) {
			System.out.println(city[i]);
		}
	}

}
