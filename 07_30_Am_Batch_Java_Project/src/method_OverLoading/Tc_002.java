package method_OverLoading;

public class Tc_002 {

	public void care(float x) {
		System.out.println("Care with int data type");
		System.out.println(x);
	}

//	public void care(long y) {
//		System.out.println("Care with float data type");
//		System.out.println(y);
//	}

	public void care(double d) {
		System.out.println("Care with double data type");
		System.out.println(d);
	}

	public void care(String x) {
		System.out.println("Care with String data type");
		System.out.println(x);
	}

	public static void main(String[] args) {
		Tc_002 t2 = new Tc_002();
		t2.care(3);
		t2.care(30.00f);
		t2.care(70.70);
		t2.care("xy");
	}

}
