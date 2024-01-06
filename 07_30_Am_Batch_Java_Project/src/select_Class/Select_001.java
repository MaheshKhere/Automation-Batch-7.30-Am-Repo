package select_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import base_Class.Base_Test;

public class Select_001 extends Base_Test{

	public static void main(String[] args) throws Throwable {
		// Dated-24-11-2023
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gad_source=1&gclid=Cj0KCQiA3uGqBhDdARIsAFeJ5r3RO2qNWn6_s_r7NbIB2IEkDpyX7kEBaI1EXWc7JIH6RBfQ7glo6rEaAoU-EALw_wcB");
		System.out.println("Title of Web Page Is:- "+ driver.getTitle());
		System.out.println("Current Url of WebPage is:- " +driver.getCurrentUrl());
		
		// Select class object
		Select s = new Select(driver.findElement(By.cssSelector("select#reg_relationship")));
		//Select by visible text
		s.selectByVisibleText("Daughter");
		//s.deselectByVisibleText("Daughter");
		
		//Select by value
		//s.selectByValue("5");
		
		// Select by index
		//s.selectByIndex(6);
		
		// To check dropdown is multi-selected
		System.out.println(s.isMultiple());
		takescreenshot("After Select Self Option");
	}
}
