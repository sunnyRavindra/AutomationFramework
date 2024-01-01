package soucedemo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.soucedemo.pages.HomePage;
import com.soucedemo.pages.LoginPage;

import framework.DriverManager;
import framework.DriverManagerFactory;
import framework.DriverType;

public class LoginTest {
	DriverManager driverManager;
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;

	@BeforeTest
	public void beforeTest() {
		driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
		driver=driverManager.getDriver();
	}

	@Test(priority = 0)
	public void login() throws InterruptedException {
		loginPage = new LoginPage(driver);
		homePage = loginPage.login();
	}

	@Test(priority = 1)
	public void validateLandingPage() {
		homePage.validatePage();
	}

	@AfterClass
	public void afterclass() {
		driver.close();
	}

}
