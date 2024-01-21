package testng;

import org.testng.annotations.Test;

import base_Class.Base_Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class TNG_Script_002 extends Base_Test{
	
	// Dated- 08-12-2023
	public  Actions act;
	
  @Test
  public void Verify_Mouse_Hover_001() {
	  act = new Actions(driver);
	  WebElement men = driver.findElement(By.xpath("//span[text()='Men']"));
	  act.moveToElement(men).build().perform();
  }
  
  @Test
  public void Verify_Mouse_Hover_002() {
	  act = new Actions(driver);
	  WebElement kid = driver.findElement(By.xpath("//span[text()='Kids']"));
       act.moveToElement(kid).build().perform(); 
  }
  
  @Test
  public void Verify_Mouse_Hover_003() {
	  act = new Actions(driver);
	  WebElement homeandKitchen = driver.findElement(By.xpath("//span[text()='Home & Kitchen']"));
       act.moveToElement(homeandKitchen).build().perform();  
  }
  
  @BeforeMethod
  public void launch_Browser() {
	  launchBrowser("chrome");
	  NavigateUrl("https://www.meesho.com/");
  }

  @AfterMethod
  public void Ending_Process() {
	 driver.close();
  }
}
