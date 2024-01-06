package string;

public class Class_007 {

	public static void main(String[] args) {
		
		String a ="Have a Happy and Safe Diwali";
		
		// Print characters in forward Direction
		//System.out.println(a.length());
	for(int y=0 ; y<a.length(); y++) {
		System.out.print(a.charAt(y)+" ");
	}
		
	// Print in reverse direction
//		for(int y = a.length()-1; y>=0; y--) {
//			System.out.print(a.charAt(y)+" ");
//		}
		
		System.out.println();
		StringBuffer c = new StringBuffer("Pranj");
		c.replace(0, 1, "A");
		System.out.println(c);
		
}}
