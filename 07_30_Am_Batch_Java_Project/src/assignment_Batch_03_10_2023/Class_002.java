package assignment_Batch_03_10_2023;

public class Class_002 extends Class_001 implements Interface_001 {
	// Rashami Mam
	short s = 53;

	public void done() {
		System.out.println(super.s);                     // used super keyword to access parents inst var
	}

	public void display() {
		super.display();                              // to access parent class inst method
	}

	public Class_002() {
		super(10);                                  // to call parent class parameterised constructor
		System.out.println("user defined constructor from child class");
	}

	public void methodoverriding() {
		System.out.println("Methodoverring from child class");
	}

	@Override
	public void m1() {
		System.out.println("m1 method from interface");

	}

	@Override
	public void m2() {
		System.out.println("m2 method from interface");

	}

	private int x = 500;              // hiding variable using private access modifier

	private void hidevalue(int z) {
		x = z;                       // hiding value
		System.out.println(x);
	}

	public static void main(String[] args) {
		Class_002 cs = new Class_002();
		cs.done();
		cs.display();
		cs.methodoverriding();                // child class method
		cs.m1();                             // calling method from interface
		cs.m2();                            // calling method from interface
		cs.hidevalue(36);
		
     System.out.println("----------------------------------------------");
     
		char signal = 'G';                   // if else if ladder
		if (signal == 'R') {
			System.out.println("Stop");
		} else if (signal == 'Y') {
			System.out.println("Warning");
		} else if (signal == 'G') {
			System.out.println("Go");
		}else {
			System.out.println("Invalid");
		}
		
		System.out.println("--------------------------------------------");
		
		int[][] ab = { { 5, 6, 8 }, { 4, 6, 9 }, { 7, 4, 2 } };  
		// multidimensional array using nested for loop without allocating memory

		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				System.out.print(ab[x][y] + " ");
			}
			System.out.println();
		}}
}
