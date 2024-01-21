package automate_WebApplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_003 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.railyatri.in/");
		
		// size of searchbox
		WebElement searchbox = driver.findElement(By.xpath("//input[@placeholder='Enter train no. or name']"));
	
		// x co-ordinate 
		System.out.println(searchbox.getLocation().x);
		
		//y co-ordinate
		System.out.println(searchbox.getLocation().y);
		
		// get size 
		System.out.println(searchbox.getSize());
		
		// to check is enable
		System.out.println(searchbox.isEnabled());
	
	}

}
