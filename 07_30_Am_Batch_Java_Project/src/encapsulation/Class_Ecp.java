package encapsulation;

public class Class_Ecp {

	private int e = 10000;
	
	private void hidemoney(int x) {
		e=x;
		System.out.println(e); 
	}
	
	public static void main(String[] args) {
		Class_Ecp c = new Class_Ecp();
		c.hidemoney(6);
	}
}
