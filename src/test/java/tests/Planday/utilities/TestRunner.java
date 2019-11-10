package tests.Planday.utilities;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-reports"},
		monochrome = true,
		features = "resource/features",
		tags={"@task"},
		glue = {"tests.Planday.stepDefinitions"}
		)

public class TestRunner {
	
}
