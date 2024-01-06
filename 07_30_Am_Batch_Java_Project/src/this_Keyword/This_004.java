package this_Keyword;

public class This_004 {
    // Requirement executes All Constructor in class
	
	int x;
	float f;
	String ab;
	
	public This_004 () {
		System.out.println("i am user defined Constructor");
	}
	
	public This_004 (int x) {
		this();
		this.x=x;
		System.out.println(this.x);
	}
	
	public This_004(int x, float f) {
		this(x);
		this.x=x;
		this.f=f;
		System.out.println(this.x);
		System.out.println(this.f);
	}
	
	public This_004(int x, float f, String ab) {
		this(x, f);
		this.x=x;
		this.f=f;
		this.ab=ab;
		System.out.println(this.x);
		System.out.println(this.f);
		System.out.println(this.ab);
	}
	public static void main(String[] args) {
		This_004 t3= new This_004(7, 50.40f,"abc");
		
	}

}
