package select_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import base_Class.Base_Test;

public class Select_002 extends Base_Test {

	public static void main(String[] args)  {
		//Dated-25-11-2023
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://demoqa.com/select-menu");
		System.out.println("Title of Web Page Is:- " + driver.getTitle());
		System.out.println("Current Url of WebPage is:- " + driver.getCurrentUrl());

		//Scroll Page
		Actions act = new Actions (driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();

		WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("Black");
		System.out.println("Is Dropdown Multi-Selected:- "+s.isMultiple());
		
		
		// Locate MultiSelect DropDown
		Select s1 = new Select(driver.findElement(By.id("cars")));
		s1.selectByValue("volvo");
		System.out.println(s1.isMultiple());
		s1.selectByValue("saab");
		s1.deselectByValue("volvo");
		s1.deselectAll();
		
		}

}
