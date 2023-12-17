package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;



public class Utils{
	public WebDriver driver;

	@BeforeSuite(groups= {"Firefox"})
	public void firefoxBeforeSuite() {
		Driver Driver = new Driver(driver, "Firefox");
		driver = testNG.Driver.getDriver();
	}

	@AfterSuite(groups= {"Firefox"})
	public void firefoxAfterSuite() {
		driver.quit();
	}
	
//	@BeforeTest(groups= {"qa","uat"})
//	public void beforeTest() {
//		System.out.println("@BeforeTest");
//	}
//
//	@AfterTest(groups= {"qa","uat"})
//	public void afterTest() {
//		System.out.println("@AfterTest");
//	}
	
}
