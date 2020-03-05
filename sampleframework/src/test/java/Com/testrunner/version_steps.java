package Com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/features/carwale.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc03"},
		glue = {"steps"},
		monochrome = true
		)
public class version_steps {

}
