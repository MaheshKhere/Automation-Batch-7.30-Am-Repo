package control_Statement;

public class If_Else_if {

public void a () {
	
}


	public static void main(String[] args) {
		
	
		int i = 90; // local variable
		if(i<60) {
			System.out.println("Grade B");
		}else if(i<80&&i>60) {
			System.out.println("Grade B+");
		}else if(i<65||i>=90) {
			System.out.println("Grade A");
		}else {
			System.out.println("Percentage is 70");
		}
	}

}
