package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
	 System.out.println("user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("user has to enter username and password");
	}

	@And("click on submit")
	public void click_on_submit() {
	System.out.println("user click on submit");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	System.out.println("user is navigated to home page");
	}

}
