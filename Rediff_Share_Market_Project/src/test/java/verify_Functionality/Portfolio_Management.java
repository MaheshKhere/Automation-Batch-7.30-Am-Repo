package verify_Functionality;

import org.testng.annotations.Test;

public class Portfolio_Management extends BaseClass{
  @Test
  public void create_portfolio() {
	 System.out.println();
	  ap.click("createportfolio_id");
	  ap.clear("portfolioname_cssSelector");
	  ap.type("portfolioname_cssSelector", "portfolioname");
	  ap.click("createportfoliobutton_id");
	  
  }
  
  @Test()
  public void delete_portfolio() {
	  System.out.println("delete_portfolio");
  }
  
  @Test
  public void update_portfolio() {
	  System.out.println("update_portfolio");
  }
}
