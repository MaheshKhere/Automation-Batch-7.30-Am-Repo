package dynamic_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base_Class.Base_Test;

public class IRCTC_DropDown extends Base_Test {

	public static void main(String[] args) throws Throwable {
		// Dated- 27-11-2023
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/");
		System.out.println("Title of Web Page Is:- " + driver.getTitle());
		System.out.println("Current Url of WebPage is:- " + driver.getCurrentUrl());

		// From DropDown
		WebElement from = driver
				.findElement(By.cssSelector("span[class='ng-tns-c57-8 ui-autocomplete ui-widget'] :first-child"));
		from.sendKeys("Warora");

		// Click on City name
		driver.findElement(By.xpath("//li[@id='p-highlighted-option']")).click();

		// Capture City Name
		System.out.println("Entered From City Name is:- " + from.getAttribute("value"));
		takescreenshot("abc");
		// To DropDown
		WebElement to = driver.findElement(By.xpath("//input[@aria-controls='pr_id_2_list']"));
		to.sendKeys("Nagpur");

		// Click on Nagpur
		driver.findElement(By.xpath("//span[text()=' NAGPUR - NGP ']")).click();

		// Capture City Name
		System.out.println("Entered To City Name is:- " + to.getAttribute("value"));

		// Click on Reservation type Dropdown
		driver.findElement(By.xpath("//p-dropdown[@id='journeyQuota']/div")).click();

		// Click on Ladies
		driver.findElement(By.xpath("//li[@aria-label='LADIES']")).click();

		// Click on Calendar
		driver.findElement(By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']/input")).click();

		// Click on 30 date
		driver.findElement(By.xpath("(//a[@class='ui-state-default ng-tns-c58-10 ng-star-inserted'])[2]")).click();

		// Click on Classes
		driver.findElement(By.xpath("//p-dropdown[@id='journeyClass']/div")).click();

		// Click on Vistadome
		driver.findElement(By.xpath("//li[@aria-label='Vistadome AC (EV)']")).click();
	
	    // Click on search button
		driver.findElement(By.cssSelector("button.search_btn.train_Search")).click();	}

}
