package actions_Class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Class_01 {

	public static void main(String[] args) throws Exception {
	     
		// To get Current Project path
		String projectpath= System.getProperty("user.dir");
		System.out.println(projectpath);
		FileInputStream fis = new FileInputStream(projectpath+"\\src\\test\\resources\\data.properties");
        Properties p = new Properties();
        p.load(fis);
        
        // data fetch from file
       System.out.println(p.getProperty("user"));
	
	}

}
