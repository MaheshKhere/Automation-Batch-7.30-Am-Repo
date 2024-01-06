package scanner_Class;

import java.util.Scanner;

public class Scanner_Ex_04 {

	public static void main(String[] args) {
		
		String c = "ab";
		Scanner sc = new Scanner(c);
	
		// To verify scanner class contains string
		// control+shift+o
	System.out.println("Assign Value -" +sc.hasNext());	
	
	System.out.println("Given String is- "+sc.nextLine());
	}

}
