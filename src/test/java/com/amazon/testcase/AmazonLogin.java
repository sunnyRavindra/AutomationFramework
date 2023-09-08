package com.amazon.testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.base.Base;

import sun.security.util.Password;

public class AmazonLogin extends Base{

	@Test
	public void logininAmazon() {

		Assert.assertTrue(driver.findElement(By.cssSelector(AmazonOR.getProperty("username"))).isDisplayed());

		driver.findElement(By.cssSelector(AmazonOR.getProperty("username"))).sendKeys("sunny.bharne@gmail.com");;
		
		Assert.assertTrue(driver.findElement(By.cssSelector(AmazonOR.getProperty("usernameButton"))).isDisplayed());

		driver.findElement(By.cssSelector(AmazonOR.getProperty("usernameButton"))).click();

		takeScreenShot(driver, "amazon");
		
		Assert.assertTrue(driver.findElement(By.cssSelector(AmazonOR.getProperty("password"))).isDisplayed());

		driver.findElement(By.cssSelector(AmazonOR.getProperty("password"))).sendKeys();
		
		Assert.assertTrue(driver.findElement(By.cssSelector(AmazonOR.getProperty("passwordButton"))).isDisplayed());

		driver.findElement(By.cssSelector(AmazonOR.getProperty("passwordButton"))).click();

	}

}
