package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base_Class.Base_Test;

public class Priyanka_Mam_Example extends Base_Test{
	 @BeforeClass
	  public void Launch_Browse() {
		  launchBrowser("chrome");
		  NavigateUrl("https://www.flipkart.com/");
	  }
	  @Test(priority = 1)
	  public void close_popup()
	  {
		  WebElement popup = driver.findElement(By.xpath("//span[@class='_30XB9F']"));
		  if(popup.isDisplayed()) {
			  popup.click();
		  }
	  }
	  @Test(priority = 2)
	  public void Verify_Searchbar()
	  {
	WebElement search = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
	search.sendKeys("shirt");
//	driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
	
	Actions act= new Actions(driver);
	act.sendKeys(Keys.ENTER).build().perform();

	
		  
	  }
	 
	  
	
}
