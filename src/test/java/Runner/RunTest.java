package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features = "src/test/java/Feature/CreateLead.feature", glue = "Steps")
@RunWith(Cucumber.class)
public class RunTest {

	}


