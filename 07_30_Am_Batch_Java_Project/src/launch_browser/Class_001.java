package launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Class_001 {

	public static void main(String[] args) {
		
		// Launch Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		driver.quit();
		
		
		//Launch Firefox
		
//		WebDriver driver_1 = new FirefoxDriver();
//		driver_1.manage().window().maximize();
//		driver_1.get("https://www.selenium.dev/");
//		
		
		
		

	}

}
