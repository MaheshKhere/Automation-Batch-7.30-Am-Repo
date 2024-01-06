package scanner_Class;

import java.util.Scanner;

public class Scanner_08 {

	public static void main(String[] args) {

		String ab;
		int num1, result;
		int num2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Choose an operator from given: +, -, * or /");
		ab = sc.nextLine();
		System.out.println("Enter 1st number");
		num1=sc.nextInt();
		System.out.println("Enter 2nd number");
		num2=sc.nextInt();
		
		switch (ab) {
		
		case "+":
			result= num1+num2;
			//System.out.println(num1+ "+" +num2 +"="+result);
			System.out.println("Addition of two numbers is " +result);
			break;
		
		case "-":
			result= num1-num2;
			System.out.println(num1+ "-" +num2 +"="+result);
			//System.out.println("Subtract of two numbers is " +result);
			break;
			
		case "*":
			result= num1*num2;
			System.out.println(num1+ "*" +num2 +"="+result);
			//System.out.println("Multiplication of two numbers is " +result);
			break;
		case "/":
			result= num1/num2;
			System.out.println(num1+ "/" +num2 +"="+result);
			//System.out.println("Division of two numbers is " +result);
			break;
		}
		
	}

}
