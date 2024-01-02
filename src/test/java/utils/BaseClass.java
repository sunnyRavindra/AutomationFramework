package utils;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseClass {

	static WebDriver driver;
	static String browserName = "chrome";
	static String url = "http://automationpractice.com/index.php";
	private String Headless = "--headless";
	private static FirefoxOptions options;

	public static WebDriver init() {
		// System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver = new ChromeDriver();
//		try {
//			options = new FirefoxOptions();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		// options.addArguments(Headless);
//		try {
//			driver = new FirefoxDriver(options);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
	}

	public static void takeSnapShot() throws Exception {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(System.getProperty("user.dir") + "//src//test//resources//screenShots//something.png");
		FileUtils.copyFile(SrcFile, DestFile);
	}


}
