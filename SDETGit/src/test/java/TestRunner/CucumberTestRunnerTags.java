package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@smoke and @Regression or @Perf",
features = {"src/test/resources/FeatureWithTags"},
glue = {"Steps"},
plugin = {"pretty","html:target/htmlreport.html"})

public class CucumberTestRunnerTags extends AbstractTestNGCucumberTests{
	


}
