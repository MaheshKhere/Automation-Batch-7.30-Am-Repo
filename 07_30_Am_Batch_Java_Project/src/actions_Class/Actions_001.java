package actions_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import base_Class.Base_Test;

public class Actions_001 extends Base_Test {

	public static void main(String[] args) throws Throwable {
		
	    driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		// Actions class
		Actions act = new Actions(driver);
		
		// Click on create account
		WebElement createAcc = driver.findElement(By.linkText("Create new account"));
		
		// Capture name of web element
		System.out.println("Click on WebElement is:- "+createAcc.getText());
		
		act.moveToElement(createAcc).click().build().perform();
		Thread.sleep(4000);
		Base_Test.takescreenshot("Create Account Page");
		
		// Right click 
		act.contextClick().build().perform();
		Thread.sleep(3000);
		Base_Test.takescreenshot("Right Click on Page");
	}

}
