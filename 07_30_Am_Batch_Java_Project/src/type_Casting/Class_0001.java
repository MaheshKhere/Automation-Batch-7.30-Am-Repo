package type_Casting;

public class Class_0001 {

	public static void main(String[] args) {
		// Widening casting
		
		int i = 1000;
		long k = i;
		System.out.println(i);
		System.out.println(k);
		
		int m1= 20;
		double s1 =m1;
		System.out.println(m1);
		System.out.println(s1);
		float f= 500.145226f;
		double d = f;
		//System.out.println(d);
// Narrowing Casting
		
		long l = 600;
		int x = (int) l;
		System.out.println(l);
		System.out.println(x);
		
		double p = 30.596;
		int h = ( int)p;
		System.out.println(p);
		System.out.println(h);
		
		int m = 50;
		short s = (short) m;
		System.out.println(s);
		
	}

}
