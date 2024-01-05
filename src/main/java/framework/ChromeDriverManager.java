package framework;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {

	public ChromeDriverManager() {
		driver = new ChromeDriver();
	}

}
