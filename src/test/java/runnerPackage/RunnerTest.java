package runnerPackage;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\Features", 
					glue = "stepDefinition", 
					tags = "@tag1", 
					dryRun = false, 
					plugin = {
							"pretty", "html:target/cucumber-html-report" })
public class RunnerTest {

}
