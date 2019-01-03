package runnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\ManifestLandingPage.feature", glue = "stepDefinition", tags = "@tag1", dryRun = false, plugin = {
		"pretty", "html:target/cucumber-html-report" })
public class RunnerTest {

}
