package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import utils.BaseClass;

public class TestListener implements ITestListener {

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Started : ###########Started###########" + context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Ends : ##########Ended######### :-->" + context.getName());
	}
	
    @Override		
    public void onTestFailure(ITestResult results) {					
    	System.out.println("Test Results Status : " + results.getStatus());
    	try {
			BaseClass.takeSnapShot();
		} catch (Exception e) {
			Reporter.log("Issue in Taking screenshot");
		}
    	
    }    		
    
    @Override
    public void onTestSuccess(ITestResult result) {
    	System.out.println("Test sucessfuly completed " + result.getName() );
    }
    
    @Override
    public void onTestSkipped(ITestResult result) {
    	System.out.println("Test sucessfuly completed " + result.getName() );
    }

}
