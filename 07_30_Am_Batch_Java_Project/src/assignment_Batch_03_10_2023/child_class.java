package assignment_Batch_03_10_2023;

public class child_class extends Parent_class implements Inter_001{
// Pranali mam
	//................overriding concept ................
		public void get() { // instance
			System.out.println("get method from child class");
		}

	         // .................overloading concept .................
		public static void go() { // static
			System.out.println("static from child class");
		}

		public static void main(String[] args) {
			child_class c1 = new child_class();
			c1.datahiding(12);
			; // parent
			c1.get(); // child overriding not access by parent
			go();
			System.out.println(".....................");
			// ................. interface concept......................
			c1.s2();

			Inter_001 i = new child_class(); // creating interface object indirectly
			i.s2();
			System.out.println(".....................");
			// ...... 1st paroperty........IS a Relationship ...............
			c1.city();// parent
			c1.get(); // child
			// ........ 2nd property.........Has a relationship .................
			Parent_class p1 = new Parent_class(); // creating a parent object ...we can access only parent class variable
													// and methods
			// p1.city();

			// Parent_class = new child_class(); // 3rd property we can use parent ref
			// variable to Hold child class object
			// child_class c1 = new Parent_class(); // 4th Property we cannot use child ref
			// variable to hold parent class object
			System.out.println(".....................");

		}

		@Override
		public void s2() {
			System.out.println(" s2 method from Interface");

		}

}
