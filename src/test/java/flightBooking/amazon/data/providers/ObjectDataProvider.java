package com.amazon.data.providers;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amazon.base.Base;

public class ObjectDataProvider extends Base {

	@Test(dataProvider = "searchData")
	public void validateSearch(String searchKeyword,String searchKeyworktwo) throws InterruptedException {

		driver.findElement(By.cssSelector(AmazonOR.getProperty("searchBar"))).clear();
		driver.findElement(By.cssSelector(AmazonOR.getProperty("searchBar"))).sendKeys(searchKeyword);
		driver.findElement(By.cssSelector(AmazonOR.getProperty("searchButton"))).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector(AmazonOR.getProperty("searchBar"))).clear();
		driver.findElement(By.cssSelector(AmazonOR.getProperty("searchBar"))).sendKeys(searchKeyworktwo);
		driver.findElement(By.cssSelector(AmazonOR.getProperty("searchButton"))).click();
	}

	@DataProvider
	public Object[][] searchData() {
		return new Object[][] { { "manual", "testing" }, { "Automation", "testing" } };
	}

}
