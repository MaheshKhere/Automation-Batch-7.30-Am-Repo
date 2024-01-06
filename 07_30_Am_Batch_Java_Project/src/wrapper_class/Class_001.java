package wrapper_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_001 {

	public static void main(String[] args) {
		
		// Convert Primitive data into Wrapper Class
		int g = 400;
		Integer i = Integer.valueOf(g);
		System.out.println(i);
		
		float f = 50.69f;
		Float ab = Float.valueOf(f);
		System.out.println(ab);
		
		// Convert wrapper class into Primitive Data
		Integer k = new Integer(8000);
		int b = k.intValue();
		System.out.println(b);
		
		Double op = new Double(20.6898);
		double a = op.doubleValue();
		System.out.println(a);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}
