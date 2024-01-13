package verify_Functionality;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import functionality.Application_Functionality;

import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public Application_Functionality ap;
	public ExtentReports rep;
	public ExtentTest test;

	@BeforeMethod
	public void beforeMethod(ITestContext context) throws Exception {

		// pass ap variable
		ap = (Application_Functionality) context.getAttribute("ap");

		// pass test variable
		test = (ExtentTest) context.getAttribute("test");
		
	}

	@BeforeTest
	public void beforeTest(ITestContext context) throws Exception {

		// Initialize Properties file Through Constructor
		ap = new Application_Functionality();

		// set ap reference variable
		context.setAttribute("ap", ap);

		// Initialize report
		 rep =ap.create_extent_report();
		
		
		context.setAttribute("test", test);
		
	}

	@AfterTest
	public void aftertest() {
		rep.flush();

	}
}
