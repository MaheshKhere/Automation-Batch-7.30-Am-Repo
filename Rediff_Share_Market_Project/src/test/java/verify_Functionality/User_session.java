package verify_Functionality;

import org.testng.annotations.Test;

public class User_session extends BaseClass {
	@Test
	public void do_login() {

		// Enter properties file String key is equal to chrome
		ap.open_browser("chromebrowser");

		// Enter properties file String key is equal to https://money.rediff.com/
		ap.navigate("rediffurl");

		// Enter properties file String key is equal to Sign In
		ap.click("sigin_linktext");

	}

	@Test
	public void do_logout() {
		System.out.println("do_logout");

	}
}
