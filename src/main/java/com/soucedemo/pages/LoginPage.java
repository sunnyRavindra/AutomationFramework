package com.soucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;
	String URL = "https://www.saucedemo.com/";
	String userID = "standard_user";
	String password = "secret_sauce";

	@FindBy(css = "input#user-name")
	private WebElement _userName;

	@FindBy(css = "input#password")
	private WebElement _password;

	@FindBy(css = "input#login-button")
	private WebElement _loginButton;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public HomePage login() throws InterruptedException {
		_userName.sendKeys(userID);
		_password.sendKeys(password);
		_loginButton.click();
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		Thread.sleep(10000);
		return new HomePage(driver);
	}



}
