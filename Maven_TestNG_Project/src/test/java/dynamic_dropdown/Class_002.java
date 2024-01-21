package dynamic_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class_002 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		System.out.println("Title of Web Page Is:- " + driver.getTitle());
		System.out.println("Current Url of WebPage is:- " + driver.getCurrentUrl());
        WebElement best = driver.findElement(By.linkText("Best Sellers"));
		
        Actions act = new Actions(driver);
		//act.moveToElement(best).click().build().perform();
        //act.moveToElement(best).click().build().perform();
		
		// mouse hover
		//act.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		
		act.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox"))).click().sendKeys("abc").doubleClick().build().perform();
	
		//right click
		//act.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox"))).contextClick().build().perform();
	}

}
