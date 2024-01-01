package bdd.pom;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BasicPage {

	@Given("User starts the Browser")
	public void user_starts_the_browser() {
		System.out.println("Browser Started");
	}

	@Given("step with int {int}")
	public void step_with_int(Integer int1) {
		System.out.println("Execute step 1 with int : " + int1);
	}

	@When("step with string {string} and {string}")
	public void step_with_string(String string1, String string2) {
		System.out.println("Execute step 1 with strings : " + string1 + " and " + string2);
	}

	@Then("step with double {double}")
	public void step(Double double1) {
		System.out.println("Execute step 1 with doube : " + double1);
	}

	@Then("^step with regex (.+)$")
	public void step_four(String regexString) {
		System.out.println("Execute regexString : " + regexString);
	}

	@Then("step with list input")
	public void step_with_list_input(List<String> ListString) {

		System.out.println("index0 : " + ListString.get(0));
		System.out.println("index1 : " + ListString.get(1));
		System.out.println("index2 : " + ListString.get(2));
		System.out.println("index3 : " + ListString.get(3));
		System.out.println("index4 : " + ListString.get(4));
		System.out.println("index5 : " + ListString.get(5));
	}

	@Then("step six")
	public void step_six() {
		System.out.println("Execute step 6");
	}

}
