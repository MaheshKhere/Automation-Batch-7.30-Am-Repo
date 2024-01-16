package functionality;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
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
		report.config().setDocumentTitle("Rediff Extent Report");
		report.config().setReportName("Functional Testing");
		report.config().setTheme(Theme.DARK);
		
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
	
	
	// To check portfolio name is present or not
	public void checkSelectedOptioninDropdown(String locator, String option) {
		
	 s = new Select(getElement(locator));
		String text = s.getFirstSelectedOption().getText();
		
		if(text.equalsIgnoreCase(text)) {
			test.log(Status.INFO, "Selected Option is :- " +option);
		}
	}
		
		// To select option for delete portfolio
		public void selectportfolioname(String locator, String option) {
			s= new Select(getElement(locator));
			s.selectByVisibleText(option);
		}
		
		
		// Check for option is not available
		public void checkSelectedOptionnotinDropdown(String locator, String option) {
			String text = s.getFirstSelectedOption().getText();

			if(text.equalsIgnoreCase(text)) {
				test.log(Status.INFO, "Option is not Present in dropdown :- " +option);
			}
		}
		
		
		// To Handle alert
		public void acceptalert() {
			test.log(Status.INFO, "Switching towards Alert..");
			
			// To wait for alert box
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
		
			// Switch alert
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		
			test.log(Status.INFO, "Accepted Alert..");

		}
		
	}

