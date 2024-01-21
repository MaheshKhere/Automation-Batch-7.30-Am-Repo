package base_Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Base_Test {

	public static WebDriver driver;
	public static String parent_Window_id;
	public static String Child_Window_id;
	public static Actions act;

	// Dynamic code for Capture Screen Shot
	public static void takescreenshot(String screenshotname) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("../Maven_TestNG_Project/ScreenShot/" + screenshotname + ".png");
		FileHandler.copy(src, target);
	}

	// Dynamic code for browser launch
	public static void launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			driver = new ChromeDriver(option);
			
		} else if (browser.equalsIgnoreCase("firefox")) {
			FirefoxOptions option_1 = new FirefoxOptions();
			option_1.addArguments("--disable-notifications");
			driver = new FirefoxDriver(option_1);
			
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Launch Browser is:- " + browser);
	}

    //Dynamic code for navigate url
	public static void NavigateUrl(String url) {
		driver.get(url);
		System.out.println("Navigate Url is:- " + url);
		System.out.println("Title Of WebPage is:- " + driver.getTitle());
	}

	// Dynamic Code for Switch Child Window
	public static void Switch_Window() {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		parent_Window_id = it.next();
		Child_Window_id = it.next();
		System.out.println("Parent Window Id is:- " + parent_Window_id);
		System.out.println("Child Window Id is:- " + Child_Window_id);
		

	}
	
	// Action Class
	public static void initialize_action_Class() {
		act = new Actions(driver);
	}
	
	// Extent Report
	public static void init_Extent_Report() {
		
	}
	
	// To generate random number
	public static int random_number() {
	Random r = new Random();
	
	// To generate 7 random numbers
	int random_no = r.nextInt(3734756); 
	return random_no;
	}
	
	
	public static void open_browser(String browsername) throws Exception {
		// To get project Location
		String project_path = System.getProperty("user.dir");
		// To Specify Location of properties file
		FileInputStream fis = new FileInputStream(project_path+"\\src\\test\\resources\\data.properties");

	}
	
}