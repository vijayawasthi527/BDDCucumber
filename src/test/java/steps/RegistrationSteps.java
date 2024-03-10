package steps;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class RegistrationSteps 
{
	@Given("User Should be at accounts Page")
	public void user_should_be_at_accounts_page() 
	{
		System.out.println("Given Statement");
	   
	}

	@When("User enters the following data")
	public void user_enters_the_following_data(io.cucumber.datatable.DataTable dataTable)
	{
	    List<List<String>> data = dataTable.asLists();
	    for(List<String> ll:data)
	    {
	    	System.out.println(ll);
	    }
	    List<String> firstList = data.get(0);

		String value = firstList.get(0);

		System.out.println(value);//Erin
		
	String lastName	= data.get(0).get(1);
	
	System.out.println(lastName);//Smith
    String mobile = data.get(1).get(3);
	
	System.out.println(mobile);

	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button()
	{
		System.out.println("Clicking on Submit button");
	}

	@Then("user should see the confirmation")
	public void user_should_see_the_confirmation() 
	{
		System.out.println("Confirmation Maessage");
	    
	}

}
