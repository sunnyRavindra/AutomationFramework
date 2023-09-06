package com.amazon.data.providers;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.amazon.base.Base;

public class HashMapDataProvider extends Base {

	@Test(dataProvider = "searchData")
	public void validateSearch(HashMap<String,String> map) throws InterruptedException {

		driver.findElement(By.cssSelector(AmazonOR.getProperty("searchBar"))).clear();
		driver.findElement(By.cssSelector(AmazonOR.getProperty("searchBar"))).sendKeys(map.get("keyword1"));
		driver.findElement(By.cssSelector(AmazonOR.getProperty("searchButton"))).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector(AmazonOR.getProperty("searchBar"))).clear();
		driver.findElement(By.cssSelector(AmazonOR.getProperty("searchBar"))).sendKeys(map.get("keyword2"));
		driver.findElement(By.cssSelector(AmazonOR.getProperty("searchButton"))).click();
		Thread.sleep(2000);

	}

	@DataProvider
	public Object[][] searchData() {
		HashMap<String,String> map = new HashMap<>();
		map.put("keyword1" , "Samsung mobile");
		map.put("keyword2" , "Apple mobile");
		
		HashMap<String,String> map1 = new HashMap<>();
		map1.put("keyword1" , "Samsung mobile");
		map1.put("keyword2" , "Apple mobile");

		return new Object[][] { { map }, { map1 } };
	}

}
