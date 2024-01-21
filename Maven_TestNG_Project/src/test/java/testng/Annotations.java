package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	// Dated- 05-12-2023
	@BeforeSuite 
	public void a() {
		System.out.println("@Before Suite");
	}

	@BeforeTest 
	public void b() {
		System.out.println("@Before Test");
	}
	
	@BeforeClass 
	public void c() {
		System.out.println("@Before Class");
	}
	
	@BeforeMethod
	public void d() {
		System.out.println("@Before Method");
	}
	
	@Test
	public void e() {
		System.out.println("@Test Method-1");
	}
	@Test
	public void f() {
		System.out.println("@Test Method-2");
	}

	@AfterMethod
	public void i() {
		System.out.println("@After Method");
	}
	
	@AfterClass
	public void j() {
		System.out.println("@After Class");
	}
	
	@AfterTest
	public void k() {
		System.out.println("@After Test");
	}
	
	@AfterSuite
	public void l() {
		System.out.println("@After Suite");
	}
}
