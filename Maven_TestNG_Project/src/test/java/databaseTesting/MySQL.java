package databaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base_Class.Base_Test;

public class MySQL extends Base_Test {

	// Dated- 18-12-2023
	
	public ResultSet r;
	@Test(priority = 1)
	public void verify_database() throws Throwable {
		String port_no = "3306";
		String host = "localhost";

		// create Jdbc connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port_no + "/mahesh", "root",
				"mahesh@7028");

		// create statement (path for database to send query)
		Statement s = conn.createStatement();
		r = s.executeQuery("select * from QA where Name=\"John\";");
		// r =0
		r.next(); // to Shift 0 to 1

		System.out.println(r.getString("Name"));
		System.out.println(r.getString("Pass"));
	}

	@Test(priority = 2)
	public void Verify_facebook_login() throws Exception {
		launchBrowser("chrome");
		NavigateUrl("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(r.getString("Pass"));
	}
}
