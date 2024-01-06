package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Class_001 {

	

	public void get()  {
  
		int [] a = new int[2];
		a[0]=1;
		a[1]=2;
		a[2]=4;
		System.out.println(a[2]);
	}
	
	public void print()   {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
				
		}catch (NullPointerException ne) {
			
		}catch (Exception e) {
			
		}
	}

	public void b() throws Exception   {
		
		PrintWriter p = new PrintWriter("");
	}
	
	public static void main(String[] args)     {
		Class_001 c1 = new Class_001();
		c1.print();
		System.out.println("Exception Handled");
		
	}

	/* Runtime time jvm is going to create one stack 
	 * main method----- > get() -----> Sysou
	 * Format of default exception
	 * Exception in main thread : exception information and reason
	 * at class name . main ( line no-.....) 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
