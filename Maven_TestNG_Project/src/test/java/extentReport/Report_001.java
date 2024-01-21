package extentReport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base_Class.Base_Test;

public class Report_001 extends Base_Test{
	//Dated- 19-12-2023
@Test
public void verify_Report() {
	
	String path =System.getProperty("user.dir");
	ExtentSparkReporter report = new ExtentSparkReporter(path +"\\ExtentReport\\Verify_Report.html");
	report.config().setDocumentTitle("Automation Report");
	report.config().setReportName("Functional Testing");
	report.config().setTheme(Theme.STANDARD);
	
	//Attach report
	ExtentReports r = new ExtentReports();
	r.attachReporter(report);
	
	// Name of OS
	r.setSystemInfo("OS","Window");
	
	// Name of QA
	r.setSystemInfo("QA", "Mahesh Khere");
	
	//Name of Browser
	r.setSystemInfo("Browser", "Chrome");
	
	// use Create test ()
	ExtentTest test = r.createTest("Launch Browser");
	
	//to give description
	test.log(Status.INFO, "Opened Chrome Browser");
	test.log(Status.PASS,"pass");
	test.log(Status.FAIL,"failed");

	launchBrowser("chrome");
	NavigateUrl("https://www.facebook.com/");
	
	// to Stop Monitoring Report
	r.flush();
	
}
}
