package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base_Class.Base_Test;

public class TNG_Script_004 extends Base_Test {

    // Dated - 11-12-2023
	@Test(priority = 2, description = "Verify if user is able to enter input in search box")
	public void Verify_Search_Box() {
		WebElement searchbox = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		searchbox.sendKeys("shirt");
		System.out.println("Entered Text in Searchbox is :- " + searchbox.getAttribute("value"));
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();

	}

	@Test(priority = 1, description = "Check if user is able to close login Pop-up")

	public void Close_Login_PopUp() {
		WebElement Pop_up = driver.findElement(By.xpath("//span[@role='button']"));

		if (Pop_up.isDisplayed()) {
			Pop_up.click();
		}
	}

	@Test(priority = 3, description = "Verify if user click on product")
	public void Click_on_Shirt() {
		driver.findElement(By.xpath("(//a[text()='Men Regular Fit Solid Spread Collar Casual Shirt'])[1]")).click();
	}

	@Test(priority = 4, description = "Switch Parent to Child Window")
	public void Switch_ChildWindow() {
		// Method Came from base test
		Switch_Window();
		driver.switchTo().window(Child_Window_id);
	}

	@Test(priority = 5, description = "Verify user is able to add prduct to cart")
	public void Click_On_AddToCart() {
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		driver.findElement(By.xpath("//span[text()='Place Order']")).click();
	}

	@BeforeClass(description = "Launched Chrome Browser")
	public void Launch_Browser() {
		launchBrowser("chrome");
		NavigateUrl("https://www.flipkart.com/");
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
