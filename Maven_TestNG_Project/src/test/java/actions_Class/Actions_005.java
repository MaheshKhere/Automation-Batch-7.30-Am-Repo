package actions_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base_Class.Base_Test;

public class Actions_005 extends Base_Test{
	public static void main(String[] args) throws Throwable {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.railyatri.in/");
		
		
		Actions action = new Actions(driver);
		
		// Locate Search directly in method
		//action.moveToElement(driver.findElement(By.cssSelector("input[placeholder='Enter train no. or name']"))).sendKeys("12722").build().perform();
		
		// Perform Click and Sendkeys Method
		WebElement Searchbox = driver.findElement(By.cssSelector("input[placeholder='Enter train no. or name']"));
		action.moveToElement(Searchbox).click().sendKeys("12967").build().perform();
		driver.findElement(By.cssSelector("img#img_search")).click();
		takescreenshot("Jaipur SF Express");
	}
}
