package method_Overriding;

class Parent_Class {

	public Number workhard(int x) {
		System.out.println("Super Class Work Hard");
		return x;
	}
}

public class Class_001 extends Parent_Class {

	public Integer workhard(int x) {
		System.out.println("Sub Class Work Hard");
		return x;
	}

	public static void main(String[] args) {
		Class_001 c = new Class_001();
		c.workhard(4);
		Parent_Class p = new Class_001();
		p.workhard(5);
	}
}
