package Com.stepdef;

import java.io.IOException;

import Com.pages.login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login_steps {
	
	login log =new login();
	@Given("^the user launched the chrome browser and open carawale website$")
	public void open_browser()
	{
		log.url();
	}
	
	
	@When("^click login button$")
	public void click_login() {
		log.login_button();
	}

	@Then("^enter username and password$")
	public void username_password() throws IOException {
		log.username_pass();
	}
}
