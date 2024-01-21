package file_upload;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base_Class.Base_Test;

public class FileUpload_002 extends Base_Test{
  @Test
  public void verify_upload() {
	  
	  launchBrowser("chrome");
	  NavigateUrl("https://demo.automationtesting.in/");
	  driver.findElement(By.xpath("//input[@name='input4[]']")).click();
  }
}
