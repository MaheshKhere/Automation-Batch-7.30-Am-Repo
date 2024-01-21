package pomExecution;

import org.testng.annotations.Test;

import POM.Create_Account_Page;
import POM.SignPage;
import base_Class.Base_Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class POmSignIN extends Base_Test{
	
  @Test
  public void Verify_user_SignIn() {
	  // Dated- 23-12-2023
	  SignPage sp = new SignPage(driver);
	  sp.user_sign_In();  
  }
  
  @Test
  public void verify_user_account() {
	  // Dated- 25-12-2023
	  Create_Account_Page c = new Create_Account_Page(driver);
	  c.enter_user_information();
  }
  
  
  @BeforeClass
  public void invokeBrowser() {
	  launchBrowser("chrome");
	  NavigateUrl("http://www.automationpractice.pl/");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
