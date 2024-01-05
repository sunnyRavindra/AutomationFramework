package soucedemo.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/soucedemo/facadelogin.feature", glue = {
		"soucedemo" }, monochrome = true, plugin = { "pretty", "html:target/cucumber/cucumber.html",
				"json:target/cucumber/cucumber.json", })
public class FacadeLogin extends AbstractTestNGCucumberTests {
}


