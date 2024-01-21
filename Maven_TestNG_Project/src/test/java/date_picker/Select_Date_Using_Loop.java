package date_picker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base_Class.Base_Test;

public class Select_Date_Using_Loop extends Base_Test{
	
	@BeforeClass
	public void invoke_browser() {
		launchBrowser("chrome");
		NavigateUrl("https://www.irctc.co.in/");
	}

	@Test(priority = 1)
	public void verify_date_dropdown() {
		driver.findElement(By.cssSelector("input[class*='-c58-10 ui-inputtext ui-widget']")).click();
	}
	
	@Test(priority = 2)
	public void verify_month()
{
		//feb
		//WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']"));
		
		WebElement next_arrow_button = driver.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']"));
		//
		String monthname = driver.findElement(By.xpath("//div[@class='ui-datepicker-title ng-tns-c58-10']")).getText();
		
		//System.out.println("Month is :- "+monthname);
		
		int date= 2;
		while(true) {
		if(monthname.equalsIgnoreCase("March2024")) {
			System.out.println(monthname);
			
			// Select date
			driver.findElement(By.xpath("(//a[@class='ui-state-default ng-tns-c58-10 ng-star-inserted'])"+"["+date+"]")).click();
		}
		else {
			next_arrow_button.click();
		}break;
		}
}
}
