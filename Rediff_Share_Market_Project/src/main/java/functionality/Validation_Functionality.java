package functionality;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Validation_Functionality extends Generic_Functionality{

	public void validate_title() {
		
	}
	
	public void validate_text() {
		
	}
	
	public void validate_element() {
		
	}
	
	
	public void screenshot(String screenshotname) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(projectpath+"\\Screenshot\\"+screenshotname+".png");
		FileHandler.copy(src, trg);
	}
}
