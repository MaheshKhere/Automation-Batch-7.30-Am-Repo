package super_ex;

public class Super_004 extends Parent_Super {

	public Super_004() {
		super(5);
		System.out.println("I am user defined cons. from child Class");
	}
	
	public static void main(String[] args) {
		Super_004 s4 = new Super_004();
	}
}
