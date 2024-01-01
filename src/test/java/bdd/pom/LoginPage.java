package bdd.pom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {

	@Given("User navigates to the the demoqa website")
	public void user_navigates_to_the_the_demoqa_website() {
		System.out.println("Step1");
	}

	@When("User validates the homepage title")
	public void user_validates_the_homepage_title() {
		System.out.println("Step2");
	}

	@Then("User enters username")
	public void user_enters_username() {
		System.out.println("Step3");
	}

	@Then("User enters password")
	public void user_enters_password() {
		System.out.println("Step4");
	}

	@Then("User click son the signin button")
	public void user_click_son_the_signin_button() {
		System.out.println("Step5");
	}

	@Given("{string} testcase")
	public void testcase(String string) {
		System.out.println("testcase : " + string);
	}
}
