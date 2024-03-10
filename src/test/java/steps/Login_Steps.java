package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Steps
{
	@Given("I am at login page")
	public void goToLoginPage()
	{
		System.out.println("Given Statement");
		
	}
	
	@When("I enter userName")
	public void enteringUsername()
	{
		System.out.println("Entering UserName");
	}
	
	@When("I enter password")
	public void enteringPassword()
	{
		System.out.println("Entering Password");
	}
	
	@When("I clicked on Login Button")
	public void loginToApp()
	{
		System.out.println("Clicking on login Button");
	}
	
	@Then("I should logged into Application")
	public void validateLogin()
	{
		System.out.println("Validating Login");
	}
	
	@Given("I am at login Page")
	public void atLoginPage()
	{
		System.out.println("Nav to login Page");
	}
	
	@When("I should see the title")
	public void validateTitle()
	{
		System.out.println("Validating the Title");
	}
	

}
