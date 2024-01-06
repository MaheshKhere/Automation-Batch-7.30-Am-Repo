package super_ex;

public class Super_002 extends Parent_Super{

	public void display () {
//		super.display();
		System.out.println(" i am child class ");
	}
	public static void main(String[] args) {
		Super_002 s2= new Super_002();
		s2.display();

	}

}
