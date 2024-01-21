package actions_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_003 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		//locate frame
	WebElement frame =	driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	
	// To enter into frame
	driver.switchTo().frame(frame);
	
	// Locate Source element
	WebElement source = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
	WebElement source_1 = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
	WebElement source_2 = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
	WebElement source_3 = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));

	
	// Locate Target Element
	WebElement target= driver.findElement(By.xpath("//div[@id='trash']"));
	
	// Actions Class
	Actions act = new Actions(driver);
	
	// Perform Drag and drop
	//act.dragAndDrop(source,target).build().perform();
	
	// Another Method for drag and Drop
	act.clickAndHold(source).moveToElement(target).release().build().perform();
	act.clickAndHold(source_1).moveToElement(target).release().build().perform();
	act.clickAndHold(source_2).moveToElement(target).release().build().perform();
	act.clickAndHold(source_3).moveToElement(target).release().build().perform();

	}
}
