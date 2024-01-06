package this_Keyword;

public class This_007 {

	public This_007 () {
		System.out.println("No Parameterized Constructor");
	}
	public This_007 (int a) {
		this();
		System.out.println("One Parameterized Constructor");
	}
	
	public This_007(int a, int b) {
		this(4);
		System.out.println("Two Parameterized Constructor");
	}
	
	public This_007 (int s, long l, String x) {
		this(10,30);
		System.out.println("Three Parameterized Constructor");
	}
	
	public static void main(String[] args) {
		
	// Create class object with highest Parameterized Constructor
		
	This_007 t7= new This_007(3,69, "xyz");
	}

}
