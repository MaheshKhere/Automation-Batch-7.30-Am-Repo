package method_Types;

public class Methods_types {

	// Instance Variable or non static variable or instance global
	int i = 2000;
	
	// Static variable or static global variable
	static double d = 289.4567;
	
	// Instance Method
	public void a() {
		System.out.println("Access Instance Variable in instance method is-" + i);
		System.out.println("Access Static Variable in instance method is-"+ d);
	}
	
	// Static Method 
	public static void b() {
		short s = 70; 
		Methods_types mt = new Methods_types ();
		System.out.println("Access instance variable in static method is-"+mt.i);
		System.out.println("Access local variable in static method is-" + s);
		System.out.println(s); // access local variable directly
		}
	
	    public static void main(String[] args) {
		Methods_types mt_1 = new Methods_types();
	
		System.out.println(mt_1.i); // Access Instance Variable
		mt_1.a(); // Access instance method 
		
		// Access Static Variable directly and by class name
		System.out.println(d);
		System.out.println(Methods_types.d);
		
	    // Access Static method directly and by class name
		b();                
		Methods_types.b(); 	
	}
}
