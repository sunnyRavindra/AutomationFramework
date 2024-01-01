package utils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Driver {

	private WebDriver driver;

	public WebDriver openBrowser() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void goTo(String URL) {
		driver.get(URL);
	}

	public void closeBrowser() {
		driver.close();
		driver = null;
	}

	public void isElementVisible(ArrayList<WebElement> elements) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Iterator<WebElement> iterator = elements.iterator();
		while (iterator.hasNext()) {
			wait.until(ExpectedConditions.visibilityOf(iterator.next()));
			Assert.assertTrue(iterator.next().isDisplayed());
			Reporter.log("Validated Link : " + iterator.next().getText());
		}
		wait = null;
	}

}
