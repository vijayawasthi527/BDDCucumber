package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps
{
	@Given("user should be logged into application")
	public void user_should_be_logged_into_application() {
	   System.out.println("Given Statement");
	}

	@When("user click on order button")
	public void user_click_on_order_button() {
	    System.out.println("Clicking on orders button");
	}

	@Then("user redirect to orders page")
	public void user_redirect_to_orders_page() 
	{
	   System.out.println("Redairecting to orders page");
	}

	@When("user click on current order button")
	public void user_click_on_current_order_button() {
		System.out.println("Clicking on current order button");
	    
	}

	@Then("user should see the current order information")
	public void user_should_see_the_current_order_information()
	{
		System.out.println("current order information fetched");
	   
	}

	@When("user click on past order button")
	public void user_click_on_past_order_button() {
		System.out.println("Clicking on past order button");
	}

	@Then("user should see the past order information")
	public void user_should_see_the_past_order_information() {
		System.out.println("past order information fetched");
	}

	@When("user click on cancelled order button")
	public void user_click_on_cancelled_order_button() {
		System.out.println("Clicking on cancel order button");
	}

	@Then("user should see the cancelled order information")
	public void user_should_see_the_cancelled_order_information() {
		System.out.println("canceled order information fetched");
	}



}
