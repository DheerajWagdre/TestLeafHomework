package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features = "src/test/java/Feature/CreateLeadWithOutline.feature", glue = "Steps")
@RunWith(Cucumber.class)
public class RunTestforOutLine {

	}


