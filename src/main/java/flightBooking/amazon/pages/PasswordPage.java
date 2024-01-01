package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement Password;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement submit;
	
	public PasswordPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterPassword(String Password) {
		this.Password.sendKeys(Password);
	}
	
	public void submit() {
		this.submit.click();
	}
}
