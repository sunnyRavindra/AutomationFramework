package soucedemo.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/soucedemo/lockedoutLogin.feature", glue = {
		"soucedemo" }, monochrome = true, plugin = { "pretty", "html:target/cucumber/cucumber.html",
				"json:target/cucumber/cucumber.json", })
public class LockedOutLogin extends AbstractTestNGCucumberTests {
}
