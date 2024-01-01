package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SuiteListener implements ISuiteListener {

@Override
public void onFinish(ISuite suite1) {
System.out.println("onFinish function started of ISuiteListener " );

}

@Override
public void onStart(ISuite suite2) {
System.out.println("onStart function started of ISuiteListener " );

}

}