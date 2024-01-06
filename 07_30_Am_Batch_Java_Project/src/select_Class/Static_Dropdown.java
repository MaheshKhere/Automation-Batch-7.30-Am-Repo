package select_Class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base_Class.Base_Test;

public class Static_Dropdown extends Base_Test {

	public static void main(String[] args) {
		// Dated- 25-11-2023
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jeevansathi.com/");
		System.out.println("Title of Web Page Is:- " + driver.getTitle());
		System.out.println("Current Url of WebPage is:- " + driver.getCurrentUrl());

		// locate dropdown
		WebElement dropdown = driver.findElement(By.cssSelector("div[data-qa='relationship']"));
		dropdown.click();

		List<WebElement> option = driver.findElements(By.xpath("//div[@id='relationshipOptions']/ul/li"));

		for (int i = 0; i < option.size(); i++) {
         if(option.get(i).getText().equalsIgnoreCase("son")) {
        	 option.get(i).click();
         }
         
         
         }
        driver.findElement(By.xpath("//div[@id='relationshipOptions']/ul/li[4]")).click();
		}
	}


