package assignment_Batch_03_10_2023;

import java.util.Scanner;

public class Parent_class {
// Pranali Mam
	// .................Method has 4 Category.................

//  1. Method without Arguments and Without Return Type
	public static void m1() {

		System.out.println("Method without Arguments and Without Return Type");
	}

	// 2. Method with Arguments and Without Return Type

	public static void m2(int i) {
		int a = 30;
		System.out.println("Method with Arguments and Without Return Type :" + i);
	}

	// 3. Method without Arguments and With Return Type

	public static int m3() {

		System.out.println("Method without Arguments and With Return Type");

		return 20;
	}

	// 4. Method with Arguments and With Return Type
	public static int m4(int i) { // static method

		System.out.println(" Method with Arguments and With Return Type :" + i);
		return i;

	}

	public void get() { // instance overriding concept
		System.out.println("get method from parent class");
	}

	int h = 100; // data hiding concept

	public void datahiding(int w) {
		this.h = w;
		System.out.println("w");
		this.get(); // using this keyword
		System.out.println("Instance method");
	}

	public void city() {
		System.out.println("city method from parent class");
	}
	// .................datatype concepet

	static byte a; // short int long bydefault value = 0
	static float f;
	static double dd;
	static char abc;
	static boolean xyz;

	// ......................variable concepet..................
	static int num1 = 12; // static variable
	int num2; // instance variable

	public void m5() {
		int mobno; // local variable
	}

	public static void main(String[] args) {
		// ........method output ........
		m1();
		m2(30);
		int y = m3();
		System.out.println(y);
		m4(234);
		System.out.println(".....................");
		// .........Dataype output............
		System.out.println("The Default value of byte :" + a);
		System.out.println("The Default value of float : " + f);
		System.out.println("The Default value of double : " + dd);
		System.out.println("The Default value of char : " + abc);
		System.out.println("The Default value of boolean : " + xyz);
		System.out.println(".....................");
		// ....................variable output ................
		Parent_class p = new Parent_class();

		System.out.println(num1); // direct way ....... 3 way for call static variable
		System.out.println(p.num1); // with the help of className.variableName
		System.out.println(p.num1); // with the help of object creation
		System.out.println(p.num2); // num2 instance variable ko direct call nai kr sakte
		p.m5();
		p.datahiding(123); // data hiding

		System.out.println(".....................");

		// ......................If Else If concept ..............
		String city = "Nashik";

		if (city == "Nagpur") {
			System.out.println("city is Nagpur");
		} else if (city == "Nashik") {
			System.out.println("city is Nashik");
		} else if (city == "Pune") {
			System.out.println("city is Pune");
		} else {
			System.out.println("you are in different city");
		}
		System.out.println(".....................");
		// .....................combination of switch and scanner class ...............
		int Day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Select any number from 1-7 to choose Day:");
		Day = sc.nextInt();
		System.out.println(".....................");

		switch (Day) {
		case 1:
			System.out.println("your Day is monday");
			break;

		case 2:
			System.out.println("your Day is Tuesday");
			break;
		case 3:
			System.out.println("your Day is Wednesday");
			break;

		case 4:
			System.out.println("your Day is Thursday");
			break;
		case 5:
			System.out.println("Your Day is Friday");
			break;

		case 6:
			System.out.println("Your Day is Saterday");
			break;

		case 7:
			System.out.println("Your Day is Sunday");
			break;

		default:
			System.out.println("Invalid Input");
			break;
		}
		System.out.println(".....................");
		// ................Array with scanner...........................

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Your Array Size");
		int size = sc.nextInt();

		int[] city1 = new int[size];

		for (int i = 0; i < city1.length; i++) {
			System.out.println(city1[i]);
		}
		System.out.println(".....................");
		// ...............Multidimentional array..................
		int z[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // 3/3 form

		for (int x = 0; x < 3; x++) {
			for (int s = 0; s < 3; s++) {
				System.out.print(z[x][s] + "   ");
			}
			System.out.println();
		}
		System.out.println(".....................");
		// ....................looping do while loop....................
		int i = 20;
		do {
			System.out.println(i);
			i++;
		} while (i <= 30);// {//

//		System.out.println(i);         // using while loop
//		f--;
//		}	
//	
		System.out.println(".....................");

		// ....................nested for loop .............
//	for (int v = 0; v <3; i++) {
//		for (int x = 0; x <=5 ; x++) {
//			System.out.println(v+ " " +x);
//		}
//
//	}
		String a = "Pranali";
		System.out.println("length of String" + a.length());                     // find length -7
		String m = a.replace('n', 'b');                                       // replace char -Prabali
		System.out.println(m);
		System.out.println(a.indexOf("i"));                                 // index value -6
		System.out.println(a.substring(4));                                 // skip char - ali
		System.out.println(a.charAt(5));                                   // index char - l
		System.out.println(a.concat(" ksh"));                             // join string - Pranali ksh
		System.out.println(a.toLowerCase());                               // -p
		System.out.println(a.toUpperCase());                               // RANALI
		System.out.println(".....................");
		String s = new String(" How are ");                               // join string
		System.out.print(a.trim());                                         // -How are you
		System.out.print("you");
		System.out.println(".....................");
		String n = new String(" ");
		System.out.println("Is String empty:- " + n.isEmpty());                 // - true
		System.out.println(a.contains("Pranali"));                               // contains total string -true
		System.out.println(a.equals("sound"));                                    // not match string -false
		System.out.println(".....................");
		String g = "pranali";
		System.out.println(a.equalsIgnoreCase(g));                            // ignore capital letter - true
		System.out.println(a.endsWith("ing"));                              // find ending char - false

	}
}
