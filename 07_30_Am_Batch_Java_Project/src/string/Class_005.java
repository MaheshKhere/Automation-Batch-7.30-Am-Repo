package string;

public class Class_005 {

	public static void main(String[] args) {
		String s = "Pranjali";
		String r = "PRAnjali";
		String w = "ab";
		String a = " Jyoti " + "Jiwtode";

		// to check string is empty
		System.out.println("Is String is Empty:- " + s.isEmpty());

		// To Get Length of String
		// int n = s.length();
		// System.out.println(r);
		System.out.println("The length of String is:- " + s.length());

		// Replace some character of String
		System.out.println("The New String after of Replacing is:- " + s.replace("Pranjali", "Jyoti"));

		// To Get Substring
		System.out.println("SubString with Beginning Index is:- " + s.substring(4));
		System.out.println("SubString with Beginning Index and Ending Index:- " + s.substring(3, 6));

		// To check character wrt index
		System.out.println("Character at Index 5 is:- " + s.charAt(5));

		// To add another string
		System.out.println("Add new String is:- " + s.concat(" Jiwtode"));
		// System.out.println(a);

		// To make lower case
		System.out.println("Make String in lowercase is:- " + s.toLowerCase());

		// To Make uppercase
		System.out.println("To Make String in Uppercase is:- " + s.toUpperCase());

		// To remove space
		System.out.println("After Remove Space:- " + s.trim());
		// System.out.print(w);
		// System.out.println(a.trim());

		// To check character in string
		System.out.println("Is String Contain character is:- " + s.contains("jayli"));

		// To check two string
		System.out.println("Check Two String is equal or not:-" + s.equals("Pranjali"));

		// To check ignore case
		System.out.println("Ignore Case of String is:- " + s.equalsIgnoreCase("PRANJALI"));

		// Ends with
		System.out.println("Is Name Ends with li is:- " + s.endsWith("li"));

		// To get index
		System.out.println("To get Index of j is:- " + s.indexOf("j"));

	}
}
