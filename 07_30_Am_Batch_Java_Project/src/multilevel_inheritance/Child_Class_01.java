package multilevel_inheritance;

public class Child_Class_01 extends Parent_Class{

	public void go() {
		System.out.println("Instance Method From Child Class-1");
	}
	
	public static void verify() {
		System.out.println("Static Method From Child Class-1");
		}
	
	public static void main(String[] args) {
		
		Child_Class_01 c1= new Child_Class_01();
		c1.getData(); // Parent Instance Class 
		get();       // Parent Static Method 
		c1.go();    // Child Class _01 Instance Method
		verify();  // Child Class _01 Static 

	}
}
