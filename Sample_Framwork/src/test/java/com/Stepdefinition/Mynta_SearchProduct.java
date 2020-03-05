package com.Stepdefinition;

import java.io.IOException;

import com.pages.Myntra_LoginPage;
import com.pages.Myntra_SearchingProduct;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mynta_SearchProduct {
	Myntra_SearchingProduct SearchPro = new Myntra_SearchingProduct();
	Myntra_LoginPage mylogin = new Myntra_LoginPage();
	
	@Given("^user launch the chrome application$")
	public void user_launch_the_chrome_application() {
	    // Write code here that turns the phrase above into concrete actions
		SearchPro.launch();
		
	}

	@When("^the user loggedin to the home page$")
	public void the_user_loggedin_to_the_home_page() throws IOException, InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		SearchPro.search_page();
		
	}

	@Then("^the user search the product$")
	public void the_user_search_the_product()  {
	    // Write code here that turns the phrase above into concrete actions
		SearchPro.search_product();
	}

	@Then("^click on down arrow and enter key the user get the searching products$")
	public void click_on_down_arrow_and_enter_key_the_user_get_the_searching_products()  {
	    // Write code here that turns the phrase above into concrete actions
		SearchPro.close_search();
		
	}

}
