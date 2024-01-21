package automate_WebApplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_002 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");

		// Capture title of webpage
		System.out.println("The title of web page is:- " + driver.getTitle());

		WebElement link = driver.findElement(By.linkText("Today's Deals"));

		// Capture text of link
		System.out.println(link.getText());
		
		// To get attribute of web element
		System.out.println(link.getAttribute("class"));
		
		// To get Tagname
		System.out.println(link.getTagName());
		
		// To check web element is visible or hidden
		System.out.println(link.isDisplayed());

		// Click on link
		link.click();

	}

}
