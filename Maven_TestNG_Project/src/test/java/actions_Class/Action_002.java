package actions_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_002 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		// Search Box
		WebElement searchbox =driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("abcxya");
		
		// Action Class
		Actions act = new Actions(driver);
		//double click
		//act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).doubleClick().build().perform();
	act.moveToElement(searchbox).doubleClick().build().perform();
	
	// To capture input data of searchbox
	System.out.println("Input data of SearchBox is:- "+ searchbox.getAttribute("value"));
	}
}
