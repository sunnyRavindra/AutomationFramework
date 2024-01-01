package demoqa.testcases;

//import demoqa.pages.HomePage;
import static utils.Keywords.*;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import demoqa.pages.ElementsPage;
import demoqa.pages.HomePage;

public class UIValidation {

	@Test
	public void validateDemoQALandingPage() {
		Reporter.log("#################### Starting Validation ##########################");
		HomePage homePage = new HomePage();
		homePage.openPage();
		homePage.validatePageLinks();
		Reporter.log("#################### Validation Completed #############################");
	}

	@Test
	public void validateDemoQAElementPage() {
		Reporter.log("#################### Starting Validation ##########################");
		ElementsPage elementsPage = new ElementsPage();
		elementsPage.openPage();
		elementsPage.validatePageLinks();
		Reporter.log("#################### Validation Completed #############################");
	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("#################### Starting Browser->>> BeforeMethod #############################");
		openBrowser();
		Reporter.log("#################### Browser Started-->>> BeforeMethod #############################");

	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("#################### Stoping Browser-->>> AfterMethod ##########################");
		closeBrowser();
		Reporter.log("#################### Browser Stopped-->>> AfterMethod #########################");

	}

}
