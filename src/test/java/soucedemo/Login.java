package soucedemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import afw.manager.FileReaderManager;
import afw.manager.PageObjectManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.soucedemo.HomePage;
import pages.soucedemo.LoginPage;

public class Login {
	WebDriver driver;
	PageObjectManager pom;
	LoginPage loginPage;
	HomePage homePage;

	@Before
	public void Before() {
		System.out.println("########################## Open Browser ################################");
		driver = new FirefoxDriver();
		pom = new PageObjectManager(driver);
		loginPage = pom.getLoginPage();
		homePage = pom.getHomePage();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Given("Navigate to {string} with url {string}")
	public void go_to_with_url(String string, String url) {
		loginPage.goTo(url);
	}

	@Given("enter username {string}")
	public void enter_username(String userName) throws InterruptedException {
		loginPage.enterUserName(userName);
	}

	@Given("enter password {string}")
	public void enter_password(String password) throws InterruptedException {
		loginPage.enterPassword(password);
	}

	@Given("click on {string} button")
	public void click_on_button(String string) {
		loginPage.clickOnSubmit();
	}

	@Then("validate title with {string}")
	public void validate_title_with(String title) {
		homePage = new HomePage(driver);
		homePage.validateTitle(title);
	}

	@Given("login to soucedemo")
	public void login_to_soucedemo() throws InterruptedException {
		loginPage.login();
	}

	@After
	public void After() {
		System.out.println("########################## Closing Browser ################################");
		driver.quit();
	}

}
