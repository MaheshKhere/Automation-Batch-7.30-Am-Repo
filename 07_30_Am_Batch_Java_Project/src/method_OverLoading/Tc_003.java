package method_OverLoading;

public class Tc_003 {

	public int add(int x, int y) {
		System.out.println("add of two int data type");
		int z = x +y;
		System.out.println(z);
		return z;
	}

	public static double  add(double x, double y) {
		System.out.println("add of two double data type");
		double d = x+y;
		System.out.println(d);
		return d;
	}
	// Static Block
	static {
		System.out.println(" i Am Static Block-1");
	}
	
	static {
		System.out.println(" i Am Static Block-2");
	}
	
	public static void main(String[] args) {
		Tc_003 t3 = new Tc_003();
		t3.add(30, 60);
		t3.add(60.50, 70.60);
	}
}
