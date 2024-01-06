package hierarchical_Inheritance;

public class Child_Class_03 extends Parent_Class{
	
	public void b() {
		System.out.println("Instance Method From Child_Class_03");
	}
	public static void main(String[] args) {
		Child_Class_03 c3 = new Child_Class_03 ();
		
		
		c3.getData();  // Parent Instance Method
		get();        // Parent Static Method
		c3.b();      // Child_Class_03 Instance Method
	}
}
