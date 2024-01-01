package seleniumTest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RemoteDriver {

	String browserName = "firefox";
	String browserVersion = "120.0";
	String platform = "linux";
//	boolean acceptInsecureCerts =  true;
	WebDriver driver;
	

	@Test
	public void Remote() throws MalformedURLException {
		
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability("browserName", browserName);
		options.setCapability("browserVersion", browserVersion);
		options.setCapability("platformName", platform);
		driver = new RemoteWebDriver(new URL("http://localhost:4444"),options);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}
	
	@Test(dependsOnMethods="Remote")
	public void httpConnections() throws MalformedURLException, IOException {
		HttpURLConnection huc = null;
		int responseCode = 0;
		driver.navigate().to("http://www.zlti.com");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		Iterator<WebElement> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			String url = iterator.next().getAttribute("href");
			
			if(url.startsWith("http://www.zlti.com")) {
				
				huc = (HttpURLConnection)(new URL(url).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				responseCode = huc.getResponseCode();
				
				if (responseCode >=400) {
					System.out.println("The link : " + url + " Is broken. ");
				}
			}
			
		}
	}
	
}
