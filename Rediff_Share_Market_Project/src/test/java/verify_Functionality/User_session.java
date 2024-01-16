package verify_Functionality;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class User_session extends BaseClass {
	@Test(priority = 1)
	public void do_login() throws Exception {

		
		test.log(Status.INFO, "Login...");
		// Enter properties file String key is equal to chrome
		af.open_browser("chromebrowser");

		// Enter properties file String key is equal to https://money.rediff.com/
		af.navigate("rediffurl");
		
		// Takescreenshot
		af.screenshot("Rediff Homepage");

		// Enter properties file String key is equal to Sign In
		af.click("sign_xpath");
		
		af.type("username_id", "username");	// enter username
		
		af.type("userpass_xpath", "userpass"); //enter userpass
		
		af.click("submitbuttton_id"); // Click on Submit button
		
	}

	@Test(priority = 2)
	public void do_logout() {
		System.out.println("do_logout");
		af.click("signout_linktext");

	}
}
