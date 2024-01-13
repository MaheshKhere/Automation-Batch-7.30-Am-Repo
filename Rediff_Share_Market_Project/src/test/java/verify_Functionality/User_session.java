package verify_Functionality;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class User_session extends BaseClass {
	@Test(priority = 1)
	public void do_login() throws Exception {

		test = rep.createTest("do login");
		
		test.log(Status.INFO, "Login...");
		// Enter properties file String key is equal to chrome
		ap.open_browser("chromebrowser");

		// Enter properties file String key is equal to https://money.rediff.com/
		ap.navigate("rediffurl");
		
		// Takescreenshot
		ap.screenshot("Rediff Homepage");

		// Enter properties file String key is equal to Sign In
		ap.click("sign_xpath");
		
		ap.type("username_id", "username");	// enter username
		
		ap.type("userpass_xpath", "userpass"); //enter userpass
		
		ap.click("submitbuttton_id"); // Click on Submit button
		
	}

	@Test(priority = 2)
	public void do_logout() {
		System.out.println("do_logout");
		ap.click("signout_linktext");

	}
}
