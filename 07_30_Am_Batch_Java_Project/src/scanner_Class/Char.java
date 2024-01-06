package scanner_Class;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
	char a;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Single Character");
	a= sc.next().charAt(0);
	System.out.println("Your Single Character is- "+a);
	}

}
