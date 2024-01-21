package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base_Class.Base_Test;

public class HardAssert_002 extends Base_Test{
  @Test
  public void verify_link() {
	  
	  // Dated - 14-12-2023
	  String Expected_link_name= "Amazon mini";
	  WebElement link= driver.findElement(By.linkText("Amazon miniTV"));
	  String Actual_link_name = link.getText();
	  System.out.println(Actual_link_name);
	  
	  // Verify Expected and Actual link name
	 // Assert.assertEquals(Expected_link_name, Actual_link_name);
	  Assert.assertTrue(Actual_link_name.equals(Expected_link_name), "Both Links are not Same");
	  
	  // insert input 
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
  }
  @BeforeSuite
  public void beforeSuite() {
	  
	  launchBrowser("chrome");
	  NavigateUrl("https://www.amazon.in/");
  }

  @AfterSuite
  public void afterSuite() {
  }
}
