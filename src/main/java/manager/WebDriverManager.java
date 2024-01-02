package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {
	private WebDriver driver;

	public WebDriver getDriver() {
		if(driver == null) driver = createDriver();
		return driver;
	}

	private WebDriver createDriver() {
//		   switch (environmentType) {	    
//	        case LOCAL : driver = createLocalDriver();
//	        	break;
//	        case REMOTE : driver = createRemoteDriver();
//	        	break;
//		   }
		driver = new FirefoxDriver();
		   return driver;
	}

//	private WebDriver createRemoteDriver() {
//		throw new RuntimeException("RemoteWebDriver is not yet implemented");
//	}
//
//	private WebDriver createLocalDriver() {
//        switch (driverType) {	    
//        case FIREFOX : driver = new FirefoxDriver();
//	    	break;
//        case CHROME : 
//        	System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getDriverPath());
//        	driver = new ChromeDriver();
//    		break;
//        case INTERNETEXPLORER : driver = new InternetExplorerDriver();
//    		break;
//        }
//
//        if(FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize()) driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
//		return driver;
//	}	

	public void closeDriver() {
		driver.close();
		driver.quit();
	}

}
