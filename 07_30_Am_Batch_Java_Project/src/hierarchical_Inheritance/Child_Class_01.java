package hierarchical_Inheritance;

public class Child_Class_01 extends Parent_Class{

	public void print() {
		System.out.println("Instance Method From Child_Class_01");
	}

	public static void main(String[] args) {
		Child_Class_01 c1 = new Child_Class_01();
		c1.getData(); // Parent Instance Method
		get();       //  Parent Static Method
		c1.print(); // Child_Class_01 Instance Method
	}
}
