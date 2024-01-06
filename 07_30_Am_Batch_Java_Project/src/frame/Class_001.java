package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base_Class.Base_Test;

public class Class_001 extends Base_Test{

	public static void main(String[] args) throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://docs.oracle.com/javase/8/docs/api/");
		takescreenshot("Home of API Doc");
		
		// Frame 
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("java.awt")).click();
		Thread.sleep(3000);
		takescreenshot("After Click on Java.Awt Package");
		
		// To come out from frame
		driver.switchTo().defaultContent();
		
		// Frame locate with help of index
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("Paint")).click();
		Thread.sleep(2000);
		takescreenshot("After Click on Paint Interface");

	}

}
