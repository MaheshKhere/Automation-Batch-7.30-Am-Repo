package loops;

public class Loop_001 {

	public static void main(String[] args) {
		// Print Numbers from 0 to 5
		for(int i = 0; i<5; i++) {
			System.out.println(i);
		}
		System.out.println("----------------------------");
		
		// break Statement
		for(int x=1; x<=10;x++) {
			System.out.println(x);
			if(x==4) {
				break;
			}
		}
		System.out.println("---------------------------");
		for(int i = 0; i< 6; i++) {
	         for(int j = 0; j < 2; j++){
	        	 //System.out.println("i = " + i+",j = " + j);
	            if(i == 1) {
	               break;
	            }
	           System.out.println("i = " + i+",j = " + j);
	         }
	      }
	}

}
