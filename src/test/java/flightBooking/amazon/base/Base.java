package com.amazon.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import flightBooking.amazon.utilities.WebUtil;


public class Base extends WebUtil{

	public static WebDriver driver;

	// Initializing base Config Properties
	public static Properties Config = new Properties();
	public static Properties AmazonOR = new Properties();
	public static Logger logs = Logger.getLogger("devpinoyLogger");
	public String configFile = "//src//test//resources//properties//config.properties";
	public String amazonOrFile = "//src//test//resources//properties//Amazon.OR.properties";
	public String Browser;

	@BeforeSuite
	public void setUp() {

		logs.info("Entering Before suite !!!");

		if (driver == null) {

			initProperty(configFile, Config);

			initProperty(amazonOrFile, AmazonOR);

			intiBrowser();

			logs.info("Before Suite formalities completed successfully");
		}

	}

	@AfterSuite
	public void tearDown() {

		logs.info("Tearing it all down !!!");

		if (driver != null) {
			driver.quit();
		}
	}

	// Initialize Property File
	public static void initProperty(String filepath, Properties property) {

		try {
			property.load(new FileInputStream(System.getProperty("user.dir") + filepath));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// Initialize browser
	public static void intiBrowser() {
		if (Config.getProperty("Browser").equals("Chrome")) {
			// System.setProperty("webDriver.chrome.driver", System.getProperty("user.dir")
			// + "//src//test//resources//excecutatbles//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get(Config.getProperty("BaseURL"));
		}
	}

}
