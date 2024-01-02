package stepdefinition.soucedemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import manager.FileReaderManager;
import manager.PageObjectManager;
import pages.soucedemo.HomePage;
import pages.soucedemo.LoginPage;

public class Login {
	WebDriver driver = new FirefoxDriver();
	PageObjectManager pom = new PageObjectManager(driver);
	LoginPage loginPage = pom.getLoginPage();
	HomePage homePage = pom.getHomePage();

	@Given("goTo {string} with url {string}")
	public void go_to_with_url(String string, String url) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait()));
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

}
