package seleniumTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.seleniumDriver;

public class BasicTest {
	public WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		
	}

	@Test
	public void ActionsClass() throws InterruptedException {
		driver = seleniumDriver.getDriver();

		// WebElements
		WebElement Home = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		WebElement Flights = driver.findElement(By.xpath("//a[contains(text(),'Flights')]"));
		WebElement Hotels = driver.findElement(By.xpath("//a[contains(text(),'Hotels')]"));
		WebElement CarRentals = driver.findElement(By.xpath("//a[contains(text(),'Car Rentals')]"));

		// Actions and Action Class
		Actions builder = new Actions(driver);
		Action moveToElement = builder.moveToElement(Home).build();
		Action clickAndHold = builder.clickAndHold().build();
		Action clickAndHoldElement = builder.clickAndHold(Flights).build();
		Action contextClick = builder.contextClick().build();
		Action contextClickElement = builder.contextClick(Hotels).build();
		Action doubleClick = builder.doubleClick().build();
		Action doubleClickElement = builder.doubleClick(CarRentals).build();
		Action dragAndDrop = builder.dragAndDrop(CarRentals, Flights).build();
		Action dragAndDropWithOffSet = builder.dragAndDropBy(Flights, 100, 200).build();

		moveToElement.perform();
		clickAndHold.perform();
		clickAndHoldElement.perform();
		contextClick.perform();
		contextClickElement.perform();
		doubleClick.perform();
		doubleClickElement.perform();
		dragAndDrop.perform();
		dragAndDropWithOffSet.perform();

//		Thread.sleep(5000);
//		driver.close();
//		driver.quit();
//		System.exit(0);
	}

	@Test
	public void WindowHandle() {
		driver.get("https://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();

		String mainWindow = driver.getWindowHandle();

		Set<String> allWindows = driver.getWindowHandles();

		Iterator<String> iterator = allWindows.iterator();

		while (iterator.hasNext()) {
			driver.switchTo().window(iterator.next());
		}
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void brokenLinks() {
		String URL = "http://www.zlti.com";
		
		driver

	}

}
