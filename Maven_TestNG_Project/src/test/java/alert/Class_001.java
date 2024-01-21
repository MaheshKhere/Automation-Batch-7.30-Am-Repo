package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import base_Class.Base_Test;

public class Class_001 extends Base_Test{
	
public static void main(String[] args) throws Exception {
	
	launchBrowser("chrome");
	NavigateUrl("https://nxtgenaiacademy.com/alertandpopup/");
	
	driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
	
	//Alert
	Alert alert = driver.switchTo().alert();
	Thread.sleep(2000);
	alert.accept();
	
	// Prompt Alert
	driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
	Alert alert_1 = driver.switchTo().alert();
	Thread.sleep(3000);
	alert_1.sendKeys("abs");
	alert_1.accept();
}
}
