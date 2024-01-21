package file_upload;

import org.testng.annotations.Test;

import base_Class.Base_Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;

public class File_Upload_Using_Robot_class extends Base_Test {

	// Dated-28-12-2023
	@Test
	public void verify_File_upload() throws Exception {
		// click on file upload button
		driver.findElement(By.xpath("//button[text()='Add files']")).click();

		// Create object String Selection
		StringSelection s = new StringSelection("\"C:\\Users\\HP\\Desktop\\BITUMEN PATCHES QUANTITY.xlsx\"");

		// Copy file path
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);

		// Robot Class
		Robot r = new Robot();
		 
		// Press Control v
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		
		// Release Control v
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		
		
		// press Enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@BeforeMethod
	public void launchMethod() {
		launchBrowser("chrome");
		NavigateUrl("https://uploadnow.io/");

	}

}
