package mercurytours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.BaseClass;

public class LoginTest {

	WebDriver driver;
	String username = "sunny";
	String password = "sunny1234";

	@BeforeClass
	public void init() {
		BaseClass.initDriver();
		driver = BaseClass.getDriver();
		driver.navigate().to("https://demo.guru99.com/test/newtours/");
	}

	@Test(priority=0)
	public void login() throws InterruptedException {
		driver.findElement(By.cssSelector("input[name='userName']")).sendKeys(username);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		Thread.sleep(5000);
	}

	@Test(priority=1)
	public void logout() {
		driver.findElement(By.xpath("//a[normalize-space()='SIGN-OFF']")).click();
	}

	@AfterClass
	public void quit() {
		driver.close();
	}
}