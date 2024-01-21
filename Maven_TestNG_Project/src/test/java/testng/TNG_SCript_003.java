package testng;

import org.testng.annotations.Test;

import base_Class.Base_Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
@Listeners(Listeners_001.class)
public class TNG_SCript_003 extends Base_Test{

  @Test
  public void Verify_Mouse_Hover_001() {
	  WebElement men = driver.findElement(By.xpath("//span[text()='Men']"));
	  act.moveToElement(men).build().perform();
  }
  
  @Test
  public void Verify_Mouse_Hover_002() {
	  WebElement kid = driver.findElement(By.xpath("//span[text()='Kids']"));
       act.moveToElement(kid).build().perform();
  }
  
  @Test
  public void Verify_Mouse_Hover_003() {
	 WebElement homeandKitchen = driver.findElement(By.xpath("//span[text()='Home & Kitchen']"));
       act.moveToElement(homeandKitchen).build().perform(); 
  }
  
  @BeforeClass
  public void beforeClass() {
	  launchBrowser("chrome");
	  NavigateUrl("https://www.meesho.com/");  
  }

  @AfterClass
  public void end_Process()
{
	  driver.close();
	  }
}
