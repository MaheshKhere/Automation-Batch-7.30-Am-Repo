package constructor_001;

public class Constructor_003 {

	public Constructor_003() {
		System.out.println(" hiiii");
	}

	// Parameterized Constructor
	public void Constructor_003(int a, boolean e, char c) {
		System.out.println("bye");
		System.out.println(a);
		System.out.println(e);
		System.out.println(c);
	}

	public static void main(String[] args) {
		Constructor_003 c = new Constructor_003();
		// Constructor_003 c2= new Constructor_003(3,true, 'y');
		c.Constructor_003(24, false, 'r');
	}

}
