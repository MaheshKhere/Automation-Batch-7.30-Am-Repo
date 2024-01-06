package this_Keyword;

public class This_001 {

	int a;
	String s;
	
	public void add() {
		
	}
	
	public This_001(int a, String s) {
		this.a= a;
		this.s= s;
		System.out.println(this.a);
		System.out.println(this.s);
		
	}
	
	
	public static void main(String[] args) {
		This_001 t = new This_001(3, "abc");
	}

}
