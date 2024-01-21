package actions_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Priyanka_madm_001 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://jqueryui.com/droppable/");

		Actions act = new Actions(driver);
		// get title of window
		System.out.println("Title of window" + driver.getTitle());
		// take screenshot
		// takescreenshot("draganddrop");
		// locate frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		// locate dragable element
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		// locate droppable element
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		act.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(2000);

	}

}
