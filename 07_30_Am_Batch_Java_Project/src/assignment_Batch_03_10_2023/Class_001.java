package assignment_Batch_03_10_2023;

import java.util.Scanner;

public class Class_001 {
// Rashami Mam
	int i;
	int x = 20;                                   // inst. variable
	static double d = 60.235;                    // static variable
	short s = 693;

	public void instancemethod(int v) {
		i = v;                           // value of inst var using method argument
	}

	public void display() {
		System.out.println("The value of v is " + i);
		System.out.println("Parent class display method");
	}

	public static void go() {                          // static method
		byte b = 30;
		System.out.println(b);                   // access local var directly
	}

	protected Class_001() {                      // user-defined cons with protected access mod
		System.out.println("User defined constructor");
	}

	public Class_001(int x) {
		this();                             // using this keyword to call default cons
		System.out.println("Parameterised constructor parent class");
	}

	public void methodoverloading(int r) {
		System.out.println("Methodoverloading with int datatype");
	}

	public void methodoverloading(float f) {
		System.out.println("Methodoverloading with float datatype");
	}

	public void methodoverriding() {
		System.out.println("Methodoverring from parent class");
	}

	public static void main(String[] args) {
		Class_001 cs = new Class_001(500);
		System.out.println(cs.x);                     // access inst var
		System.out.println(d);                      // access static var directly
		go();                                     // calling static method directly
		cs.instancemethod(400);                // calling inst method using class ref var.
		cs.display();
		cs.methodoverloading(100);
		cs.methodoverloading(306f);
		
    System.out.println("---------------------------------------------------------------");
    
		char alpha;
		Scanner sc = new Scanner(System.in);       
		System.out.println("Choose the alphabet from A to D");
		alpha = sc.next().charAt(0);

		switch (alpha) {                                         // switch block using scanner class
		case 'A':
			System.out.println("You have entered alphabet A");
			break;                                              // break keyword
		case 'B':
			System.out.println("You have entered alphabet B");
			break;
		case 'C':
			System.out.println("You have entered alphabet C");
			break;
		case 'D':
			System.out.println("You have entered alphabet D");
			break;
		default:
			System.out.println("Invalid");
		}
	}
}
