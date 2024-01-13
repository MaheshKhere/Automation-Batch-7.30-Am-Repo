package functionality;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Application_Functionality extends Validation_Functionality{

	
	public Application_Functionality() throws Exception {
		
		// Initialize Environment Properties File-1
		fis = new FileInputStream(projectpath+"\\src\\test\\resources\\environment.properties");
		envprop = new Properties();
		envprop.load(fis);
	
		// Initialize UAT Properties File-2
		fis = new FileInputStream(projectpath+"\\src\\test\\resources\\UAT.properties");
		uatprop = new Properties();
		uatprop.load(fis);
		
		// Initialize Locator Properties File-3
		fis = new FileInputStream(projectpath+"\\src\\test\\resources\\locators.properties");
		locatorprop = new Properties();
		locatorprop.load(fis);
			
	}
	
	public void screenshot(String screenshotname) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(projectpath+"\\Screenshot\\"+screenshotname+".png");
		FileHandler.copy(src, trg);
	}
	
	public ExtentReports create_extent_report() {
		ExtentSparkReporter report = new ExtentSparkReporter(projectpath+"\\Report\\Rediff.html");
		report.config().setDocumentTitle("Automation Report");
		report.config().setReportName("Functional Testing");
		report.config().setTheme(Theme.STANDARD);
		
		//Attach report
		ExtentReports rep = new ExtentReports();
		rep.attachReporter(report);
		
		// Name of OS
		rep.setSystemInfo("OS","Window");
		
		// Name of QA
		rep.setSystemInfo("QA", "Mahesh Khere");
		
		//Name of Browser
		rep.setSystemInfo("Browser", "Chrome");
		return rep;
	}
}
