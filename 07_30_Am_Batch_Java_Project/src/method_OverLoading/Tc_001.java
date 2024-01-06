package method_OverLoading; // function Overloading

public class Tc_001 {
	
//	public void a(int x) {
//		System.out.println("A Method with String data type");
//	}
	public void a(byte x) {
		System.out.println("A Method with int data type");
	System.out.println(x);
	}

//	public void a(short x) {
//		System.out.println("A Method with float data type");
//		System.out.println(x);
//	}

	

	public  void a(long c) {
		System.out.println("A method is a static with int data type");
	}

	public static void b(double x, int b) {
		System.out.println("A method is a static with int and int data type");
	}

	public static void main(String[] args) {
		Tc_001 t = new Tc_001();
		t.a(3); // Instance Method
		t.a(1);
		t.a(30);
		
	}
}
