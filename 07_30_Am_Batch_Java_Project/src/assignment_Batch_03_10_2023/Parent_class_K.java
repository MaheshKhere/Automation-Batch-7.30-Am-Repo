package assignment_Batch_03_10_2023;

public class Parent_class_K extends Tc_001{
// Ketki Mam
	int i = 50; // instance variable

	public void method_p() { // instance method
		System.out.println("Parent class method");
	}

	public Parent_class_K() { // User defined Constructor
		System.out.println("User defiend constructor");}
		//Inheritance Concept
		String r = "Mandaokar";
		int a = 45;
		public void method_01 () {
			System.out.println("Instance method from Parent Class");
		}
		public static void method_001() {
			System.out.println("Static method from Parent Class");
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
				public void a(int y) {
					System.out.println("Method with int datatype");
				}
				public  void a(float y) {
					System.out.println("Method with float datatype");
				}
				public static void a(String y) {
					System.out.println("Method with String datatype");
				}
		
		public static void main(String[] args) {
				Parent_class_K p1 = new Parent_class_K();
				p1.a(50);
				//p1.a(85.264);
				p1.a("hefef");
				p1.ab();

}

		@Override
		public void ab() {
			// TODO Auto-generated method stub
			
		}}
