package testng;

import org.openqa.selenium.interactions.Actions;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base_Class.Base_Test;

public class Listeners_001 extends Base_Test implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		// Initialize action class 
		 //act = new Actions(driver);
		
		// Method came from Base test
		initialize_action_Class();
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		// Method came from base Test
		try {
			takescreenshot(result.getMethod().getMethodName());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub	
	}
}
