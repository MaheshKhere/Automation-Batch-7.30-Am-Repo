package handling_Window;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_003 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.snapchat.com/");
		
		driver.findElement(By.xpath("//button[@title='Log in to chat']")).click();
         Set<String> window = driver.getWindowHandles();
         Iterator<String> it = window.iterator();
         String parentwindowid = it.next();
         String childwindowid = it.next();
         System.out.println("Parent Window Id is:- "+parentwindowid);
         System.out.println("Child Window Id is:- "+childwindowid);
         //ED8F8B2ADC826A4C495319CBA27AF616
         // A391E833D013154138B16A57461A7D87
         
         driver.switchTo().window(childwindowid);
         driver.findElement(By.id("accountIdentifier")).sendKeys("Pranjali");
	}

}
