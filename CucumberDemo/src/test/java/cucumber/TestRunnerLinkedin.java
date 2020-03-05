package cucumber;

	import org.junit.runner.RunWith;

	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	public class TestRunnerLinkedin {
	/// I AM RUNNING WITH CUCUMBER CLASS
		@RunWith(Cucumber.class)
		@CucumberOptions(features="feature/testcaselinkedin.feature", glue="TestStepLinkedin")
		public class Testrunner_googlehomepage
		{
		}
	}

