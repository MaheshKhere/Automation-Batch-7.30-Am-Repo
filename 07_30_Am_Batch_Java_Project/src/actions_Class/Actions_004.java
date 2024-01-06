package actions_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import base_Class.Base_Test;

public class Actions_004 extends Base_Test{

	public static void main(String[] args) throws Throwable {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		// Mouse Hover
		WebElement account = driver.findElement(By.cssSelector("span[id='nav-link-accountList-nav-line-1']"));
		
		// Actions Class
		Actions  act = new Actions(driver);
		act.moveToElement(account).build().perform();
		takescreenshot("Move to Account");
		
		// Capture Text of Element
		System.out.println("Move to Element is:- "+ account.getText());
		
		// Click on Your Orders
		driver.findElement(By.xpath("//a[@id='nav_prefetch_yourorders']")).click();
		takescreenshot("After Click on Your Orders");
	}

}
