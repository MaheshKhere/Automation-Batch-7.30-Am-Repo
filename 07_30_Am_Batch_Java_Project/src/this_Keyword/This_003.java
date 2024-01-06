package this_Keyword;

public class This_003 {

	public This_003() {
		// We are calling parameterized constructor in user defined const..
		this(5);
		System.out.println("I am user defined constructor");
	}

	// user defined constructor call in parameterized const..
	public This_003(int x) {
		this(5, 7);
		System.out.println("Value of x is- " + x);
		System.out.println("One Parameterized constructor");
	}
	public This_003(int y, int z) {
		System.out.println("Two parameterized Constructor");
		System.out.println(y);
		System.out.println(z);
	}

	public static void main(String[] args) {
     // Created Class object for no argument constructor
		This_003 t3 = new This_003();
    }
}
