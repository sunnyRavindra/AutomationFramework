package bdd.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = { "bdd.pom" }, plugin = { "pretty",
		"html:target/html-reports/cucumber.html", "json:target/json-reports/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
public class BasicRunner extends AbstractTestNGCucumberTests {

}
