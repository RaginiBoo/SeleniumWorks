package Com.stepdef;

import Com.pages.version;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class version_steps {
version v=new version();
@Given("^the user launched$")
public void open()
{
	v.url3();
}
@When("^click the version and choose the version$")
public void ver()
{
	v.version();
}

@And("^enter the city name,area and click check now button$")
public void cit()
{
	v.city();
}

}
