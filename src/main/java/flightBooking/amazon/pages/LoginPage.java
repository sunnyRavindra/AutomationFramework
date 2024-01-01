package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;

	@FindBy(id = "ap_email")
	private WebElement Username;
	
	@FindBy(id = "//input[@id='continue']")
	private WebElement Continue;

	public LoginPage(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	public void goTo(String URL) {
		driver.get(URL);
	}
	
	public void enterUserName(String Username) {
		this.Username.sendKeys(Username);
	}
	
	public void clickOnContinue() {
		this.Continue.click();
	}

}
