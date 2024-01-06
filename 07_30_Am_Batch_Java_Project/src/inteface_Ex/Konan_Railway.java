package inteface_Ex;

public class Konan_Railway implements Indian_Railway, Signal_Distance{

	public static void main(String[] args) {
		Konan_Railway kr = new Konan_Railway();
		kr.green(4);
		kr.yellow();
		kr.red();
		kr.distance();
		System.out.println("--------------------------------------------------");
		
		// Interface Object-
		// Interface reference variable hold implementing class Object
		Indian_Railway ir =  new Konan_Railway ();
		ir.green(3);
		ir.yellow();
		ir.red();
	}

	@Override
	public void green(int x) {
		System.out.println("Proceed with 90 kmph");	
	}
	
	@Override
	public void yellow() {
		System.out.println("Proceed with 40 kmph");
	}
	
	@Override
	public void red() {
		System.out.println("Stop-Here");
	}

	@Override
	public void distance() {
	System.out.println("Kept signal Distance 400m");
	}
}
