package dynamic_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base_Class.Base_Test;

public class Railyatri_Drop_down extends Base_Test {

	public static void main(String[] args) throws Throwable {

		// Dated- 27-11-2023
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.railyatri.in/");
		System.out.println("Title of Web Page Is:- " + driver.getTitle());
		System.out.println("Current Url of WebPage is:- " + driver.getCurrentUrl());

		// Locate From dropdown-
		WebElement Board_from = driver.findElement(By.cssSelector("input#from_stn_input"));
		Board_from.sendKeys("Nagpur");

		// Click on Nagpur Option-
		driver.findElement(By.xpath("//li[text()='NAGPUR | NGP']")).click();

		// Capture City name-
		System.out.println("Entered City Name is:- " + Board_from.getAttribute("value"));

		// dated-28-11-2023
		// Locate Board City dropdown
		driver.findElement(By.xpath("//input[@id='to_stn_input']")).sendKeys("Pune");

		// Click on Pune city-
		driver.findElement(By.xpath("//li[text()='PUNE JN | PUNE']")).click();

		// Click on calendar-
		driver.findElement(By.id("datepicker_train")).click();

		// Click on date 30
		driver.findElement(By.xpath("(//td[text()='30'])[2]")).click();
		takescreenshot("Before Click on Search Button");

		// Click on search button-
		driver.findElement(By.id("search_btn_dweb")).click();

		// Scroll Page-
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");

		// Click on Book Now button-
		driver.findElement(By.xpath("(//div[text()=' Book Now '])[1]")).click();
		Thread.sleep(3000);
		takescreenshot("Before Click on Rs Button");

		// Click on book RS-button-
		driver.findElement(By.xpath("(//button[text()='Book ₹2270'])[1]")).click();

		js.executeScript("window.scrollBy(0,300)");

		// Click on female-
		driver.findElement(By.xpath("//li[text()='Female']")).click();

		// Enter Full name-
		driver.findElement(By.xpath("(//input[@class='inputText'])[1]")).sendKeys("Sakshi Kitey");

		// Enter Age-
		driver.findElement(By.xpath("//input[@class='inputText ageinput']")).sendKeys("26");

		// Click on Berth-
		driver.findElement(By.xpath("//input[@id='adult_add_berth']")).click();

		// Select berth - Middle
		driver.findElement(By.xpath("//li[@data-value='MB']")).click();
		
		takescreenshot("Before Click on Save and Next Button");
		Thread.sleep(3000);
		// Click on Save and Next button-
		driver.findElement(By.xpath("(//button[text()='Save & Add next'])[1]")).click();

		// date-29-11-2023

		// scroll page-
		js.executeScript("window.scrollBy(0,1000)");

		// Enter email-
		driver.findElement(By.cssSelector("input#user_email")).sendKeys("maheshkhere11@gmail.com");

		// Enter Mob No-
		driver.findElement(By.cssSelector("input#user_phone")).sendKeys("7666659125");

		// Enter IRCTC id-
		driver.findElement(By.cssSelector("input#no_call_irctc")).sendKeys("maheshkhere11");
		Thread.sleep(3000);

		takescreenshot("Before Click on Continue Button");

		// Click on Verify verifyId Button-
		driver.findElement(By.cssSelector("button#verifyIdBtn")).click();
		
		// Click on Continue Button-
		Thread.sleep(3000);
         //driver.findElement(By.cssSelector("button#passenger_save")).click();
		driver.findElement(By.xpath("//div[text()='Continue ']")).click();
		
		Thread.sleep(3000);
		// Click on Upi Button and Enter UpI Id-
		driver.findElement(By.xpath("//div[text()='UPI']")).click();
		driver.findElement(By.xpath("//input[@id='user_vpa']")).sendKeys("7028642037@ybl");
		takescreenshot("After Upi Id Entered");
	}
	}

