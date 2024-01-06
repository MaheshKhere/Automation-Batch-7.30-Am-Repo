package access_modifier;

public class Access_modifier_001 {

	public int x= 30;
	static int  b= 45;
	
	public void add() {
		int y = 60;
		
		System.out.println(" Protected Method From Parent");
	}
	public static void main(String[] args) {
		
	    int k= 30;
		Access_modifier_001 ac = new Access_modifier_001();
		ac.add();
		System.out.println(ac.x);

	}

}
