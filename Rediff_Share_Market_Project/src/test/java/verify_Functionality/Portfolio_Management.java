package verify_Functionality;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class Portfolio_Management extends BaseClass{
  @Test(priority = 1)
  public void create_portfolio() throws Exception {
	  rep.createTest("Create Portfolio");
	  test.log(Status.INFO, "Create Portfolio...");
	  ap.click("createportfolio_xpath");
	  ap.clear("portfolioname_cssSelector");
	  ap.type("portfolioname_cssSelector", "portfolioname");
	  ap.click("createportfoliobutton_id");
	  
  }
  
  @Test(priority = 2)
  public void delete_portfolio() {
	  System.out.println("delete_portfolio");
  }
  
  @Test(priority = 3)
  public void update_portfolio() {
	  System.out.println("update_portfolio");
  }
}
