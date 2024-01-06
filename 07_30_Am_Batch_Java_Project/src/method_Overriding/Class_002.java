package method_Overriding;

 class Class003{
	public void a() {
		System.out.println("A method From Super Class");
	}
}

public class Class_002 extends Class003{
	public void a() {
		System.out.println("A Method From Sub Class");
	}

	public static void main(String[] args) {
		Class_002 c2 = new Class_002();
		c2.a();
	}
}
