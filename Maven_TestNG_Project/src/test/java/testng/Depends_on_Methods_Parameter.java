package testng;

import org.testng.annotations.Test;

public class Depends_on_Methods_Parameter {
	
	// Dated- 07-12-2023
	@Test
	public void a() {
		System.out.println("a() Method");
	}

	@Test
	public void d() {
		System.out.println("d() Method");
	}
	
	@Test
	public void e() {
		System.out.println("e() Method");
	}
	
	// b method dependent a method
	@Test(dependsOnMethods = { "a" })
	public void b() {
		System.out.println("b() Method dependent on a() Metho");
	}

	// c method dependent b method
	@Test(dependsOnMethods = { "b" })
	public void c() {
		System.out.println("c() Method dependent on b() Method");
	}
	
	@Test
	public void f() {
		System.out.println("f() Method");
	}

}
