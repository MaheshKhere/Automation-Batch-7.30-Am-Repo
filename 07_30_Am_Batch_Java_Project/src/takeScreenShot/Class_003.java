package takeScreenShot;

import java.time.Duration;

import org.bouncycastle.crypto.ec.ECElGamalDecryptor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import base_Class.Base_Test;

public class Class_003 extends Base_Test{

	public static void main(String[] args) throws Throwable {
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		takescreenshot("Redbus");
	}
}
