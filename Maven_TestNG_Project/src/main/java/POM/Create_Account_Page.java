package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Create_Account_Page {
	// Dated- 25-12-2023

	public Create_Account_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "id_gender1")
	WebElement usertitle;
	@FindBy(xpath = "//input[@id='customer_firstname']")
	WebElement firstname;
	@FindBy(css = "input#customer_lastname")
	WebElement lastname;
	@FindBy(name = "passwd")
	WebElement password;
	
	@FindBy(xpath = "(//select[@class='form-control'])[1]")
	WebElement userdate;
	
	@FindBy(xpath = "(//select[@class='form-control'])[2]")
	WebElement usermonth;
	
	@FindBy(xpath = "(//select[@class='form-control'])[3]")
	WebElement useryear;
	
	@FindBy(xpath = "//div[contains(@id,'uniform-news')]")
	WebElement checkbox;
	@FindBy(xpath = "//span[text()='Register']")
	WebElement registerButton;
	
	public void enter_user_information() {
		
		usertitle.click();
		firstname.sendKeys("Bob");
		lastname.sendKeys("buider");
		password.sendKeys("bob@12");
		
		// Select class for user date dropdown
		Select s1 = new Select(userdate);
		s1.selectByValue("25");
		
		// Select class for user month dropdown
		Select s2 = new Select(usermonth);
		s2.selectByVisibleText("December ");
		
		// Select class for user Year dropdown
		Select s3 = new Select(useryear);
		s3.selectByValue("2000");
		
		checkbox.click();
		registerButton.click();
	}

}
