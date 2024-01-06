package actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base_Class.Base_Test;

public class Class_006 extends Base_Test{

	public static void main(String[] args) {
		//launchBrowser("chrome");
		//Navigateurl("https://www.globalsqa.com/demo-site/draganddrop/");
		
		Actions act = new Actions(driver);
		// locate frame
		WebElement frame = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[1]"));
		
		driver.switchTo().frame(frame);
		
		WebElement source = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		WebElement source_1 = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
		WebElement source_2 = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
		WebElement source_3 = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));



        WebElement target= driver.findElement(By.xpath("//div[@id='trash']"));
        
        //act.dragAndDrop(source, target).build().perform();
        act.clickAndHold(source).moveToElement(target).release().build().perform();
        act.clickAndHold(source_1).moveToElement(target).release().build().perform();
        act.clickAndHold(source_2).moveToElement(target).release().build().perform();
        act.clickAndHold(source_3).moveToElement(target).release().build().perform();

	
	
	}

}
