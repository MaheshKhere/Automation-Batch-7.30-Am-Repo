package actions_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base_Class.Base_Test;

public class Slider extends Base_Test {

	public static void main(String[] args) throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://jqueryui.com/slider/");

		// Locate frame
		WebElement frame = driver.findElement(By.className("demo-frame"));

		// To Enter inside frame
		driver.switchTo().frame(frame);

		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));

		// Action Class
		Actions action = new Actions(driver);
		
		// Slider Move in Forward Direction
		 action.dragAndDropBy(slider, 300, 0).build().perform();
		 
		 // Another Method for Move Slider in Forward Direction 
		//action.clickAndHold(slider).moveByOffset(250, 0).release().build().perform();
		takescreenshot("After Slider Is Moved");
		
		// Move in Backward Direction
		action.dragAndDropBy(slider, -100, 0).build().perform();
		takescreenshot("After Slider Is Moved Backward Direction");
	}

}
