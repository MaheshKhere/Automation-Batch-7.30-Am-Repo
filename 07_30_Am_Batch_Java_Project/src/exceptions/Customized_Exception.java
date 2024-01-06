package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Customized_Exception {

//	public void exception() {
//		System.out.println(10/0);
//		throw new ArithmeticException();
//		
//	}
	
	public void b()  {
		try {
		/*
		 * Statement-1
		 * Statement-2
		 * Statement-3
		 * 
		 */
		} catch (Exception e) {
			try {
				// Statement 4
			} catch (Exception e2) {
				
			}
		}
	}
	public static void main(String[] args) {
		Customized_Exception c = new Customized_Exception();
	//	c.exception();
		c.b();
		System.out.println("hiiii");
		
		try {
			// code- throw exception
			
		} catch (ArithmeticException e) {
			
		}catch (NullPointerException e) {
			
		}catch (Exception e) {
			
		}

	}

}
