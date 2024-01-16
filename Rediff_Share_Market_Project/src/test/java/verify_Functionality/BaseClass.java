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
	public Application_Functionality af;
	public ExtentReports rep;
	public ExtentTest test;

	@BeforeMethod
	public void beforeMethod(ITestContext context) throws Exception {

		// Get ap reference variable which transfer to All Test Annotation
		af = (Application_Functionality) context.getAttribute("af");

		 // Get test reference variable which transfer to All Test Annotation
		test = (ExtentTest) context.getAttribute("test");
		
	}

	@BeforeTest
	public void beforeTest(ITestContext context) throws Exception {

		// Initialize Properties file Through Constructor
		af = new Application_Functionality();
		
		
		// Pass af Reference variable To before Method
		context.setAttribute("af", af);

		// Initialize Extent report
		 rep =af.create_extent_report();
		 
		 // create test for report
		test= rep.createTest("Do Login");
		  
		// Pass test Reference variable To before Method
		context.setAttribute("test", test);
		
		af.setlog(test);
		
		
	}

	@AfterTest
	public void aftertest() {
		
		// To Stop Monitoring of extent Report
		rep.flush();

	}
}
