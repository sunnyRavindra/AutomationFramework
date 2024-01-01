package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {

	WebDriver driver;

	public Dashboard(WebDriver driver) {
		this.driver = driver;
	}

	By heading = By.xpath("//div[@class=\"main-header\"]");
	By logoutBtn = By.id("submit");

	public String getHeading() {
		String head = driver.findElement(heading).getText();
		return head;
	}

	public void clickLogout() {
		driver.findElement(logoutBtn).click();
	}
}
