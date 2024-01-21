package extentReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base_Class.Base_Test;

public class Report_002 extends Base_Test{
	
	// Dated- 20-12-2023
	public 	ExtentReports r ;
	public ExtentTest test;
	public String projectpath= System.getProperty("user.dir");
  
	@Test(priority = 1)
  public void Verify_Skill() throws Throwable {
	  
	  test= r.createTest("Verify Search Box");
	  test.log(Status.INFO, "Entered Automation Skill");
	  driver.findElement(By.xpath("//input[@placeholder='Enter skills / designations / companies']")).sendKeys("Automation Testing");
	  
	  // Click on automation testing
	  driver.findElement(By.xpath("//div[@title='Automation testing']")).click();
	  
	  Thread.sleep(3000);
	  
	  //take Screen Shot
	  takescreenshot("Entered Automation Testing");
	 
	  // Add Screen Shot in Report
	  test.addScreenCaptureFromPath(projectpath+"\\ScreenShot\\Entered Automation Testing.png" );
	  
  }
	
  @Test(priority = 2)
  public void verify_dropdown() throws Throwable {
	  
	  test= r.createTest("verify_dropdown");
	  test.log(Status.INFO,"Click on 1year");
	  //Click on dropdown
	  driver.findElement(By.id("expereinceDD")).click();
	  driver.findElement(By.xpath("//ul[@class='dropdown ']/li[2]")).click();
	  
	  Thread.sleep(3000);
	
	  //take Screen Shot
	  takescreenshot("Click on DropDown Year");
	 
	  // Add Screen Shot in Report
	  test.addScreenCaptureFromPath(projectpath+"\\ScreenShot\\Click on DropDown Year.png");
  }
  
  @Test(priority = 3)
  public void click_dropdown() throws Throwable {
	  test= r.createTest("click_dropdown");
	  test.log(Status.INFO, "Entered Mumbai Location");
	  
	  // Enter Location
	  driver.findElement(By.xpath("//input[@placeholder='Enter location']")).sendKeys("Mumbai");
	
	  //take Screen Shot
	  Thread.sleep(3000);
	  takescreenshot("Entered Mumbai Location");
	
	  // Add Screen Shot in Report
	  test.addScreenCaptureFromPath(projectpath+"\\ScreenShot\\Entered Mumbai Location.png");
	  
  }
  
  @Test(priority = 4)
  public void click_Search_button() throws Throwable {
	  test = r.createTest("click_Search_button");
	  test.log(Status.INFO, "Clicked Search Button");
	  // Click on search button
	  driver.findElement(By.xpath("//div[text()='Search']")).click();
	
	  //take Screen Shot
	  Thread.sleep(3000);
	  takescreenshot("Entered Click Search Button");
	  
	  // Add Screen Shot in Report
	  test.addScreenCaptureFromPath(projectpath+"\\ScreenShot\\Entered Click Search Button.png");  
  }
 
  @BeforeClass
  public void invoke_browser() {
	  launchBrowser("chrome");
	  NavigateUrl("https://www.naukri.com/");
	  String path =System.getProperty("user.dir");
		ExtentSparkReporter report = new ExtentSparkReporter(path +"\\ExtentReport\\Naukari_Report.html");
		report.config().setDocumentTitle("Automation Report");
		report.config().setReportName("Functional Testing");
		report.config().setTheme(Theme.STANDARD);
		
		//Attach report
        r = new ExtentReports();
		r.attachReporter(report);
		r.setSystemInfo("OS","Window");
		r.setSystemInfo("QA", "Akshay");
		r.setSystemInfo("Browser", "Chrome");	
  }
  
  @AfterClass
  public void ending_process() {
	  r.flush();
  }

}
