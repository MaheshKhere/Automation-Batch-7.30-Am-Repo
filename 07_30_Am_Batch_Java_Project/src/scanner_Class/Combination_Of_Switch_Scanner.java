package scanner_Class;

import java.util.Scanner;

public class Combination_Of_Switch_Scanner {

	public static void main(String[] args) {
		
		// Take two input from user
		String ab ;
		int num1,num2,num3, result;
	
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Choose an Operator from given: + , -, * or/");
	ab= sc.nextLine();
	
	
	// input 1
	System.out.println("Enter 1 st number");
	num1=sc.nextInt();
	
	// input 2
	System.out.println("Enter 2 st number");
	num2=sc.nextInt();
	
	
	switch(ab) {
	
	case  "+" :
		result=num1+num2;
		System.out.println(num1+ " + "+num2 + " = " +result);
		break;
		
	case "-" :
		result = num1 - num2;
		System.out.println(num1+ " - "+num2 + " = " +result);
	break;
	
	case "*":
		result = num1 * num2;
		System.out.println(num1+ " * "+num2 + " = " +result);
	break;
	case "/":
		result = num1 / num2;
		System.out.println(num1+ " / "+num2 + " = " +result);
	break;
	default :
		System.out.println("Invalid Operator");
	}
	}

}
