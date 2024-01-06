package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_002 {
	
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://docs.oracle.com/javase/8/docs/api/");
	System.out.println("Title of Web Page Is:- " + driver.getTitle());
	System.out.println("Current Url of WebPage is:- " + driver.getCurrentUrl());
    
	// locate frame by index
	driver.switchTo().frame(0);
	
	driver.findElement(By.xpath("//a[text()='java.applet']")).click();
	
	// to come out from frame
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(1);
	driver.findElement(By.xpath("//span[text()='AppletContext']")).click();
	
}
}
