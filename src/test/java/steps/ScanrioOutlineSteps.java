package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScanrioOutlineSteps
{
	@Given("User is at SignUp")
	public void user_is_at_sign_up() 
	{
	   System.out.println("Given Statement");
	}

	@When("user enters name as {string} in form")
	public void user_enters_name_as_in_form(String string) 
	{
		System.out.println("Enterd Name is "+string);
	   	}

	@When("user enter age as {int}")
	public void user_enter_age_as(Integer int1)
	{
	   System.out.println("Entered age is "+int1);
	}

	@When("user confirms {string} radio button")
	public void user_confirms_radio_button(String string)
	{
		System.out.println("Confirmed Radio Button is "+string);
	    
	}

	@Then("user gets created")
	public void user_gets_created() 
	{
		System.out.println("Then Statement");
	}


}
