package com.soucedemo.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

	WebDriver driver;

	@FindBy(css = "button#add-to-cart-sauce-labs-backpack")
	private WebElement _backpack;

	@FindBy(css = "button#add-to-cart-sauce-labs-bike-light")
	private WebElement _bikeLight;

	@FindBy(css = "button#add-to-cart-sauce-labs-onesie")
	private WebElement _onesie;

	@FindBy(css = "button#add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement _tshirt;

	@FindBy(css = "button#add-to-cart-sauce-labs-fleece-jacket")
	private WebElement _jacket;

	@FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	private WebElement _tshirtRed;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void validatePage() {

		List<WebElement> elements = new ArrayList<>(
				Arrays.asList(_backpack, _bikeLight, _onesie, _tshirt, _jacket, _tshirtRed));

		for (WebElement e : elements) {
			Assert.assertTrue(e.isDisplayed());
		}

	}

}
