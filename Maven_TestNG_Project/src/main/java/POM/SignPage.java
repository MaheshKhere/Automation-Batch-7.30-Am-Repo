package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_Class.Base_Test;

public class SignPage extends Base_Test{
	
	//Dated- 23-12-2023
	//Web-element
	@FindBy(linkText = "Sign in") WebElement signbutton; 
	@FindBy(id = "email_create") WebElement userEmail;
	@FindBy (id = "SubmitCreate") WebElement createAccButton;
	
	
	public SignPage(WebDriver driver) {
		// initialize Webelement
		PageFactory.initElements(driver, this);
	}
	
	//Operation on Webelemnt
	public void user_sign_In() {
		signbutton.click();
		userEmail.sendKeys("QA"+ random_number()+ "@gmail.com");
		System.out.println("User email is:-"+userEmail.getAttribute("value"));
		createAccButton.click();
	}
}
