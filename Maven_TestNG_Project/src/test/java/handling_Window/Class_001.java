package handling_Window;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base_Class.Base_Test;

public class Class_001 extends Base_Test {

	public static void main(String[] args) {
		// Dated-23-11-2023
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.salesforce.com/");

		// Click on link
		driver.findElement(By.linkText("Start free trial")).click();

		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentwindowid = it.next();
		String childwindowid = it.next();

		System.out.println("Parent Window Id is:- " + parentwindowid);
		System.out.println("Child Window Id is:- " + childwindowid);

		// Switch to child tab
		driver.switchTo().window(childwindowid);

		// Send data in first name
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("abc");

		// Switch to parent tab
		driver.switchTo().window(parentwindowid);
		driver.findElement(By.linkText("Watch demo")).click();
	}
}
