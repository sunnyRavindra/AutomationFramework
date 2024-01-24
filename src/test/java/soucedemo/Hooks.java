package soucedemo;

import afw.context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	TestContext testContext;

	public Hooks(TestContext context) {
		testContext = context;
	}

	@Before
	public void Before() {
		System.out.println("################################# Cucumber Before #####################################");
	}

	@After
	public void After() {
		System.out.println("################################# Cucumber Before #####################################");
		testContext.getWebDriverManager().closeDriver();
	}

}