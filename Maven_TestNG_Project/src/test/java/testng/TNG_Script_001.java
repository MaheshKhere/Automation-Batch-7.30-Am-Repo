package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TNG_Script_001 {
	public WebDriver driver;
  @Test
  public void Verify_SearchBox() {
	  driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']")).sendKeys("watch");
	  
  }
  @BeforeMethod
  public void Launch_Browser() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://www.meesho.com/");
	  System.out.println("Title of Web Page is:- " +driver.getTitle());
  }

  @AfterMethod
  public void Ending_Process() {
	  driver.close();
  }

}
