package testng;

import org.testng.annotations.Test;

public class NewTestPractice {
  @Test(groups = "sanity")
  public void f() {
	  System.out.println("f");
  }
  @Test(groups = "sanity")
  public void i() {
	  System.out.println("i");

  }
  @Test()
  public void j() {
	  System.out.println("j");

  }
 
}
