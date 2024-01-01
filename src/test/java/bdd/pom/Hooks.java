package bdd.pom;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void beforeAll() {
		System.out.println("------------------");
		System.out.println("Before all");
		System.out.println("------------------");
	}

	@After
	public void afterAll() {
		System.out.println("------------------");
		System.out.println("After all");
		System.out.println("------------------");
	}

	@Before("@Smoke")
	public void beforeAllSmoke() {
		System.out.println("------------------");
		System.out.println("Before all smoke");
		System.out.println("------------------");
	}

	@After("@Smoke")
	public void afterAllSmoke() {
		System.out.println("------------------");
		System.out.println("After all smoke");
		System.out.println("------------------");
	}

}
