package testng;

import org.testng.annotations.Test;

public class Parameter {
	
  @Test(priority = 1, invocationCount = 2)
  public void ab() {
	  System.out.println("ab() Method");
  }
  
  @Test(priority = 2, description = "Launch Chrome Browser")
  public void launch() {
	  System.out.println("launch() Method");
  }
  
  @Test(priority = 3)
  public void ef() {
	  System.out.println("ef() Method");
  }
  
  @Test(enabled = false)
  public void mn() {
	  System.out.println("mn() Method");
  }
}
