package javaScript_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JS_001 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.udemy.com/");
		
		// Scroll to page 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		// Click on Python Explore
		driver.findElement(By.linkText("Explore Python")).click();
		
		// Scroll At bottom of page
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
	    js.executeScript("window.history.go(0)");
	}

}
