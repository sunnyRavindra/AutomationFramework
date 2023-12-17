package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;

public class TestCase1 {

	private WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/login");
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
