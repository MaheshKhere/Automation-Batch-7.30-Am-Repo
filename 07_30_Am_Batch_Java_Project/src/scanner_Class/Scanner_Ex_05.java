package scanner_Class;

import java.util.Scanner;

public class Scanner_Ex_05 {

	public static void main(String[] args) {
	
		// Scanner and Switch Statement Combination
		
		//print month between 1-12
		
		int month;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number between 1-12 to choose month:");
		month=sc.nextInt();
		
		switch(month) {
		case 1:
			System.out.println("Your Month is Jan");
		break;
		
		case 2:
			System.out.println("Your Month is feb");
		break;
		case 3:
			System.out.println("Your Month is mar");
		break;
		
		case 4:
			System.out.println("Your Month is Apr");
		break;
		case 5:
			System.out.println("Your Month is Jan");
		break;
		
		case 6:
			System.out.println("Your Month is Jun");
		break;
		
		case 7:
			System.out.println("Your Month is Jul");
		break;
		case 8:
			System.out.println("Your Month is Aug");
		break;
		
		case 9:
			System.out.println("Your Month is Sep");
		break;
		case 10:
			System.out.println("Your Month is Oct");
		break;
		
		case 11:
			System.out.println("Your Month is Nov");
		break;
		
		case 12:
			System.out.println("Your Month is Dec");
		break;
		
		default :
			System.out.println("Invalid Input");
		}

	}

}
