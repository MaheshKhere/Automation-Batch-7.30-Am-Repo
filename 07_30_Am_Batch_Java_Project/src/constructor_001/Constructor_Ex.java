package constructor_001;

public class Constructor_Ex {
	
	// user defined constructor/ default 
	public Constructor_Ex () {
		System.out.println(" hiii");
	}
 
 // parameterized Constructor
 
 public Constructor_Ex (int a, int b, double d){
	 System.out.println("Value of a "+ a);
	 System.out.println("Value of b "+ b);
	 System.out.println("Value of d "+ d);
 }
 
// Method return statement
public static String name_01(String name) {
	System.out.println("Your Name is " +name);
	return name;
}

public static int verifySum(int a , int b ) {
	
	int sum = a+b;
	System.out.println(sum);
	return sum;

	
}

public static int verifyProduct(int x , int y) {
	
	return x*y;
}

	public static void main(String[] args) {
		
 
  Constructor_Ex c1 = new Constructor_Ex(40, 50, 60.90);
  System.out.println(verifyProduct(20, 20));
  verifySum(50, 10);
  name_01("peter");
  
  
	}

}
