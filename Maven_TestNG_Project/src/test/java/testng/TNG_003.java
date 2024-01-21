package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;

public class TNG_003 {
	
	
	
  
  
  @Test
  public void x() {
	  System.out.println("@Test from TNG_003");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod from TNG_003");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod from TNG_003");

  }

}
