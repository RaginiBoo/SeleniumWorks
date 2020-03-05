package com.Stepdefinition;

import com.pages.Myntra_ProfileDetails;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Myntra_ProfileEmail {
	Myntra_ProfileDetails pro = new Myntra_ProfileDetails();
	
	@Given("^launch the chrome application$")
	public void launch_the_chrome_application() {
	    // Write code here that turns the phrase above into concrete actions
	    pro.url();
	}

	@When("^the user logged in to the home page$")
	public void the_user_logged_in_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	pro.LoginPage();
	}

	@Then("^the user click the profile and get the profile email$")
	public void the_user_click_the_profile_and_get_the_profile_email()  {
	    // Write code here that turns the phrase above into concrete actions
	pro.profiledetails();
	}


}
