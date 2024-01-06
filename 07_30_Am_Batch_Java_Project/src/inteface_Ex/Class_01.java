package inteface_Ex;

public class Class_01 implements Abc, Indian_Railway {

	public static void main(String[] args) {
		Class_01 c = new Class_01();
		c.a(4);
		c.b();
		System.out.println("------------------");
		Abc a = new Class_01 ();
		a.a(3);
		a.b();
	}

	@Override
	public void a(int x) {
	System.out.println("abc interface");
	}

	@Override
	public void b() {
		
		System.out.println("abc...... interface");
	}

	@Override
	public void green(int x) {
		System.out.println(" Proceed With 90 kmph");
		
	}

	@Override
	public void yellow() {
		System.out.println("Proceed With 40 kmph");	
	}

	@Override
	public void red() {
		
		System.out.println("Stop here");
	}

}
