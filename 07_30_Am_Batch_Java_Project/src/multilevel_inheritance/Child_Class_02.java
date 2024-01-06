package multilevel_inheritance;

public class Child_Class_02 extends Child_Class_01{

	public void city() {
		System.out.println("Instance Method From Child Class-2");
	
	}
	// A-B-c-d
	public static void functionality() {
		System.out.println("Static Method From Child Class-2");
		}
	public static void main(String[] args) {
		
		Child_Class_02 c2= new Child_Class_02();
		c2.getData();          // Parent Instance Method
		get();                // Parent Static Method
		verify();            // Child Class _01 Static Method
		c2.go();            // Child Class _01 Instance Method
		c2.city();         // Child Class _02 Instance Method
		functionality();  // aaChild Class _02  Static Method
		}
}
