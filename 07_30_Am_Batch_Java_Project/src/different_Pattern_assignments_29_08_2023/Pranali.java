package different_Pattern_assignments_29_08_2023;

import java.util.Scanner;

public class Pranali {

	public static void main(String[] args) {
	   //Inverted half pyramid with numbers
		
		int rows ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows : ");
		rows = sc.nextInt();
		
		for(int i=rows; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");
      //Inverted Half Triangle
		
		int row = 4;
		for (int i = row; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	

}
