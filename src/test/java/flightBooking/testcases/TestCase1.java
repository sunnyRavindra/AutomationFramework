package testcases;

import java.time.Duration;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TestCase1 {

	private WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		Logger Log = Logger.getLogger(Log.class.getName());//
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/login");
		Log.info("****************************************************************************************");
	}

	@Test
	public void test() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("gunjankaushik", "password@123");
		Thread.sleep(5000);
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
