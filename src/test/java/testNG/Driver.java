package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	private static WebDriver driver;
	private String browser;

	public Driver(WebDriver driver, String browser) {
		this.driver = driver;
		this.browser = browser;
		setupDriver(browser);
	}

	private void setupDriver(String browser) {
		if (browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}

}
