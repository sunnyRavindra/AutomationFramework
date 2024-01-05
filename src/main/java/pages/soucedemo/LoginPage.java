package pages.soucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;
	String url = "https://www.saucedemo.com/";
	String userID = "standard_user";
	String password = "secret_sauce";
	String title = "Swag Labs";

	@FindBy(css = "input#user-name")
	WebElement _userName;

	@FindBy(css = "input#password")
	WebElement _password;

	@FindBy(css = "input#login-button")
	WebElement _loginButton;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void goTo(String url) {
		driver.get(url);
	}
	
	public void enterUserName(String userName) throws InterruptedException {
		_userName.sendKeys(userName);
		Thread.sleep(1000);
	}

	public void enterPassword(String Password) throws InterruptedException {
		_password.sendKeys(Password);
		Thread.sleep(1000);
	}

	public void clickOnSubmit() {
		_loginButton.click();
	}
	
	public void validateTitle(String title) {
		Assert.assertEquals(driver.getTitle(), title);
	}

	public HomePage login() throws InterruptedException {
		goTo(url);
		enterUserName(userID);
		enterPassword(password);
		clickOnSubmit();
		validateTitle(title);
		Thread.sleep(10000);
		return new HomePage(driver);
	}

}
