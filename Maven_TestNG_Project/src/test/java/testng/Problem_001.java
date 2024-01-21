package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base_Class.Base_Test;

public class Problem_001 extends Base_Test{
	public Actions act;
	public JavascriptExecutor js;
  @Test(priority = 1)
  public void enter_Text_() {
	  driver.findElement(By.cssSelector("input#search")).sendKeys("dolo");
    act.keyDown(Keys.ENTER).build().perform();
  }
  
  @Test(priority = 2)
  public void add_to_Cart_Button() {
	  js= (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,200)");
	 //driver.findElement(By.xpath("(//form[@class='cart-form']/button)[1]")).click();
      driver.findElement(By.xpath("(//form[@class='cart-form'])[4]/button")).click();
	  driver.findElement(By.xpath("//button[text()='PROCEED TO CART']")).click();
  }
  
  @Test(priority = 3)
  public void verify_cart() {
	  driver.findElement(By.xpath("//div[text()=' Cart ']")).click();
  }
  
  @Test
  public void add_Proceed_Button() {
	 // js.executeScript("window.scrollBy(0,150)");

	  driver.findElement(By.xpath("//button[text()='Proceed']")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  act = new Actions(driver);
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  launchBrowser("chrome");
	  NavigateUrl("https://www.netmeds.com/");
  }

}
