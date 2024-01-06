package javaScript_Executor;

import org.openqa.selenium.JavascriptExecutor;

import base_Class.Base_Test;

public class Js_003 extends Base_Test{

	public static void main(String[] args) {
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Scroll Page with some points
		js.executeScript("window.scrollBy(0,1000)");
		
		// Scroll Page upto Bottom
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		
		// To refresh page
		js.executeScript("window.history.go(0)");
		
		//To navigate back
		js.executeScript("window.history.back()");
		
		//To navigate forward
		js.executeScript("window.history.forward()");

	}

}
