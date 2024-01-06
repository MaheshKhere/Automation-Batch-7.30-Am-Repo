package access_modifier;

import abstraction.Tc_001;

public class Class_001 extends Tc_001{

	@Override
	public void Colour() {
		System.out.println("Red Colour");	
		
		
	}

	public static void main(String[] args) {
		Class_001 c = new Class_001();
		c.Colour();     // Abstract Method
		c.function();  //  Instance Method
	}

	
	
	

}
