package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/cucumber", glue = "cucumberStepDefinition",
monochrome = true, plugin = {"html:target/cucmberReport.htm"})
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
