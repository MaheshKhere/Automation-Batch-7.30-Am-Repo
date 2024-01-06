package actions_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Priyanka_Madm {

	public static void main(String[] args) throws InterruptedException {
		
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
				//driver.get("https://jqueryui.com/droppable/");
				Actions act = new Actions(driver);
				
				WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
				driver.switchTo().frame(iframe);
				
				WebElement drag = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
				
				WebElement drop = driver.findElement(By.xpath("//div[@id='trash']"));
					act.dragAndDrop(drag, drop).build().perform();
					driver.switchTo().defaultContent();
					Thread.sleep(2000);

	}

}
