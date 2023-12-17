package sandbox;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeOptions;

public class sandbox {

	public static void main(String[] args) throws IOException {
//		
//		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.setCapability("browserVersion", "100");
//		chromeOptions.setCapability("platformName", "Windows");
//		chromeOptions.setCapability("se:name", "My simple test"); 
//		chromeOptions.setCapability("se:sampleMetadata", "Sample metadata value"); 
//		WebDriver driver = new RemoteWebDriver(new URL("http://gridUrl:4444"), chromeOptions);
//		driver.get("http://www.google.com");
//		driver.quit();

	
		//Initializing base Config Properties 
		Properties BaseConfig = new Properties();
//		FileInputStream BaseConfigInputFile = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//properties//config.properties");
//		BaseConfig.load(BaseConfigInputFile);
//		
//		//Initializing OR Config Properties 
//		Properties ORConfig = new Properties();
//		FileInputStream ORConfigInputFile = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//properties//OR.properties");
//		ORConfig.load(ORConfigInputFile);
//
		
	
		System.out.println(BaseConfig.getProperty("browser"));
//		System.out.println(ORConfig.getProperty("usernameinput"));
	}

}
