package soucedemo.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/soucedemo", glue = {
		"soucedemo" }, monochrome = true, plugin = { "pretty", "html:target/cucumber/cucumber.html",
				"json:target/cucumber/cucumber.json", })
public class Regression extends AbstractTestNGCucumberTests {
	
//    @Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }

}


