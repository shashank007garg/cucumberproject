package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


/*@CucumberOptions(
features = the path of the feature files
glue=the path of the step definition files
format= to generate different types of reporting
monochrome = display the console output in a proper readable format
strict = it will check if any step is not defined in step definition file
dryRun = to check the mapping is proper between feature file and step def file
)*/

@RunWith(Cucumber.class)
@CucumberOptions(features = "Q:/_VirtualDesktop/workspace/cucumber-automation-framework/src/main/java/Features",
glue = { "StepDefination" }, 
format = {"pretty", "html:target/Destination", "json:json/Destination"},
dryRun=false,
monochrome=true,
strict=true


		
		)
public class TestRunner {

}
