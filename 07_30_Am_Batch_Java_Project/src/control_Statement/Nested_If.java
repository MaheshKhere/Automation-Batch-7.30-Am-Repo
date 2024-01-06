package control_Statement;

public class Nested_If {

	public static void main(String[] args) {
		Nested_If n = new Nested_If ();
		
		
		long l = 20000;
		
		if (l == 20000) {
			System.out.println("20000");
			if (l > 10000) {
				System.out.println("No. is  equal to 20000");
				if (l < 30000) {
					System.out.println("No is less than 30000");
				}
			} else {
				System.out.println("No is different");
			}
		}
	}

	

}
