package try_Catch_Block;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Class_001 {

	public static void main(String[] args)  {
		
	
			try {
				FileInputStream fis = new FileInputStream("");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
try {
	Thread.sleep(2000);
	
	}catch (NullPointerException ne) { 
		
	}catch (ArithmeticException ae) {
		
	}catch (Exception b) {
		
	}
	finally {
		System.out.println("i am finally");
	}
		
		System.out.println("hiiiii");
	}

}
