package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Class_006 {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");

		// Screen Shot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srg = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("../Practice_Batch_08_Morning/ScreenShot_1/HomeAmazon_001.png");
		FileHandler.copy(srg, trg);

		Select s = new Select(driver.findElement(By.xpath("//select[@name='CompanyCountry']")));
		//s.selectByVisibleText("Italy");
		//s.selectByValue("DZ");
		s.selectByIndex(1);
		System.out.println(s.isMultiple());
	}

}
