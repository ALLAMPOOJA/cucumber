package StepDefinition;

import io.cucumber.java.en.*;

public class LoginTest {
	
	@Given("user is on login page")
	public void user_is_on_login_page() 
	{
	    System.out.println("Inside step- user is on login page");
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password()
	{
		System.out.println("Inside step- user enter valid username and password");
	}

	@When("clicks on login button")
	public void clicks_on_login_button()
	{
		System.out.println("Inside step- user clicks on login button");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() 
	{
		System.out.println("Inside step- user is navigated to home page");
	}


}