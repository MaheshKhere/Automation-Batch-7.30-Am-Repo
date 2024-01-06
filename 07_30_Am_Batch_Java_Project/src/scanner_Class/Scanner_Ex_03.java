package scanner_Class;

import java.util.Scanner;

public class Scanner_Ex_03 {

	public static void main(String[] args) {
		
		// two String input from user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		
		String ab = sc.nextLine();
		System.out.println("Enter Surname");
		String xy = sc.nextLine();
		
		System.out.println("Your Full name is " +ab + xy);
//System.out.println("hii"+a+b);
	}

}
