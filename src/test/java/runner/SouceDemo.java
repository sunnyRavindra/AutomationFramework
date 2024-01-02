package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/soucedemo", glue = { "stepdefinition.soucedemo" }, plugin = { "pretty",
		"html:target/html-reports/cucumber.html", "json:target/json-reports/cucumber.json", })
public class SouceDemo extends AbstractTestNGCucumberTests {
}
