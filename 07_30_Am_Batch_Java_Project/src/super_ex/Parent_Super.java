package super_ex;

public class Parent_Super {

	double v = 30.04;

	public Parent_Super() {
		
		System.out.println(" I am user defined cons. from parent Class");
	}
	
	public Parent_Super (int x) {
		this();
		System.out.println("I am one parameter const. from parent Class");
	}
	
//	public Parent_Super (int a, int b) {
//		
//		System.out.println(" i am two parameter const. from parent");
//	}

	public void display() {
		System.out.println("I am Instance method from parent Class");
	}

	public static void main(String[] args) {
		
	}
}
