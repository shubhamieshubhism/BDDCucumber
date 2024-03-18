package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@smoke or @regression",features= {"src/test/resources/FeatureWithTags"},
glue= {"StepDefinations"},plugin= {"pretty","html:target/htmlreport.html"})

public class CucumberTestRunnerForTags extends AbstractTestNGCucumberTests {
	
}
