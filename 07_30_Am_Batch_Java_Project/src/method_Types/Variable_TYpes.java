package method_Types;

public class Variable_TYpes {
	
	// Instance variable
	short s = 90;
	
	// Static variable
	static int i = 23673;
	
	// Instance Method
	public void mahesh() {
		//System.out.println(i);
		//System.out.println(Variable_TYpes.i);
		//System.out.println(s);
		
	}

	// Static Method
	public static void st() {
		Variable_TYpes v = new Variable_TYpes();
		System.out.println(i);
		System.out.println(Variable_TYpes.i);
		System.out.println(v.s);
		
		
	}
	
	public static void main(String[] args) {
		Variable_TYpes vt = new Variable_TYpes();
		
		//st();
		Variable_TYpes.st();
	//System.out.println(vt.s);
	//System.out.println(vt.i);
	//System.out.println(i);
	//System.out.println(Variable_TYpes.i);
	//vt.mahesh();

	}

}
