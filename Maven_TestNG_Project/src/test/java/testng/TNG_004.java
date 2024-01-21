package testng;

import org.testng.annotations.Test;

public class TNG_004 {
  @Test(invocationCount = 1, description = "" )
  public void f() {
	  System.out.println("@Test from TNG_004");
  }
  
  
}
