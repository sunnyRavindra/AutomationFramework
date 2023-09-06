package com.amazon.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base {

	public static WebDriver driver;

	// Initializing base Config Properties
	public static Properties BaseConfig = new Properties();
	public static Properties ORConfig = new Properties();

	@BeforeSuite
	public void setUp() {


		if (driver == null) {

			initProperty("//src//test//resources//properties//config.properties", BaseConfig);

			initProperty("//src//test//resources//properties//config.properties", ORConfig);
			
			intiBrowser();
			
		}

	}

	@AfterSuite
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	// Initialize Property File
	public static void initProperty(String filepath, Properties property) {

		try {
			property.load(new FileInputStream(System.getProperty("user.dir") + filepath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Initialize browser
	public static void intiBrowser() {
		if (BaseConfig.getProperty("Browser").equals("Chrome")) {
			// System.setProperty("webDriver.chrome.driver", System.getProperty("user.dir")
			// + "//src//test//resources//excecutatbles//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get(BaseConfig.getProperty("BaseURL"));
		}
	}
}
