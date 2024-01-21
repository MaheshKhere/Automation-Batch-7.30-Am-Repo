package testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base_Class.Base_Test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;

public class SoftAssert_001 extends Base_Test {
	
	// Dated- 15-12-2023
	@Test
	public void Verify_url() {
		String Expected_url = "https://www.amazon.in/";
		String Actual_url = driver.getCurrentUrl();
		System.out.println("The Current Url of Web Application is:- " + Actual_url);

		SoftAssert s = new SoftAssert();
		s.assertEquals(Actual_url, Expected_url, "The Url is not Same ");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		s.assertAll();
	}

	@BeforeClass
	public void invoke_browser() {
		launchBrowser("chrome");
	NavigateUrl("https://www.amazon.in/");
	}
}
