package this_Keyword;

public class This_002 {

	public void display() {
		int s= 30;
		System.out.println(s);
	}
	
	public void getData() {
		this.display();
			
	}
	
	public static void main(String[] args) {
		This_002 t1 = new This_002();
		t1.getData();	
	}

}
