package this_Keyword;

public class This_005 extends This_006 {

	int x = 30;
	byte b = 2;

	public void getdata() {
		this.verify();
		System.out.println(this.x);
		System.out.println(this.d);
		System.out.println(this.i);
	}

	public static void main(String[] args) {
		This_005 t = new This_005();
		 t.getdata();
	}
}
