package method_Types;

public class Method_argument {
	int i;
	int b;
	
	// I want value of instance variable with help of method.
	public void sub(int x) {
		i=x;
	}
	
	public void add(int y) {
		b=y;
	}

	public void display_value() {
		System.out.println("the value x is-"+i);
		System.out.println("the value y is-"+b);
	}
	
	public static void main(String[] args) {
		Method_argument mg = new Method_argument();
		mg.sub(56);
		mg.add(25);
		mg.display_value();
	}
}
