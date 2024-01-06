package inheritance_01;

public class Child_Class_01 extends Parent_Class {
	// is-a relationship

	String s = "xyz";

	public void city() {
		System.out.println("I am instance method from child");
	}

	public static void go() {
		System.out.println("I am Static method from child");
	}

	public static void main(String[] args) {
		
		// Property No-1
		Child_Class_01 c1 = new Child_Class_01();
		c1.city_2();  // Parent Instance Method
		go_1();      // Parent Static Method
		c1.city();  // Child Instance Method
	    go();      // Child Static Method
	
		// Property No-2
		Parent_Class p = new Parent_Class(); // has relationship
		p.city_2();
		go_1();
		
		// Property No-3
		Parent_Class p1 = new Child_Class_01();
		p1.city_2();
		p1.city_2();
		
		// Property No-4
		//Child_Class_01 c3 = new Parent_Class();
			
	}
}
