package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import base_Class.Base_Test;

public class Class_002 extends Base_Test {

	public static void main(String[] args) throws Exception {
		
		launchBrowser("chrome");
		NavigateUrl("https://demoqa.com/alerts");
		
		driver.findElement(By.id("promtButton")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		al.sendKeys("abs");	
		al.dismiss();	
		
	}

}
