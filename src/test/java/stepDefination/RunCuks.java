package stepDefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		         plugin={"pretty","html:target/cucumber_junit_report","json:target/cucumber.json","junit:target_junit/cucumber.xml"},
		         tags = {"@FlipKart_TC1"},
		         features = "resources/feature/",
                 glue={"stepDefination"},
                 dryRun=false
                 )

public class RunCuks {

}
