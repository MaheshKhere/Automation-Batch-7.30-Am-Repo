package assignment_Batch_03_10_2023;

import java.util.Scanner;

public class All_java_concepts {

	// Ketki Mam
	static int point = 82; // Static Variable
	int i; // instance variable
	long l; // instance variable


// Operators in Java
	public static void operators() { // Arithmetic operators
		int a = 50;
		int c = 30;
		System.out.println(a + c);
		System.out.println(a - c);
		System.out.println(a * c);
		System.out.println(a / c);
		System.out.println(a % c);
		System.out.println(a++);
		System.out.println(a--);

		int x = 80;
		int y = x + 30;
		System.out.println(y); // Assignment operators

		int z = 80;
		int s = 30;
		System.out.println(z > s); // Comparison operators
		System.out.println(z < s);
		System.out.println(z <= s);
		System.out.println(z >= s);
		System.out.println(z == s);
		System.out.println(z != s);

		int g = 100;
		int k = 40;
		System.out.println(g < 100 && k < 40); // Logical Operators

		int f = 400;
		int e = 200;
		System.out.println(!(g < 50 && k > 100));

	}


//Decision Making Statements
	public static void If_statments() {

		int n = 200; // Simple if statement
		if (n > 100) {
			System.out.println("n is greater than 100");
		}

		int age = 18; // if else Statement
		// checking the age
		if (age <= 18) {
			// if the condition is true
			System.out.println("Able to vote");
		} else {
			System.out.println("Unable to vote");
		}

		int marks = 95; // Local Variable // if else if Statement
		// checking marks using if-else-if ladder statements
		if (marks < 50) {
			System.out.println("Fail");
		} else if (marks >= 50 && marks < 60) {
			System.out.println("D grade"); // && operator - returns true if the conditions are true.
		} else if (marks >= 60 && marks < 70) {
			System.out.println("C grade");
		} else if (marks >= 70 && marks < 80) {
			System.out.println("B grade");
		} else if (marks >= 80 && marks < 90) {
			System.out.println("A grade");
		} else if (marks >= 90 && marks < 100) {
			System.out.println("A+ grade");
		} else {
			System.out.println("Invalid");
		}

		int x1 = 10;   //Nested if Statement
		int x2 = 20;

		if (x1 == 10) {
			if (x2 != 20) {
				System.out.println("Not equals to 20");
			} else {
				System.out.println("Equals to 20");
			}
		}
	}


// Switch Statement i Java
	public static void Switch_Statement () {  
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("28 - Small size");
		System.out.println("30 - Medium size");
		System.out.println("32 - Large size");
		
		i = sc.nextInt();
		
		switch (i) {
		case 1 : 
			System.out.println("T-shirt size is S");
			break;
		case 2 : 
			System.out.println("T-shirt size is M");
			break;
		case 3 : 
			System.out.println("T-shirt size is L");
			break;
		case 4 : 
			System.out.println("T-shirt size is XL");
			break;
		case 5 : 
			System.out.println("T-shirt size is XXL");
			break;
		default : 
			System.out.println("Invalid size");
			break;
			
		}
	}


public void Scanner_class () {
		// Create a scanner object which is used to get user input in the console
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name -");
		String name = sc.nextLine(); // String input

		// Numerical input
		System.out.println("Enter age -");
		int age = sc.nextInt();
		System.out.println("Enter CGPA -");
		double cgpa = sc.nextDouble();

		// Output input by user
		System.out.println("Name - " + name);
		System.out.println("Age - " + age);
		System.out.println("CGPA - " + cgpa);
	}



public static void Control_loops() {
		
		for (int i =1; i<=10;i++) {  //for loop
			System.out.println("i value :" + i);
		}
		
		int i = 1;            //while loop
		while (i<=6) {
			System.out.println(i);
			i++;
		}
		
		int x = 5;        //do while loop
		do {
			System.out.println("x =" +x);
			x++;
		}
		while (x<=12);
	}


//All Constructor called using this keyword.
	public All_java_concepts() {  //user defined constructor
		this (5);
		System.out.println("User defined constructor");
	}
	
	public All_java_concepts(int a) {
		this (2,6);
		System.out.println("One parameterized constructor");
	}
	
	public All_java_concepts(int x,int b) {
		System.out.println("Two parameterized constructor");
	}

public static void main(String[] args) {
		
		operators();
		If_statments();
		Switch_Statement();
		All_java_concepts ab = new All_java_concepts();
		ab.Scanner_class();
		Control_loops();

}
}
