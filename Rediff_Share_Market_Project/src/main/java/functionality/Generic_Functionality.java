package functionality;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Generic_Functionality {

	public String projectpath = System.getProperty("user.dir");
	public Properties envprop;
	public Properties uatprop;
	public Properties locatorprop;
	public FileInputStream fis;
	public WebDriver driver;
	public ExtentTest test;
	public Select s;

	
	public void open_browser(String browser) {
		System.out.println("Launched Browser Is:- " + uatprop.getProperty(browser));
		
		// To generate logs in report 
		test.log(Status.INFO, "Launched Browser Is:- " + uatprop.getProperty(browser));
		
		if (uatprop.getProperty(browser).equalsIgnoreCase("chrome")) {
			// chromebrowser=chrome
			driver = new ChromeDriver();
		} else if (uatprop.getProperty(browser).equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else if (uatprop.getProperty(browser).equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void navigate(String url) {
		System.out.println("Navigated Url is :- "+uatprop.getProperty(url));
		
		test.log(Status.INFO, "Navigated Url is Is:- " + uatprop.getProperty(url));

		driver.get(uatprop.getProperty(url));

	}

	public void click(String locator) {
		// here click is performed on element
		// Which came from getElement and by locator Method
		System.out.println("Clicked On WebElement is:- "+locatorprop.getProperty(locator));
		
		test.log(Status.INFO, "Got WebElement is :- "+ locatorprop.getProperty(locator));

		
		test.log(Status.INFO, "Clicked on WebElement is :- "+ locatorprop.getProperty(locator));
		getElement(locator).click();
	}

	public void getText() {

	}

	public void select(String locator, String option) {

	}

	public void type(String locator, String Input_text) {
		test.log(Status.INFO, "Clicked on WebElement is :- "+ locatorprop.getProperty(locator));
		
		test.log(Status.INFO, "Entered Text is :- "+ uatprop.getProperty(Input_text));
		getElement(locator).sendKeys(uatprop.getProperty(Input_text));
		
	}
	
	public void clear(String locator) {
		
		test.log(Status.INFO, "Cleared WebElement is :- "+locatorprop.getProperty(locator));
		getElement(locator).clear();
	}

	
	public WebElement getElement(String locatorkey) {
		// Method Purpose = To find WebElement

		WebElement element = null;
		element = driver.findElement(getLocator(locatorkey));
		return element; // Above method method return WebElement reference variable
	}

	public By getLocator(String locatorKey) {
		// Method Purpose = To Locate WebElement With help of
		// any type of Locator
		
		By by = null; // First Time it will null and it Return By Class
		
		// Here locatorkey is coming from locator properties file
		if (locatorKey.endsWith("_id")) {
			by =By.id(locatorprop.getProperty(locatorKey));

		} else if (locatorKey.endsWith("_name")) {
			by = By.name(locatorprop.getProperty(locatorKey));

		} else if (locatorKey.endsWith("_className")) {
			by =By.className(locatorprop.getProperty(locatorKey));

		} else if (locatorKey.endsWith("_linktext")) {
			by =By.linkText(locatorprop.getProperty(locatorKey));

		} else if (locatorKey.endsWith("_partiallinktext")) {
			by =By.partialLinkText(locatorprop.getProperty(locatorKey));

		} else if (locatorKey.endsWith("_cssSelector")) {
			by =By.cssSelector(locatorprop.getProperty(locatorKey));

		} else if (locatorKey.endsWith("_xpath")) {
			by =By.xpath(locatorprop.getProperty(locatorKey));
		}

		return by;  // Return By class Variable
	}

	
	
	// To generate logs for every step
	public void setlog(ExtentTest test) {
		this.test=test;
	}
}
