package testNG;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import afw.utils.Log;

public class TestNG {
	WebDriver driver;

	@BeforeSuite(groups= {"QA"})
	public void BeforeSuite() {
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("BeforeSuite");
		driver = new FirefoxDriver();
		Log.startTestCase("BeforeSuite");
	}

	@AfterSuite(groups= {"QA"})
	public void AfterSuite() {
		Log.startTestCase("AfterSuite");
		driver.quit();
		Log.endTestCase("AfterSuite");
	}

	@Test(groups = {"QA"})
	public void Text() {
		Log.startTestCase("Test");
		driver.get("https://botcat.org/");
		Log.endTestCase("Test");
	}
//
//	@Test(dependsOnMethods= "firefoxText",groups = { "Firefox" })
//	public void firefoxTest1() {
//		driver.get("www.google.com");
//		Log.info("Starting Browser");
//	}
}
