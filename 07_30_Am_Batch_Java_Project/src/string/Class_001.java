package string;

public class Class_001 {

	String t = "Nagpur";

	public static void main(String[] args) {
		String s = "ab";
		String a = "";
		 System.out.println(s.isEmpty());
		System.out.println(a.isEmpty());

		// To check length of character
		String v = "Wardha";
		int h = v.length();
		// System.out.println(h);
		// System.out.println(v.length());

		// To replace some character from given string
		Class_001 c1 = new Class_001();
		System.out.println(c1.t.replace('g', 'k'));

		// To get index with respect character
		String c = "city";
		// System.out.println(c.indexOf("y"));

		// To get Substring with respect to index
		String b = "Automation";
//		System.out.println(b.substring(3));
//		System.out.println(b.substring(2, 9));

		// To get character with respect index
		String n = "Mobile";
		char k = n.charAt(4);
		//System.out.println(k);
		//System.out.println(n.charAt(2));

		// Add another string in given String
		String p = "Nagpur";
		String z = " is city";
//		System.out.println(p.concat(z));
//		System.out.println(p.concat(" is a village"));
//		System.out.println(p + z);
//		System.out.println(p + " is a small city");

       // To get String in character in lowercase
		String ab="pune";
		//System.out.println(ab.toLowerCase());
		
		// Uppercase
		//System.out.println(ab.toUpperCase());
		String cd ="String-in:character";
		
		
	}

}
