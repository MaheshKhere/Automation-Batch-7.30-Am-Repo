package handling_Window;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_002 {

	public static void main(String[] args) {
		// Dated- 27-11-2023
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.snapchat.com/");
		System.out.println("Title of Web Page Is:- " + driver.getTitle());
		System.out.println("Current Url of WebPage is:- " + driver.getCurrentUrl());

		driver.findElement(By.xpath("//h3[text()='Log in to chat']")).click();

		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentwindowid = it.next();
		String childwindowid = it.next();
		
		//System.out.println(parentwindowid);
		System.out.println(childwindowid);
		
		//5442B670255425E6D21D72947F35F011
		//2C1328C1F36833AF961A6894F017E82E
		// Switch one tab to another
		driver.switchTo().window(childwindowid);
		driver.findElement(By.id("accountIdentifier")).sendKeys("abc@gamil.com");
	
	}
	

}
