package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Register;

public class RegStepDef
{
	
	Register r=new Register();
	
	@Given("driver is called")
	public void driver_is_called() 
	{
		 r.initialise();
	}

	@Given("user is on login page")
	public void user_is_on_login_page() 
	{
	    r.getURL();
	}

	@When("user enters credentials")
	public void user_enters_credentials(DataTable dataTable)
	{
		r.credentials(dataTable);
	}
	
	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() 
	{
		   r.submit();
	}
	
	@Then("user is on the home page")
	public void user_is_on_the_home_page() 
	{
		   r.checkResult();
	}
}
