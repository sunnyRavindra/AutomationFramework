package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestNG {
	WebDriver driver;

	@Test(groups = {"Firefox"})
	public void firefoxText() {
		Driver Driver = new Driver(driver, "Firefox");
		driver = testNG.Driver.getDriver();
		driver.get("www.google.com");
	}

	@Test(dependsOnMethods= "firefoxText",groups = { "Firefox" })
	public void firefoxTest1() {
		driver.get("www.google.com");
	}
}
