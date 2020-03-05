package Com.stepdef;

import Com.pages.login;
import Com.pages.search;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class search_steps {

	search sea =new search();
	@Given("^the user launched the chrome browser and open carawale$")
	public void open()
	{
		sea.url();
	}
	@When ("enter the car name")
	public void search1()
	{
		sea.search();
	}
	@And ("click the search icon it will navigate to next page")
	public void enter_name()
	{
		sea.enter_search_name();
	}
	
}
