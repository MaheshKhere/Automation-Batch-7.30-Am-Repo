package testng;

import org.testng.annotations.Test;

public class Group_Parameter {
	
	// Dated- 07-12-2023
	@Test(groups = { "SuperFast Train" })
	public void train_01() {
		System.out.println("12262- Duranto Express");
	}

	@Test(groups = { "SuperFast Train" })
	public void train_02() {
		System.out.println("12106- Vidhabha Express");
	}

	@Test(groups = { "SuperFast Train" })
	public void train_03() {
		System.out.println("12722- Dakshin Express");
	}

	@Test(groups = { "Express Train" })
	public void train_04() {
		System.out.println("17672- Patna Purna Express");
	}

	@Test(groups = { "Express Train" })
	public void train_05() {
		System.out.println("20862- Pune Humsafar Express");
	}

	@Test(groups = { "Express Train" })
	public void train_06() {
		System.out.println("12655- Navjeenvan Express");
	}

}
