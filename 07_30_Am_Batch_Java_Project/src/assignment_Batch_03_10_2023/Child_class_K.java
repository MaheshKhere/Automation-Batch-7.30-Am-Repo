package assignment_Batch_03_10_2023;

public class Child_class_K extends Parent_class_K {
	// Ketki Mam
	int i = 35; // instance variable

	public void Child_method() { // instance method
		System.out.println(super.i); // parent class variable called using super keyword
	}

	public void method_p() {
		super.method_p();
	}

	public Child_class_K() {
		super();
	}

	// Inheritance Concept
	String s = "Ketki"; // Instance variable

	public void method_02() { // instance method
		System.out.println("I am instance method from child");
	}

	public static void method_002() { // instance method
		System.out.println("I am Static method from child");
	}

	//Overriding Concept
		public void b() {
			System.out.println("Method with int datatype");
		}
		public  void b(float x) {
			System.out.println("Method with float datatype");
			
		}
		public static void b(String x) {
			System.out.println("Method with String datatype");
			
		}

	public static void main(String[] args) {
			//Inheritance Concept
			//Property No 1
			Child_class_K c1 = new Child_class_K();
			System.out.println(c1.a); //Parent class
			System.out.println(c1.r); //Parent class
			System.out.println(c1.s);//child class
			c1.method_01(); //Parent class
			c1.method_001();//Parent class
			c1.method_02();//child class
			c1.method_002();//child class
			
			//Property No.2
			Parent_class_K p1 = new Parent_class_K();
			System.out.println(p1.r); //Parent class
			System.out.println(p1.a); //Parent class
			p1.method_01(); //Parent class
			p1.method_001(); //Parent class
			
			//Property No.3
			Parent_class_K p2 = new Child_class_K();
			System.out.println(p2.r); //Parent class
			System.out.println(p2.a); //Parent class
			p2.method_01(); //Parent class
			p2.method_001();//Parent class
			c1.Child_method();  
			
			//Not possible because we have to cast class object.
			//Overriding Concept
			c1.b();
			c1.b(60.4565f);
			c1.b("xsyffr");

}}
