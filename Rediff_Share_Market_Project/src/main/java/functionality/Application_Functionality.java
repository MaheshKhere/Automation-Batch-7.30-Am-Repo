package functionality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Application_Functionality extends Validation_Functionality{

	
	public Application_Functionality() throws Exception {
		
		// Initialize Environment Properties File-1
		fis = new FileInputStream(projectpath+"\\src\\test\\resources\\environment.properties");
		envprop = new Properties();
		envprop.load(fis);
	
		// Initialize UAT Properties File-2
		fis = new FileInputStream(projectpath+"\\src\\test\\resources\\UAT.properties");
		uatprop = new Properties();
		uatprop.load(fis);
		
		// Initialize Locator Properties File-3
		fis = new FileInputStream(projectpath+"\\src\\test\\resources\\locators.properties");
		locatorprop = new Properties();
		locatorprop.load(fis);
			
	}
}
