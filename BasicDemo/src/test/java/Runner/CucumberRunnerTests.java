package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(tags = "", features = "src/test/resources/features/Pagelogin.feature", glue = "StepDefinitions",
                 plugin = {})
    
public class CucumberRunnerTests {

}
