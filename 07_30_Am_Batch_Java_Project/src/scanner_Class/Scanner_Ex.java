package scanner_Class;

import java.util.Scanner;

public class Scanner_Ex {

	public static void main(String[] args) {
		int a = 30;
		int b = 60;
		// Scanner Class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int input_1 = sc.nextInt();
		System.out.println("Enter 2nd Number");
		int input_2 = sc.nextInt();
		 int total_input = input_1 * input_2;
		System.out.println("Multiplication of given Number is " + total_input);

	}

}
