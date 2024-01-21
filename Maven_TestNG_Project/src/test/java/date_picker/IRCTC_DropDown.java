package date_picker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base_Class.Base_Test;

public class IRCTC_DropDown extends Base_Test {

	// Dated- 27-12-2023
	WebElement dropdown;

	@Test(priority = 1)
	public void verify_dropdown() {

		dropdown = driver.findElement(By.cssSelector("input[class*='ng-tns-c58-10 ui-inputtext ui-widget ui']"));
		dropdown.click();

	}

	@Test(priority = 2)
	public void verify_date() {
		int date = 20;
		while (true) {
			String month_year = driver.findElement(By.xpath("//div[@class='ui-datepicker-title ng-tns-c58-10']"))
					.getText();
			if (!month_year.contains("February2024")) {

				// Next Button
				driver.findElement(
						By.cssSelector("a[class*='ui-datepicker-next ui-corner-all ng-tns-c58-10 ng-star-inserted']"))
						.click();
			} else {
				break;
			}
		}
		// select date //a[text()='3']"
		driver.findElement(By.xpath("//a[text()='" + date + "']")).click();
		System.out.println("Entered Date is:- " + dropdown.getAttribute("value"));
	}

	@BeforeClass
	public void beforeClass() {

		launchBrowser("chrome");
		NavigateUrl("https://www.irctc.co.in/");
	}

	@AfterClass
	public void afterClass() {
	}

}
