package com.Stepdefinition;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.pages.Myntra_LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Myntra_Login {
	Myntra_LoginPage mylogin = new Myntra_LoginPage();
	
	
	@Given("^the user launch the chrome application$")
	public void the_user_launch_the_chrome_application() throws IOException  {
	    // Write code here that turns the phrase above into concrete actions
		mylogin.url();
	}

	@When("^the user open the Myntra Home page$")
	public void the_user_open_the_Myntra_Home_page() {
	    // Write code here that turns the phrase above into concrete actions
	  mylogin.LoginPage();
	}

	@Then("^the user login using username and password$")
	public void the_user_login_using_username_and_password() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
	 mylogin.LoginDeatils();
	 
	}

	@Then("^click on the login button user nagivate to the next page$")
	public void click_on_the_login_button_user_nagivate_to_the_next_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	mylogin.submit();
	
	}

}
