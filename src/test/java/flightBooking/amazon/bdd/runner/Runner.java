package com.amazon.bdd.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/java/test/com.amazon.bdd",
glue="com.amazon.step.definations",
monochrome=true)	
public class Runner extends AbstractTestNGCucumberTests {

	public void TestNGRunner() {

		
	}

}
