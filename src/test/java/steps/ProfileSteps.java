package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps 
{
	@Given("User is at the home page")
	public void user_is_at_the_home_page() {
		System.out.println("Given statement");
	}

	@When("User click on add button")
	public void user_click_on_add_button() {
		System.out.println("Clicking on add");
	}

	@When("user enter the details")
	public void user_enter_the_details() {
		System.out.println("Updating the details");
	}

	@Then("Profile should get added")
	public void profile_should_get_added() {
		System.out.println("Profile addition confirmation");
	}

	@When("User click on edit button")
	public void user_click_on_edit_button() {
	    System.out.println("clicking on Edit button");
	}

	@When("user update the details")
	public void user_update_the_details() {
		System.out.println("Updating the details");
	

	}

	@Then("Profile should get updated")
	public void profile_should_get_updated() {
		System.out.println("Profile updation done");
	}

	@When("User click on delete button")
	public void user_click_on_delete_button() {
	    System.out.println("Clicking on delete button");
	}

	@Then("Profile should get deleted")
	public void profile_should_get_deleted() {
		System.out.println("Deletion confirmation");
	}
}
