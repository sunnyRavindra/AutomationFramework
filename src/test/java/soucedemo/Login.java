package soucedemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import afw.context.TestContext;
import afw.manager.PageObjectManager;
import afw.manager.PropertyManager;
import afw.manager.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.soucedemo.HomePage;
import pages.soucedemo.LoginPage;

public class Login {
	TestContext testContext;
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	
	public Login(TestContext context) {
		System.out.println("########################## Open Browser ################################");
		testContext = context;
		loginPage = testContext.getPageObjectManager().getLoginPage();
		homePage = testContext.getPageObjectManager().getHomePage();
		driver = testContext.getWebDriverManager().getDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(PropertyManager.getInstance().getConfigReader().getImplicitlyWait()));
	}

	@Before
	public void Before() {
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
		homePage.validateTitle(title);
	}

	@Given("login to soucedemo")
	public void login_to_soucedemo() throws InterruptedException {
		loginPage.login();
	}

	@After
	public void After() {
		System.out.println("########################## Closing Browser ################################");
		testContext.getWebDriverManager().closeDriver();
	}

}
