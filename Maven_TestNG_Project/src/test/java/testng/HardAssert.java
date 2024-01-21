package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base_Class.Base_Test;

public class HardAssert extends Base_Test {
	//Dated- 14-12-2023
	@BeforeClass
	public void invoke_browser() {
		launchBrowser("chrome");
		NavigateUrl("https://www.makemytrip.com/");
	}

	@Test(priority = 2)
	public void Close_Popup() throws InterruptedException {
		// To Enter in Frame
		Thread.sleep(3000);
		driver.switchTo().frame(driver
				.findElement(By.xpath("//iframe[@id='webklipper-publisher-widget-container-notification-frame']")));
		
		WebElement popup = driver.findElement(By.xpath("//a[@class='close']/i"));
		if (popup.isDisplayed()) {
			popup.click();
		}
	}

	@Test(priority = 3)
	public void click_on_link() throws Exception {
		
		// To come out from Frame
		driver.switchTo().defaultContent();
		
		String Expected_Link_name ="Super Offers";
		
		//Capture Name of Link
		WebElement link = driver.findElement(By.xpath("//p[text()='Super Offers']"));
		String actual_link_name = link.getText();
		System.out.println("Link name is:- " + actual_link_name);
		link.click();
	}
}
