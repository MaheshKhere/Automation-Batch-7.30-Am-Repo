package string;

public class String_Ex {

	public static void main(String[] args) {
		String a = "We are in Practice batch";
		String r = "We Are In Practice Batch";
		
		if (a.contains("e")) {
		System.out.println("in is present in above string");
		}
		System.out.println("Condition is false");
	
		String b = "Laptop";
		String c ="java m";
		System.out.println(c.replace("a", "n"));
		c.contains(c);
		c.equals(c);
		c.equalsIgnoreCase(a);
		c.endsWith(c);
		if(a.equals(r)) {
			System.out.println(" Both String is equal");
		}
			
			if(a.equalsIgnoreCase(r)) {
				System.out.println("Both Strings are equal ignore case");
			}
			
			if(!(b.endsWith("l"))) {
				System.out.println("Ends with p");
				
			}
		}
	
	}

	


