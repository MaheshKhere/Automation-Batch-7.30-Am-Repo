package verify_Functionality;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class Portfolio_Management extends BaseClass{
  @Test(priority = 1)
  public void create_portfolio() throws Exception {
	 
	  String portfolio_name = "John";
	  
	  test.log(Status.INFO, "create_portfolio..");
	  af.click("createportfolio_xpath");
	  af.clear("portfolioname_cssSelector");
	  af.type("portfolioname_cssSelector", "portfolioname");
	  af.click("createportfoliobutton_id");
	  af.checkSelectedOptioninDropdown("porfoliodropdown_id", portfolio_name );
	  
  }
  
  @Test(priority = 2)
  public void delete_portfolio() {
	 
	  String option_1 = "cd";
	 
	  // generate log
	  test.log(Status.INFO, "delete_portfolio...");
	  af.selectportfolioname("porfoliodropdown_id",option_1 );
	  af.click("deleteportfoliobutton_id");
	  af.acceptalert();
	  af.checkSelectedOptionnotinDropdown("porfoliodropdown_id", option_1);
  }
  
  @Test(priority = 3)
  public void update_portfolio() {
	  System.out.println("update_portfolio");
  }
}
