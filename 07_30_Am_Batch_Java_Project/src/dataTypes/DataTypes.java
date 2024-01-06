package dataTypes;



class DataTypes {

	// Numeric Data Type-4
	public byte b = 56;
	protected short z = 345;
	private short s = 29;
	int i = 76;
 long l = 23393;

	// Float Types-2
	transient float f = 34.89f;
	volatile double d = 67.48375;

	// Non numeric data types-2
	final boolean k = true;
	char y = 'd';

	// Non Primitive Data
	String ab = "12333432";
	String sd = "This is datatypes class";

	
	

	void b() {
	 int a=20;
	}

	public static void main(String[] args) {

		DataTypes dt = new DataTypes();
		dt.b();
		dt.b();
		dt.b();
	System.out.println(dt.ab);	
		// Combine string and instance Variable
		System.out.println("This is byte Variable-" + dt.b);
		System.out.println("This is Long Variable-" + dt.l);
		System.out.println("This Is Float Variable-" + dt.f);

		// Access all instance Variable
		System.out.println(dt.s);
		System.out.println(dt.i);
		System.out.println(dt.l);
		System.out.println(dt.f);
		System.out.println(dt.d);
		System.out.println(dt.k);
		System.out.println(dt.y);
		System.out.println(dt.ab);
		long l = 20000;

		if (l == 20000) {
			System.out.println("Number is equal to 20000");
			if (l > 10000) {
				System.out.println("Number is greater than 10000");
				if (l < 30000) {
					System.out.println("Number is less than 30000");
				}
			} else {
				System.out.println("No is different");
			}
		}
	}
}
