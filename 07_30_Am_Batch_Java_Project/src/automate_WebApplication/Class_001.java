package automate_WebApplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_001 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		// Capture title of webpage
		System.out.println("The title of web page is:- " +driver.getTitle());
		
		// send data on search box
		WebElement from = driver.findElement(By.cssSelector("input#src"));
		
		// send data
		from.sendKeys("Nagpur");
		
		Thread.sleep(3000);
		//remove data
		from.clear();

	}

}
