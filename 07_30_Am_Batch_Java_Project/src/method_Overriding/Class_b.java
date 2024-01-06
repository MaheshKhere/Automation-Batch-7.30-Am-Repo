package method_Overriding;

public class Class_b extends Class_a{

	public void go() {
		System.out.println("Class b go");
	}
	
	public void getData(int a , boolean b) {
		System.out.println("Class b get data");
	}// 
	
	public static void main(String[] args) {
		Class_b c= new Class_b();
		Class_a c1 = new Class_b();
		c1.go();
		c1.getData();
		
		
//		c.getData();
//		c.go();
//	
		
	}

}
