package verify_Functionality;

import org.testng.annotations.Test;

import functionality.Application_Functionality;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public Application_Functionality ap ;

	@BeforeMethod
	public void beforeMethod() throws Exception {
		//ap = new Application_Functionality();
		System.out.println("beforeMethod");
	}

	@BeforeTest
	public void beforeTest() throws Exception {
		
		// Initialize Properties file Through Constructor
		ap = new Application_Functionality();

		System.out.println("beforeTest");
	}

}
