package hierarchical_Inheritance;

public class Child_Class_02 extends Parent_Class {

	public void a() {
		System.out.println("Instance Method From Child_Class_02");
	}

	public static void main(String[] args) {
		Child_Class_02 c2 = new Child_Class_02();
		c2.getData(); // Parent Instance Method
		get();       // Parent Static Method
		c2.a();     // Child_Class_02 Instance Method
	}
}
