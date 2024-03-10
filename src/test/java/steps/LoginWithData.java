package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithData
{	
	@Given("I am at landing page")
	public void i_am_at_landing_page()
	{
	   System.out.println("This is my given Statement");
	}

	@When("I enter the username as {string}")
	public void i_enter_the_username_as(String uname)
	{
	   System.out.println("Enter user name is "+uname);
	}

	@When("I enter the password as {string}")
	public void i_entere_the_password_as(String pwd)
	{
		System.out.println("enter password is "+pwd);
	   
	}

	@When("I clicked on submit button")
	public void i_clicked_on_submit_button() {
	   
	}

	@Then("I should get logged into app")
	public void i_should_get_logged_into_app()
	{
	   System.out.println("user logged in");
	}

}
